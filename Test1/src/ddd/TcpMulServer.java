package ddd;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

class ServerClass{
	ArrayList<ThreadServerClass> threadList=new ArrayList<ThreadServerClass>();

	Socket s1;
	DataOutputStream outputStream;
	int limit;
	String id;
	int portno;
	public ServerClass(int portno, int limit, String id) throws IOException {
		Socket s1=null;
		limit=this.limit;
		id=this.id;
		portno=this.portno;
		ServerSocket ss1=new ServerSocket(portno); //listen
		System.out.println("서버가동.....");
		
		System.out.println("ttt");
	
	while(true) {
		System.out.println("sss");
		
		s1=ss1.accept(); //연결
		System.out.println("listen");
		
		System.out.println("접속주소:"+s1.getInetAddress()+", 접속포트: "+s1.getPort());
		if(threadList.size()!=limit) {
		ThreadServerClass tServer1=new ThreadServerClass(s1);
		threadList.add(tServer1);
		tServer1.start();
		
		}
	
		System.out.println("접속자수: "+threadList.size());
	}
		

	
	}
	
	


	public void sendChat(String chat) throws IOException {
		for(int i=0; i<threadList.size();i++)
			threadList.get(i).outputStream.writeUTF(chat);
	
	}
	
	
	//클래스안에 클래스
	class ThreadServerClass extends Thread{//한명 접속마다 처리할 쓰레드 클래스
		Socket socket1;
		DataInputStream inputStream;
		DataOutputStream outputStream;
		
		public ThreadServerClass(Socket s1) throws IOException {
			socket1=s1;
			inputStream=new DataInputStream(s1.getInputStream());
			outputStream=new DataOutputStream(s1.getOutputStream());
		}
	
	public void run() {
		String nickname="";
	
			try {
				
				if(inputStream !=null) {
				nickname=inputStream.readUTF();
				sendChat(nickname+"님 입장~~^^ ^^");
				//서버가 하는일: 별명만 30명에게 전송
				}
				while(inputStream!=null) {
					//System.out.println(inputStream.readUTF());
					sendChat(inputStream.readUTF());
					//클라이언트가보낸 채팅 내용을 접속한 모두에게 보냄
				}//정상채팅의 경우는 계속 while 문 안에서 반복 loop
			
			} catch (IOException e) {// 여기로 왔단 얘기는 에러가 발생한 것 //나가버린다.
				//e.printStackTrace();
			}finally {
				//나간 쓰레드 인덱스 찾기
				for(int i=0; i<threadList.size();i++) {
					if(socket1.equals(threadList.get(i).socket1)) {
						threadList.remove(i);
						
						
						try {
							sendChat(nickname+"님 퇴장~~ㅠㅠ ㅠㅠ");
						} catch (IOException e) {
							//e.printStackTrace();
						}
					}
				}
				System.out.println("접속자수: "+threadList.size()+"명");
			}
			
		
	}
	
	
	
	
	}//ThreadServerClass end
	
	
	

}
public class TcpMulServer {

	public static void main(String[] args) throws NumberFormatException, IOException {

	
		if(args.length!=1) {
			System.out.println("사용법:서버실행은 \'java 패키지명.파일명  포트번호\' 형식으로 입력");
		}
						//Integer.parseInt(args[0])
		new ServerClass(43437, 2, "또치");
	}

}
