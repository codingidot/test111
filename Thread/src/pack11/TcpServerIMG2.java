package pack11;

import java.awt.image.BufferedImage;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.imageio.ImageIO;

public class TcpServerIMG2 {

	public static void main(String[] args) throws IOException {

		 ServerSocket ss1 = new ServerSocket(51234);
         System.out.println("���� �غ�Ǿ� ����");
         
         while(true) {
                 System.out.println("��ٸ��� ��");
                 
                 Socket s1 = ss1.accept();
                 System.out.println(s1.getInetAddress() + "���� ����");
                 
                 File file1 = new File("d:/aa.jpg");        //�׸����� ����
                 FileInputStream fis1 = new FileInputStream(file1);
                 DataInputStream dis1 = new DataInputStream(fis1);
                 DataOutputStream dos1 = new DataOutputStream(s1.getOutputStream());
                 //��, bb.jpg�� �Է¹޾� network�� ������ ���� �غ�...
                 
                 File file2=new File("d:/aa22.jpg");
                 BufferedImage bi=ImageIO.read(file1);
                 
                 ImageIO.write(bi, "png", dos1);
                 
                 
                
         }
         
	}

}
