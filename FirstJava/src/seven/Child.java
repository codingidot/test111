package seven;

import java.util.Scanner;

class Parent{
	public void car() {
		System.out.println("�������� ����̺�");
	}
}

public class Child extends Parent {

	@Override
	public void car() {
		System.out.println("�Ƶ����� ����");
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("������� Ÿ�ڽ��ϱ�?");
		int sel=sc.nextInt();
		Parent p7=null;
		switch(sel) {
		case 1:
			p7=new Parent();
			p7.car();
			break;
			
		case 2:
			p7=new Child();
			p7.car();
			break;
		
		default:
			System.out.println("1��2�߿� �����ϻ�");
		}
	}
	
}
