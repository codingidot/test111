package seven;

public class Conversion {

	public static void main(String[] args) {
		
		int aa=2345;
		short bb=(short)aa;//int--> short int
		
		
		//AutoBoxing(int-->참조타입변수)
		int cc=3;
		Integer dd=cc; //Integer dd=new Integer(cc);
		//wrap을 해서 int 클래스화
		
		//AutoUnboxing(참조타입변수-->int)
		int ee=dd;
		
		//overloading
		// kaja();
		// kajs(20,30);
		
		//자녀객체가 부모객체, 부모객체 to 자녀객체
		
		//overriding(재정의) ( vs   overloading, 함수종복)
		
		//toString() -Object -속성과 메소드
		
		//그렇다면 overriding(재정의)
		//1) 상속에 있어서 메소드 이름이 같아야
		//2) 자녀는 부모보다 업그레이드 되어야
		
		//상속용어
		//부모객체, Parent, Base, 기본
		//자녀객체, Child, Derieved, 파생객체
		
		//flutter by google 안드로이드와 애플 모두 적용가능
	}

}
