package eight;

import java.util.ArrayList;
import java.util.Scanner;

//  �̰� �˻��� �ϼ� ///////////////
class SMarket2 {
         private String sangpum;
         private int price;
         public SMarket2(){
                 //this("�� ��ĭ",0);
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
         return  "��ǰ�̸���  "+sangpum+" �̰�  "+"��ǰ������ "+price+" �Դϴ�"; 
         }
}

public class Seventh {

        public static void main(String[] args) {

                ArrayList <SMarket2> arr1 = new ArrayList<SMarket2>();
                
                arr1.add(new SMarket2("��",1000));
        arr1.add(new SMarket2("���",3000));
        arr1.add(new SMarket2("����",2900));
        arr1.add(new SMarket2("����Ʈ",1100));
        arr1.add(new SMarket2("�����",3200));
        arr1.add(new SMarket2("��������",5500));
        arr1.add(new SMarket2("���ϻ�",500));
        arr1.add(new SMarket2("���ڰ���",2200));
        arr1.add(new SMarket2("�������꽺",1500));
        arr1.add(new SMarket2("īī�����ڼ�Ʈ",7000));
        arr1.add(new SMarket2("�ٴҶ���̽�ũ��",8000));
        arr1.add(new SMarket2("����������",10000));
                
        Scanner sc = new Scanner(System.in);
        String sel;
        do {                      //CRUD
                System.out.println("1.��ǰ�˻�");
                System.out.println("2.���ݼ���");
                System.out.println("3.��ǰ����");
                System.out.println("4.��ǰ�Է�");
                System.out.println("7.����");
                sel=sc.next();
        //} while(!sel.equals("7"));
        
                 switch(sel) {
                     case "1" :
                    System.out.println("���� �� �̻��� �˻��ϳ���?");
                    int ka=Integer.parseInt(sc.next());
                    //System.out.println("������ 3000�� �̻��� ��ǰ�� �˻�");
                  
                    ArrayList <SMarket2> arr2 = new ArrayList<SMarket2>();
                    arr2= kajaSearch(arr1, ka);
                    for (int i = 0; i < arr2.size(); i++) {
                          System.out.println(arr2.get(i).toString());/////////////
                    }
                    break;
                    
                     case "2":
                     System.out.println("� ��ǰ�� ���ݼ��� �Ͻðٽ��ϱ�?");
                    String mulgun=sc.next();
                    System.out.println("������ �󸶷� �ϰڽ��ϱ�?");
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
                    	 System.out.println("������ ��ǰ�� �Է����ּ���");
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
                    	 System.out.println("�Է��� ��ǰ�� �̸��� �Է����ּ���");
                    	 String add=sc.next();
                    	 System.out.println("������ �Է����ּ���");
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
