package pack; //현재 방의 이름

import java.util.Scanner; //내가 사용할 방이름을 끌고와서 쓰겠다는 것

public class SecondDay {

	public static void main(String[] args) {
		//문제 1-100 사이의 정수를 입력받아 50이상이 들어왔으면 "50이상이네"를 출력하시오
		
		//1-100사이의 정수를 입력 : 여기 입력
		//화면출력 : sysout
		//화면입력 : Scanner 내장클래스
		
		Scanner sc5=new Scanner(System.in); //ctrl +Shift + o를 누르면 자동으로 import됨
		System.out.print("1-100사이의 정수를 입력: ");
		int bada=sc5.nextInt();
		
		if(bada>=50) {
			System.out.println("50이상");
		}
		/* 여러줄 주석은 드래그하고 ctrl + shift + / */
		// ctrl + shift + \는 주석이 풀린다
		//ctrl + shift + L 을 누르면 단축키들을 볼수있다.
		
		//c언어에서 getchar() get character ==> getche()
		//국어, 영어, 수학점수
		//getchar() getchar() getchar()
		//100 엔터 90엔터 에러
		//100울 getchar()가 받고 엔터를 getchar()가 받았다 그래서 에러가 뜬다
		
		//자바에서는 nextInt();, nextDouble() 이런것들도 위와 같은 문제가 발생한다.
		//그래서 next() : 문자열 받는 방식 "ondal" 
		//char : 한글자 받는다
		
		Scanner sc55=new Scanner(System.in); //ctrl +Shift + o를 누르면 자동으로 import됨
		System.out.print("1-100사이의 정수를 입력: ");
		String bada2=sc55.next(); //String은 heap에 저장된다 중요
		
		//문자열을 숫자로 변경
		int bada5=Integer.parseInt(bada2);
		// c언어 함수로는 atoi() : alphabet to int  , atof()
		if(bada5>=50) {
			System.out.println("50이상");
		}
		

		
	}

}
