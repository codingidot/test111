package four;

public class Bubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] k={10, 90,100, 60, 70, 23};
		//Q) �� k �迭�� ���� ������������ ��Ʈ�Ͻÿ�
		//bubble sort
		// ��Ʈ�� �ѹ� �Ҷ����� �ּڰ� , �״��� �ּҰ� , ....�̷������� ������
		//��ü ���ڰ� 6���̸� 5���� �����Ʈ ������ ���Ҽ��ִ�
		
		int imsi;;
		
		/*
		 * for (int i= 0; i<k.length-1; i++) { int h=0; //�̰� ������ ���⿡ �־���� (�߿�) for (int
		 * j = 0; j<k.length-1-i; j++) { //sort�ѹ� �������� �ϳ��� ������ġ�� �Ϻ��ϹǷ� �ϳ��� ���δ�
		 * if(k[j]<k[j+1]) { imsi=k[j+1]; k[j+1]=k[j]; k[j]=imsi; h=1; } } if(h==0) {
		 * //�ܿ�°� if�� �̰� ���� ���� switch�� h���� �ܿ�°� ���� 3��°�� ����� ���� for�� �ȿ� if�� �����ϱ� break; }
		 * }
		 */
		
		for(int i=0; i<k.length; i++ ) {
			int g=0;
				for(int j=0;j<k.length-1-i;j++) {
					if(k[j]<k[j+1]) {
						int im=k[j];
						k[j]=k[j+1];
						k[j+1]=im;
						g=1;
					}
					if(g==0) {
						break;
					}
				}
		}
		
		//flag ��� -switch ���(on-off) 
		
		for(int i=0; i<k.length;i++) {
			System.out.print(k[i]+"\t");
		}
		
		
	}

}
