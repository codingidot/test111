package seven;

import java.util.Scanner;

/* �θ�(Boomo), �ڳ�(Janyu) Ŭ������ ����Ͽ� ������ ����ȯ ���α׷��� �ۼ��Ͻÿ�*/

//����� 

//������� Ÿ�ðڽ��ϱ�? (�θ���=1, �ڳ���=2)
//2
//�ڳ���Ÿ�� ���డ��

class Boomo{
	public void car() {
		System.out.println("�θ���");
	}
}
public class Janyu extends Boomo {

	@Override
	public void car() {
		System.out.println("�ڳ���");
	}
	
	public static void main(String[] args) {
		Boomo b1=new Boomo();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("������� Ÿ�ðڽ��ϱ�(�θ���=1, �ڳ���=2");
		String s=sc.next();
		if(s.equals("1")) {
			b1.car();
		}else if(s.equals("2")) {
			Boomo b2=new Janyu();
			b2.car();
		}else {
			System.out.println("1�� 2�߿� �������ּ���");
		}
		
	}
	
}
