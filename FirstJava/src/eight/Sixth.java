package eight;

import java.util.HashMap;
import java.util.Set;

public class Sixth {

	public static void main(String[] args) {
		//[hashmap]
		//key, value 사용, hashing 기법으로 빠른 검색
		//hashing: key를 사용하여 hash function-hash code
		// -->막바로 value찾음
		
		
		//key, value 사용, hashing기법으로 빠른 검색
		HashMap<Integer, String> hm1= new HashMap<Integer, String>();
		System.out.println(hm1.size()); //0
		hm1.put(new Integer(100), "멋쟁이"); //ArrayList는 add로 HashMap은 put으로 추가
		hm1.put(new Integer(300), "공주");
		hm1.put(new Integer(200), "왕자");
	
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
