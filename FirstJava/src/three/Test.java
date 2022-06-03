package three;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
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
				     answer--;
					if(input.equals("a")) {
						System.out.println("a - - - -"); 
						  success++;
						  a++;
					} 
						else if(input.equals("p")) {
								System.out.println("- p p - -");	
								success++;
								answer--; //p가 두 글자임으로 한번 빼준다
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

}
