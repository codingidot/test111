package eight;

import java.util.ArrayList;

public class Third {

	public static void main(String[] args) {
		/*
		 * ArrayList arr3=new ArrayList(); //no generic
		 * 
		 * <generic> 배열과 컬렉션의 장점을 따서 만들어보자 
		 * 가변길이 배열 + one data type
		 * 
		 * 형식은 (문자열만 들어갈경우) 
		 * ArrayList <String> arr3= new ArrayList<String>();
		 * 
		 * 객체만 들어가게 할 경우 
		 * ArrayList<SMarket> arr3=new ArrayList<SMarket>();
		 */
	
	
		// Q1) 문자열만 들어가는 ArrayList 객체 arr1 생성하기
		
		//generic
		ArrayList <String> arr1= new ArrayList<String>();
		
		//arr1.add(30);//x
		arr1.add("빵");
		arr1.add("라면");
		arr1.add("우유");
		arr1.add("김밥");
		
		//ArrayList는 입력은 add() 출력은 get(i)
		for(int i=0; i<arr1.size(); i++) {
			System.out.println(arr1.get(i));
		}
		
		for(String imsi: arr1){
			System.out.println(imsi);
		}
	}

}
