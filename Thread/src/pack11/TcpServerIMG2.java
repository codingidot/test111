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
         System.out.println("서버 준비되어 있음");
         
         while(true) {
                 System.out.println("기다리는 중");
                 
                 Socket s1 = ss1.accept();
                 System.out.println(s1.getInetAddress() + "에서 접속");
                 
                 File file1 = new File("d:/aa.jpg");        //그림파일 전송
                 FileInputStream fis1 = new FileInputStream(file1);
                 DataInputStream dis1 = new DataInputStream(fis1);
                 DataOutputStream dos1 = new DataOutputStream(s1.getOutputStream());
                 //즉, bb.jpg를 입력받아 network로 전송을 위한 준비...
                 
                 File file2=new File("d:/aa22.jpg");
                 BufferedImage bi=ImageIO.read(file1);
                 
                 ImageIO.write(bi, "png", dos1);
                 
                 
                
         }
         
	}

}
