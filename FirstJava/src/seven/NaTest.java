package seven;

public class NaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Na na1=new Na();
		na1.useDon(); // ���� ��
		na1.isBoat();  //��ӵȰ� interface
		na1.manaDon(); //��ӵȰ� extends
		//�ᱹ ���赵�� ����׸� interface������� ���߻���� �Ѱ�
		
		//������ Ȯ�� ������ ���� ���� ���� ������ �Ʒ�ó�� ����ϵ��� �ۼ��Ͻÿ�
		
		na1.isBoseok();
	
	}

}
//interface�� �߰� ����
// (1)c����� �Լ��� ����
// (�Լ�ȣ�⹮, �Լ����ǹ�)
// (2) ����
// (3) ���� ������ ���� or spring db����� ���

/*
 * �߻�ȭ(abstraction):����Ŭ����(interface�� abstraction�� ���̰�)
 * 
 * ������, ������(polymorphism)
 * 		
 * 	  ���� 
 * ��� �� ��
 * 
 * interface�� abstract ��� ���������� "��ӿ� �־"
 */