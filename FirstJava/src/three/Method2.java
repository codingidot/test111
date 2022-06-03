package three;

import java.util.Scanner;

public class Method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//키, 몸무게는 ㅇ여기서 입력받고 키, 몸무게값을 메서드정의문으로 보내서
		//bmi 및 비만, 저체중 등의 결과처리를 할수 있도록 자바 프로그램을 작성하시오
		
		
		 Scanner sc=new Scanner(System.in);
			System.out.print("몸무게를 입력하세요: ");
			 String weight=sc.next();
			 double Dweight=Double.parseDouble(weight);
			 System.out.println();
			 System.out.print("키를 입력하세요(cm로 입력): ");
			 String height=sc.next();
			 double Dheight=Double.parseDouble(height)/100;
			 bmi(Dweight, Dheight);
			}

	private static void bmi(double Dweight, double Dheight) {
		// TODO Auto-generated method stub
		
		double bManDo=Dweight/(Dheight*Dheight);
		 System.out.println("bmi:"+bManDo);
		 if(bManDo>=30) 
			 System.out.println("비만입니다");
		 else if(bManDo>=25)
			        System.out.println("과체중입니다");
		 	  else if(bManDo>=20)
		 		       System.out.println("보통");
		 	  	   else 
		 	  		   		System.out.println("저체중");
	}


}
