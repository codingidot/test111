package four;

public class FourDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * (��������) Q) 20,30, 50, 70 ,90 �̶�� 5���������� �迭���ְ� 
		 * ������ �޼ҵ� 2�������� ó���Ͽ� ���Ͻÿ� (��, �迭��
		 * ���ڷ� ������)
		 */
		
		//������ ��ǥ���� �� �迭�� ���۹����̴�(�ּ�, ������ȣ��).
		//������ ���޹���� call by value(���� ��������), call by reference(�繰�Կ� �־� ��ġ �˷����� ����)
		int t=0;
		int[] arr={20, 30, 50 ,70 ,90};
		int hap=0;
		for (int i = 0; i < arr.length; i++) {
			hap+=arr[i];
		}
		
		arr[0]=20;
		arr[1]=30;
		arr[2]=50;
		arr[3]=70;
		arr[4]=90;
		
		total(arr);
		
		
	}
	
	private static void total(int[] arr) {
		// TODO Auto-generated method stub
		int t=0;
		for(int i=0; i<arr.length;i++) {
			t+=arr[i];
		}
		
		System.out.println(t);
	}
	//��������  hap=hap+80 �ʱ�ġ �ʿ�
	//����������
	//sort //rank logic //suffle ���� ���̺귯���� �ִ�.
	//�ڵ� �׽�Ʈ ������ ���̺귯���� ������� �ʰ� sort�� ����Ͻÿ�

	

}
