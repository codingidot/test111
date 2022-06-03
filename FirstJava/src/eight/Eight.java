package eight;


import java.util.ArrayList;
import java.util.Scanner;

//-----------------------
class SMarket1 {
	 private String sangpum;
	 private int price;
	 public SMarket1(){
		 //this("나 빈칸",0);
	 }
	 public SMarket1(String sangpum,int price){
		 this.sangpum=sangpum;
		 this.price=price;
	 }		 
	 public String getSangpum() {
		return sangpum;
	}
	public void setSangpum(String sangpum) {
		this.sangpum = sangpum;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String toString(){
	 return  "상품이름은  "+sangpum+" 이고  "+"상품가격은 "+price+" 입니다"; 
	 }
}
//---------------------
public class Eight {// ArrayList1.java 

	public static void main(String[] args) {
		
		  
		 ArrayList <SMarket1> arr1 = new ArrayList<SMarket1>();
         
    	  arr1.add(new SMarket1("빵",1000));
    	  arr1.add(new SMarket1("라면",3000));
    	  arr1.add(new SMarket1("우유",2900));
    	  arr1.add(new SMarket1("빵세트",1100));
    	  arr1.add(new SMarket1("라면라면",3200));
    	  arr1.add(new SMarket1("유기농우유",5500));
    	  arr1.add(new SMarket1("단팥빵",500));
    	  arr1.add(new SMarket1("초코과자",2200));
    	  arr1.add(new SMarket1("오렌지쥬스",1500));
    	  arr1.add(new SMarket1("카카오초코세트",7000));
    	  arr1.add(new SMarket1("바닐라아이스크림",8000));
    	  arr1.add(new SMarket1("생과일케익",10000));
    	
    	  
    	  
    	  Scanner sc10=new Scanner(System.in);////////////
    	  String sel;
    	  do {                       //CRUD 하자 
    		  System.out.println("1.상품검색");
    		  System.out.println("2.가격수정");
    		  System.out.println("3.상품삭제");
    		  System.out.println("4.상품입력");
    		  System.out.println("7.종료");
    		  sel=sc10.next();
    		  
    		//  }while(!sel.equals("7"));  
    		  
    		  
    		  
    		  
    		  
    		  
    		  
    		  //crud   ==> r (검색) 
         	  switch(sel) {
         	  case "1" :
        		  System.out.println("가격 얼마이상을 검색하나요?????");
            	  int ka=Integer.parseInt(sc10.next());
        		//System.out.println("가격이 3000원이상인 상품 검색해보자는~~~");
        		
        		 ArrayList <SMarket1> arr2 = new ArrayList<SMarket1>();
        		 arr2= kajaSearch(arr1, ka);
        		for (int i = 0; i < arr2.size(); i++) {
        			System.out.println(arr2.get(i).toString());/////////////
        		}
        		break;
        		 
         	  //}
         	  
         	  
         	  
         	  
         	  
         	  
         	  case "2":
           	
       		    arr1= kajaUpdate(arr1);
       			for (int i = 0; i < arr1.size(); i++) {
    	System.out.println(arr1.get(i).toString());/////////////
        		}
        		break;
         	 case "3":
 				arr1 = kajaDelete(arr1);
 				for (int i = 0; i < arr1.size(); i++) {
 					System.out.println(arr1.get(i).toString());/////////////
 				}
 				break;
         	 case "4":
  				arr1 = kajaInsert(arr1);
  				for (int i = 0; i < arr1.size(); i++) {
  					System.out.println(arr1.get(i).toString());/////////////
  				}
  				break;
         		
        	  }//switch-end
    		  
    	  }while(!sel.equals("7"));
    	 
    	 
    	 

	}//main-end

	private static ArrayList<SMarket1> kajaInsert(ArrayList<SMarket1> arr1) {
		// TODO Auto-generated method stub
		 Scanner sc10=new Scanner(System.in);////////////
			System.out.println("입력할 상품명 입력하세요!!!!!?????");
		  	 String pum=sc10.next();
		  	 System.out.println("입력할 가격을 입력하세요!!!!!?????");
			 int ka=Integer.parseInt(sc10.next());
			 
			  arr1.add(new SMarket1(pum,ka));
		  	
				
				return arr1;
	}

	private static ArrayList<SMarket1> kajaDelete(ArrayList<SMarket1> arr1) {
		// TODO Auto-generated method stub
		Scanner sc10 = new Scanner(System.in);////////////
		System.out.println("삭제할 상품명 입력하세요!!!!!?????");
		String pum = sc10.next();
		for (int i = 0; i < arr1.size(); i++) {
			if (pum.equals(arr1.get(i).getSangpum()))
				arr1.remove(i);
		}
		return arr1;
	}

	private static ArrayList<SMarket1> 
	          kajaUpdate(ArrayList<SMarket1> arr1) {
		// TODO Auto-generated method stub
	 Scanner sc10=new Scanner(System.in);////////////
	System.out.println("가격을 수정할 상품명 입력하세요!!!!!?????");
  	 String pum=sc10.next();
  	 System.out.println("수정할 가격을 입력하세요!!!!!?????");
	 int ka=Integer.parseInt(sc10.next());
  		for (int i = 0; i < arr1.size(); i++) {
	//if ("카카오초코".equals(arr1.get(i).getSangpum()))
			if (pum.equals(arr1.get(i).getSangpum()))
				   arr1.get(i).setPrice(ka);
		}
		return arr1;
	}

	private static ArrayList<SMarket1> 
	           kajaSearch(ArrayList<SMarket1>   arr1,int price) {
	
		 ArrayList <SMarket1> arr2 = new ArrayList<SMarket1>();
			
			for (int i = 0; i < arr1.size(); i++) {
				if (arr1.get(i).getPrice() >= price)
					arr2.add(arr1.get(i));
			}
			return arr2;
	}
	}
