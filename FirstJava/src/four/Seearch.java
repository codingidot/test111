package four;

import java.util.Arrays;

public class Seearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//<검색의 종류>
		
		//30, 50, 100, 10, 70
		
		//A개발자: 2초   B개발자:5초
		//순차검색
		//평균검색횟수 ( sequence search)
		//(1+100)/2=50번  1번만에 찾은경우와 100번만에 찾은경우 평균검색횟수는 
		//(N+1)/2
		
		//이진검색(binary search)
		//반드시 sort가 되어 있어야 한다.
		//10 15 20 32 57 91 97
		//(log2(N)   +1)/2=평균검색 횟수;
		//2의 6승은 64   2의 7승은 128 100개인 배열은 2의 6승과 7승 사이이므로 6.몇 여기에 +1
	
		int[]arr= {11, 84, 45, 78, 34, 9,2};
		//sort 안되어 있으면 sort하고
		Arrays.sort(arr);//2 9 11 34 45 78 84
		
		//78은 몇번째? //배열 5번째
		System.out.println("78은 "+Arrays.binarySearch(arr, 78)+"번째에 있다는");
		
		//100은 몇번째? //없으면 -8이라고 나옴
		int k=Arrays.binarySearch(arr, 100);
		if(Arrays.binarySearch(arr, 100)>=0) {
			System.out.println(Arrays.binarySearch(arr, 100)+"번째 있습니다");
		}else {
			System.out.println("없는 숫자입니다");
		}
	
	}

}
