package pack;

public class Lclass {

	public static void main(String[] args) {

		Math.random(); // 0~1
		//45*Math.random(); //0~44.88788...
		/*
		 * Math.ceil(45*Math.random()); //1~45 무조건 올림하는 함수
		 * System.out.println((int)Math.ceil(45*Math.random()));
		 * System.out.println((int)Math.ceil(45*Math.random()));
		 * System.out.println((int)Math.ceil(45*Math.random()));
		 * System.out.println((int)Math.ceil(45*Math.random()));
		 * System.out.println((int)Math.ceil(45*Math.random()));
		 * System.out.println((int)Math.ceil(45*Math.random()));
		 */
		//for(초기치; 목적치; 증가치){
		// STMT;
		//}
		for(int i=1; i<=6;i++) {
			System.out.println((int)Math.ceil(45*Math.random()));
		}
		//i를 출력하려고 해도 for문 밖에서는 출력이 안된다. stack 메모리의 특징이 임시로 방을 잡아서 쓰다가 반복문의 범위를 벗어나면 없어진다.
		
		/*
		 * for(int i=1 ; ; i++) { }//계속 출력된다 for(int i=1; i<=10; i++) { } for(int i=10;
		 * i>=1 ; i=i-1) { } for(int i=10; i>=1; i--) { }
		 */
		
		int aaa=100;
		aaa++; //101  후치연산자 //aaa=aaa+1
		++aaa; //102  전치연산자
		System.out.println(aaa++); //102 출력후 1이 증가해 103이됨
		System.out.println(++aaa); //103에서 1을 증가하고 출력하므로 104출력
		
		int k=(int)(Math.ceil(Math.random()*12));
		
		System.out.println(k);
		
	}

}
