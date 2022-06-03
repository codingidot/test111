package pack3;
class ThreadClass1 extends Thread{
	public void run() {
		System.out.println(getName()+"나는나야");
		System.out.println("all you need is love~~~");
	}
}

class ThreadClass2 extends Thread{
	public void run() {
		System.out.println(getName()+"나도 너 아니거든");
		System.out.println("love is all youo need~~~");
	}
}

public class ThreadMainClass {

	public static void main(String[] args) {
		ThreadClass1 tc1=new ThreadClass1();
		ThreadClass2 tc2=new ThreadClass2();
		tc1.start();
		tc2.start();
		
		//실행결과가 실행할때마다 다르다
		//jvm이 그때 그때 무엇을 선택하나에 따라 다르다
		
	}

}
