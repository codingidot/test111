package eight;

import java.util.HashMap;
import java.util.Set;

public class Sixth {

	public static void main(String[] args) {
		//[hashmap]
		//key, value ���, hashing ������� ���� �˻�
		//hashing: key�� ����Ͽ� hash function-hash code
		// -->���ٷ� valueã��
		
		
		//key, value ���, hashing������� ���� �˻�
		HashMap<Integer, String> hm1= new HashMap<Integer, String>();
		System.out.println(hm1.size()); //0
		hm1.put(new Integer(100), "������"); //ArrayList�� add�� HashMap�� put���� �߰�
		hm1.put(new Integer(300), "����");
		hm1.put(new Integer(200), "����");
	
		System.out.println(hm1.get(300));
		System.out.println(hm1.get(100));
		System.out.println(hm1.get(200));
	
		hm1.remove(300);
		if(hm1.size()>0) {
			System.out.println(hm1.size());
		}
		
		Set <Integer> s1=hm1.keySet();
		//System.out.println(s1);
		//
		for(Integer i: s1) {
			System.out.println(i+"\t"+hm1.get(i));
		}
	}

}
