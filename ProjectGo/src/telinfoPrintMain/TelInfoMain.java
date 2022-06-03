package telinfoPrintMain;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import telinfoDAO.TelInfoDAO;
import telinfoVO.TelInfoVO;

//src-마오-class - 페키지명은 telinfoPrintMain, class명은 TelInfoMain
//main o
public class TelInfoMain { //TelInfoMain.java

public static void main(String[] args) 
throws ClassNotFoundException, SQLException{
int sel=0;
TelInfoDAO tidao = new TelInfoDAO();  //이쪽 메뉴에서 저쪽 DAO를 사용하려고

do {
System.out.println("비상연락망관리!!");
System.out.println("-----------------------------");
System.out.println("1: 한명입력");
System.out.println("2: 수정");
System.out.println("3: 삭제");
System.out.println("4: 전체출력");
System.out.println("5: 종료");
System.out.println("-----------------------------");
System.out.println("이용할 메뉴를 선택하세요");

sel= Integer.parseInt(JOptionPane.showInputDialog("메뉴선택"));//gui

switch(sel) {

case 4://전체 출력 		DB - DAO - VO -처리
//DAO에 있는 전체추력메소드 너나와
ArrayList<TelInfoVO> tiArray = tidao.getAllInfo();
//DAO에서 올때는 tiarray 를 가지고옴
for(TelInfoVO imsi: tiArray ) {
System.out.print(imsi.getId()+"\t");
System.out.print(imsi.getName()+"\t");
System.out.print(imsi.getTel()+"\t");
System.out.print(imsi.getD()+"\t");
System.out.println();
}
break;

case 1:
	int id=Integer.parseInt(JOptionPane.showInputDialog("아이디입력"));
	String name=JOptionPane.showInputDialog("이름입력");
	String tel=JOptionPane.showInputDialog("전화번호 입력");
	String d=JOptionPane.showInputDialog("날짜입력 00/00/00");
	
	tidao.insertInfo(id, name, tel, d);
break;

case 2:
	int id1=Integer.parseInt(JOptionPane.showInputDialog("변경할 아이디입력"));
	String name1=JOptionPane.showInputDialog("이름입력");
	String tel1=JOptionPane.showInputDialog("전화번호 입력");
	String d1=JOptionPane.showInputDialog("날짜입력 00/00/00");
	
	tidao.updateInfo(id1, name1, tel1, d1);
	break;
	
case 3:
	int id2=Integer.parseInt(JOptionPane.showInputDialog("삭제할 아이디입력"));
	boolean dl=tidao.deleteInfo(id2);
	if(dl)
		System.out.println("삭제했다");
	else
		System.out.println("안됐음");
case 5:
	System.exit(1);
	break;

default :
	System.out.println("메뉴에 있는 숫자를 입력하세요");
	
}//switch-end
}while(sel !=5);
}
}

