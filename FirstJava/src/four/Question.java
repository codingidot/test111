package four;

public class Question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//다음 두수의 내용을 맞 바꾸시오
		int a=100;
		int b=200;
		//a=b;
		//b=a; //b는 그대로 200
		
		int imsi; //임시방을 만든다
		imsi=a;
		a=b;
		b=imsi;
		System.out.println(a+"\t"+b);
		
		
		//swqp: zigzag기법 
		//int imsi=b;
		//b=a;
		//a=imsi;
		
	
		
		// sort는 정렬=key+차순
		//           키 + 오른차순이냐 내림차순이냐
		// 내부소트, 외부소트
		//내부소트
			//메모리소트: 10 35 89 23 
			//bubble sort, insertion sort, radix sort,...
			//quick sort 가장빠른데 복잡함
		//외부소트
			//보조기억장치 2-way merge sort
		
		//이런 반이름을 출력하는 프로그램
		// 1-1
		// 1-2
		// 2-1
		// 2-2
		// 3-1
		// 3-2
		
	
		
		for(int i=1;i<4;i++) { //이 방법이 훨씬 쉽다, 빨리 가는게 안쪽
			for(int j=1; j<3; j++) {
				System.out.println(i+"-"+j);
			}
		}
		
		
				
		
		
	}

}
