package pack6;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	public static void main(String[] args) throws IOException {
		
		ServerSocket ss1=new ServerSocket(7115); //listen
									  //��Ʈ��ȣ
			
		Socket s1=ss1.accept(); 
		
		InputStream is1=s1.getInputStream(); //���Ͽ��� �Է� ��Ʈ�� ���
		OutputStream os1=s1.getOutputStream(); //���Ͽ��� ��½�Ʈ�� ���
		
		//byte stream�� ó��
		int b1;
		while(true) {
			b1=is1.read();//1byte�� ���ڿ� �б� client--> Server
						  //���ڰ� network stream�� ������
			if(b1==-1)break; //-1�� eof, ������ ��
			os1.write(b1);// ���ڿ� ��� Server --> Client
			//���� ���ڰ� osi1�� ���� client�� ����
		}
		//������ �������� run ���� Ŭ���̾�Ʈ run
	}											

}
