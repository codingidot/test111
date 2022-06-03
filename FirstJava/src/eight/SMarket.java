package eight;

class SMarket {
    private String sangpum;
    private int price;
    //생성자 , toString() 작성 
    
    public SMarket(){  } //디폴트 생성자  
       
    public SMarket(String sangpum,int price){//인자있는 생성자
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

        

public String toString(){/////////////////
   return "상품이름은  "+sangpum+" 이고  "+"상품가격은  "+price+" 원 입니다"; 
     }
}