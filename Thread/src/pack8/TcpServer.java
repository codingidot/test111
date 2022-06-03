package pack8;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


	// 1:1ä�� (�� vs ����) -��ȭó�� ������ ������ �� �Ҽ��� �־�� ��
	// send ��� ������, rcv ��� ������
	class ThreadSend extends Thread {
	        Socket s1; //from Client
	        DataOutputStream dos1; //out -> "�氡�氡"�� ���� ���̹Ƿ�
	        //�⺻ ������ Ÿ�Ժ��� ó���ϱ� (��) writeInt, WriteUTF(���ڿ�ó��)
	        //file: byte stream, character stream
	        //network: DataOutputStream, DataInputStream
	        //             (byte, character �Ѵ� ����)
	        
	        String what1;//ä�ý� �Ǿտ� ���� ���ڿ� (��) ������ ==>
	                                        //readLine() ���ڿ���Ʈ��
	        
	        ThreadSend(Socket s1) throws IOException {
	                this.s1 = s1; //s1�޾Ƽ� s1�ʵ忡 �ֱ�
	                dos1 = new DataOutputStream(s1.getOutputStream()); //send�� ���� i/o ��Ʈ��
	                what1 = "������ ==> "; //��ȭ�� �տ� �׻� �ٴ� �ܾ�
	        }
	        
	        public void run() {
	                Scanner sc1 = new Scanner(System.in);
	                while(dos1 != null) { //chat ������
	                        try { dos1.writeUTF(what1 + sc1.nextLine());
	                                //io ��Ʈ���� ���� ��뿡�� char ������ //������ ==> �氡�氡
	                        } catch (IOException e) {
	                                //e.printStackTrace(); //�� �κ��� ���������� �߸� ���ŷο�Ƿ� �ּ��ܴ�
	                        }
	                }
	        }
	        
	}
	
	class ThreadRcv extends Thread{ //client�� ������ ������ �޴´�
		 Socket s1; //from Client
	        DataInputStream dis1;
	        //what1="������==>" ----------> ���������� ó���ϹǷ� �Ⱦ�
	       ThreadRcv(Socket s1) throws IOException{
	    	   this.s1=s1;
	    	   dis1=new DataInputStream(s1.getInputStream());
	    			   
	       }
	       
	    public void run() {
	    	while(dis1!=null) {
	    		try {
					System.out.println(dis1.readUTF());
				} catch (IOException e) {
					e.printStackTrace();
				}
	    	}
	    }
	
	}


public class TcpServer {
	/* 1��1 ä�� */
	public static void main(String[] args) throws NumberFormatException, IOException {
		if(args.length!=1) {
			System.out.println("������ java ���ϸ� ��Ʈ��ȣ");
			System.exit(1);
		}
		
		// listen
		ServerSocket ss1= new ServerSocket(Integer.parseInt(args[0]));
		System.out.println("���� �� �غ� ��");
	
	
		while(true) {
			System.out.println("���� ��ȭ ��ٸ�����....");
			Socket s1=ss1.accept(); //connect�� ����
		
		
		//�Ʒ��� ���� receive/ send �� �����ڸ�
			//���⿡ thread�� ���
		//////////////////////////////������ ������ ��� �ƴ� ==> ��ȭ���
	ThreadSend tsendSer1=new ThreadSend(s1);
	ThreadRcv trcvSer1=new ThreadRcv(s1);
	tsendSer1.start();
	trcvSer1.start();	
		
		
		
		
		
		}
	
	
	}

}
