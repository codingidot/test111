package seven;

class Parent7 
{        int don;               //����~~������ �ߺ� !!!!!!!!
        public  Parent7(int don){//���� �ִ� ������
                  this.don=don;
                  System.out.println("�� �� �޾ҳ�!"+don+"��");
         }
        public Parent7(){//���� ���� ������
                  System.out.println("�� �� ����!!!");
        }
}
class Child7 extends Parent7 //////////
{
      public Child7(){//�����ڰ� ����������� �׷��ϱ�  ����Ʈ������ �ƴ� 
              System.out.println("���� ��û���� ����!!!");
      }
      public Child7(int don) {
    	 super(don);
    	 
    	  System.out.println("���� ��û���� ����!!"+don+"��");
    	  System.out.println("���� ��û���� ����!!"+super.don+"��");
      }
}
public class Fifth {
        public static void main(String[] args) {
           //Parent7 p7=new Parent7();
                Child7 c7=new Child7(30);
                //���濹�������̶� �θ� Ŭ���� ���� ������ �ڽ� Ŭ���� ����
           
              
      
        }

}