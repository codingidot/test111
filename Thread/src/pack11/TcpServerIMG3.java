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

public class TcpServerIMG3 {

    public static void main(String[] args) throws IOException {

    	 ServerSocket ss1 = new ServerSocket(57794);
         System.out.println("서버 준비되어 있음...");
         
         while(true) {
                 System.out.println("기다리는 중....");
                 
                 Socket s1 = ss1.accept();
                 System.out.println(s1.getInetAddress()+"에서 접속");
                 
                 File file1 = new File("d:/cc.xlsx");

                 FileInputStream fis1 = new FileInputStream(file1);
                 DataInputStream dis1 = new DataInputStream(fis1);
                 DataOutputStream dos1 = new DataOutputStream(s1.getOutputStream());
                 
                 
                 byte [] byteBae = new byte[(int) file1.length()];
                 
                 System.out.println("file-->byte중...");
                 dis1.readFully(byteBae);
                 
                 dos1.writeInt(byteBae.length);
                 dos1.write(byteBae);
                 
                 System.out.println("전송했당~~");
                 s1.close();
    }
}
}
