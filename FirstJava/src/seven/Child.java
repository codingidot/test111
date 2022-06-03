package seven;

import java.util.Scanner;

class Parent{
	public void car() {
		System.out.println("엄마차로 드라이브");
	}
}

public class Child extends Parent {

	@Override
	public void car() {
		System.out.println("아들차로 여행");
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("어느차를 타겠습니까?");
		int sel=sc.nextInt();
		Parent p7=null;
		switch(sel) {
		case 1:
			p7=new Parent();
			p7.car();
			break;
			
		case 2:
			p7=new Child();
			p7.car();
			break;
		
		default:
			System.out.println("1과2중에 선택하삼");
		}
	}
	
}
