package four;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//"�迭"���� �ڹ� ���̺귯���� ���������� �⺻
		//���� �����迭�� ��Ʈ�Ͽ� �������� �� ������������ ����Ͻÿ�
		int[] a= {10, 90, 100, 60, 70};
		Arrays.sort(a); 
		//��������
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"\t");
		}
		System.out.println();
		
		//��������
		for(int i=a.length-1; i>=0; i--) {
			System.out.println(a[i]);
		}
	}

}
