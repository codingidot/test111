package seven;

import java.util.Scanner;

/* 부모(Boomo), 자녀(Janyu) 클래스를 사용하여 개겣의 형변환 프로그램을 작성하시오*/

//결과는 

//어느차를 타시겠습니까? (부모차=1, 자녀차=2)
//2
//자녀차타고 여행가자

class Boomo{
	public void car() {
		System.out.println("부모차");
	}
}
public class Janyu extends Boomo {

	@Override
	public void car() {
		System.out.println("자녀차");
	}
	
	public static void main(String[] args) {
		Boomo b1=new Boomo();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("어느차를 타시겠습니까(부모차=1, 자녀차=2");
		String s=sc.next();
		if(s.equals("1")) {
			b1.car();
		}else if(s.equals("2")) {
			Boomo b2=new Janyu();
			b2.car();
		}else {
			System.out.println("1과 2중에 선택해주세요");
		}
		
	}
	
}
