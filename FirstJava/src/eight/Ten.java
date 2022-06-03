package eight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class Ten {

	public static void main(String[] args) {
		
		String bae[] = {"babo","ondal","kongjoo","satto","choonhyang"};
		//한컴타자연습
		List <String> list1=Arrays.asList(bae);
		Collections.shuffle(list1);
		for(String hana: list1) {
			System.out.println(hana);
		}
	
		ArrayList arr3=new ArrayList(); 
		arr3.add(new Integer(700));
		arr3.add(new Integer(500));
		arr3.add(new Integer(300));
		arr3.add(new Integer(200));
		arr3.add(new Integer(800));
		
		Object[] ob1=arr3.toArray();
		Arrays.sort(ob1);
	
		System.out.println("Arrays.sort후 출력");
		for(int i=0; i<ob1.length; i++) {
			System.out.println(ob1[i]+"\t");
			System.out.println();
		}
	}

}
