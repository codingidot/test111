package seven;

import java.util.Scanner;

public class Second {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("ù��°����: ");
		String one1=sc.nextLine(); //���ڿ� �޴� ��
		//��ĭ���� ���� �� �Է�   //i love you ���� ������
		// ����(But) next()�� i�� �Է� ~~~
		
		int soo1=Integer.parseInt(one1);
		
		System.out.println("�ι�°����: ");
		String two1=sc.nextLine();
		int soo2=Integer.parseInt(two1);
		
		//-----------------------------
		int bada=kaja(soo1, soo2); //�޼ҵ� 2,3����
		System.out.println(bada);
		//--------------------------------
		
	}

	private static int kaja(int soo1, int soo2) {
		if(soo2==0) {
			System.out.println("0���� ���� �� ���ٰ� ���ض�~~~");
			throw new ArithmeticException(); //�����ڰ� ������ �����°� throw �ý����� �ִ� ������ �޴°� catch
		}else
			
		return soo1/soo2;
	}

}
