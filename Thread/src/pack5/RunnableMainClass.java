package pack5;
class RunnableClass1 implements Runnable{
	public void run() { //Runnable은 인터페이스, 필요시 추가로 상속이 가능
		for(int i=1;i<=10;i++) {
			//extends Thread와 달리 getName()은 여기서는
			//Runnable은 no 쓰레드이므로 이렇게 해야함
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
	public void run() { //Runnable은 인터페이스, 필요시 추가로 상속이 가능
		for(int i=1;i<=10;i++) {
			//extends Thread와 달리 getName()은 여기서는
			//Runnable은 no 쓰레드이므로 이렇게 해야함
			System.out.println("사랑합니다");
			
		
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
		//상속없는 클래스- new Thread -start
		//RunnableClass r1=new RunnableClass(); //현재 상속이 없는상태
		//Thread th1=new Thread(r1); 
		
		Thread th1=new Thread(new RunnableClass1());
		Thread th2=new Thread(new RunnableClass2());
		
		th1.start();
		th2.start();
		
	}

}
