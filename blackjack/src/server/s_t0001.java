// [t0001] 방 목록 갱신 기능 추가
// https://github.com/Hx2DEV/BLACKJACK/issues/10
// 작업자 전호형

package server;

import java.io.ObjectOutputStream;
import java.net.Socket;
import data.toss;

// 클라이언트 클래스
public class s_t0001{
	
	public void s_t0001() {};
	
	public toss s_t0001_send(toss toss, ObjectOutputStream oos) {
		try {
			System.out.println("[서버] [t0001] 방 목록 갱신 시작");
	        toss.setCode("t0001");															// 클라이언트가 전송된 코드 분류를 알 수 있도록 객체에 코드명 저장
	        
	        //	RoomInfo를 바탕으로 RoomMap에 방번호와 인원수 저장 시작 ==============================
	        int counter=0;																		// 방 인원수 체크할 변수 생성
			for (int i = 0; i < 10; i++) {														
				for (int j = 1; j < 3; j++) {
					if(toss.getRoomInfo(j, i)!=null) {counter = counter+1;}			// id가 null이 아니라면(방에 누군가 있다면) counter+1
					
				}
				toss.setRoomMap(i+1, counter);											// RoomMap에 방번호를 키값으로, counter를 벨류 값으로 저장
				counter=0;																		// 다음 방의 접속자를 체크하기 위해 카운터 초기화
			}
	        //	RoomInfo를 바탕으로 RoomMap에 방번호와 인원수 저장 완료 ==============================
			oos.writeObject(toss);															// TOSS 객체 내용 전송
	        oos.flush();																			// OOS 비움
	        System.out.println("[서버] [t0001] 방 목록 갱신 완료");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return toss;
	};
	
	
	
	
}