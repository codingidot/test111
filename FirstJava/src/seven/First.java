package seven;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		try {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("ù��°����: ");
		String one1=sc.nextLine(); //���ڿ� �޴� ��
		//��ĭ���� ���� �� �Է�   //i love you ���� ������
		// ����(But) next()�� i�� �Է� ~~~
		
		int soo1=Integer.parseInt(one1);
		
		System.out.println("�ι�°����: ");
		String two1=sc.nextLine();
		int soo2=Integer.parseInt(two1);
		
		System.out.println(soo1/soo2);
		//try catch�� ������ jvm�� ������ �޾Ƽ� �����޼����� ��Ÿ��
		//try catch�� ������ jvm�� ������ ��ٰ� 
		}catch(NumberFormatException e) {
			System.out.println("���̸��Ҳ�! ���ڷ� �Է��ϸ� �ȵǰڴ�!!!");
			System.out.println(e);
			System.out.println(e.getMessage());
		}catch(ArithmeticException e) {
			System.out.println("0�� �ƴ� ������ �Է��϶��~~~5");
		}catch(Exception e) { //Exception�� ��� ������ ��ó���Ҽ� �����Ƿ� �������� ����Ѵ�.
			System.out.println("�������ٴ�~~~");
			System.out.println("0�� �ƴ� �ΰ��� ������ �Է��ϼ���"); //������ ��ó���
			System.out.println(e.getMessage());  //by Zero
			System.out.println(e); //.toString();
				//java.lang.Arith... /by Zero
		//oracle:ora-10976
			//c���: errno 4069 file not found, perror()
			//�ڹ�: message
		}finally { //��������
			System.out.println("goooooooooooood");
			//db ���� x, network ���� x
		}
		
		}
	
	
	//���� �߻��� JVM���� ���޵�
	
	//����: Exception(���� Ŭ����, ����Ŭ�������� ����)
		//try{}: ���ܳ����� ����
		//catch{}: ���� �� ó���ϱ�
		//finally{}: ������ ó��
	
}
