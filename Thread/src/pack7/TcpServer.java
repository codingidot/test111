package pack7;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {

	public static void main(String[] args) throws NumberFormatException, IOException {
		ServerSocket ss1=new ServerSocket(Integer.parseInt(args[0])); //port ��ȣ
										//your ip(localhost, 127.0.0.1),your port	
		System.out.println("��ȭ�� �غ�Ǿ� ����....");
	while(true) {
		System.out.println("��ȭ��ٸ�����....");
		Socket s1=ss1.accept(); //��ٸ�����
		System.out.println(s1.getInetAddress()+"���� ��ȭ�Գ�");
							//��ȭ�⿡ ���� �����ȣ
		BufferedWriter bw1=
				new BufferedWriter(new OutputStreamWriter(s1.getOutputStream()));
		
		bw1.write("��� ����~~~~");
		bw1.newLine(); bw1.flush();
		System.out.println("��~~~");
		bw1.close(); s1.close();
				
		//������ .exe �� �ƴ� .class�� �ϸ�ȴ�
		//dos��忡�� ������ : javac ... aa.java  �����ϴ¼��� �����ϵ�
		//         ������: java  .....aa (.class)
		//         ��Ű�� ���Խ�      java ��Ű����.aa
		//                       (�̶� ������ġ�� ��Ű���� ����)
		//.class��ġ�� Navigator�ǿ��� bin ������ �ִ�. 
		// ����ȭ�鿡 ��Ű�� ������ ���翡�� ���̰� shift�������¿��� �����ؼ� �͹̳�(Power Shell)���� ���� ������ȴ�.
	}
	
	
	
	
	
	
	
	}

}
