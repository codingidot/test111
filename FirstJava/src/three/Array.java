package three;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�迭 : ���â�� �Ѳ����� ��°�
		
		int score; //���â�� �ϳ� ��°�
		int[] jumsoo=new int[5]; //���â�� 5�� ���� //int jumsoo[]=new int[5]�� �����ѵ� �̰� �ؾ� �̰� c#�� �ȵ�
		jumsoo[0]=100;
		jumsoo[1]=90;
		jumsoo[4]=85;
		//jumsoo[5]=78; ��������
		System.out.println(jumsoo[0]+"\t"+jumsoo[1]+"\t"+jumsoo[4]);
		
		double[] jumsoo1=new double[5];
		jumsoo1[0]=15.7;
		jumsoo1[1]=9.0;
		jumsoo1[4]=8.5;
		//[]�� index(����)��� �Ѵ�.
		
		for(int i=0; i<jumsoo.length; i++) {
				    if(i<4) {
				        System.out.print(jumsoo[i]+"\t");
				                }else {
				          System.out.println(jumsoo[i]);
				      }
				}
		
		
		  for(int i=0; i<5; i++) {// for���ȿ� ���ǹ��� ���� �ݺ��Ҷ����� ����Ƿ� �ӵ��� ���������ִ�. 
			        System.out.print(jumsoo1[i]+"\t");
		  }
		  System.out.println();
		  //for������ ctrl + spacebar�ϸ� �ڵ����� �迭 for�� ������ش�
		  //���� ���� 1���� �迭�̴� -���� ����Ʈ
		  
		  //���� �ζ� ���α׷�(�ߺ� ���� ����) (�迭�̿�)
		  int number;
		  
		  int[] lotto= new int[6];
		  for(int i=0; i<lotto.length; i++) {
			  number=(int)Math.ceil(Math.random()*45);
			  	lotto[i]=number;
			  for(int j=0; j<i;j++) {
				  if(lotto[i]==lotto[j]) {
					  i--;
				  }
			  }
		  }
		  for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i]+"\t");
		}
		  //���� �޼���2����- ���ڷ� �迭�� ����
		  
		  // ��ǰ��� (apple)
		
	}

}
