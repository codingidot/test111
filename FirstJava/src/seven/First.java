package seven;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		try {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("첫번째수는: ");
		String one1=sc.nextLine(); //문자열 받는 것
		//빈칸포함 한줄 다 입력   //i love you 한줄 다읽음
		// 벗뜨(But) next()는 i만 입력 ~~~
		
		int soo1=Integer.parseInt(one1);
		
		System.out.println("두번째수는: ");
		String two1=sc.nextLine();
		int soo2=Integer.parseInt(two1);
		
		System.out.println(soo1/soo2);
		//try catch가 없으면 jvm이 에러를 받아서 에러메세지를 나타냄
		//try catch가 있으면 jvm이 에러를 잡다가 
		}catch(NumberFormatException e) {
			System.out.println("형이말할께! 숫자로 입력하면 안되겠니!!!");
			System.out.println(e);
			System.out.println(e.getMessage());
		}catch(ArithmeticException e) {
			System.out.println("0이 아닌 값으로 입력하라는~~~5");
		}catch(Exception e) { //Exception은 모든 에러를 다처리할수 있으므로 마지막에 써야한다.
			System.out.println("에러났다는~~~");
			System.out.println("0이 아닌 두개의 정수를 입력하세요"); //에러시 대처방안
			System.out.println(e.getMessage());  //by Zero
			System.out.println(e); //.toString();
				//java.lang.Arith... /by Zero
		//oracle:ora-10976
			//c언어: errno 4069 file not found, perror()
			//자바: message
		}finally { //생략가능
			System.out.println("goooooooooooood");
			//db 접속 x, network 접속 x
		}
		
		}
	
	
	//예외 발생시 JVM에게 전달됨
	
	//예외: Exception(내장 클래스, 예외클래스중의 조상)
		//try{}: 예외날지도 몰라
		//catch{}: 예외 시 처리하기
		//finally{}: 무조건 처리
	
}
