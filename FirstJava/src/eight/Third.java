package eight;

import java.util.ArrayList;

public class Third {

	public static void main(String[] args) {
		/*
		 * ArrayList arr3=new ArrayList(); //no generic
		 * 
		 * <generic> �迭�� �÷����� ������ ���� ������ 
		 * �������� �迭 + one data type
		 * 
		 * ������ (���ڿ��� �����) 
		 * ArrayList <String> arr3= new ArrayList<String>();
		 * 
		 * ��ü�� ���� �� ��� 
		 * ArrayList<SMarket> arr3=new ArrayList<SMarket>();
		 */
	
	
		// Q1) ���ڿ��� ���� ArrayList ��ü arr1 �����ϱ�
		
		//generic
		ArrayList <String> arr1= new ArrayList<String>();
		
		//arr1.add(30);//x
		arr1.add("��");
		arr1.add("���");
		arr1.add("����");
		arr1.add("���");
		
		//ArrayList�� �Է��� add() ����� get(i)
		for(int i=0; i<arr1.size(); i++) {
			System.out.println(arr1.get(i));
		}
		
		for(String imsi: arr1){
			System.out.println(imsi);
		}
	}

}
