package nine;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ninth {

	public static void main(String[] args) throws IOException {
		//Q) aaa.txt 파일내용과 bbb.txt파일내용이
		// 상호 바뀌도록 프로그램을 작성하시오
		//<hint> 변수의 값을 변경시 zigzag-swap
		String str1=null;
	
		BufferedReader br1 = new BufferedReader(new FileReader("d:/aaa.txt"));                
		  
		 PrintWriter pw1= new PrintWriter //open 
		                     (new BufferedWriter(new FileWriter("d:/imsi.txt")));

		while( (str1=br1.readLine()) != null ){ //null :한줄의끝 , -1 : 한글자의끝 
		                            pw1.println(str1);///////////////////
		 }
		  br1.close(); pw1.close();       
		  
		   //bbb.txt --> aaa.txt copy
		 BufferedReader br2  = new BufferedReader
		                                          (new FileReader("d:/bbb.txt"));                
		 PrintWriter pw2= new PrintWriter
		                       (new BufferedWriter(new FileWriter("d:/aaa.txt")));                
		                
		 while( (str1=br2.readLine()) != null ){ 
		       pw2.println(str1);///////////////////
		 }
		 br2.close();pw2.close();
		        
		  //imsi.txt --> bbb.txt copy                
		 BufferedReader br3= new BufferedReader(new FileReader("d:/imsi.txt"));                
		 PrintWriter pw3= new PrintWriter //open
		                        (new BufferedWriter(new FileWriter("d:/bbb.txt")));                
		 while( (str1=br3.readLine()) != null ){
		        pw3.println(str1);///////////////////
		 }
		 br3.close(); pw3.close(); //close 
		   
		   File f1=new File("d:/imsi.txt");
		  if(f1.exists()) {//파일 있어??? 그런데 결과는 true야 false야 
		    if(f1.delete()) //파일을 지우자 그런데 결과는 true야 false야 
		       System.out.println("임시파일 안녕이라는~~~");
		        else
		       System.out.println("ㅇㄱㄹㅇ~ 오잉 에러야~~웬열~~!!!");
		             
		  } //f1.exists-yes-end 
		  else //파일이 없으면 
		                  System.out.println("지울파일 없어 !!!!!!!");
		  
		  }//main-end

	// aa.txt를 지우면 ?a.txt와 같이 이름만 바뀐다 // 완전삭제: overwrite 
	

}
