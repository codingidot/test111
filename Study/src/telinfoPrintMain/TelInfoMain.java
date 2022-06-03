package telinfoPrintMain;


import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import telinfoDAO.TelInfoDAO;
import telinfoVO.TelInfoVO;

public class TelInfoMain { //TelInfoMain.java

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//�޴� ���鶧�� do-while��
		int sel = 0;
		TelInfoDAO tidao = new TelInfoDAO();//���� �޴����� ���� DAO�� ����ϱ����� ��ü ����
		do {
			System.out.println("��󿬶�������!!");
			System.out.println("-------------------------");
			System.out.println("1: �Ѹ��Է�");
			System.out.println("2: ����");
			System.out.println("3: ����");
			System.out.println("4: ��ü���");
			System.out.println("5: ����");
			System.out.println("-------------------------");
			System.out.println("�̿��� �޴��� �����ϼ���");
			
			sel = Integer.parseInt(JOptionPane.showInputDialog("�޴�����"));//GUI
			switch(sel) {////////
			case 1: //1�� �Է� ����  //gui
				
				int id= Integer.parseInt(JOptionPane.showInputDialog("���̵��?"));
				String name= JOptionPane.showInputDialog("�̸���?");
				String tel= JOptionPane.showInputDialog("��ȭ��ȣ��?");
				String sDate= JOptionPane.showInputDialog("��¥��?");
				
				boolean b1 = tidao.db_insert_nametel(id, name, tel, sDate);
				if(b1) //true if(boolean==true) �� ����
					System.out.println("insert ok");
				else
					System.out.println("insert error");
				break;
				
			case 2://update
				
				String n1 = JOptionPane.showInputDialog("���� �̸���?");
				String n2 = JOptionPane.showInputDialog("�ٲ� �̸���?");
				
				boolean b2 = tidao.update_name(n1, n2);
				if (b2) System.out.println("update ok");
				else System.out.println("update error");
				break;
			
			case 3://delete
				
				int delid = Integer.parseInt(JOptionPane.showInputDialog("������ ���̵��?"));
				
				boolean b3 = tidao.delete_name(delid);
				if(b3) System.out.println("delete ok");
				else System.out.println("delete error");
				break;
				
			
			case 4: //��ü���  =>  DB - DAO - VO - ó��
													//DAO�� �ִ� ��ü��¸޼ҵ� �� ����
													//DAO���� �ö��� tiarry �� ������ ��
				ArrayList<TelInfoVO> tiArray = tidao.getAllInfo();//��ü.�޼ҵ�
				for(TelInfoVO imsi:tiArray) {//�ϳ��� ������ TelInfoVO�� �־���
					System.out.print(imsi.getId()+"\t");
					System.out.print(imsi.getName()+"\t");
					System.out.print(imsi.getTel()+"\t");
					System.out.println(imsi.getD());
				}
				break;
				
			case 5:
				System.out.println("�����մϴ�");
				System.exit(1);
				break;
				}///switch-end
			}//do-end
		while(sel != 5);
	}//do-while-end
}