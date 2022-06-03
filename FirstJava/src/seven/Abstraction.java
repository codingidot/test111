package seven;
abstract class Kwail{//추상메서드가 하나라도 있으면 추상 클래스
	public void good() {
		System.out.println("먹으면 좋아");
	}
	public abstract void mukja(); //추상메소드 //선언은 가능하지만 구현은 안된다. 
}

class Sakwa extends Kwail{
	public void mukja() {
		System.out.println("사과를 사각사각 먹자");
	}
}

class Bae extends Kwail{
	public void mukja() {
		System.out.println("배를 잠수함 모양으로 깍아 먹자");
	}
}

class Kam extends Kwail{
	public void mukja() {
		System.out.println("감은 꼭지떼고 맛있게 먹자는~~~");
	}
}
public class Abstraction {
	//추상화의 주된 목적은 다형성이다
	public static void main(String[] args) {
		Kwail k1=new Sakwa();
		k1.mukja();
		
		Kwail k2=new Bae();
		k2.mukja();
		
		Kwail k3=new Kam();
		k3.mukja();
		
	}

}

//과제 금요일까지
//Collection
//map
//list
//set 각각의 득징에 대하여 정리해서 메모장에 넣어 개인톡으로 보내라
