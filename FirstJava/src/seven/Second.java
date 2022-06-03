package seven;

import java.util.Scanner;

public class Second {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("첫번째수는: ");
		String one1=sc.nextLine(); //문자열 받는 것
		//빈칸포함 한줄 다 입력   //i love you 한줄 다읽음
		// 벗뜨(But) next()는 i만 입력 ~~~
		
		int soo1=Integer.parseInt(one1);
		
		System.out.println("두번째수는: ");
		String two1=sc.nextLine();
		int soo2=Integer.parseInt(two1);
		
		//-----------------------------
		int bada=kaja(soo1, soo2); //메소드 2,3형식
		System.out.println(bada);
		//--------------------------------
		
	}

	private static int kaja(int soo1, int soo2) {
		if(soo2==0) {
			System.out.println("0으로 나눌 수 없다고 전해라~~~");
			throw new ArithmeticException(); //개발자가 에러를 던지는건 throw 시스템이 주는 에러를 받는게 catch
		}else
			
		return soo1/soo2;
	}

}
