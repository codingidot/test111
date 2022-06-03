package pack;

import java.util.Scanner;

public class Again {

	public static void main(String[] args) {
		
		//반복문
		//do ~while
		//head, body 순으로 보통 되있지만 이건 body, head로 되어 있다.
		
		/*
		 * do { //block
		 * 
		 * }while(조건);  head쪽에 세미콜론 꼭 붙여야한다. 
		 * 
		 */
		
		/*
		 * do { int i=300 }
		 * while(i<300);
		 */
	//====================>키오스크에서 메뉴 만들때만 가능
	/*
	 * 1.아메리카노 
	 * 2.까페라떼
	 * 
	 * 선택하시오(1-2) 3을 누르면 다시 눌러주세요
	 */ 
	//문제 
	//================
	// 메뉴
		//1.짜장
		//2.짬뽕
	//================== a를 입력해도 메뉴가 다시 입력되도록
		Scanner sc=new Scanner(System.in);
		String choose;
		do {
		    System.out.println("1. 짜장면");
		    System.out.println("2. 짬뽕");
		    System.out.print("매뉴를 선택하세요 : ");
		    choose = sc.next();
		}while(!choose.equals("1")&&!choose.equals("2")); //.equals()메서드는 주소값을 비교하는게 아니라 입력값 잧체를 비교한다. 앞에!가 붙으면 달라야 true
		//while(choose!="1"&&choose!="2")//이렇게 하면 내용과 주소를 비교하는것이므로 안된다
		   System.out.println("맛잇게 드세요!!");
		   
		   
		   
	}

}
