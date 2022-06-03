package eleven;

import java.awt.AWTException;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
									//Fifth
class CaptureClass extends JFrame{ //JFrame�� swing�̴� â�ݴ°� �������ص���

		//GUI
		private Button b1=new Button("��üȭ�� ĸ������");
		Robot robot1;
			//�ڹٰ� os�� Ű���� ���콺 ���� ������ ����//
	   Dimension totWint1;
	   //////������Ʈ�� �ʺ�- ���̸� �����ϴ� ���̹ڽ�
	   //java.awt.Dimension
	   Rectangle rect1;
	   BufferedImage bImage1;
	   
	   public CaptureClass() throws IOException, AWTException{
		   add(b1);
		   b1.setVisible(true);
		   //----------------------------------------
		   //jdk1.3����, ���Ƿ� os������ Ű���� ���콺 ����
		   robot1=new Robot();
		   //  Toolkit:os���� ��ȸ //�ڹ��������� ȭ��ũ�⸦ �˾ƺ��� //awt
		   totWint1=Toolkit.getDefaultToolkit().getScreenSize();
		   
		   //�� 1024x 768�� ȭ��ũ�⿴�ٰ� �ϸ�
		   rect1=new Rectangle((int)totWint1.getWidth(), (int)totWint1.getHeight());
		   
		   ///////ĸ�����ڴ�
		   bImage1=robot1.createScreenCapture(rect1);
		   ImageIO.write(bImage1,"jpg", new File("d:/aa.jpg"));
		   
		   setSize(200,200);
		   setVisible(true);
		   
	   
	   }
}

public class CaptureMainClass {//Fifth

	public static void main(String[] args) throws IOException, AWTException {

		new CaptureClass();
	
	}

}
