package bpkg;

public class Bclass {

	public static void main(String[] args) {
		
		//�� �������� �����ִ� �ͳ���
		// + - * / ==> + - * / c���� java�� ����
		//> < >= <= = �̰͵� ����
		//== != ���İ� ����� ==�ΰ���
		//and or not
		// && || !
		
		System.out.println(5>3); //true
		System.out.println(5==3); //false
		
		System.out.println(10/3);//3 //sysout + ctrl-spacebar
		// ����/����=����
		// ����/�Ǽ�=�Ǽ� 10/3.0=3.3333...
		// �Ǽ�/����=�Ǽ�
		// �Ǽ�/�Ǽ�=�Ǽ�
		
		int ff=2147483647; //0111 1111 1111 1111
		int hh=1;// 0000 0000 0000 0001
		int jj=ff+hh; //���⼭ ������ ���� ��������? ��������� �ƹ��͵� ���� �ȶ�
		System.out.println(jj);
		//������� �̰��� -2147483648 1000 0000 0000 0000
		//
		//whitebox ���α׷� �ҽ��� ����üũ blackbox �����ϸ鼭 ����üũ
		
		short aaa=100;
		int bbb=aaa; //short�� int�� �־��µ� ���� �ȳ���. �����ſ��� ��ū���� �־��� ������
		// �����ſ��� ū�ŷ� ���°� �Ͻ��� ����ȯ(implicit conversion)
		
		int aaaa=100;
		 short bbbb=(short)aaaa;// �������  , ���ڰ� �쿬�� ������ �߷��� �״�� ���� �����ȳ� 
		 //����ȯ            
		 //����� ����ȯ(explicit conversion)
		 //(short)�� ������ ����ȯ �����ڶ�� �Ѵ�. ����ȯ ������(cast ������)
		 // double (�Ǽ� 3.798) 8byte, �������Ǽ�(3.44442423...)
		 // float    4byte, �������Ǽ� (3.567845)�Ҽ��� 6������ ,�Ǽ��� �⺻��    
		 // char aa='A'; char bb='ȫ' 2byte
		 //boolean 1byte�� ó��
		 // ���� ���� ��� �������� stack memory�� ���ȴ�!!
		 
		 //���� 
		 //�޿����� �����Դ� ������ 1/6�̴�.
		 //�����԰� 100kg�� ����� �޿��� �纸�� ?
		 int weight=100;
		 double moonWeight=weight/6.0; //6.0�� �ƴ϶� 6���� �ϸ� 16�� ����
		 System.out.println(moonWeight); //16.666666666666668
		 //�Ҽ� ���� ��° �ڸ����� ���ϰ� �ʹ�
		 System.out.printf("�޿��� ������= %.2f\n", moonWeight); //c�����
		 
		 // 30+20==> 50  "tom" +"jerry" ==>tomjerry
		 
		 //��� ���ϱ�?
		 // 2�� �����?  2�� ������ �������� �ȴ�
		 // 10/3     10%3
		 //10�� 2�� ������� �˷��� 
		 //10%2==0
		 if(10%2==0) { //���� ����°Ŵ� =�ΰ� �����
			 System.out.println("2�� ���");
		 }else {
			 System.out.println("2�� ����� �ƴ�");
		 }
		 
		 
		 //if(���ǹ�){ //1����
		 //yes;}
		 
		 
		 if(5>3){
			 int k100; 
		 }
		 
		 //if(���ǹ�){ //2����
		 //yes;}
		 //else{
		 // no;
		 //}
		 
		 if(5>3) {
			 int k100=7;
		 }else {
			 int p=100;
		 }
		 
		 //����   87���� �� �� �� ��� ������� ���Ͻÿ�
		 //(��, 80-100 �� 60-80 �� �� �Ʒ��� ��)
		 int score=87;
		 if(score>80)  //�̷��� �ٵ�{ }�� �ѹ��常 �ִ°�쿡�� {}���� �����ϴ� 
			 System.out.println("��");
		  else if(score>60) 
			   System.out.println("��");
		  	   else 
			   System.out.println("��");
		 //nested��� ¦�� �°� ������ ������� if�� else�� ĭ�� ������
		 
		 //���� if , ��ø if ����Ѵ�
		 
		 // ���� i ���� 270�϶� i�� 3�� ����̸� "�ź�", 5�� ����̸� "����" , 3�� 5 ���� ����̸�
		 //"���ù�����~~~"�� ����ϴ� �ڹ� ���α׷��� �ۼ��Ͻÿ�
		 
		 int i=270;
		 if(i%15==0) 
			System.out.println("���ù�����~~~"); 
		 else if(i%5==0) 
			 	System.out.println( "����");
		      else if(i%3==0)
		    	  System.out.println("�ź�");
		           else
		        	   System.out.println("3�� ����� 5�� ����� �ƴմϴ�");
		    	  
		 
	}

}
