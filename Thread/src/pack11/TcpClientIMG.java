package pack11;

import java.awt.image.BufferedImage;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.imageio.ImageIO;

public class TcpClientIMG {

    public static void main(String[] args) 
                    throws UnknownHostException, IOException {
            
            Socket s1 = new Socket("127.0.0.1", 57791);
            DataInputStream dis1 = new DataInputStream(s1.getInputStream());
            
            
            //file����, ����޾� --> byte�迭��
            int len1 = dis1.readInt(); //������ ���� ���ϱ��� ���� �޾ƿ�
            byte[] byteBae2 = new byte[len1];
            dis1.readFully(byteBae2); // �׸��� ����޾� ����Ʈ �迭��
            
            //byte�迭 --> file�� ����
            FileOutputStream fos1 = new FileOutputStream("d:/aa2.jpg");
            fos1.write(byteBae2); //���� ����Ʈ�迭 --> ���Ϸ�
            
            System.out.println("��");
            
    }
}
