package pack9;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpMulClient {

	public static void main(String[] args)  {
			String nickname="����";
		
		//if(args.length!=3) {
		//	System.out.println(
		//	"����: Ŭ���̾�Ʈ������ \'java ��Ű����.���ϸ� ip�ּ� ��Ʈ��ȣ �г���\' �������� �Է�");
		//	System.exit(1);
		//}
	
	Socket s1;
	try {				//args[0], Integer.parseInt(args[1])
		s1 = new Socket("localhost" ,43431);
		System.out.println("������ ����....");
		
		
		DataOutputStream outputStream=new DataOutputStream(s1.getOutputStream());
		DataInputStream inputStream= new DataInputStream(s1.getInputStream());
		outputStream.writeUTF("##"+nickname); //�г��� ���� ������ ���� ����
	
		new KajaClientGUI (outputStream, inputStream,"��11") {
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
		