package six;

class Cafe1{
	  String menu;
      String size;
      int price;
      String place;
      
      public void cafe1() {
              
      }
      
      public String getMenu() {
              return menu;
      }
      public void setMenu(String menu) {
              this.menu = menu;
      }
      public String getSize() {
              return size;
      } 
      public void setSize(String size) {
              this.size = size;
      }
      public int getPrice() {
              return price;
      }
      public void setPrice(int price) {
              this.price = price;
      }
      public String getPlace() {
              return place;
      }
      public void setPlace(String place) {
              this.place = place;
      }
      
      public String toString() {
              return menu + "의 " + size + "사이즈는 " + price + "원이며 " + place + "지점에서 판매";
      }
}


public class Cafe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pummok="coffee**big**1500**jongro";
		
		Cafe1 cal=new Cafe1();
		String [] bae=pummok.split("\\*\\*");
		cal.setMenu(bae[0]);
		cal.setSize(bae[1]);
		cal.setPrice(Integer.valueOf(bae[2]));
		cal.setPlace(bae[3]);
		System.out.println(cal);
		
	}

}
