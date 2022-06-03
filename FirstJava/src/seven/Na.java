package seven;
//상부구조  맨위에 쓴다
interface Samchon{ //상속역할
	//선언은 가능하나 구현은 안된다 Child class에서 구현
	//public x
	public void isBoat();
}

interface Komo{
	void isBoseok();
}

//하부구조
class Booja{
		public void manaDon() {
			System.out.println("많이 벌었다~~~");
		}
}


 class Na extends Booja implements Samchon, Komo  {
//Na는 isBoat, manaDon, useDon 메소드 모두 갖고 있음
	public void useDon() {
		System.out.println("많이사자~~~");
	}
	
	@Override
	public void isBoat() {
		System.out.println("보트 타자~~~");
	}
	public void isBoseok() {
		System.out.println("보석 많아~~~");
	}
	
	
	

}
