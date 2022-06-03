package pack;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		System.out.println("입력");
		String i=sc.nextLine();
		
		System.out.println("입력");
		String j=sc.next();
		System.out.println("nextLine()"+i);
		System.out.println("next()"+j);
	}
}
