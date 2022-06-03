package six;
class Parent{
	public void car() {
		System.out.println("부모차타고 드라이브하자는~~~~");
	}
	
}

class Child extends Parent{
	public void car() {
		System.out.println("자녀차 타고 가자는~~~~");
	}
	//overriding 재정의
}

public class Sangsok1 {

	public static void main(String[] args) {
		
		Parent p1=new Parent();
		Child c1=new Child();
		
		p1.car();
		c1.car();
		
		
		//------------------객체의 형변환-----------
		Parent p2= c1;
		Child c2=(Child)p1;
	}

}
