package three;

import java.util.Scanner;

public class Method3 {
	public static void main(String[] args) {
        // TODO Auto-generated method stub

        //Ű, �����Դ� ���⼭ �Է¹ް�  Ű, �����԰��� �޼ҵ����ǹ����� ������
        // bmi �� �޼ҵ����ǹ����� ����ϰ�  ��, ��ü�� ��굵 ���ǹ����� �ϰ� 
        //��, ��ü�� ����  ���ó���� �������� �����Ͽ� ��� �Ҽ� �ֵ��� �ڹ� ���α׷��� �ۼ��Ͻÿ�(3����) 
        Scanner sc2=new Scanner(System.in);

      System.out.println("Ű�� �Է��ϼ���");
      int ki=sc2.nextInt(); //178
      
                
      System.out.println("�����Ը� �Է��ϼ���");
      int mom=sc2.nextInt();//78
              
     String str1=kajaBMI2(ki,mom); 
      //////�޼ҵ�ȣ�⹮ -3�������� ���� �޾Ƽ� "��ü��" ���� ����� ��µǵ���  ��           
     System.out.println(str1); //////////////

//�� ���� ��ſ� ���ٷ� ����ٸ� ==========================
    System.out.println(kajaBMI2(ki,mom)); ///////////
    //=============================================
}// main-end 
          //��ȯ�� 
private static String kajaBMI2(int ki, int mom) {//�޼ҵ����ǹ�-2���� 
          double mKi=ki/100.0;
  double  bmi=mom/ Math.pow(mKi,2);//mKi�� 2�� 
      System.out.printf("%.2f\n", bmi); //23.6743523 ==> 23.67
      
  String result=null; 
      if(bmi>=30.0)
                 result="��";
      else if(bmi>=25.0) 
                result="��ü��";
      else  if(bmi>=20.0)
                result="����";
      else 
                 result="��ü��";
      return  result; ///////////////////////
        
}//kajaBMI2-end
}//class-end 



