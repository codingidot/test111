package four;

import java.util.Arrays;
import java.util.Scanner;

public class HangMan2 {

	public static void main(String[] args) {//�������� Ǭ��
		String [] moonja={"a","p","p","l","e"}; //���ڿ��迭 
	       String [] jool={"_","_","_","_","_"};
		   
	          
	      //�ʱ�ġ �۾��ε� ��� ���α׷� �ۼ��ÿ��� ���� ���� ����  
	       String ip;
	      // int cnt=0;
	       int sw=0;
	       //count�� flag���
	       
	       //ó���� jool(����) ��¤�
	       for(int j=0; j<5;j++)
	           System.out.print(jool[j]);
	       System.out.println();
	       
	       
	       Scanner scan1=new Scanner(System.in);
	       
	       for(int i=1;i<=13;i++){///////////13-for-start
	    	 //cnt=0;  
	   	     System.out.println("��������Է�:"); 
	         ip=scan1.next();  
	         for(int j=0; j<5;j++){//���߾����� ��������� ��� �ش� ���ڸ� �Ʒ��� 
	        	   if(ip.equals(moonja[j]))//����� 
	        		  jool[j]=moonja[j]; //�����ڸ� ���ٷ� �������� 
	         } 
	          /* a  p  p  l  e   ==> moonja�迭
	         
	             a  p  p  -  -   ===> jool�迭   */
	          
	          
	         
	         /*     apple 
	                _pp__      */
	         
	         for(int j=0; j<5;j++)
	             System.out.print(jool[j]);// �������ڸ��� p�� �Է��ϰ� ���߾����� _pp__ �����	
	         
	          
	         System.out.println("\t"+i+"���õ�"); //1���õ� 
	           
	         
	         
	         
	   
	        if(Arrays.equals(moonja, jool)){//true?  
	             System.out.println("�����߾��");
	              sw=1;  
	        	  break;//�ݺ����� ���� ������ ������ 13-for-end �������� exit 	   
	         }
	      
	      }/////////////////////////////  13-for-end
	       
	       

	        if(sw==0) //
	              System.out.print("������ȸ��");
	         
	       }//main-end
//class-end 
	}


