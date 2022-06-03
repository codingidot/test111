package five;
//문제 
//제과점(Bakery.java  -BBang클래스)에서 빵종류와 빵가격을 그리고 "빵을 맛있게 먹자"를 출력하는 메소드를
//설계하여 운영하려고 한다.
//이에대한 OOP(object oriented programming)를 만드시오 
//출력예
//피자빵	2000원
//소보루빵	 1000원
//빵을 맛있게 먹자

	class BBang {
	private String bread;
	private int price;
	public void delicous() {
		System.out.println("빵을 맛있게 먹자");
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
			BBang pizza= new BBang("피자빵", 2000);
			BBang soboroo= new BBang("소보루빵", 1000);
			//BBang dd=new BBang(); // 
			System.out.println(pizza.getBread()+"\t"+pizza.getPrice()+"원");
			System.out.println(soboroo.getBread()+"\t"+soboroo.getPrice()+"원");
			pizza.delicous();
	}

}
