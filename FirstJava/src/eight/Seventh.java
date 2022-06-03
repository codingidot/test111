package eight;

import java.util.ArrayList;
import java.util.Scanner;

//  이건 검색만 완성 ///////////////
class SMarket2 {
         private String sangpum;
         private int price;
         public SMarket2(){
                 //this("나 빈칸",0);
         }
         public SMarket2(String sangpum,int price){
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

public class Seventh {

        public static void main(String[] args) {

                ArrayList <SMarket2> arr1 = new ArrayList<SMarket2>();
                
                arr1.add(new SMarket2("빵",1000));
        arr1.add(new SMarket2("라면",3000));
        arr1.add(new SMarket2("우유",2900));
        arr1.add(new SMarket2("빵세트",1100));
        arr1.add(new SMarket2("라면라면",3200));
        arr1.add(new SMarket2("유기농우유",5500));
        arr1.add(new SMarket2("단팥빵",500));
        arr1.add(new SMarket2("초코과자",2200));
        arr1.add(new SMarket2("오렌지쥬스",1500));
        arr1.add(new SMarket2("카카오초코세트",7000));
        arr1.add(new SMarket2("바닐라아이스크림",8000));
        arr1.add(new SMarket2("생과일케익",10000));
                
        Scanner sc = new Scanner(System.in);
        String sel;
        do {                      //CRUD
                System.out.println("1.상품검색");
                System.out.println("2.가격수정");
                System.out.println("3.상품삭제");
                System.out.println("4.상품입력");
                System.out.println("7.종료");
                sel=sc.next();
        //} while(!sel.equals("7"));
        
                 switch(sel) {
                     case "1" :
                    System.out.println("가격 얼마 이상을 검색하나요?");
                    int ka=Integer.parseInt(sc.next());
                    //System.out.println("가격이 3000원 이상인 상품을 검색");
                  
                    ArrayList <SMarket2> arr2 = new ArrayList<SMarket2>();
                    arr2= kajaSearch(arr1, ka);
                    for (int i = 0; i < arr2.size(); i++) {
                          System.out.println(arr2.get(i).toString());/////////////
                    }
                    break;
                    
                     case "2":
                     System.out.println("어떤 상품을 가격수정 하시겟습니까?");
                    String mulgun=sc.next();
                    System.out.println("가격을 얼마로 하겠습니까?");
                    int don=sc.nextInt();
                    for(int i=0; i<arr1.size(); i++) {
                    if(mulgun.equals(arr1.get(i).getSangpum())) {
                    	arr1.set(i, new SMarket2(mulgun, don));
                    }
                    }
                
                    for(SMarket2 sm: arr1) {
                    	System.out.println(sm);
                    }
                    
                    break;
                    
                     case "3":
                    	 System.out.println("삭제할 상품을 입력해주세요");
                    	 String sakje=sc.next();
                    	 for(int i=0; i<arr1.size(); i++) {
                             if(sakje.equals(arr1.get(i).getSangpum())) {
                             	arr1.remove(i);
      
                             }
                             }
                    	 for(SMarket2 sm: arr1) {
                         	System.out.println(sm);
                         }
                    	 break;
                     case "4":
                    	 System.out.println("입력할 상품의 이름을 입력해주세요");
                    	 String add=sc.next();
                    	 System.out.println("가격을 입력해주세요");
                    	 int mon=sc.nextInt();
                    	 SMarket2 ss=new SMarket2(add, mon);
                    	 arr1.add(ss);
                    	 
                    	 for(SMarket2 sm: arr1) {
                          	System.out.println(sm);
                          }
                     	 break;
                 }
       } while(!sel.equals("7"));
        }

        private static ArrayList<SMarket2> 
                        kajaSearch(ArrayList<SMarket2> arr1, int price) {
                ArrayList <SMarket2> arr2 = new ArrayList <SMarket2>();
                for(int i = 0; i < arr1.size(); i++) {
                        if(arr1.get(i).getPrice() >= price)
                                arr2.add(arr1.get(i));
                }
                return arr2;
        }
}        
