package pack5;
class RunnableClass1 implements Runnable{
	public void run() { //Runnable�� �������̽�, �ʿ�� �߰��� ����� ����
		for(int i=1;i<=10;i++) {
			//extends Thread�� �޸� getName()�� ���⼭��
			//Runnable�� no �������̹Ƿ� �̷��� �ؾ���
			System.out.println(Thread.currentThread().getName()+"Ich Liebe Dich");
			
		
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	}
}

class RunnableClass2 implements Runnable{
	public void run() { //Runnable�� �������̽�, �ʿ�� �߰��� ����� ����
		for(int i=1;i<=10;i++) {
			//extends Thread�� �޸� getName()�� ���⼭��
			//Runnable�� no �������̹Ƿ� �̷��� �ؾ���
			System.out.println("����մϴ�");
			
		
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	}
}
public class RunnableMainClass {

	public static void main(String[] args) {
		//��Ӿ��� Ŭ����- new Thread -start
		//RunnableClass r1=new RunnableClass(); //���� ����� ���»���
		//Thread th1=new Thread(r1); 
		
		Thread th1=new Thread(new RunnableClass1());
		Thread th2=new Thread(new RunnableClass2());
		
		th1.start();
		th2.start();
		
	}

}
