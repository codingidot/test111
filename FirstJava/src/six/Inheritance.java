package six;
	
	class Boomo{
		protected int diamond; //protectet: 상속 관계에서만
		public void don() {
			System.out.println("나 재산 많아~~~~~");
		}
	}
	
	class Janyu extends Boomo{
		public void car() {
			diamond=3;
			System.out.println("중형차 있음~~~~~~~~~");
		}
	}
public class Inheritance {

	public static void main(String[] args) {
		//상속(inheritace): 재사용
		
		//캡슐화, 상속, 추상화, 다형성
		//oop =>부서이동=>후임자
		//앞에서작성한 내용을 넘겨받아 서 추가로 만들기 시작하면....
		
		//1) 100% 상속
		//2) 자녀의 재산은 부모와 같거나 많다
		//3) extends (is a kind of)
		//물고기 extends 동물 (자녀 extends 부모)
		
		Boomo b1=new Boomo();
		b1.don();
		
		Janyu j1=new Janyu();
		j1.car();
		j1.don();// 상속받은 메소드
		System.out.println(j1.diamond);
		
		//Q) 부모: Animal 메소드: move()
		//   자녀: Fish 메소드: swim()
		
		
		
		
		
		
		
		//오라클 데이터베이스 설치
		//https://www.oracle.com/database/technologies/xe18c-downloads.html
	}

}
