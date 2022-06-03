package pack6;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	public static void main(String[] args) throws IOException {
		
		ServerSocket ss1=new ServerSocket(7115); //listen
									  //포트번호
			
		Socket s1=ss1.accept(); 
		
		InputStream is1=s1.getInputStream(); //소켓에서 입력 스트림 얻기
		OutputStream os1=s1.getOutputStream(); //소켓에서 출력스트림 얻기
		
		//byte stream을 처리
		int b1;
		while(true) {
			b1=is1.read();//1byte씩 문자열 읽기 client--> Server
						  //글자가 network stream에 있으면
			if(b1==-1)break; //-1은 eof, 파일의 끝
			os1.write(b1);// 문자열 출력 Server --> Client
			//받은 글자가 osi1을 통해 client로 전송
		}
		//실행은 서버먼저 run 한후 클라이언트 run
	}											

}
