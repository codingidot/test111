package three;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� �޼���2����- ���ڷ� �迭�� ����
		int[] array=new int[5];
		array[0]=1;
		array[1]=2;
		array[2]=3;
		array[3]=4;
		array[4]=5;
		int i;		
		for ( i = 0; i < array.length; i++) {
			secondMethod(array[i]);
		}
		
			 
		 ///////////////////////////////////////////////////////////////////////////////////////////// 
		  // ��ǰ��� (apple)
		
		
		String[] arr=new String[5];
		arr[0]="a";
		arr[1]="p";
		arr[2]="p";
		arr[3]="l";
		arr[4]="e";
		
		Scanner sc=new Scanner(System.in);
		System.out.println("���ĺ��� �Է��ϼ��� ��ȸ�� 7���Դϴ�");
		
		int fail=0;
		int success=0;
		int answer=0;
		int a=0,p=0,l=0,e=0;
		while(success<4){
			String input=sc.next();
				if(a>0&&input.equals("a")) {
					System.out.println("�̹� �Է��� ���亪�Դϴ�");
					success--;
				}
				if(p>0&&input.equals("p")) {
					System.out.println("�̹� �Է��� ���亪�Դϴ�");
					success--;
				}
				if(l>0&&input.equals("l")) {
					System.out.println("�̹� �Է��� ���亪�Դϴ�");
					success--;
				}
				if(e>0&&input.equals("e")) {
					System.out.println("�̹� �Է��� ���亪�Դϴ�");
					success--;
				}
		for (int j = 0; j < arr.length; j++) {
			if(arr[j].equals(input)){
			 		answer++;
			 }
		}//for() end
		
			if(answer!=1&&answer!=2) {
			System.out.println("Ʋ�Ƚ��ϴ�");
			fail++;
		    }
			else if(answer==1 || answer==2){
				     answer=0;
					if(input.equals("a")) {
						System.out.println("a - - - -"); 
						  success++;
						  a++;
					} 
						else if(input.equals("p")) {
								System.out.println("- p p - -");	
								success++;
								p++;
						}
							else if(input.equals("l")) {
	 								System.out.println("- - - l -");
	 								success++;
	 								l++;
							}	
								 else if(input.equals("e")) {
									 	 System.out.println("- - - - e");
									 	 success++;
									 	 e++;
	 					 	     }
		    }//if(answer==1 || answer==2) end
 		if(fail==7) {
 			System.out.println("������ȸ��");
 			break;
	    }//if(fail==7) end
		
		}//while() end
		if(success==4) {
		System.out.println("apple~~~ ����");
		}
	}

	private static void secondMethod(int number) {
			System.out.println(number);
		
	}

}
