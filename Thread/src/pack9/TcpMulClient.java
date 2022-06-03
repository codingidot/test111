package pack9;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpMulClient {

	public static void main(String[] args)  {
			String nickname="파이";
		
		//if(args.length!=3) {
		//	System.out.println(
		//	"사용법: 클라이언트실행은 \'java 패키지명.파일명 ip주소 포트번호 닉네임\' 형식으로 입력");
		//	System.exit(1);
		//}
	
	Socket s1;
	try {				//args[0], Integer.parseInt(args[1])
		s1 = new Socket("localhost" ,43431);
		System.out.println("서버에 연결....");
		
		
		DataOutputStream outputStream=new DataOutputStream(s1.getOutputStream());
		DataInputStream inputStream= new DataInputStream(s1.getInputStream());
		outputStream.writeUTF("##"+nickname); //닉네임 먼저 보내는 것은 같다
	
		new KajaClientGUI (outputStream, inputStream,"파11") {
			public void closeWork() throws IOException{
				outputStream.close();
				inputStream.close();
				System.exit(0);
			}
		};
	
	} catch (IOException e) {
		//e.printStackTrace();
	}
	
	
}

}
		