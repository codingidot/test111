package seven;

public class Sangsok1 {

	public static void main(String[] args) {
		Parent p1=new Parent();
		Child c1=new Child();
		
		p1.car();
		c1.car();
		
		
		//��ü�� ����ȯ
		Parent p2=c1;
		// Parent pe=new Child();
	
		//Child c2=p1; ��������
		
		//Child c2=new Parent(); ����
		
		//Child c3=p2; ����
		
		Child c3=(Child)p2; //���� �ȳ���
		
		Child c5=(Child)p1; //���� ��Ű�� ����, �������� ������ �ȵ����� rub�ϸ� ������ ����
		
		
		/* �θ�(Boomo), �ڳ�(Janyu) Ŭ������ ����Ͽ� ������ ����ȯ ���α׷��� �ۼ��Ͻÿ�*/
		
		//����� 
		
		//������� Ÿ�ðڽ��ϱ�? (�θ���=1, �ڳ���=2)
		//2
		//�ڳ���Ÿ�� ���డ��
		
		
		//���߻�� 
		//�ڹٿ��� ��� ����
		//���̾Ƹ�� ���� ������ �׷��� Diamond Problem ������ �׷���
		
		//===>interface : ����׸� ���赵(�Ϻ��� ���赵: class)
		// Ű���尡 �ٸ��� extends�� �ƴ�
		// class child extends father, mother�� ���߻���̶� ����
		
		//�ذ��
		//class father{}
		//interface mother{}
		//===> ����� class child extends father implements mother{} �̷��� ���߻���� �Ҽ��ִ�.
		//(��, mother���� method ���� o, ������ x �׷��Ƿ� ������ child���� ����� �Ѵ�)
	
	
	}

}
