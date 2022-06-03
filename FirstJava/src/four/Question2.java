package four;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Love 단어를 123번째 글자인 ove를 먼저 출력하고
		//바로 이어서 L을 출력하는 형식의 프로그램을 작성하시오
		//단, 이런형식의 출력을 20번 반복 출력하고 문법으로는 substring()을 사용하시오
		
		String s1="         I Love You";
		//String s1="LOVE";
		kajaDisplay(s1);
		//substring(1,2)는 o만 나온다 왜냐하면 컴마 뒤에는 1부터 시작한다.
	}

	private static void kajaDisplay(String s1) {

		for(int i=0; i<200; i++) {
			//s1=s1.substring(1,20)+s1.substring(0,1);
			s1=s1.substring(1, s1.length())+ s1.substring(0, 1);
			System.out.println(s1);
		}
	}

}
