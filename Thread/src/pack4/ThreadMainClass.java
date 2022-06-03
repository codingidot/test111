package pack4;



class ThreadClass1 extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(getName()+"내가 쏘고있다~!");
		
		
			try {
				Thread.sleep(500);//500ms 즉 0.5초
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		
		
		}
	}
}

class ThreadClass2 extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(getName()+"네가 쏘는 거냐!!!");
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
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
