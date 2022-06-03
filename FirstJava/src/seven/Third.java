package seven;

import java.util.Scanner;

public class Third {

	public static void main(String[] args) {
		try {
		Scanner sc=new Scanner(System.in);
		System.out.println("첫번째수는: ");
		String one1=sc.nextLine(); 
		int soo1=Integer.parseInt(one1);
		
		System.out.println("두번째수는: ");
		String two1=sc.nextLine();
		int soo2=Integer.parseInt(two1);
		
		//-----------------------------
		int bada=kaja(soo1, soo2); //메소드 2,3형식
		System.out.println(bada);
		//--------------------------------
	}catch(Exception e) {
		System.out.println("여기서 에러 처리한다는~~~~");
	}
	}

	private static int kaja(int soo1, int soo2)
		throws ArithmeticException{	//강제로 에러 발생시킨건 throw이고 throws는 왔던데로 다시 돌려보낸다(위에 메소드 적은데)
		//throws=try-catch와 같다.
		return soo1/soo2;
	}

}
