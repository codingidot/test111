package three;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문제 메서드2형식- 인자로 배열을 전달
		int[] array=new int[5];
		array[0]=1;
		array[1]=2;
		array[2]=3;
		array[3]=4;
		array[4]=5;
		int i;		
		for ( i = 0; i < array.length; i++) {
			secondMethod(array[i]);
		}
		
			 
		 ///////////////////////////////////////////////////////////////////////////////////////////// 
		  // 행맨게임 (apple)
		
		
		String[] arr=new String[5];
		arr[0]="a";
		arr[1]="p";
		arr[2]="p";
		arr[3]="l";
		arr[4]="e";
		
		Scanner sc=new Scanner(System.in);
		System.out.println("알파벳을 입력하세요 기회는 7번입니다");
		
		int fail=0;
		int success=0;
		int answer=0;
		int a=0,p=0,l=0,e=0;
		while(success<4){
			String input=sc.next();
				if(a>0&&input.equals("a")) {
					System.out.println("이미 입력한 알페벳입니다");
					success--;
				}
				if(p>0&&input.equals("p")) {
					System.out.println("이미 입력한 알페벳입니다");
					success--;
				}
				if(l>0&&input.equals("l")) {
					System.out.println("이미 입력한 알페벳입니다");
					success--;
				}
				if(e>0&&input.equals("e")) {
					System.out.println("이미 입력한 알페벳입니다");
					success--;
				}
		for (int j = 0; j < arr.length; j++) {
			if(arr[j].equals(input)){
			 		answer++;
			 }
		}//for() end
		
			if(answer!=1&&answer!=2) {
			System.out.println("틀렸습니다");
			fail++;
		    }
			else if(answer==1 || answer==2){
				     answer=0;
					if(input.equals("a")) {
						System.out.println("a - - - -"); 
						  success++;
						  a++;
					} 
						else if(input.equals("p")) {
								System.out.println("- p p - -");	
								success++;
								p++;
						}
							else if(input.equals("l")) {
	 								System.out.println("- - - l -");
	 								success++;
	 								l++;
							}	
								 else if(input.equals("e")) {
									 	 System.out.println("- - - - e");
									 	 success++;
									 	 e++;
	 					 	     }
		    }//if(answer==1 || answer==2) end
 		if(fail==7) {
 			System.out.println("다음기회에");
 			break;
	    }//if(fail==7) end
		
		}//while() end
		if(success==4) {
		System.out.println("apple~~~ 정답");
		}
	}

	private static void secondMethod(int number) {
			System.out.println(number);
		
	}

}
