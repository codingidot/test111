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
		//Q) aaa.txt ���ϳ���� bbb.txt���ϳ�����
		// ��ȣ �ٲ�� ���α׷��� �ۼ��Ͻÿ�
		//<hint> ������ ���� ����� zigzag-swap
		String str1=null;
	
		BufferedReader br1 = new BufferedReader(new FileReader("d:/aaa.txt"));                
		  
		 PrintWriter pw1= new PrintWriter //open 
		                     (new BufferedWriter(new FileWriter("d:/imsi.txt")));

		while( (str1=br1.readLine()) != null ){ //null :�����ǳ� , -1 : �ѱ����ǳ� 
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
		  if(f1.exists()) {//���� �־�??? �׷��� ����� true�� false�� 
		    if(f1.delete()) //������ ������ �׷��� ����� true�� false�� 
		       System.out.println("�ӽ����� �ȳ��̶��~~~");
		        else
		       System.out.println("��������~ ���� ������~~����~~!!!");
		             
		  } //f1.exists-yes-end 
		  else //������ ������ 
		                  System.out.println("�������� ���� !!!!!!!");
		  
		  }//main-end

	// aa.txt�� ����� ?a.txt�� ���� �̸��� �ٲ�� // ��������: overwrite 
	

}
