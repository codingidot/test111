package pack;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Weight {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("키는");
		//I love you를 next()로 받으면 I nextInt()로 받으면 I love you 
		
		double ki=Double.parseDouble(sc.next()); 
		
		System.out.println("몸무게");
		double mom=Double.parseDouble(sc.next());
		double mk=ki/100.0;
		double bmd=mom/(mk*mk);
		
		System.out.println("비만도: "+bmd);
		
		if(bmd>=30) 
			 System.out.println("비만입니다");
		 else if(bmd>=25)
			        System.out.println("과체중입니다");
		 	  else if(bmd>=20)
		 		       System.out.println("보통");
		 	  	   else 
		 	  		   		System.out.println("저체중");
	
	//=========================================================
		
		
		
	}

}
