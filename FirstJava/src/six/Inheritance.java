package six;
	
	class Boomo{
		protected int diamond; //protectet: ��� ���迡����
		public void don() {
			System.out.println("�� ��� ����~~~~~");
		}
	}
	
	class Janyu extends Boomo{
		public void car() {
			diamond=3;
			System.out.println("������ ����~~~~~~~~~");
		}
	}
public class Inheritance {

	public static void main(String[] args) {
		//���(inheritace): ����
		
		//ĸ��ȭ, ���, �߻�ȭ, ������
		//oop =>�μ��̵�=>������
		//�տ����ۼ��� ������ �Ѱܹ޾� �� �߰��� ����� �����ϸ�....
		
		//1) 100% ���
		//2) �ڳ��� ����� �θ�� ���ų� ����
		//3) extends (is a kind of)
		//����� extends ���� (�ڳ� extends �θ�)
		
		Boomo b1=new Boomo();
		b1.don();
		
		Janyu j1=new Janyu();
		j1.car();
		j1.don();// ��ӹ��� �޼ҵ�
		System.out.println(j1.diamond);
		
		//Q) �θ�: Animal �޼ҵ�: move()
		//   �ڳ�: Fish �޼ҵ�: swim()
		
		
		
		
		
		
		
		//����Ŭ �����ͺ��̽� ��ġ
		//https://www.oracle.com/database/technologies/xe18c-downloads.html
	}

}
