package pack6;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPMainClass {

	public static void main(String[] args) throws UnknownHostException {
		//InetAddress Ŭ������ �ڹ�Ŭ������ IP�ּ�ǥ���� ���� ���
		InetAddress inet1=InetAddress.getLocalHost();
							//Ŭ������.static�޼ҵ�()
		//==>�ڽ��� ������� localhost�� InetAddress ��ü����
	 

		//ip�ּ�
		System.out.println(inet1.getHostAddress());//String
		//��, getHostAddress�� IP�ּҸ� ���ڿ��� return
		//dotted decimal address  ��)192.168.192.1
		//Window + R Ű�� ������ cmd ������ ipconfig������ Ȯ��
		
		System.out.println(inet1.getHostName());
						//ȣ��Ʈ�̸��� ���ڿ��� return
		InetAddress inet2=InetAddress.getByName("www.naver.com");
		
		System.out.println(inet2);//www.naver.com/223.130.195.95
		//223.130.195.95�� �Է��ϸ� ���̹��� ����
		
		
		InetAddress[] inet3=InetAddress.getAllByName("www.naver.com");
		
		for(int i=0; i<inet3.length; i++) {
			System.out.println(inet3[i]);
		}
		
		
		//IP Address(getAddress) to byte�迭, byte�迭 �� �����ּ�
		//getAddress(): byte[] �迭�� return
		//IP address�� ����Ʈ�迭�� ��ȯ����
		//��, 1110011011000101100
		byte[] byte4=inet1.getAddress();
		
		for(int i=0;i<byte4.length;i++) {
			System.out.print((int)byte4[i]+""+"\t");
		}
		System.out.println();
		// byte�� -128~ 127���� ����
		//127�� �Ѵ¼��� ���̳ʽ��� �ȴ�.
		//192.168.192.1 ��  -64	-88	-64	1�� ����
		//-64+256 =192
		//-88+256=168
		
		
		//======������ �������ϰ� �ذ����ڴ�==============
		//������ ������ �͸� 256���� -ó��
		//-64+256 =192
		//-88+256=168
		
		System.out.println("(���� �ּ� �ذ��ϱ�)");
		String change1=""; //���ڿ�
		for(int i=0; i<byte4.length;i++) {
			if(byte4[i]<0)
				change1=change1+(""+(byte4[i]+256));
			else
				change1=change1+(""+byte4[i]);
			if(i!=3)// �ּ� �ǵڿ� ���� ��µ��� �ʵ���
				change1=change1+".";
		}
		System.out.println(change1);
	
	}
	}
	
	



