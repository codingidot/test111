package pack1;
class ThreadClass extends Thread{ //����� �ٷ� �ϰ� ����
								  //�ٸ� ����� ���� ��� �ۼ����
	public void run() { //������Ŭ���� �ȿ� �ִ� run()�޼ҵ峻���� �����
		System.out.println("������� ���ú��� 1��~~~");
	}
}

public class ThreadMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadClass tc1=new ThreadClass();
		tc1.start();
		System.out.println("�������Ϸ�����");
	
		/*
		 * ��°�� 
		 * �������Ϸ����� 
		 * ������� ���ú��� 1��~~~
		 * ����� ������� ������ ����
		 */
	}

}
