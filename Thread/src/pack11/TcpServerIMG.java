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
                    
                    
                    byte[] byteBae = new byte[(int)file1.length()];
                    //파일의 길이만큼 바이트배열 잡음  //예) byte[] byteBae = new byte[1024]; -> 1024byte
                                                                     // 10011100  11110110 ..-> 1024개
                    System.out.println("file-->byte 중...");
                    dis1.readFully(byteBae); //파일내용 -> 바이트배열, 100byte라면 100100100...
                    
                    
                    //길이를 먼저 전송, 내용을 전송
                    dos1.writeInt(byteBae.length); // (1) 1024글자
                                            //파일길이 먼저 전송  4바이트 확보, 0100001 / 100을 보낸다
                    dos1.write(byteBae); //파일 자체를 바이트배열 전송 // (2) 실제 파일을 보냄
                    System.out.println("전송완료");
            }
            
            
    }
}
