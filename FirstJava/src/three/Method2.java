package three;

import java.util.Scanner;

public class Method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ű, �����Դ� �����⼭ �Է¹ް� Ű, �����԰��� �޼������ǹ����� ������
		//bmi �� ��, ��ü�� ���� ���ó���� �Ҽ� �ֵ��� �ڹ� ���α׷��� �ۼ��Ͻÿ�
		
		
		 Scanner sc=new Scanner(System.in);
			System.out.print("�����Ը� �Է��ϼ���: ");
			 String weight=sc.next();
			 double Dweight=Double.parseDouble(weight);
			 System.out.println();
			 System.out.print("Ű�� �Է��ϼ���(cm�� �Է�): ");
			 String height=sc.next();
			 double Dheight=Double.parseDouble(height)/100;
			 bmi(Dweight, Dheight);
			}

	private static void bmi(double Dweight, double Dheight) {
		// TODO Auto-generated method stub
		
		double bManDo=Dweight/(Dheight*Dheight);
		 System.out.println("bmi:"+bManDo);
		 if(bManDo>=30) 
			 System.out.println("���Դϴ�");
		 else if(bManDo>=25)
			        System.out.println("��ü���Դϴ�");
		 	  else if(bManDo>=20)
		 		       System.out.println("����");
		 	  	   else 
		 	  		   		System.out.println("��ü��");
	}


}
