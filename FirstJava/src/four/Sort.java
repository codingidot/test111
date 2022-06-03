package four;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//"배열"에서 자바 라이브러리는 오름차순이 기본
		//문제 다음배열을 소트하여 오름차순 및 내림차순으로 출력하시오
		int[] a= {10, 90, 100, 60, 70};
		Arrays.sort(a); 
		//오름차순
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"\t");
		}
		System.out.println();
		
		//내림차순
		for(int i=a.length-1; i>=0; i--) {
			System.out.println(a[i]);
		}
	}

}
