package three;

public class Method4 {
	//Method Overloading
	
	//overloading(�޼��� �ߺ�) vs overriding(������)
	//overloading�� �������� ���̱� ���Ѱ�
	//atof() atoi() atol() 
	
	//kaja(); //�޼��� 1����
	
	//kaja2(100); //�޼��� 2���� ȣ�⹮ , ����, argument
				 //�޼��� ���ǹ����� kaja(int soo){ //soo�� �Ű�����, parameter
	
	//kaja3(100.7);
	// ���⼭�� �������� ������ �ƴ� �Ǽ���� �� ....
	//�׷��ٸ� �޼ҵ� �̸��� ���� ���� �ȵǴ� ��???
	//why? �̷��� ������ ��ΰ� �Ǿ������?
	//�켱 �������� �� ������ ����
	// �׷��ٸ� �ѹ� �õ��غ��� ����� �����غ���
	
	public static void main(String[] args) {
		
		int aa=100;
		double bb=100.7;
		
		kaja(aa); //�޼��� 2���� ȣ�⹮
		kaja(bb); //�̸��� ���Ƶ���
		kaja();
		
	//overrloading ����
	//1. method �̸��� ���ƾ�
	//2. ������ Ÿ���� �ڸ��ų� ������ �޾ƾ��Ѵ�
	}

	private static void kaja() {
		// TODO Auto-generated method stub
		
	}

	private static void kaja(double bb) {
		// TODO Auto-generated method stub
		
	}

	private static void kaja(int aa) {
		// TODO Auto-generated method stub
		
	}
	
}
