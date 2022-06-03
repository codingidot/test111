package pack11;

import java.awt.image.BufferedImage;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.imageio.ImageIO;

public class TcpClientIMG2 {

	public static void main(String[] args) throws UnknownHostException, IOException {

		   Socket s1 = new Socket("127.0.0.1", 51234);
           DataInputStream dis1 = new DataInputStream(s1.getInputStream());
           FileOutputStream fos1=new FileOutputStream("d:/kk2.jpg");
           DataOutputStream dos1=new DataOutputStream(fos1);
           BufferedImage bi=ImageIO.read(dis1);
           ImageIO.write(bi, "jpg",dos1 );
           System.out.println("¼º°ø");
           
           
           
	}

}
