package temp;

class Car11{  //설계, 정의
	//접근지정자(access modifier)
	//private : 자기 클래스 안에서만 접근이 가능
	//public : 외부 클래스에서 접근가능
	//protected: 상속에서만 접근가능
	//(default) : 같은 패키지 안에서만 접근가능, 
	private String color; //속성, 필드
	private int door;
	public void dirve() { //메소드
		System.out.println("멋지게 드라이브하자");
	}
	//접근하게 해주는 메소드는 public으로 만들어준다.
	public void setColor(String color) {//color를 받아주는 식구 //메소드 2형식 정의문
			 this.color=color; //자기자신을 참조하는 객체를 this로 나타냄
	}
	
	public String getColor() {
		return this.color;
	}
	public int getDoor() {
		return door;
	}
	public void setDoor(int door) {
		this.door = door;
	}
	
	
}




public class CarClass1 {

	public static void main(String[] args) {// main에서 시작해서 main으로 끝나게 실행 되므로 여기안에서 생성
		// TODO Auto-generated method stub
		//제작, 생성
		Car11 car=new Car11();
		
		car.setColor("blue");
		System.out.println(car.getColor());
		car.dirve();
	
		car.setDoor(2);
		System.out.println(car.getDoor());
	}

}

	//캠슐화: 필드(속성)+메소드가 쌍을 이루는 것
                  //정보은닉
