package five;
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
	public BBang(String bread, int price) {
		this.bread=bread;
		this.price=price;
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
}

	
	public class Bakery {

	public static void main(String[] args) {
			BBang pizza= new BBang("���ڻ�", 2000);
			BBang soboroo= new BBang("�Һ��继", 1000);
			//BBang dd=new BBang(); // 
			System.out.println(pizza.getBread()+"\t"+pizza.getPrice()+"��");
			System.out.println(soboroo.getBread()+"\t"+soboroo.getPrice()+"��");
			pizza.delicous();
	}

}
