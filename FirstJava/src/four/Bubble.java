package four;

public class Bubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] k={10, 90,100, 60, 70, 23};
		//Q) 위 k 배열을 점수 내립차순으로 소트하시오
		//bubble sort
		// 소트를 한반 할때마다 최솟값 , 그다음 최소값 , ....이런식으로 구해짐
		//전체 숫자가 6개이면 5번만 버블소트 돌려도 구할수있다
		
		int imsi;;
		
		/*
		 * for (int i= 0; i<k.length-1; i++) { int h=0; //이건 무조건 여기에 있어야함 (중요) for (int
		 * j = 0; j<k.length-1-i; j++) { //sort한번 돌때마다 하나의 숫자위치가 완벽하므로 하나씩 줄인다
		 * if(k[j]<k[j+1]) { imsi=k[j+1]; k[j+1]=k[j]; k[j]=imsi; h=1; } } if(h==0) {
		 * //외우는건 if문 이거 없고 위에 switch인 h없이 외우는걸 권장 3번째도 상관은 없음 for문 안에 if문 있으니까 break; }
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
		
		//flag 기법 -switch 기법(on-off) 
		
		for(int i=0; i<k.length;i++) {
			System.out.print(k[i]+"\t");
		}
		
		
	}

}
