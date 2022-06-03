package pack7;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {

	public static void main(String[] args) throws NumberFormatException, IOException {
		ServerSocket ss1=new ServerSocket(Integer.parseInt(args[0])); //port 번호
										//your ip(localhost, 127.0.0.1),your port	
		System.out.println("전화는 준비되어 있음....");
	while(true) {
		System.out.println("전화기다리는중....");
		Socket s1=ss1.accept(); //기다리는중
		System.out.println(s1.getInetAddress()+"에서 전화왔네");
							//전화기에 찍힌 상대방번호
		BufferedWriter bw1=
				new BufferedWriter(new OutputStreamWriter(s1.getOutputStream()));
		
		bw1.write("어떻게 지내~~~~");
		bw1.newLine(); bw1.flush();
		System.out.println("뚝~~~");
		bw1.close(); s1.close();
				
		//실행은 .exe 가 아닌 .class로 하면된다
		//dos모드에서 컴파일 : javac ... aa.java  저장하는순간 컴파일됨
		//         실행은: java  .....aa (.class)
		//         패키지 포함시      java 패키지명.aa
		//                       (이때 실행위치는 패키지를 보고)
		//.class위치는 Navigator탭에서 bin 폴더에 있다. 
		// 바탕화면에 패키지 폴더를 복사에서 붙이고 shift누른상태에서 마오해서 터미널(Power Shell)에서 열기 누르면된다.
	}
	
	
	
	
	
	
	
	}

}
