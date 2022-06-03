package telinfoPrintMain;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import telinfoDAO.TelInfoDAO;
import telinfoVO.TelInfoVO;

//src-����-class - ��Ű������ telinfoPrintMain, class���� TelInfoMain
//main o
public class TelInfoMain { //TelInfoMain.java

public static void main(String[] args) 
throws ClassNotFoundException, SQLException{
int sel=0;
TelInfoDAO tidao = new TelInfoDAO();  //���� �޴����� ���� DAO�� ����Ϸ���

do {
System.out.println("��󿬶�������!!");
System.out.println("-----------------------------");
System.out.println("1: �Ѹ��Է�");
System.out.println("2: ����");
System.out.println("3: ����");
System.out.println("4: ��ü���");
System.out.println("5: ����");
System.out.println("-----------------------------");
System.out.println("�̿��� �޴��� �����ϼ���");

sel= Integer.parseInt(JOptionPane.showInputDialog("�޴�����"));//gui

switch(sel) {

case 4://��ü ��� 		DB - DAO - VO -ó��
//DAO�� �ִ� ��ü�߷¸޼ҵ� �ʳ���
ArrayList<TelInfoVO> tiArray = tidao.getAllInfo();
//DAO���� �ö��� tiarray �� �������
for(TelInfoVO imsi: tiArray ) {
System.out.print(imsi.getId()+"\t");
System.out.print(imsi.getName()+"\t");
System.out.print(imsi.getTel()+"\t");
System.out.print(imsi.getD()+"\t");
System.out.println();
}
break;

case 1:
	int id=Integer.parseInt(JOptionPane.showInputDialog("���̵��Է�"));
	String name=JOptionPane.showInputDialog("�̸��Է�");
	String tel=JOptionPane.showInputDialog("��ȭ��ȣ �Է�");
	String d=JOptionPane.showInputDialog("��¥�Է� 00/00/00");
	
	tidao.insertInfo(id, name, tel, d);
break;

case 2:
	int id1=Integer.parseInt(JOptionPane.showInputDialog("������ ���̵��Է�"));
	String name1=JOptionPane.showInputDialog("�̸��Է�");
	String tel1=JOptionPane.showInputDialog("��ȭ��ȣ �Է�");
	String d1=JOptionPane.showInputDialog("��¥�Է� 00/00/00");
	
	tidao.updateInfo(id1, name1, tel1, d1);
	break;
	
case 3:
	int id2=Integer.parseInt(JOptionPane.showInputDialog("������ ���̵��Է�"));
	boolean dl=tidao.deleteInfo(id2);
	if(dl)
		System.out.println("�����ߴ�");
	else
		System.out.println("�ȵ���");
case 5:
	System.exit(1);
	break;

default :
	System.out.println("�޴��� �ִ� ���ڸ� �Է��ϼ���");
	
}//switch-end
}while(sel !=5);
}
}

