package seven;

class Parent7 
{        int don;               //아하~~생성자 중복 !!!!!!!!
        public  Parent7(int don){//인자 있는 생성자
                  this.don=don;
                  System.out.println("나 돈 받았네!"+don+"억");
         }
        public Parent7(){//인자 없는 생성자
                  System.out.println("나 돈 없어!!!");
        }
}
class Child7 extends Parent7 //////////
{
      public Child7(){//개발자가 직접만들었음 그러니까  디폴트생성자 아님 
              System.out.println("나는 엄청나게 많아!!!");
      }
      public Child7(int don) {
    	 super(don);
    	 
    	  System.out.println("나는 엄청나게 많아!!"+don+"억");
    	  System.out.println("나는 엄청나게 많아!!"+super.don+"억");
      }
}
public class Fifth {
        public static void main(String[] args) {
           //Parent7 p7=new Parent7();
                Child7 c7=new Child7(30);
                //동방예의지국이라 부모 클래스 먼저 찍히고 자식 클래스 찍힘
           
              
      
        }

}