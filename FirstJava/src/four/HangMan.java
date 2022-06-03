package four;

import java.util.Arrays;
import java.util.Scanner;

public class HangMan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] dap= {"a","p","p","l","e"};
		String[] input= {"-","-","-","-","-"};
		int sido=1;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("알바펫을 입력해주세요 기회는 13번 입니다");
		
		while(!Arrays.equals(dap, input)) {
		System.out.println(sido+"번째 시도입니다");
		String answer=sc.next();
		
		
		for (int i = 0; i < dap.length; i++) {
			if(dap[i].equals(answer)) {
				input[i]=answer;
				
			}
		}
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i]);
		}
		
			sido++;
			if(sido==14) {
				System.out.println("땡 다음기회에");
				break;
			}
		}
		if(Arrays.equals(dap, input)) {
		System.out.println("정답~~~");
		}
		}

}
