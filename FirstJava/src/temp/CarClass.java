package temp;

class Car{  //설계, 정의
	String color; //속성, 필드
	int door;
	public void dirve() { //메소드
		System.out.println("멋지게 드라이브하자");
	}
	
	
	
}




public class CarClass {

	public static void main(String[] args) {// main에서 시작해서 main으로 끝나게 실행 되므로 여기안에서 생성
		// TODO Auto-generated method stub
		//제작, 생성
		Car car=new Car();
		
		//사용
		car.color="navy";
		car.door=4;
		
		System.out.println(car.color+"\t"+car.door);
		car.dirve();
		
	}

}

	//캠슐화: 필드(속성)+메소드가 쌍을 이루는 것
                  //정보은닉
