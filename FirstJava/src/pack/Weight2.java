package pack;

import javax.swing.JOptionPane;

public class Weight2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k12= Integer.parseInt(JOptionPane.showInputDialog("키는"));
		int mom3= Integer.parseInt(JOptionPane.showInputDialog("몸무게는"));
		double mk1=k12/100.0; //.0으로 안하면 int 값이 들어간다.
		double bm121=mom3/Math.pow(mk1, 2); /////수학함수 mk1의 2제곱의 함수
		
		System.out.println("비만도:"+bm121);
		
		if(bm121>=30) 
			 System.out.println("비만입니다");
		 else if(bm121>=25)
			        System.out.println("과체중입니다");
		 	  else if(bm121>=20)
		 		       System.out.println("보통");
		 	  	   else 
		 	  		   		System.out.println("저체중");
	}

}
