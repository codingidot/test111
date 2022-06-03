package pack8;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;






public class TcpClient {

	public static void main(String[] args) throws NumberFormatException, UnknownHostException, IOException {

		if(args.length!=2) {
			System.out.println("사용법은 java 파일명 ip주소 포트번호");
			System.exit(1);
		}
	
	Socket s1=new Socket(args[0], Integer.parseInt(args[1]));
	//thread랑 원통(DatainputStream, DataOutputStream)다 있으니
	
	//여기가 send/rdv 위치
	//서버에 클래스 3개 중 ThreadSend , ThreadRcv 클래스를 클라이언트가 공유하여 사용함
	//즉, 새로 클래스 만들필요 없음
	
	ThreadSend tsendcli1=new ThreadSend(s1);
	ThreadRcv trcvli1=new ThreadRcv(s1);
	
	tsendcli1.start();
	trcvli1.start();
	
	
	//recieve,send ==> 무전기 안될려면 thread로 작성해야함
	//BUT 이미 작성되어 있구만// 같은 package 안에 들어 있으므로  객체명만 바꿔서 사용
	}

}
