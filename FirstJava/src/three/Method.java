package three;

public class Method {

	public static void main(String[] args) {// c#�� pascal�� �Ἥ Main()
		//main�� ȣ�⹮�� �����ϴ� �ý����� ������ �ִ� virtual machine
		//casing ����
		//naming
		//1) Pascal casing
		// ��) TotalSaraly ������Ʈ,Ŭ���� �̸�
		//2) Camel casing
		// ��) getScore  �޼���, ���� �̸�
		//(����) snake casing : employ_name database
		
		
		//�ʱ�ġ ��� ��� ��� ���� main���� ������ �ʰ� ������ �Ѵ�(���:module)
		choki(); //�޼��� ȣ�⹮,  c������ �Լ� �ڹٿ����� �޼ҵ� //�޼��� 1����
		keysan();//ȣ�⹮  //��¡�� ���� ��Ű�� ���ǹ����� ���ٰ� �ٽ� ���ƿͼ� ���� �޼��带 �����Ű�°� 1����
		chool();//ȣ�⹮
		//������ ������ ��Ű�鼭 ���𰡸� �ָ鼭 ��Ű�°��� 2����
		hapke(90, 85); //2���ĸ޼���
		//1����, 2������ ���ǹ� ���ٰ� ȣ�⹮ �ؿ��ٷ� ���ư��µ� 3������ ���ǹ����ٰ� ȣ�⹮���� ���ƿ� ȣ�⹮�� ����� ��ȯ���� ��Ÿ����(�߿�)
		//������ ������ ���״µ� ������ ������ �������� 3����
		String irumbatja=badaIrum(); //�޼��� 3������ ���� �޾ƾ���
		System.out.println(irumbatja);
		System.out.println(badaIrum());
	}// ��� ���α׷��� main���� �����ؼ� main���� ������. main ������ �ٸ����� �޼��带 ȣ���ؼ� ����

	private static String badaIrum() { //��ȯ�� String
		// TODO Auto-generated method stub
		return "ȫ�浿"; //return�� �ϳ��� ���ڸ� ����// return "ȫ", "��" �̷������� �ȵ� "ȫ"+"��"�� ����
	}

	private static void hapke(int i, int j) {
		// TODO Auto-generated method stub
		int t=i+j;
		System.out.println(t);
	}

	private static void chool() {// ���ǹ�
		// TODO Auto-generated method stub
		System.out.println("���ó��");
		
	}

	private static void keysan() {//���ǹ�
		// TODO Auto-generated method stub
		System.out.println("���ó��");
		
	}

	private static void choki() {//�޼��� ���ǹ�
		// TODO Auto-generated method stub
		System.out.println("�ʱ�ġó��");
	}

}
