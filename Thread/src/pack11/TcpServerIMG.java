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

public class TcpServerIMG {

    public static void main(String[] args) throws IOException {

            ServerSocket ss1 = new ServerSocket(57791);
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
                    
                    
                    byte[] byteBae = new byte[(int)file1.length()];
                    //������ ���̸�ŭ ����Ʈ�迭 ����  //��) byte[] byteBae = new byte[1024]; -> 1024byte
                                                                     // 10011100  11110110 ..-> 1024��
                    System.out.println("file-->byte ��...");
                    dis1.readFully(byteBae); //���ϳ��� -> ����Ʈ�迭, 100byte��� 100100100...
                    
                    
                    //���̸� ���� ����, ������ ����
                    dos1.writeInt(byteBae.length); // (1) 1024����
                                            //���ϱ��� ���� ����  4����Ʈ Ȯ��, 0100001 / 100�� ������
                    dos1.write(byteBae); //���� ��ü�� ����Ʈ�迭 ���� // (2) ���� ������ ����
                    System.out.println("���ۿϷ�");
            }
            
            
    }
}
