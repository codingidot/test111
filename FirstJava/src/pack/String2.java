package pack;

import java.util.Scanner;

public class String2 {

	public static void main(String[] args) {
		int pp=100; //stack�� ����
		String aaa="ondal"; //heap�޸𸮿� ����, stack �޸𸮿� aaa��� ���â�� ��������� 
		//aaa��� ���â�� ondal�� heap�޸� ��ġ�� ��Ÿ���� ������ �����Ѵ�.
		
		String ppp=null; //null pointer error , heap�� ������ �����Ƿ� ppp�� �ּҰ� ����.
		String qqq="";//�� ���ڿ� (���̰� 0�� ���ڿ�) heap�� ���ڿ��� �� �ְ� ���ÿ� qqq�� �޸��ּҰ� ��    // "  "
		
	  //System.out.println(ppp.length()>0); //null pointer error 
		System.out.println(qqq.length()>0); //false; ���̰� 0�̴ϱ�
		
		
		String aa="ondal";
		String bb="ondal"; //aa�� ������ �����Ƿ� heap�޸𸮿� �̹� ������� "ondal"�� ����ϰ� ���ÿ��� ���� ������ ���� �߿�
		
		if(aa==bb) { //�Ȱ��� �������� ����� �߿�
			System.out.println(aa+"\t"+bb);
		}
		
		if(aa.equals(bb)) { //������ ������ ����°� �߿�   �����ϰ� ������ Ʋ���� ������ ����
			System.out.println(aa+"\t"+bb);
		}
	
		/*
		 * Ű�� ������ ���� ������ ������(Scanner���) bmi�� ���ϴ� �ڹ� ���α׷��� �ۼ��Ͻÿ� 
		 * ��, 30�̻��̸� �� 
		 * 25~30�̸� ��ü��
		 * 20-~25 ���� 
		 * 20 �̸��̸� ��ü�� 
		 * �񸸵�=������/ ���� Ű�� ���� 100/(1.8*1.8)
		 *
		 */
		 Scanner sc=new Scanner(System.in);
		System.out.print("�����Ը� �Է��ϼ���: ");
		 String weight=sc.next();
		 double Dweight=Double.parseDouble(weight);
		 System.out.println();
		 System.out.print("Ű�� �Է��ϼ���(cm�� �Է�): ");
		 String height=sc.next();
		 double Dheight=Double.parseDouble(height)/100;
		
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
