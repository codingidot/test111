package nine;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fifth {

	public static void main(String[] args) throws IOException  { //main()을 호출한 JVM에게 예외를 던짐 , JVM 이 처리함
																			
		// Q) 파일 copy, 단 byte 단위로
		
		//byte 단위
		
		int imsi=0; //'A' ==> 문자상수(문자 A이면서 동시에 아스키코드 65)
		FileInputStream fis1=null; //byte 단위
		FileOutputStream fos1 =null;
	
		//---------------------------------------
		//if(args.length==2){//원본파일명과 사본파일명 합해서 2개파일
		fis1=new FileInputStream("d:/spring.jpg"); //open
		//fis1=new FileInputStream("aa.jpg"); //open
		fos1=new FileOutputStream("d:/spring3.jpg", false);
		
		//--------------------------------
		 
		while((imsi=fis1.read())!=-1) {
			//read() 괄호안에 비어있으면 한 바이트단위로 처리
			fos1.write(imsi); //파일에 출력
			System.out.println(imsi+"나 지금북사중~");
		}
		
		fis1.close(); fos1.close();
	
	}

}
