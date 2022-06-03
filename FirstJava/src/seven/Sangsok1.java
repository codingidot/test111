package seven;

public class Sangsok1 {

	public static void main(String[] args) {
		Parent p1=new Parent();
		Child c1=new Child();
		
		p1.car();
		c1.car();
		
		
		//객체의 형변환
		Parent p2=c1;
		// Parent pe=new Child();
	
		//Child c2=p1; 에러난다
		
		//Child c2=new Parent(); 에러
		
		//Child c3=p2; 에러
		
		Child c3=(Child)p2; //에러 안난다
		
		Child c5=(Child)p1; //실행 시키면 에러, 컴파일은 에러가 안되지만 rub하면 에러가 난다
		
		
		/* 부모(Boomo), 자녀(Janyu) 클래스를 사용하여 개겣의 형변환 프로그램을 작성하시오*/
		
		//결과는 
		
		//어느차를 타시겠습니까? (부모차=1, 자녀차=2)
		//2
		//자녀차타고 여행가자
		
		
		//다중상속 
		//자바에서 허락 안함
		//다이아몬드 문제 때문에 그렇다 Diamond Problem 때문에 그렇다
		
		//===>interface : 대충그린 설계도(완벽한 설계도: class)
		// 키워드가 다르다 extends가 아님
		// class child extends father, mother는 다중상속이라 오류
		
		//해결법
		//class father{}
		//interface mother{}
		//===> 방법은 class child extends father implements mother{} 이렇게 다중상속을 할수있다.
		//(단, mother에는 method 정의 o, 구현은 x 그러므로 구현은 child에서 해줘야 한다)
	
	
	}

}
