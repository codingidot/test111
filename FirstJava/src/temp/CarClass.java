package temp;

class Car{  //����, ����
	String color; //�Ӽ�, �ʵ�
	int door;
	public void dirve() { //�޼ҵ�
		System.out.println("������ ����̺�����");
	}
	
	
	
}




public class CarClass {

	public static void main(String[] args) {// main���� �����ؼ� main���� ������ ���� �ǹǷ� ����ȿ��� ����
		// TODO Auto-generated method stub
		//����, ����
		Car car=new Car();
		
		//���
		car.color="navy";
		car.door=4;
		
		System.out.println(car.color+"\t"+car.door);
		car.dirve();
		
	}

}

	//ķ��ȭ: �ʵ�(�Ӽ�)+�޼ҵ尡 ���� �̷�� ��
                  //��������
