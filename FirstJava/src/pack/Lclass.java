package pack;

public class Lclass {

	public static void main(String[] args) {

		Math.random(); // 0~1
		//45*Math.random(); //0~44.88788...
		/*
		 * Math.ceil(45*Math.random()); //1~45 ������ �ø��ϴ� �Լ�
		 * System.out.println((int)Math.ceil(45*Math.random()));
		 * System.out.println((int)Math.ceil(45*Math.random()));
		 * System.out.println((int)Math.ceil(45*Math.random()));
		 * System.out.println((int)Math.ceil(45*Math.random()));
		 * System.out.println((int)Math.ceil(45*Math.random()));
		 * System.out.println((int)Math.ceil(45*Math.random()));
		 */
		//for(�ʱ�ġ; ����ġ; ����ġ){
		// STMT;
		//}
		for(int i=1; i<=6;i++) {
			System.out.println((int)Math.ceil(45*Math.random()));
		}
		//i�� ����Ϸ��� �ص� for�� �ۿ����� ����� �ȵȴ�. stack �޸��� Ư¡�� �ӽ÷� ���� ��Ƽ� ���ٰ� �ݺ����� ������ ����� ��������.
		
		/*
		 * for(int i=1 ; ; i++) { }//��� ��µȴ� for(int i=1; i<=10; i++) { } for(int i=10;
		 * i>=1 ; i=i-1) { } for(int i=10; i>=1; i--) { }
		 */
		
		int aaa=100;
		aaa++; //101  ��ġ������ //aaa=aaa+1
		++aaa; //102  ��ġ������
		System.out.println(aaa++); //102 ����� 1�� ������ 103�̵�
		System.out.println(++aaa); //103���� 1�� �����ϰ� ����ϹǷ� 104���
		
		int k=(int)(Math.ceil(Math.random()*12));
		
		System.out.println(k);
		
	}

}
