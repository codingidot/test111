package six;
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
	
	//생성자 오버로딩(constructor overloading)
	public BBang() { //개발자가 작성한 디폴트 생성자
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
	
	public void chool() {//전문출력메소드
		
		System.out.println(bread+"\t"+price+"원");
	}

	@Override
	public String toString() {
		return bread+"\t"+price+"원";
	}
	
}

	
	public class Bakery {

	public static void main(String[] args) {
			BBang pizza= new BBang("피자빵", 2000);
			BBang soboroo= new BBang("소보루빵", 1000);
			BBang dd=new BBang("크림빵", 2000); // 초키치가 입력되는 생성자를 쓰면 디폴트 생성자를 따라 만들어야함
			BBang tt=new BBang(); 
			BBang kk=new BBang("카레빵", 3600);
			
			tt.setBread("고구마빵");
			tt.setPrice(8900);
			
			
			System.out.println(dd.getBread()+"\t"+dd.getPrice()+"원");
			System.out.println(pizza.getBread()+"\t"+pizza.getPrice()+"원");
			System.out.println(soboroo.getBread()+"\t"+soboroo.getPrice()+"원");
			tt.chool();
			System.out.println(kk);
			
			//답안란이 있는데 복붙, 파일첨부 하나(답 소스를 긁어서 메모장에 넣고 
			//answer_1.txt 저장 ==> 파일 첨부(파일명에 한글 x)
			// 2번 답은 answer_2.txt
			
	}

}
