package three;

public class Method {

	public static void main(String[] args) {// c#은 pascal로 써서 Main()
		//main의 호출문은 실행하는 시스템이 가지고 있다 virtual machine
		//casing 원리
		//naming
		//1) Pascal casing
		// 예) TotalSaraly 프로젝트,클래스 이름
		//2) Camel casing
		// 예) getScore  메서드, 변수 이름
		//(참고) snake casing : employ_name database
		
		
		//초기치 계산 출력 등과 같이 main에서 다하지 않고 나눠서 한다(모듈:module)
		choki(); //메서드 호출문,  c언어에서는 함수 자바에서는 메소드 //메서드 1형식
		keysan();//호출문  //사징이 일을 시키면 정의문으로 갔다가 다시 돌아와서 다음 메서드를 실행시키는게 1형식
		chool();//호출문
		//사장이 직원을 시키면서 무언가를 주면서 시키는것이 2형식
		hapke(90, 85); //2형식메서드
		//1형식, 2형식은 정의문 갔다가 호출문 밑에줄로 돌아가는데 3형식은 정의문갔다가 호출문으로 돌아와 호출문을 지우고 반환값을 나타낸다(중요)
		//사장이 직원을 시켰는데 직원이 뭔가를 가져오면 3형식
		String irumbatja=badaIrum(); //메서드 3형식은 값을 받아야함
		System.out.println(irumbatja);
		System.out.println(badaIrum());
	}// 모든 프로그램은 main에서 시작해서 main으로 끝난다. main 사장이 다른데서 메서드를 호출해서 쓴다

	private static String badaIrum() { //반환값 String
		// TODO Auto-generated method stub
		return "홍길동"; //return은 하나의 인자만 가능// return "홍", "길" 이런식으로 안됨 "홍"+"이"는 가능
	}

	private static void hapke(int i, int j) {
		// TODO Auto-generated method stub
		int t=i+j;
		System.out.println(t);
	}

	private static void chool() {// 정의문
		// TODO Auto-generated method stub
		System.out.println("출력처리");
		
	}

	private static void keysan() {//정의문
		// TODO Auto-generated method stub
		System.out.println("계산처리");
		
	}

	private static void choki() {//메서드 정의문
		// TODO Auto-generated method stub
		System.out.println("초기치처리");
	}

}
