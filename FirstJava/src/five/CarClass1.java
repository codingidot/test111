package five;
//��ü�� life cycle
//new�ϸ� ��ü�� ����
//�ڵ����� �ʱ�ġ�� ��(���ڴ� 0,,,): "default construction"
//��������ϴٰ� 
// ���߿� ��ü�� �Ҹ� �ȴٴ�(������������� ����:Garbage Collecotr(java, c#)
//�Ҹ�Ǳ����� �Ҹ��ڰ� ����: ��ü�� ���� 
//c++���� ���� �����ڰ� ���� ��ü(���ݺ��� �ٸ� ������ ������ ��ü)�� ������
//�� �׷��� ������ ���ƾ��ϴµ� ����� ���(dangling pointer problem, ������ �ϴµ� �������� memory leak
class Car{  //����, ����
	
	private String color; //�Ӽ�, �ʵ�
	private int door;
	public void dirve() { //�޼ҵ�
		System.out.println("������ ����̺�����");
	}
	public Car() {};
	public Car(String color, int door) {//�޼ҵ� 2���� �޼ҵ� ���ǹ��� ����, void�� String���� ��ȯ�� ���� �ȵȴ�, return�� �Ⱦ���
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
		//����, ����
		Car car=new Car(); //�ʱ�ġ�� �ִ°� �����ڶ�� �ϰ� Car�� default�����ڰ� �����Ƿ� default���� ������ ���ִ�.
		Car mycar=new Car("blue", 3);// �޼ҵ� 2���İ� ����
		
		car.setColor("blue");
		System.out.println(car.getColor());
		car.dirve();
	
		car.setDoor(2);
		System.out.println(car.getDoor());
		
		Car yourcar=new Car(); //heap�� ���ο� �ν��Ͻ��� ��������
		yourcar.setColor("white");
		yourcar.setDoor(6);
		
		
		 
	}

}

	//ķ��ȭ: �ʵ�(�Ӽ�)+�޼ҵ尡 ���� �̷�� ��
                  //��������
