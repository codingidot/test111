package four;

public class Question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� �μ��� ������ �� �ٲٽÿ�
		int a=100;
		int b=200;
		//a=b;
		//b=a; //b�� �״�� 200
		
		int imsi; //�ӽù��� �����
		imsi=a;
		a=b;
		b=imsi;
		System.out.println(a+"\t"+b);
		
		
		//swqp: zigzag��� 
		//int imsi=b;
		//b=a;
		//a=imsi;
		
	
		
		// sort�� ����=key+����
		//           Ű + ���������̳� ���������̳�
		// ���μ�Ʈ, �ܺμ�Ʈ
		//���μ�Ʈ
			//�޸𸮼�Ʈ: 10 35 89 23 
			//bubble sort, insertion sort, radix sort,...
			//quick sort ��������� ������
		//�ܺμ�Ʈ
			//���������ġ 2-way merge sort
		
		//�̷� ���̸��� ����ϴ� ���α׷�
		// 1-1
		// 1-2
		// 2-1
		// 2-2
		// 3-1
		// 3-2
		
	
		
		for(int i=1;i<4;i++) { //�� ����� �ξ� ����, ���� ���°� ����
			for(int j=1; j<3; j++) {
				System.out.println(i+"-"+j);
			}
		}
		
		
				
		
		
	}

}
