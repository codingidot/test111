package eight;


import java.util.ArrayList;
import java.util.Scanner;

//-----------------------
class SMarket1 {
	 private String sangpum;
	 private int price;
	 public SMarket1(){
		 //this("�� ��ĭ",0);
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
	 return  "��ǰ�̸���  "+sangpum+" �̰�  "+"��ǰ������ "+price+" �Դϴ�"; 
	 }
}
//---------------------
public class Eight {// ArrayList1.java 

	public static void main(String[] args) {
		
		  
		 ArrayList <SMarket1> arr1 = new ArrayList<SMarket1>();
         
    	  arr1.add(new SMarket1("��",1000));
    	  arr1.add(new SMarket1("���",3000));
    	  arr1.add(new SMarket1("����",2900));
    	  arr1.add(new SMarket1("����Ʈ",1100));
    	  arr1.add(new SMarket1("�����",3200));
    	  arr1.add(new SMarket1("��������",5500));
    	  arr1.add(new SMarket1("���ϻ�",500));
    	  arr1.add(new SMarket1("���ڰ���",2200));
    	  arr1.add(new SMarket1("�������꽺",1500));
    	  arr1.add(new SMarket1("īī�����ڼ�Ʈ",7000));
    	  arr1.add(new SMarket1("�ٴҶ���̽�ũ��",8000));
    	  arr1.add(new SMarket1("����������",10000));
    	
    	  
    	  
    	  Scanner sc10=new Scanner(System.in);////////////
    	  String sel;
    	  do {                       //CRUD ���� 
    		  System.out.println("1.��ǰ�˻�");
    		  System.out.println("2.���ݼ���");
    		  System.out.println("3.��ǰ����");
    		  System.out.println("4.��ǰ�Է�");
    		  System.out.println("7.����");
    		  sel=sc10.next();
    		  
    		//  }while(!sel.equals("7"));  
    		  
    		  
    		  
    		  
    		  
    		  
    		  
    		  //crud   ==> r (�˻�) 
         	  switch(sel) {
         	  case "1" :
        		  System.out.println("���� ���̻��� �˻��ϳ���?????");
            	  int ka=Integer.parseInt(sc10.next());
        		//System.out.println("������ 3000���̻��� ��ǰ �˻��غ��ڴ�~~~");
        		
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
			System.out.println("�Է��� ��ǰ�� �Է��ϼ���!!!!!?????");
		  	 String pum=sc10.next();
		  	 System.out.println("�Է��� ������ �Է��ϼ���!!!!!?????");
			 int ka=Integer.parseInt(sc10.next());
			 
			  arr1.add(new SMarket1(pum,ka));
		  	
				
				return arr1;
	}

	private static ArrayList<SMarket1> kajaDelete(ArrayList<SMarket1> arr1) {
		// TODO Auto-generated method stub
		Scanner sc10 = new Scanner(System.in);////////////
		System.out.println("������ ��ǰ�� �Է��ϼ���!!!!!?????");
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
	System.out.println("������ ������ ��ǰ�� �Է��ϼ���!!!!!?????");
  	 String pum=sc10.next();
  	 System.out.println("������ ������ �Է��ϼ���!!!!!?????");
	 int ka=Integer.parseInt(sc10.next());
  		for (int i = 0; i < arr1.size(); i++) {
	//if ("īī������".equals(arr1.get(i).getSangpum()))
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
