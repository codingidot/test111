package nine;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fifth {

	public static void main(String[] args) throws IOException  { //main()�� ȣ���� JVM���� ���ܸ� ���� , JVM �� ó����
																			
		// Q) ���� copy, �� byte ������
		
		//byte ����
		
		int imsi=0; //'A' ==> ���ڻ��(���� A�̸鼭 ���ÿ� �ƽ�Ű�ڵ� 65)
		FileInputStream fis1=null; //byte ����
		FileOutputStream fos1 =null;
	
		//---------------------------------------
		//if(args.length==2){//�������ϸ�� �纻���ϸ� ���ؼ� 2������
		fis1=new FileInputStream("d:/spring.jpg"); //open
		//fis1=new FileInputStream("aa.jpg"); //open
		fos1=new FileOutputStream("d:/spring3.jpg", false);
		
		//--------------------------------
		 
		while((imsi=fis1.read())!=-1) {
			//read() ��ȣ�ȿ� ��������� �� ����Ʈ������ ó��
			fos1.write(imsi); //���Ͽ� ���
			System.out.println(imsi+"�� ���ݺϻ���~");
		}
		
		fis1.close(); fos1.close();
	
	}

}
