package pack2;
class ThreadClass extends Thread{

	@Override
	public void run() {
		Thread.currentThread().setName("독도는 우리땅~~");
		System.out.println(getName()+"나는 쓰레드라는~~~");
	}
	
}
public class ThreadMainClass {

	public static void main(String[] args) {

		ThreadClass tc1=new ThreadClass();
		ThreadClass tc2=new ThreadClass();
		tc1.start();
		tc2.start();
		System.out.println("지금 TWO 쓰레드 한다는 ~~~~");
	}

}
