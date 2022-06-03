package five;

public class SecondArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//array: 고정길이, one data type
		
		int[] k2=new int[3]; //1차원 배열 //단층아파트
		//고층아파트: 2차원배열, 단지:3차원배열
		
				    // 층(행), 호수(열)	
		int[][] k=new int[2][3]; //2*3=6개 아파트
		k[1][0]=30;
		k[1][2]=50;
		k[0][0]=100;
		
		System.out.println(k[0][0]+"\t"+k[1][2]);

		//Q 2차원배열에 1차원처럼 초기치를 넣는다면?
		//int [][] k100= {10,20,30,40,50,60}; //안된다
		int[][] k102= {{1,2,3}, {4,5,6}};
		
		int[][] k121= {
					  {1,2,3},
					  {4,5,6}
					  };//이런식으로 쓰면 좋다
	
		for (int i = 0; i < k121.length; i++) { //k121은 행을 대표함
			for (int j = 0; j <k121[i].length; j++) { //k121[i]는 열을 대표함
				System.out.print(k121[i][j]+"\t");
			}
			System.out.println();
		}
		
	
	}
	


}
