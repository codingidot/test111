package pack4;



class ThreadClass1 extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(getName()+"���� ����ִ�~!");
		
		
			try {
				Thread.sleep(500);//500ms �� 0.5��
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
			System.out.println(getName()+"�װ� ��� �ų�!!!");
		
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
		
		//�������� �����Ҷ����� �ٸ���
		//jvm�� �׶� �׶� ������ �����ϳ��� ���� �ٸ���
		
	}

}
