package pack2;
class ThreadClass extends Thread{

	@Override
	public void run() {
		Thread.currentThread().setName("������ �츮��~~");
		System.out.println(getName()+"���� ��������~~~");
	}
	
}
public class ThreadMainClass {

	public static void main(String[] args) {

		ThreadClass tc1=new ThreadClass();
		ThreadClass tc2=new ThreadClass();
		tc1.start();
		tc2.start();
		System.out.println("���� TWO ������ �Ѵٴ� ~~~~");
	}

}
