package five;

public class Love {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Love �ܾ 123��° ������ ove�� ���� ����ϰ�
		//�ٷ� �̾ L�� ����ϴ� ������ ���α׷��� �ۼ��Ͻÿ�
		//��, �̷������� ����� 20�� �ݺ� ����ϰ� �������δ� substring()�� ����Ͻÿ�
		
		String s1="         I Love You"; //�������α׷� GUI�� ����
		//String s1="LOVE";
		//kajaDisplay(s1);
		//substring(1,2)�� o�� ���´� �ֳ��ϸ� �ĸ� �ڿ��� 1���� �����Ѵ�.
		String abc="       abcde";
		//mykaja(abc);
	
		String test=" 123   ";
		for(int i=0; i<200; i++) {
			test=test.substring(1,test.length())+test.substring(0,1);
		System.out.println(test);
		}
		
	}

	private static void mykaja(String abc) {
		// TODO Auto-generated method stub
		for(int i=0; i<200; i++) {
		abc=abc.substring(1, 12)+abc.substring(1,3);
		System.out.println(abc);
		}
		
	}

	private static void kajaDisplay(String s1) {

		for(int i=0; i<200; i++) {
			//s1=s1.substring(1,20)+s1.substring(0,1);
			s1=s1.substring(1, s1.length())+ s1.substring(0, 1); //1���� length��ŭ ���� ������ ��ĭ ���������
			System.out.println(s1);
		}
	}
}
