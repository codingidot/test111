package eight;

class SMarket {
    private String sangpum;
    private int price;
    //������ , toString() �ۼ� 
    
    public SMarket(){  } //����Ʈ ������  
       
    public SMarket(String sangpum,int price){//�����ִ� ������
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
   return "��ǰ�̸���  "+sangpum+" �̰�  "+"��ǰ������  "+price+" �� �Դϴ�"; 
     }
}