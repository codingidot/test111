package eight;

import java.util.ArrayList;

public class SMarketTest {
	//(Q3) ���� ���⿡ Collection �� ������Ѻ��ڴ�~~~~
    //ArrayList arr3�� ����� ó���� �Ǹ��� ��¥�� �ְ� 
    //�״������� �Ǹų����� ������ ��θ� ����Ͻÿ�  
    //( ��¿� ) 
    /*
    //Mon Nov 16 19:59:44 KST 2020
    ��ǰ�̸���  ���� �̰�  ��ǰ������ 1000 �� �Դϴ�
    ��ǰ�̸���  �� �̰�  ��ǰ������ 2000 �� �Դϴ�*/


	public static void main(String[] args) {
		
		ArrayList<SMarket> arr3=new ArrayList<SMarket>();
		
		//���� : ��ü����� -> �ʱⰪ�ְ� -> �÷��ǿ� �ְ�
		// (�͸�ü new)->������ -> add���
		
		arr3.add(new SMarket("����", 1000));
		arr3.add(new SMarket("��", 2000));
		arr3.add(new SMarket("����", 3000));
	
		for(int i=0; i<arr3.size(); i++) {
			System.out.println(arr3.get(i));
		}
		System.out.println();
		
		for(int i=0; i<arr3.size(); i++) {
			   System.out.println("��ǰ�̸���  "+arr3.get(i).getSangpum()+" �̰�  "+"��ǰ������  "+arr3.get(i).getPrice()+" �� �Դϴ�" );
			   
		}
		System.out.println();
		
		//Q) ������ 1500�� �̻��� ��ǰ�� ���� �ش� ��ǰ�� ����Ͻÿ�
		for(SMarket s: arr3) {
			if(s.getPrice()>=1500) {
		System.out.println(s.getSangpum());
			}
	}
	}

}
