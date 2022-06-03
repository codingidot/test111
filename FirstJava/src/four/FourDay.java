package four;

public class FourDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * (예습문제) Q) 20,30, 50, 70 ,90 이라는 5개의점수를 배열에넣고 
		 * 총점은 메소드 2형식으로 처리하여 구하시오 (단, 배열을
		 * 인자로 전송함)
		 */
		
		//벼열의 대표명은 그 배열의 시작번지이다(주소, 보관함호수).
		//인자의 전달방식은 call by value(가방 직접전달), call by reference(사물함에 넣어 위치 알려저서 전달)
		int t=0;
		int[] arr={20, 30, 50 ,70 ,90};
		int hap=0;
		for (int i = 0; i < arr.length; i++) {
			hap+=arr[i];
		}
		
		arr[0]=20;
		arr[1]=30;
		arr[2]=50;
		arr[3]=70;
		arr[4]=90;
		
		total(arr);
		
		
	}
	
	private static void total(int[] arr) {
		// TODO Auto-generated method stub
		int t=0;
		for(int i=0; i<arr.length;i++) {
			t+=arr[i];
		}
		
		System.out.println(t);
	}
	//누적스텝  hap=hap+80 초기치 필요
	//디자인패턴
	//sort //rank logic //suffle 같은 라이브러리가 있다.
	//코딩 테스트 같은데 라이브러리를 사용하지 않고 sort를 사용하시오

	

}
