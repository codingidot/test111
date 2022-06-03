package three;

import java.util.Scanner;

public class ThirdDay {

	public static void main(String[] args) {
		/*
		 * 문제 점수를 입력받아 학점을 구하는 자바 프로그램을 작성하시오 
		 * (switch 예습문제) 
		 * <조건> 90-100 a학점 
		 * 80-89 b
		 * 70-79 c 
		 * 60-69 d 
		 * 60 미만은 f
		 */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int score=sc.nextInt();
		int caseScore=score/10;
		
		switch(caseScore) { //조건에 boolean 못들어감
		case 10:
		case 9: //case에 실수 못들어가고 , case>3이런거 안되고, case3~8 이런거 안됨
		System.out.println("a학점");
		break;
		case 8:
			System.out.println("b학점");
			break; //break하지 않으면 밑에거 전부 실행됨
		case 7:
			System.out.println("c학점");
			break;
		case 6:
			System.out.println("d학점");
			break;
		default :
			System.out.println("f학점");
			break; //마지막껀 생략가능
		}
		
		//logic 연습- 문제풀이과정
		//문제분석- 순서도(flowchart)-coding-run  -에러 Syntax error(오타), logic error
	
	}

}
