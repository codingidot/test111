package server;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import data.toss;

public class server {
	static String code = "";	 																									// 분류 코드 임시 저장
	static String[][] roomInfo = new String[5][10];																			// 방 정보 저장 (방번호, Mid, Sid)
	static HashMap<String, Socket> userSocketMap = new HashMap<String, Socket>();						// 클라이언트의 접속 ID, 소켓정보 기록
	static HashMap<Socket, String> socketUserMap = new HashMap<Socket, String>();						// 클라이언트의 소켓정보, 접속 ID 기록
	static HashMap<String, ObjectOutputStream> userOOSMap = new HashMap <String, ObjectOutputStream>();	// 클라이언트의 접속 ID, OOS 기록
	static Socket thisClient;
	static toss toss;
	
	
	public static void main(String[] args) {
		System.out.println("버전 220511 2321");
		try (
			ServerSocket server = new ServerSocket()) {
			InetSocketAddress ipep = new InetSocketAddress(9999); 				// 9999 포트에 서버를 대기 시킨다.
			server.bind(ipep);																	// 서버 인스턴스에 소켓 정보 bind
			System.out.println("[서버 시작]");
				
			ExecutorService receiver = Executors.newCachedThreadPool(); 		// 클라이언트로 부터 메시지 수신 대기 스래드 풀
			List<Socket> list = new ArrayList<>();										// 클라이언트 리스트
			
			
			// 클라이언트로 부터 수신 시작 ==============================================================
			while (true) {
				try {
					Socket socket = server.accept(); 										// 클라이언트로 부터 접속 대기한다. (블록킹)
					list.add(socket); 							// 클라이언트 리스트에 추가한다.
					System.out.println("[연결 수락] : " + socket.getRemoteSocketAddress() + ": " + Thread.currentThread().getName());
					System.out.println("리스트 정보" + list.get(0));									// 접속 정보 콘솔 출력

					receiver.execute(() -> {	// 클라이언트 스래드 풀 시작
						try (
							Socket thisClient = socket;
							ObjectInputStream ois = new ObjectInputStream(thisClient.getInputStream());
							ObjectOutputStream oos = new ObjectOutputStream(thisClient.getOutputStream());
						){
							while (true) { // 받기
								toss = (toss)ois.readObject();											// 전송된 객체 수신
								code = toss.getCode();														// 분류 코드 확인
								//userSocketMap.put(toss.getId(), thisClient);							// 아이디와 소켓 정보를 HashMap에 저장
								
								//코드에 따른 동작 실행====================================
								switch(code) {
								case "t0000" : 
									// [t0000] 로그인 기능 추가
									// https://github.com/Hx2DEV/BLACKJACK/issues/16
									// 작업자 전호형
									toss.setRoomInfo_all(roomInfo);						// server.server.java가 가지고 있는 방 정보를 toss 덮음
									s_t0000 t0000 = new s_t0000();
									toss = t0000.s_t0000_send(toss, oos);
										if (toss.getIntnote()==1) {
											userOOSMap.put(toss.getId(), oos);
											userSocketMap.put(toss.getId(), thisClient);		// 유저 정보 저장
											socketUserMap.put(thisClient, toss.getId());		// 유저 정보 저장
											
											userSocketMap.forEach((key, value) -> {			// 접속자 전체 정보 출력
												System.out.println("아이디: "+ key + " / 소켓 값: " + value);
												});	
										}
									break;
								
								
								case "t0001" : 
									// [t0001] 방 목록 갱신 기능 추가	
									// https://github.com/Hx2DEV/BLACKJACK/issues/10
									// 작업자 전호형
									toss.setRoomInfo_all(roomInfo);						// server.server.java가 가지고 있는 방 정보를 toss 덮음
									s_t0001 t0001 = new s_t0001();
									t0001.s_t0001_send(toss, oos);
									
									break;
								
								case "t0002" : 
									// [t0002] 방 생성 기능 추가
									// https://github.com/Hx2DEV/BLACKJACK/issues/13
									// 작업자 전호형
												
									toss.setRoomInfo_all(roomInfo);						// server.server.java가 가지고 있는 방 정보를 toss 덮음
									s_t0002 t0002 = new s_t0002();
									toss = t0002.s_t0002_send(toss, oos);				// t0002에서 처리된 값으로 toss 최신화
									roomInfo = toss.getRoomInfo_all();					// t0002에서 처리된 값으로 roomInfo 최신화
									break;	
									
									
								case "t0003" :
									toss.setRoomInfo_all(roomInfo);						// 서버의 정보를 참고하여 toss의 RoomInfo 최신화
									s_t0003 t0003 = new s_t0003();
									t0003.s_t0003_send(toss, userOOSMap);				
									break;
								
								
								case "t0005" :
									// [t0005] 회원가입 기능 추가
									// https://github.com/Hx2DEV/BLACKJACK/issues/20
									// 작업자 전호형
									s_t0005 t0005 = new s_t0005();
									t0005.s_t0005_send(toss, oos);
									break;
									
								case "t0006" :
									// [t0006] 방 참가 기능 추가
									// https://github.com/Hx2DEV/BLACKJACK/issues/21
									// 작업자 전호형
									s_t0006 t0006 = new s_t0006();
									toss = t0006.s_t0006_send(toss, oos);
									roomInfo = toss.getRoomInfo_all();
									break;
								}
							} 
						} catch (SocketTimeoutException e){
						} catch (EOFException e){
						} catch (IOException e){
						} catch (ClassNotFoundException e) {
						} finally {																	// 접속 종료 (비정상 종료 포함)
							list.remove(socket);												// 리스트에서 종료 클라이언트 삭제
							String tmp_id = socketUserMap.get(socket);

							s_t0007 t0007 = new s_t0007();
							roomInfo = t0007.s_t0007_send(toss, roomInfo, tmp_id, userOOSMap);
							
							System.out.println("접속 종료에 따른 계정 메모리 삭제 " + socketUserMap.get(socket));
							System.out.println("접속 종료에 따른 소켓 메모리 삭제 " +userSocketMap.get(socketUserMap.get(socket)));
							userSocketMap.remove(socketUserMap.get(socket));					// 리스트에서 삭제
							socketUserMap.remove(socket);												// 리스트에서 삭제
							userOOSMap.remove(tmp_id);
							

							System.out.println("[접속 종료] ");
						}
					});
				} catch (Exception e) { }
			}		
		} catch (Exception e) { }
	}
}