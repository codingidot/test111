package five;

public class SecondArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//array: ��������, one data type
		
		int[] k2=new int[3]; //1���� �迭 //��������Ʈ
		//��������Ʈ: 2�����迭, ����:3�����迭
		
				    // ��(��), ȣ��(��)	
		int[][] k=new int[2][3]; //2*3=6�� ����Ʈ
		k[1][0]=30;
		k[1][2]=50;
		k[0][0]=100;
		
		System.out.println(k[0][0]+"\t"+k[1][2]);

		//Q 2�����迭�� 1����ó�� �ʱ�ġ�� �ִ´ٸ�?
		//int [][] k100= {10,20,30,40,50,60}; //�ȵȴ�
		int[][] k102= {{1,2,3}, {4,5,6}};
		
		int[][] k121= {
					  {1,2,3},
					  {4,5,6}
					  };//�̷������� ���� ����
	
		for (int i = 0; i < k121.length; i++) { //k121�� ���� ��ǥ��
			for (int j = 0; j <k121[i].length; j++) { //k121[i]�� ���� ��ǥ��
				System.out.print(k121[i][j]+"\t");
			}
			System.out.println();
		}
		
	
	}
	


}
