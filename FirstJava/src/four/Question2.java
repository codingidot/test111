package four;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Love �ܾ 123��° ������ ove�� ���� ����ϰ�
		//�ٷ� �̾ L�� ����ϴ� ������ ���α׷��� �ۼ��Ͻÿ�
		//��, �̷������� ����� 20�� �ݺ� ����ϰ� �������δ� substring()�� ����Ͻÿ�
		
		String s1="         I Love You";
		//String s1="LOVE";
		kajaDisplay(s1);
		//substring(1,2)�� o�� ���´� �ֳ��ϸ� �ĸ� �ڿ��� 1���� �����Ѵ�.
	}

	private static void kajaDisplay(String s1) {

		for(int i=0; i<200; i++) {
			//s1=s1.substring(1,20)+s1.substring(0,1);
			s1=s1.substring(1, s1.length())+ s1.substring(0, 1);
			System.out.println(s1);
		}
	}

}
