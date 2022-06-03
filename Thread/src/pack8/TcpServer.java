package pack8;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


	// 1:1채팅 (나 vs 서버) -전화처럼 한쪽이 여러번 말 할수도 있어야 함
	// send 담당 쓰레드, rcv 담당 쓰레드
	class ThreadSend extends Thread {
	        Socket s1; //from Client
	        DataOutputStream dos1; //out -> "방가방가"를 보낼 것이므로
	        //기본 데이터 타입별로 처리하기 (예) writeInt, WriteUTF(문자열처리)
	        //file: byte stream, character stream
	        //network: DataOutputStream, DataInputStream
	        //             (byte, character 둘다 가능)
	        
	        String what1;//채팅시 맨앞에 나를 문자열 (예) 미팅중 ==>
	                                        //readLine() 문자열스트림
	        
	        ThreadSend(Socket s1) throws IOException {
	                this.s1 = s1; //s1받아서 s1필드에 넣기
	                dos1 = new DataOutputStream(s1.getOutputStream()); //send를 위한 i/o 스트림
	                what1 = "미팅중 ==> "; //대화시 앞에 항상 붙는 단어
	        }
	        
	        public void run() {
	                Scanner sc1 = new Scanner(System.in);
	                while(dos1 != null) { //chat 있으면
	                        try { dos1.writeUTF(what1 + sc1.nextLine());
	                                //io 스트림을 통해 상대에게 char 보내기 //미팅중 ==> 방가방가
	                        } catch (IOException e) {
	                                //e.printStackTrace(); //이 부분은 에러내용이 뜨면 번거로우므로 주석단다
	                        }
	                }
	        }
	        
	}
	
	class ThreadRcv extends Thread{ //client가 나에게 보낸걸 받는다
		 Socket s1; //from Client
	        DataInputStream dis1;
	        //what1="미팅중==>" ----------> 보내는쪽이 처리하므로 안씀
	       ThreadRcv(Socket s1) throws IOException{
	    	   this.s1=s1;
	    	   dis1=new DataInputStream(s1.getInputStream());
	    			   
	       }
	       
	    public void run() {
	    	while(dis1!=null) {
	    		try {
					System.out.println(dis1.readUTF());
				} catch (IOException e) {
					e.printStackTrace();
				}
	    	}
	    }
	
	}


public class TcpServer {
	/* 1대1 채팅 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		if(args.length!=1) {
			System.out.println("사용법은 java 파일명 포트번호");
			System.exit(1);
		}
		
		// listen
		ServerSocket ss1= new ServerSocket(Integer.parseInt(args[0]));
		System.out.println("서버 잘 준비 됨");
	
	
		while(true) {
			System.out.println("미팅 대화 기다리느중....");
			Socket s1=ss1.accept(); //connect을 받자
		
		
		//아래는 원래 receive/ send 가 오는자리
			//여기에 thread를 사용
		//////////////////////////////이제는 무전기 방식 아님 ==> 전화기로
	ThreadSend tsendSer1=new ThreadSend(s1);
	ThreadRcv trcvSer1=new ThreadRcv(s1);
	tsendSer1.start();
	trcvSer1.start();	
		
		
		
		
		
		}
	
	
	}

}
