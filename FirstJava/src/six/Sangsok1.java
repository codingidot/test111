package six;
class Parent{
	public void car() {
		System.out.println("�θ���Ÿ�� ����̺����ڴ�~~~~");
	}
	
}

class Child extends Parent{
	public void car() {
		System.out.println("�ڳ��� Ÿ�� ���ڴ�~~~~");
	}
	//overriding ������
}

public class Sangsok1 {

	public static void main(String[] args) {
		
		Parent p1=new Parent();
		Child c1=new Child();
		
		p1.car();
		c1.car();
		
		
		//------------------��ü�� ����ȯ-----------
		Parent p2= c1;
		Child c2=(Child)p1;
	}

}
