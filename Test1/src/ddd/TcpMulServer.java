package ddd;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

class ServerClass{
	ArrayList<ThreadServerClass> threadList=new ArrayList<ThreadServerClass>();

	Socket s1;
	DataOutputStream outputStream;
	int limit;
	String id;
	int portno;
	public ServerClass(int portno, int limit, String id) throws IOException {
		Socket s1=null;
		limit=this.limit;
		id=this.id;
		portno=this.portno;
		ServerSocket ss1=new ServerSocket(portno); //listen
		System.out.println("��������.....");
		
		System.out.println("ttt");
	
	while(true) {
		System.out.println("sss");
		
		s1=ss1.accept(); //����
		System.out.println("listen");
		
		System.out.println("�����ּ�:"+s1.getInetAddress()+", ������Ʈ: "+s1.getPort());
		if(threadList.size()!=limit) {
		ThreadServerClass tServer1=new ThreadServerClass(s1);
		threadList.add(tServer1);
		tServer1.start();
		
		}
	
		System.out.println("�����ڼ�: "+threadList.size());
	}
		

	
	}
	
	


	public void sendChat(String chat) throws IOException {
		for(int i=0; i<threadList.size();i++)
			threadList.get(i).outputStream.writeUTF(chat);
	
	}
	
	
	//Ŭ�����ȿ� Ŭ����
	class ThreadServerClass extends Thread{//�Ѹ� ���Ӹ��� ó���� ������ Ŭ����
		Socket socket1;
		DataInputStream inputStream;
		DataOutputStream outputStream;
		
		public ThreadServerClass(Socket s1) throws IOException {
			socket1=s1;
			inputStream=new DataInputStream(s1.getInputStream());
			outputStream=new DataOutputStream(s1.getOutputStream());
		}
	
	public void run() {
		String nickname="";
	
			try {
				
				if(inputStream !=null) {
				nickname=inputStream.readUTF();
				sendChat(nickname+"�� ����~~^^ ^^");
				//������ �ϴ���: ���� 30���� ����
				}
				while(inputStream!=null) {
					//System.out.println(inputStream.readUTF());
					sendChat(inputStream.readUTF());
					//Ŭ���̾�Ʈ������ ä�� ������ ������ ��ο��� ����
				}//����ä���� ���� ��� while �� �ȿ��� �ݺ� loop
			
			} catch (IOException e) {// ����� �Դ� ���� ������ �߻��� �� //����������.
				//e.printStackTrace();
			}finally {
				//���� ������ �ε��� ã��
				for(int i=0; i<threadList.size();i++) {
					if(socket1.equals(threadList.get(i).socket1)) {
						threadList.remove(i);
						
						
						try {
							sendChat(nickname+"�� ����~~�Ф� �Ф�");
						} catch (IOException e) {
							//e.printStackTrace();
						}
					}
				}
				System.out.println("�����ڼ�: "+threadList.size()+"��");
			}
			
		
	}
	
	
	
	
	}//ThreadServerClass end
	
	
	

}
public class TcpMulServer {

	public static void main(String[] args) throws NumberFormatException, IOException {

	
		if(args.length!=1) {
			System.out.println("����:���������� \'java ��Ű����.���ϸ�  ��Ʈ��ȣ\' �������� �Է�");
		}
						//Integer.parseInt(args[0])
		new ServerClass(43437, 2, "��ġ");
	}

}
