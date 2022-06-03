package pack;

import java.util.Scanner;

public class String2 {

	public static void main(String[] args) {
		int pp=100; //stack에 잡힘
		String aaa="ondal"; //heap메모리에 잡힘, stack 메모리에 aaa라는 기억창고가 만들어지고 
		//aaa라는 기억창고에 ondal의 heap메모리 위치를 나타내는 번지를 저장한다.
		
		String ppp=null; //null pointer error , heap에 잡히지 않으므로 ppp에 주소가 없다.
		String qqq="";//빈 문자열 (길이가 0인 문자열) heap에 빈문자열이 들어가 있고 스택에 qqq로 메모리주소가 들어감    // "  "
		
	  //System.out.println(ppp.length()>0); //null pointer error 
		System.out.println(qqq.length()>0); //false; 길이가 0이니까
		
		
		String aa="ondal";
		String bb="ondal"; //aa와 내용이 같으므로 heap메모리에 이미 만들어진 "ondal"을 사용하고 스택에도 같은 번지가 잡힘 중요
		
		if(aa==bb) { //똑같은 번지인지 물어본거 중요
			System.out.println(aa+"\t"+bb);
		}
		
		if(aa.equals(bb)) { //내용이 같은지 물어보는것 중요   번지하고 내용이 틀린걸 문제로 낸다
			System.out.println(aa+"\t"+bb);
		}
	
		/*
		 * 키와 몸무게 각각 변수에 넣은후(Scanner사용) bmi를 구하는 자바 프로그램을 작성하시오 
		 * 단, 30이상이면 비만 
		 * 25~30이면 과체중
		 * 20-~25 보통 
		 * 20 미만이면 저체중 
		 * 비만도=몸무게/ 미터 키의 제곱 100/(1.8*1.8)
		 *
		 */
		 Scanner sc=new Scanner(System.in);
		System.out.print("몸무게를 입력하세요: ");
		 String weight=sc.next();
		 double Dweight=Double.parseDouble(weight);
		 System.out.println();
		 System.out.print("키를 입력하세요(cm로 입력): ");
		 String height=sc.next();
		 double Dheight=Double.parseDouble(height)/100;
		
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
