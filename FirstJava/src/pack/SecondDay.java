package pack; //���� ���� �̸�

import java.util.Scanner; //���� ����� ���̸��� ����ͼ� ���ڴٴ� ��

public class SecondDay {

	public static void main(String[] args) {
		//���� 1-100 ������ ������ �Է¹޾� 50�̻��� �������� "50�̻��̳�"�� ����Ͻÿ�
		
		//1-100������ ������ �Է� : ���� �Է�
		//ȭ����� : sysout
		//ȭ���Է� : Scanner ����Ŭ����
		
		Scanner sc5=new Scanner(System.in); //ctrl +Shift + o�� ������ �ڵ����� import��
		System.out.print("1-100������ ������ �Է�: ");
		int bada=sc5.nextInt();
		
		if(bada>=50) {
			System.out.println("50�̻�");
		}
		/* ������ �ּ��� �巡���ϰ� ctrl + shift + / */
		// ctrl + shift + \�� �ּ��� Ǯ����
		//ctrl + shift + L �� ������ ����Ű���� �����ִ�.
		
		//c���� getchar() get character ==> getche()
		//����, ����, ��������
		//getchar() getchar() getchar()
		//100 ���� 90���� ����
		//100�� getchar()�� �ް� ���͸� getchar()�� �޾Ҵ� �׷��� ������ ���
		
		//�ڹٿ����� nextInt();, nextDouble() �̷��͵鵵 ���� ���� ������ �߻��Ѵ�.
		//�׷��� next() : ���ڿ� �޴� ��� "ondal" 
		//char : �ѱ��� �޴´�
		
		Scanner sc55=new Scanner(System.in); //ctrl +Shift + o�� ������ �ڵ����� import��
		System.out.print("1-100������ ������ �Է�: ");
		String bada2=sc55.next(); //String�� heap�� ����ȴ� �߿�
		
		//���ڿ��� ���ڷ� ����
		int bada5=Integer.parseInt(bada2);
		// c��� �Լ��δ� atoi() : alphabet to int  , atof()
		if(bada5>=50) {
			System.out.println("50�̻�");
		}
		

		
	}

}
