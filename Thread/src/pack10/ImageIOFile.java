package pack10;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageIOFile {

	public static void main(String[] args) throws IOException {

		
		File file1=new File("d:/aa.jpg"); //원본
		BufferedImage buffimage1=ImageIO.read(file1); //객체.메소드()
		
		
		File file2=new File("d:/aa2.jpg");
		ImageIO.write(buffimage1, "jpg", file2);
				
	
		File file3=new File("d:/aa3.gif");
		ImageIO.write(buffimage1, "gif", file3);
		
		
		File file4=new File("d:/aa3.png");
		ImageIO.write(buffimage1, "png", file4);
		System.out.println("저장됨");
		
	
	}

}
