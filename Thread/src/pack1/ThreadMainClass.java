package pack1;
class ThreadClass extends Thread{ //상속을 바로 하고 있음
								  //다른 상속이 없는 경우 작성방법
	public void run() { //쓰레드클래스 안에 있는 run()메소드내용이 실행됨
		System.out.println("쓰레드와 오늘부터 1일~~~");
	}
}

public class ThreadMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadClass tc1=new ThreadClass();
		tc1.start();
		System.out.println("쓰레드하러가자");
	
		/*
		 * 출력결과 
		 * 쓰레드하러가자 
		 * 쓰레드와 오늘부터 1일~~~
		 * 어느게 먼저라는 개념이 없음
		 */
	}

}
