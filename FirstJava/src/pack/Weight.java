package pack;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Weight {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Ű��");
		//I love you�� next()�� ������ I nextInt()�� ������ I love you 
		
		double ki=Double.parseDouble(sc.next()); 
		
		System.out.println("������");
		double mom=Double.parseDouble(sc.next());
		double mk=ki/100.0;
		double bmd=mom/(mk*mk);
		
		System.out.println("�񸸵�: "+bmd);
		
		if(bmd>=30) 
			 System.out.println("���Դϴ�");
		 else if(bmd>=25)
			        System.out.println("��ü���Դϴ�");
		 	  else if(bmd>=20)
		 		       System.out.println("����");
		 	  	   else 
		 	  		   		System.out.println("��ü��");
	
	//=========================================================
		
		
		
	}

}
