package six;

public class Question {

	public static void main(String[] args) {
		// "�࿧�׷�, duetMiso, ��õ��" �� ���ڿ� ������ �ְ� 
		//��½� �Ѵܾ ���پ� ����Ͻÿ�
		
		String s1="�࿧�׷�, duetMiso, ��õ��";
		
		String[] bae=s1.split(",");
		//�࿧�׷� --> bae[0]
		//duetMiso [1]
		//��õ�� [2]
		for (int i = 0; i < bae.length; i++) {
			System.out.println(bae[i]);
		}
		
		//===============================================
		
	}

}
