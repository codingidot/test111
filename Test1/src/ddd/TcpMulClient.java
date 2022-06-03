package ddd;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpMulClient {
	String id;
	int port;
	TcpMulClient(String id, int port){
		
		Socket s1;
		try {				//args[0], Integer.parseInt(args[1])
			s1 = new Socket("localhost" ,port);
			System.out.println("서버에 연결....");
			
			
			DataOutputStream outputStream=new DataOutputStream(s1.getOutputStream());
			DataInputStream inputStream= new DataInputStream(s1.getInputStream());
			outputStream.writeUTF("##"+id); //닉네임 먼저 보내는 것은 같다
		
			new KajaClientGUI (outputStream, inputStream,id) {
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
		