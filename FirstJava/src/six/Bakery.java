package six;
//���� 
//������(Bakery.java  -BBangŬ����)���� �������� �������� �׸��� "���� ���ְ� ����"�� ����ϴ� �޼ҵ带
//�����Ͽ� ��Ϸ��� �Ѵ�.
//�̿����� OOP(object oriented programming)�� ����ÿ� 
//��¿�
//���ڻ�	2000��
//�Һ��继	 1000��
//���� ���ְ� ����

	class BBang {
	private String bread;
	private int price;
	public void delicous() {
		System.out.println("���� ���ְ� ����");
	}
	
	//������ �����ε�(constructor overloading)
	public BBang() { //�����ڰ� �ۼ��� ����Ʈ ������
		// TODO Auto-generated constructor stub
	}
	public String getBread() {
		return bread;
	}
	public void setBread(String bread) {
		this.bread = bread;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public BBang(String bread, int price) {
		this.bread=bread;
		this.price=price;
	}
	
	public void chool() {//������¸޼ҵ�
		
		System.out.println(bread+"\t"+price+"��");
	}

	@Override
	public String toString() {
		return bread+"\t"+price+"��";
	}
	
}

	
	public class Bakery {

	public static void main(String[] args) {
			BBang pizza= new BBang("���ڻ�", 2000);
			BBang soboroo= new BBang("�Һ��继", 1000);
			BBang dd=new BBang("ũ����", 2000); // ��Űġ�� �ԷµǴ� �����ڸ� ���� ����Ʈ �����ڸ� ���� ��������
			BBang tt=new BBang(); 
			BBang kk=new BBang("ī����", 3600);
			
			tt.setBread("������");
			tt.setPrice(8900);
			
			
			System.out.println(dd.getBread()+"\t"+dd.getPrice()+"��");
			System.out.println(pizza.getBread()+"\t"+pizza.getPrice()+"��");
			System.out.println(soboroo.getBread()+"\t"+soboroo.getPrice()+"��");
			tt.chool();
			System.out.println(kk);
			
			//��ȶ��� �ִµ� ����, ����÷�� �ϳ�(�� �ҽ��� �ܾ �޸��忡 �ְ� 
			//answer_1.txt ���� ==> ���� ÷��(���ϸ� �ѱ� x)
			// 2�� ���� answer_2.txt
			
	}

}
