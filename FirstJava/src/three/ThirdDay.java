package three;

import java.util.Scanner;

public class ThirdDay {

	public static void main(String[] args) {
		/*
		 * ���� ������ �Է¹޾� ������ ���ϴ� �ڹ� ���α׷��� �ۼ��Ͻÿ� 
		 * (switch ��������) 
		 * <����> 90-100 a���� 
		 * 80-89 b
		 * 70-79 c 
		 * 60-69 d 
		 * 60 �̸��� f
		 */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		int score=sc.nextInt();
		int caseScore=score/10;
		
		switch(caseScore) { //���ǿ� boolean ����
		case 10:
		case 9: //case�� �Ǽ� ������ , case>3�̷��� �ȵǰ�, case3~8 �̷��� �ȵ�
		System.out.println("a����");
		break;
		case 8:
			System.out.println("b����");
			break; //break���� ������ �ؿ��� ���� �����
		case 7:
			System.out.println("c����");
			break;
		case 6:
			System.out.println("d����");
			break;
		default :
			System.out.println("f����");
			break; //�������� ��������
		}
		
		//logic ����- ����Ǯ�̰���
		//�����м�- ������(flowchart)-coding-run  -���� Syntax error(��Ÿ), logic error
	
	}

}
