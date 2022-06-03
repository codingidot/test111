package five;
//객체의 life cycle
//new하면 객체가 생성
//자동으로 초기치가 들어감(숫자는 0,,,): "default construction"
//계속진행하다가 
// 나중에 객체가 소멸 된다는(쓰레기전담반이 가동:Garbage Collecotr(java, c#)
//소멸되기전에 소멸자가 가동: 객체를 정리 
//c++같은 경우는 개발자가 직접 객체(지금보다 다른 간단한 형태의 객체)를 지워야
//ㄴ 그래서 지우지 말아야하는데 지우는 경우(dangling pointer problem, 지워야 하는데 안지워서 memory leak
class Car{  //설계, 정의
	
	private String color; //속성, 필드
	private int door;
	public void dirve() { //메소드
		System.out.println("멋지게 드라이브하자");
	}
	public Car() {};
	public Car(String color, int door) {//메소드 2형식 메소드 정의문과 유사, void나 String같은 반환형 쓰면 안된다, return도 안쓴다
		this.color=color;
		this.door=door;
				
	}
	
	public void setColor(String color) {
			 this.color=color; 
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

	public static void main(String[] args) {
		//제작, 생성
		Car car=new Car(); //초기치를 넣는걸 생성자라고 하고 Car는 default생성자가 있으므로 default값이 변수에 들어가있다.
		Car mycar=new Car("blue", 3);// 메소드 2형식과 유사
		
		car.setColor("blue");
		System.out.println(car.getColor());
		car.dirve();
	
		car.setDoor(2);
		System.out.println(car.getDoor());
		
		Car yourcar=new Car(); //heap에 새로운 인스턴스가 생성됐음
		yourcar.setColor("white");
		yourcar.setDoor(6);
		
		
		 
	}

}

	//캠슐화: 필드(속성)+메소드가 쌍을 이루는 것
                  //정보은닉
