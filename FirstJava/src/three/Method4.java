package three;

public class Method4 {
	//Method Overloading
	
	//overloading(메서드 중복) vs overriding(재정의)
	//overloading은 가독성을 높이기 위한것
	//atof() atoi() atol() 
	
	//kaja(); //메서드 1형식
	
	//kaja2(100); //메서드 2형식 호출문 , 인자, argument
				 //메서드 정의문에서 kaja(int soo){ //soo는 매개변수, parameter
	
	//kaja3(100.7);
	// 여기서의 차이점은 정수가 아닌 실수라는 것 ....
	//그렇다면 메소드 이름을 같게 쓰면 안되는 지???
	//why? 이러한 질문이 대두가 되었을까요?
	//우선 복잡하죠 즉 가독성 문제
	// 그렇다면 한번 시도해봐서 결과를 예측해보자
	
	public static void main(String[] args) {
		
		int aa=100;
		double bb=100.7;
		
		kaja(aa); //메서드 2형식 호출문
		kaja(bb); //이름이 같아도됨
		kaja();
		
	//overrloading 조건
	//1. method 이름은 같아야
	//2. 인자의 타입이 자르거나 갯수가 달아야한다
	}

	private static void kaja() {
		// TODO Auto-generated method stub
		
	}

	private static void kaja(double bb) {
		// TODO Auto-generated method stub
		
	}

	private static void kaja(int aa) {
		// TODO Auto-generated method stub
		
	}
	
}
