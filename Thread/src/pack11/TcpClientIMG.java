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
            
            
            //file길이, 내용받아 --> byte배열로
            int len1 = dis1.readInt(); //서버가 보낸 파일길이 먼저 받아옴
            byte[] byteBae2 = new byte[len1];
            dis1.readFully(byteBae2); // 그리고 내용받아 바이트 배열로
            
            //byte배열 --> file로 저장
            FileOutputStream fos1 = new FileOutputStream("d:/aa2.jpg");
            fos1.write(byteBae2); //받은 바이트배열 --> 파일로
            
            System.out.println("끝");
            
    }
}
