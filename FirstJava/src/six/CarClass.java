package six;

class Car{  //����, ����
	String color; //�Ӽ�, �ʵ�
	int door;
	public Car(String color, int door) {
			this.color=color;
			this.door=door;
			
	}
	
	public Car() {};
	public void dirve() { //�޼ҵ�
		System.out.println("������ ����̺�����");
	}
	
	public void chool() {//������� �޼ҵ�(�����ڰ� ������)
		System.out.println("�ڵ�����="+color+"\t �� ����="+door);

	}

	@Override
	public String toString() { //�޼ҵ� 3���� ���ǹ� ��Ÿ��
		return "�ڵ�����="+color+"\t �� ����="+door;
 
	}
	
	
	
}




public class CarClass {

	public static void main(String[] args) {// main���� �����ؼ� main���� ������ ���� �ǹǷ� ����ȿ��� ����
		// TODO Auto-generated method stub
		//����, ����
		Car car=new Car(); //����Ʈ �����ڸ� ���� ���� ����� �Ѵ�.
		Car car1=new Car("black", 4);
		Car mycar=new Car("white", 2);
		
		//���
		car.color="navy";
		car.door=4;
		
		car.dirve();
		car1.chool();
		car.chool();
		System.out.println(mycar);//mycar.toString�� ��µȴ�.
		
		System.out.println(mycar.toString());
		//overloading vs overriding(������)
		
		//��ü�� ���� ~~~~> object(�Ӽ�, �޼ҵ�)
		//toString()  ===>�������ؼ� ��밡��
	}

}

	//ķ��ȭ: �ʵ�(�Ӽ�)+�޼ҵ尡 ���� �̷�� ��
                  //��������
