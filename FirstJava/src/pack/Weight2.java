package pack;

import javax.swing.JOptionPane;

public class Weight2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k12= Integer.parseInt(JOptionPane.showInputDialog("Ű��"));
		int mom3= Integer.parseInt(JOptionPane.showInputDialog("�����Դ�"));
		double mk1=k12/100.0; //.0���� ���ϸ� int ���� ����.
		double bm121=mom3/Math.pow(mk1, 2); /////�����Լ� mk1�� 2������ �Լ�
		
		System.out.println("�񸸵�:"+bm121);
		
		if(bm121>=30) 
			 System.out.println("���Դϴ�");
		 else if(bm121>=25)
			        System.out.println("��ü���Դϴ�");
		 	  else if(bm121>=20)
		 		       System.out.println("����");
		 	  	   else 
		 	  		   		System.out.println("��ü��");
	}

}
