package seven;
//��α���  ������ ����
interface Samchon{ //��ӿ���
	//������ �����ϳ� ������ �ȵȴ� Child class���� ����
	//public x
	public void isBoat();
}

interface Komo{
	void isBoseok();
}

//�Ϻα���
class Booja{
		public void manaDon() {
			System.out.println("���� ������~~~");
		}
}


 class Na extends Booja implements Samchon, Komo  {
//Na�� isBoat, manaDon, useDon �޼ҵ� ��� ���� ����
	public void useDon() {
		System.out.println("���̻���~~~");
	}
	
	@Override
	public void isBoat() {
		System.out.println("��Ʈ Ÿ��~~~");
	}
	public void isBoseok() {
		System.out.println("���� ����~~~");
	}
	
	
	

}
