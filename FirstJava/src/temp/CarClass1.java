package temp;

class Car11{  //����, ����
	//����������(access modifier)
	//private : �ڱ� Ŭ���� �ȿ����� ������ ����
	//public : �ܺ� Ŭ�������� ���ٰ���
	//protected: ��ӿ����� ���ٰ���
	//(default) : ���� ��Ű�� �ȿ����� ���ٰ���, 
	private String color; //�Ӽ�, �ʵ�
	private int door;
	public void dirve() { //�޼ҵ�
		System.out.println("������ ����̺�����");
	}
	//�����ϰ� ���ִ� �޼ҵ�� public���� ������ش�.
	public void setColor(String color) {//color�� �޾��ִ� �ı� //�޼ҵ� 2���� ���ǹ�
			 this.color=color; //�ڱ��ڽ��� �����ϴ� ��ü�� this�� ��Ÿ��
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

	public static void main(String[] args) {// main���� �����ؼ� main���� ������ ���� �ǹǷ� ����ȿ��� ����
		// TODO Auto-generated method stub
		//����, ����
		Car11 car=new Car11();
		
		car.setColor("blue");
		System.out.println(car.getColor());
		car.dirve();
	
		car.setDoor(2);
		System.out.println(car.getDoor());
	}

}

	//ķ��ȭ: �ʵ�(�Ӽ�)+�޼ҵ尡 ���� �̷�� ��
                  //��������
