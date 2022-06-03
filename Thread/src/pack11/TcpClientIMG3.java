package pack11;

import java.awt.image.BufferedImage;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.imageio.ImageIO;

public class TcpClientIMG3 {

    public static void main(String[] args) 
                    throws UnknownHostException, IOException {
            
    	Socket s1 = new Socket("127.0.0.1", 57794);
        DataInputStream dis1 = new DataInputStream(s1.getInputStream());
        
        int len1 = dis1.readInt();
        byte[] byteBae2 = new byte[len1];
        dis1.readFully(byteBae2);
        
        FileOutputStream fos1 = new FileOutputStream("d:/cc5.xlsx");
        fos1.write(byteBae2);
        
        System.out.println("╡Т~~юд~~~~~");
        
        s1.close();
            
    }
}
