package three;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열 : 기억창고를 한꺼번에 잡는것
		
		int score; //기억창고 하나 잡는것
		int[] jumsoo=new int[5]; //기억창고 5개 잡힘 //int jumsoo[]=new int[5]도 가능한데 이건 잊어 이건 c#이 안됨
		jumsoo[0]=100;
		jumsoo[1]=90;
		jumsoo[4]=85;
		//jumsoo[5]=78; 에러난다
		System.out.println(jumsoo[0]+"\t"+jumsoo[1]+"\t"+jumsoo[4]);
		
		double[] jumsoo1=new double[5];
		jumsoo1[0]=15.7;
		jumsoo1[1]=9.0;
		jumsoo1[4]=8.5;
		//[]를 index(점자)라고 한다.
		
		for(int i=0; i<jumsoo.length; i++) {
				    if(i<4) {
				        System.out.print(jumsoo[i]+"\t");
				                }else {
				          System.out.println(jumsoo[i]);
				      }
				}
		
		
		  for(int i=0; i<5; i++) {// for문안에 조건문을 쓰면 반복할때마다 물어보므로 속도가 느려질수있다. 
			        System.out.print(jumsoo1[i]+"\t");
		  }
		  System.out.println();
		  //for누르고 ctrl + spacebar하면 자동으로 배열 for문 만들어준다
		  //어태 배운것 1차원 배열이다 -단층 아파트
		  
		  //문제 로또 프로그램(중복 숫자 배제) (배열이용)
		  int number;
		  
		  int[] lotto= new int[6];
		  for(int i=0; i<lotto.length; i++) {
			  number=(int)Math.ceil(Math.random()*45);
			  	lotto[i]=number;
			  for(int j=0; j<i;j++) {
				  if(lotto[i]==lotto[j]) {
					  i--;
				  }
			  }
		  }
		  for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i]+"\t");
		}
		  //문제 메서드2형식- 인자로 배열을 전달
		  
		  // 행맨게임 (apple)
		
	}

}
