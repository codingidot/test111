package seven;

public class NaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Na na1=new Na();
		na1.useDon(); // 원래 나
		na1.isBoat();  //상속된것 interface
		na1.manaDon(); //상속된것 extends
		//결국 설계도를 대충그린 interface방법으로 다중상속을 한것
		
		//위까지 확인 했으면 고모로 부터 보석 많음을 아래처럼 출력하도록 작성하시오
		
		na1.isBoseok();
	
	}

}
//interface의 추가 역할
// (1)c언어의 함수의 원형
// (함수호출문, 함수정의문)
// (2) 협업
// (3) 실제 내용의 원형 or spring db연결시 사용

/*
 * 추상화(abstraction):대충클래스(interface와 abstraction은 사촌간)
 * 
 * 가독성, 다형성(polymorphism)
 * 		
 * 	  과일 
 * 사과 배 감
 * 
 * interface나 abstract 모두 전제조건이 "상속에 있어서"
 */