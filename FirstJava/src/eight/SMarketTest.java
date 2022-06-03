package eight;

import java.util.ArrayList;

public class SMarketTest {
	//(Q3) 이제 여기에 Collection 을 적용시켜보자는~~~~
    //ArrayList arr3를 만들어 처음에 판매한 날짜를 넣고 
    //그다음부터 판매내용을 넣은후 모두를 출력하시오  
    //( 출력예 ) 
    /*
    //Mon Nov 16 19:59:44 KST 2020
    상품이름은  우유 이고  상품가격은 1000 원 입니다
    상품이름은  빵 이고  상품가격은 2000 원 입니다*/


	public static void main(String[] args) {
		
		ArrayList<SMarket> arr3=new ArrayList<SMarket>();
		
		//순서 : 객체만들고 -> 초기값넣고 -> 컬렉션에 넣고
		// (익명객체 new)->생성자 -> add명령
		
		arr3.add(new SMarket("우유", 1000));
		arr3.add(new SMarket("빵", 2000));
		arr3.add(new SMarket("과자", 3000));
	
		for(int i=0; i<arr3.size(); i++) {
			System.out.println(arr3.get(i));
		}
		System.out.println();
		
		for(int i=0; i<arr3.size(); i++) {
			   System.out.println("상품이름은  "+arr3.get(i).getSangpum()+" 이고  "+"상품가격은  "+arr3.get(i).getPrice()+" 원 입니다" );
			   
		}
		System.out.println();
		
		//Q) 가격이 1500원 이상인 상품에 대해 해당 상품명만 출력하시오
		for(SMarket s: arr3) {
			if(s.getPrice()>=1500) {
		System.out.println(s.getSangpum());
			}
	}
	}

}
