package seven;
abstract class Kwail{//�߻�޼��尡 �ϳ��� ������ �߻� Ŭ����
	public void good() {
		System.out.println("������ ����");
	}
	public abstract void mukja(); //�߻�޼ҵ� //������ ���������� ������ �ȵȴ�. 
}

class Sakwa extends Kwail{
	public void mukja() {
		System.out.println("����� �簢�簢 ����");
	}
}

class Bae extends Kwail{
	public void mukja() {
		System.out.println("�踦 ����� ������� ��� ����");
	}
}

class Kam extends Kwail{
	public void mukja() {
		System.out.println("���� �������� ���ְ� ���ڴ�~~~");
	}
}
public class Abstraction {
	//�߻�ȭ�� �ֵ� ������ �������̴�
	public static void main(String[] args) {
		Kwail k1=new Sakwa();
		k1.mukja();
		
		Kwail k2=new Bae();
		k2.mukja();
		
		Kwail k3=new Kam();
		k3.mukja();
		
	}

}

//���� �ݿ��ϱ���
//Collection
//map
//list
//set ������ ��¡�� ���Ͽ� �����ؼ� �޸��忡 �־� ���������� ������
