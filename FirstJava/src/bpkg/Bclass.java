package bpkg;

public class Bclass {

	public static void main(String[] args) {
		
		//한 플젝에는 관련있는 것끼리
		// + - * / ==> + - * / c언어랑 java랑 같음
		//> < >= <= = 이것도 같음
		//== != 같냐고 물어볼때 ==두개임
		//and or not
		// && || !
		
		System.out.println(5>3); //true
		System.out.println(5==3); //false
		
		System.out.println(10/3);//3 //sysout + ctrl-spacebar
		// 정수/정수=정수
		// 정수/실수=실수 10/3.0=3.3333...
		// 실수/정수=실수
		// 실수/실수=실수
		
		int ff=2147483647; //0111 1111 1111 1111
		int hh=1;// 0000 0000 0000 0001
		int jj=ff+hh; //여기서 오류가 날거 같은것은? 결과적으로 아무것도 오류 안뜸
		System.out.println(jj);
		//결과값이 이거임 -2147483648 1000 0000 0000 0000
		//
		//whitebox 프로그램 소스로 오류체크 blackbox 실행하면서 오류체크
		
		short aaa=100;
		int bbb=aaa; //short를 int에 넣었는데 에러 안난다. 작은거에서 더큰데로 넣었기 때문에
		// 작은거에서 큰거로 가는걸 암시적 형변환(implicit conversion)
		
		int aaaa=100;
		 short bbbb=(short)aaaa;// 에러뜬다  , 숫자가 우연히 작으면 잘려도 그대로 들어간다 에러안남 
		 //형변환            
		 //명시적 형변환(explicit conversion)
		 //(short)와 같은걸 형변환 연산자라고 한다. 형변환 연산자(cast 연산자)
		 // double (실수 3.798) 8byte, 배정도실수(3.44442423...)
		 // float    4byte, 단정도실수 (3.567845)소수점 6개까지 ,실수의 기본형    
		 // char aa='A'; char bb='홍' 2byte
		 //boolean 1byte로 처리
		 // 위와 같은 모든 변수들은 stack memory에 기억된다!!
		 
		 //문제 
		 //달에서의 몸무게는 지구의 1/6이다.
		 //몸무게가 100kg인 사람이 달에서 재보면 ?
		 int weight=100;
		 double moonWeight=weight/6.0; //6.0이 아니라 6으로 하면 16이 나옴
		 System.out.println(moonWeight); //16.666666666666668
		 //소수 이하 둘째 자리까지 구하고 싶다
		 System.out.printf("달에서 몸무게= %.2f\n", moonWeight); //c언어임
		 
		 // 30+20==> 50  "tom" +"jerry" ==>tomjerry
		 
		 //배수 구하기?
		 // 2의 배수냐?  2로 나누어 떨어지면 된다
		 // 10/3     10%3
		 //10이 2의 배수인지 알려면 
		 //10%2==0
		 if(10%2==0) { //같냐 물어보는거니 =두개 써야함
			 System.out.println("2의 배수");
		 }else {
			 System.out.println("2의 배수가 아님");
		 }
		 
		 
		 //if(조건문){ //1형식
		 //yes;}
		 
		 
		 if(5>3){
			 int k100; 
		 }
		 
		 //if(조건문){ //2형식
		 //yes;}
		 //else{
		 // no;
		 //}
		 
		 if(5>3) {
			 int k100=7;
		 }else {
			 int p=100;
		 }
		 
		 //문제   87점이 상 중 하 어느 등급인지 구하시오
		 //(단, 80-100 상 60-80 중 그 아래는 하)
		 int score=87;
		 if(score>80)  //이렇게 바디{ }에 한문장만 있는경우에는 {}생략 가능하다 
			 System.out.println("상");
		  else if(score>60) 
			   System.out.println("중");
		  	   else 
			   System.out.println("하");
		 //nested기법 짝에 맞게 맞춰줌 예를들어 if와 else의 칸을 맞춰줌
		 
		 //다중 if , 중첩 if 라고한다
		 
		 // 문제 i 값이 270일때 i가 3의 배수이면 "거봐", 5의 배수이면 "아하" , 3과 5 동시 배수이면
		 //"동시배수배수~~~"를 출력하는 자바 프로그램을 작성하시오
		 
		 int i=270;
		 if(i%15==0) 
			System.out.println("동시배수배수~~~"); 
		 else if(i%5==0) 
			 	System.out.println( "아하");
		      else if(i%3==0)
		    	  System.out.println("거봐");
		           else
		        	   System.out.println("3의 배수도 5의 배수도 아닙니다");
		    	  
		 
	}

}
