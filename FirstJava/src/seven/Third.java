package seven;

import java.util.Scanner;

public class Third {

	public static void main(String[] args) {
		try {
		Scanner sc=new Scanner(System.in);
		System.out.println("ù��°����: ");
		String one1=sc.nextLine(); 
		int soo1=Integer.parseInt(one1);
		
		System.out.println("�ι�°����: ");
		String two1=sc.nextLine();
		int soo2=Integer.parseInt(two1);
		
		//-----------------------------
		int bada=kaja(soo1, soo2); //�޼ҵ� 2,3����
		System.out.println(bada);
		//--------------------------------
	}catch(Exception e) {
		System.out.println("���⼭ ���� ó���Ѵٴ�~~~~");
	}
	}

	private static int kaja(int soo1, int soo2)
		throws ArithmeticException{	//������ ���� �߻���Ų�� throw�̰� throws�� �Դ����� �ٽ� ����������(���� �޼ҵ� ������)
		//throws=try-catch�� ����.
		return soo1/soo2;
	}

}
