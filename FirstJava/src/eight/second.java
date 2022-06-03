package eight;

import java.util.ArrayList;

public class second {
	//array: 배열, 고정길이, 배열 , one data type
	//collection: 컬렉션, 가변길이배열, multi data type
	
	public static void main(String[] args) {
		//List
		ArrayList arr1=new ArrayList(); //순번: 0.1.2
		//array(배열) 길이는 i<10 ==>k.length
		System.out.println(arr1.size());
		//Integer는 기본 16바이트에 + 주소로 4byte즉 , 총 20바이트 요구됨
		//wrapper: int의 클래스화 (null)
		arr1.add(new Integer(300));
		arr1.add(new Double(100.7));
		arr1.add(new Character('A'));
		arr1.add(new String("ondal"));
		//arr1.add(300);//ok //but 객체취급하곤 안맞음
		
		for(int i=0; i<arr1.size(); i++) {
			System.out.println(arr1.get(i));
		}
		System.out.println();
		arr1.add("빵");
		arr1.add("라면");
		arr1.add("우유");
		arr1.add("김밥");
		
		System.out.println(arr1.size());
		
		//내용수정은 set, 삭제는 remove
		
		arr1.set(5, "과자"); //라면--> 과자
		arr1.remove(6);
		arr1.remove("빵");
		
		
		for(int i=0; i<arr1.size(); i++) {
			System.out.println(arr1.get(i));
		}
	}

}
