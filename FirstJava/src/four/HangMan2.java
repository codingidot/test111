package four;

import java.util.Arrays;
import java.util.Scanner;

public class HangMan2 {

	public static void main(String[] args) {//교수님이 푼거
		String [] moonja={"a","p","p","l","e"}; //문자열배열 
	       String [] jool={"_","_","_","_","_"};
		   
	          
	      //초기치 작업인데 사실 프로그램 작성시에는 먼저 쓰지 않음  
	       String ip;
	      // int cnt=0;
	       int sw=0;
	       //count와 flag기법
	       
	       //처음에 jool(밑줄) 출력ㅡ
	       for(int j=0; j<5;j++)
	           System.out.print(jool[j]);
	       System.out.println();
	       
	       
	       Scanner scan1=new Scanner(System.in);
	       
	       for(int i=1;i<=13;i++){///////////13-for-start
	    	 //cnt=0;  
	   	     System.out.println("예상글자입력:"); 
	         ip=scan1.next();  
	         for(int j=0; j<5;j++){//맞추었으면 밑줄지우고 대신 해당 문자를 아래로 
	        	   if(ip.equals(moonja[j]))//내용비교 
	        		  jool[j]=moonja[j]; //영문자를 밑줄로 내려보냄 
	         } 
	          /* a  p  p  l  e   ==> moonja배열
	         
	             a  p  p  -  -   ===> jool배열   */
	          
	          
	         
	         /*     apple 
	                _pp__      */
	         
	         for(int j=0; j<5;j++)
	             System.out.print(jool[j]);// 시작하자마자 p를 입력하고 맞추었으니 _pp__ 줄출력	
	         
	          
	         System.out.println("\t"+i+"번시도"); //1번시도 
	           
	         
	         
	         
	   
	        if(Arrays.equals(moonja, jool)){//true?  
	             System.out.println("참잘했어요");
	              sw=1;  
	        	  break;//반복문을 빠져 나오는 것으로 13-for-end 다음으로 exit 	   
	         }
	      
	      }/////////////////////////////  13-for-end
	       
	       

	        if(sw==0) //
	              System.out.print("다음기회에");
	         
	       }//main-end
//class-end 
	}


