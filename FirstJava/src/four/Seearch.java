package four;

import java.util.Arrays;

public class Seearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//<�˻��� ����>
		
		//30, 50, 100, 10, 70
		
		//A������: 2��   B������:5��
		//�����˻�
		//��հ˻�Ƚ�� ( sequence search)
		//(1+100)/2=50��  1������ ã������ 100������ ã����� ��հ˻�Ƚ���� 
		//(N+1)/2
		
		//�����˻�(binary search)
		//�ݵ�� sort�� �Ǿ� �־�� �Ѵ�.
		//10 15 20 32 57 91 97
		//(log2(N)   +1)/2=��հ˻� Ƚ��;
		//2�� 6���� 64   2�� 7���� 128 100���� �迭�� 2�� 6�°� 7�� �����̹Ƿ� 6.�� ���⿡ +1
	
		int[]arr= {11, 84, 45, 78, 34, 9,2};
		//sort �ȵǾ� ������ sort�ϰ�
		Arrays.sort(arr);//2 9 11 34 45 78 84
		
		//78�� ���°? //�迭 5��°
		System.out.println("78�� "+Arrays.binarySearch(arr, 78)+"��°�� �ִٴ�");
		
		//100�� ���°? //������ -8�̶�� ����
		int k=Arrays.binarySearch(arr, 100);
		if(Arrays.binarySearch(arr, 100)>=0) {
			System.out.println(Arrays.binarySearch(arr, 100)+"��° �ֽ��ϴ�");
		}else {
			System.out.println("���� �����Դϴ�");
		}
	
	}

}
