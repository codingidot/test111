package pack;

import java.util.Scanner;

public class Again {

	public static void main(String[] args) {
		
		//�ݺ���
		//do ~while
		//head, body ������ ���� �������� �̰� body, head�� �Ǿ� �ִ�.
		
		/*
		 * do { //block
		 * 
		 * }while(����);  head�ʿ� �����ݷ� �� �ٿ����Ѵ�. 
		 * 
		 */
		
		/*
		 * do { int i=300 }
		 * while(i<300);
		 */
	//====================>Ű����ũ���� �޴� ���鶧�� ����
	/*
	 * 1.�Ƹ޸�ī�� 
	 * 2.�����
	 * 
	 * �����Ͻÿ�(1-2) 3�� ������ �ٽ� �����ּ���
	 */ 
	//���� 
	//================
	// �޴�
		//1.¥��
		//2.«��
	//================== a�� �Է��ص� �޴��� �ٽ� �Էµǵ���
		Scanner sc=new Scanner(System.in);
		String choose;
		do {
		    System.out.println("1. ¥���");
		    System.out.println("2. «��");
		    System.out.print("�Ŵ��� �����ϼ��� : ");
		    choose = sc.next();
		}while(!choose.equals("1")&&!choose.equals("2")); //.equals()�޼���� �ּҰ��� ���ϴ°� �ƴ϶� �Է°� ��ü�� ���Ѵ�. �տ�!�� ������ �޶�� true
		//while(choose!="1"&&choose!="2")//�̷��� �ϸ� ����� �ּҸ� ���ϴ°��̹Ƿ� �ȵȴ�
		   System.out.println("���հ� �弼��!!");
		   
		   
		   
	}

}
