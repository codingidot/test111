package eight;

import java.util.ArrayList;

public class second {
	//array: �迭, ��������, �迭 , one data type
	//collection: �÷���, �������̹迭, multi data type
	
	public static void main(String[] args) {
		//List
		ArrayList arr1=new ArrayList(); //����: 0.1.2
		//array(�迭) ���̴� i<10 ==>k.length
		System.out.println(arr1.size());
		//Integer�� �⺻ 16����Ʈ�� + �ּҷ� 4byte�� , �� 20����Ʈ �䱸��
		//wrapper: int�� Ŭ����ȭ (null)
		arr1.add(new Integer(300));
		arr1.add(new Double(100.7));
		arr1.add(new Character('A'));
		arr1.add(new String("ondal"));
		//arr1.add(300);//ok //but ��ü����ϰ� �ȸ���
		
		for(int i=0; i<arr1.size(); i++) {
			System.out.println(arr1.get(i));
		}
		System.out.println();
		arr1.add("��");
		arr1.add("���");
		arr1.add("����");
		arr1.add("���");
		
		System.out.println(arr1.size());
		
		//��������� set, ������ remove
		
		arr1.set(5, "����"); //���--> ����
		arr1.remove(6);
		arr1.remove("��");
		
		
		for(int i=0; i<arr1.size(); i++) {
			System.out.println(arr1.get(i));
		}
	}

}
