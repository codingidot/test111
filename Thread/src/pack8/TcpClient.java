package pack8;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;






public class TcpClient {

	public static void main(String[] args) throws NumberFormatException, UnknownHostException, IOException {

		if(args.length!=2) {
			System.out.println("������ java ���ϸ� ip�ּ� ��Ʈ��ȣ");
			System.exit(1);
		}
	
	Socket s1=new Socket(args[0], Integer.parseInt(args[1]));
	//thread�� ����(DatainputStream, DataOutputStream)�� ������
	
	//���Ⱑ send/rdv ��ġ
	//������ Ŭ���� 3�� �� ThreadSend , ThreadRcv Ŭ������ Ŭ���̾�Ʈ�� �����Ͽ� �����
	//��, ���� Ŭ���� �����ʿ� ����
	
	ThreadSend tsendcli1=new ThreadSend(s1);
	ThreadRcv trcvli1=new ThreadRcv(s1);
	
	tsendcli1.start();
	trcvli1.start();
	
	
	//recieve,send ==> ������ �ȵɷ��� thread�� �ۼ��ؾ���
	//BUT �̹� �ۼ��Ǿ� �ֱ���// ���� package �ȿ� ��� �����Ƿ�  ��ü�� �ٲ㼭 ���
	}

}
