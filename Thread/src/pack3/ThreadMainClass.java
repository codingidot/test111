package pack3;
class ThreadClass1 extends Thread{
	public void run() {
		System.out.println(getName()+"���³���");
		System.out.println("all you need is love~~~");
	}
}

class ThreadClass2 extends Thread{
	public void run() {
		System.out.println(getName()+"���� �� �ƴϰŵ�");
		System.out.println("love is all youo need~~~");
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
