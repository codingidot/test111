package six;

class Car{  //설계, 정의
	String color; //속성, 필드
	int door;
	public Car(String color, int door) {
			this.color=color;
			this.door=door;
			
	}
	
	public Car() {};
	public void dirve() { //메소드
		System.out.println("멋지게 드라이브하자");
	}
	
	public void chool() {//출력전문 메소드(개발자가 만들어야)
		System.out.println("자동차색="+color+"\t 문 갯수="+door);

	}

	@Override
	public String toString() { //메소드 3형식 정의문 스타일
		return "자동차색="+color+"\t 문 갯수="+door;
 
	}
	
	
	
}




public class CarClass {

	public static void main(String[] args) {// main에서 시작해서 main으로 끝나게 실행 되므로 여기안에서 생성
		// TODO Auto-generated method stub
		//제작, 생성
		Car car=new Car(); //디폴트 생성자를 따로 정의 해줘야 한다.
		Car car1=new Car("black", 4);
		Car mycar=new Car("white", 2);
		
		//사용
		car.color="navy";
		car.door=4;
		
		car.dirve();
		car1.chool();
		car.chool();
		System.out.println(mycar);//mycar.toString이 출력된다.
		
		System.out.println(mycar.toString());
		//overloading vs overriding(재정의)
		
		//객체의 조상 ~~~~> object(속성, 메소드)
		//toString()  ===>재정의해서 사용가능
	}

}

	//캠슐화: 필드(속성)+메소드가 쌍을 이루는 것
                  //정보은닉
