package telinfoPrintMain;


import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import telinfoDAO.TelInfoDAO;
import telinfoVO.TelInfoVO;

public class TelInfoMain { //TelInfoMain.java

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//메뉴 만들때는 do-while문
		int sel = 0;
		TelInfoDAO tidao = new TelInfoDAO();//이쪽 메뉴에서 저쪽 DAO를 사용하기위해 객체 생성
		do {
			System.out.println("비상연락망관리!!");
			System.out.println("-------------------------");
			System.out.println("1: 한명입력");
			System.out.println("2: 수정");
			System.out.println("3: 삭제");
			System.out.println("4: 전체출력");
			System.out.println("5: 종료");
			System.out.println("-------------------------");
			System.out.println("이용할 메뉴를 선택하세요");
			
			sel = Integer.parseInt(JOptionPane.showInputDialog("메뉴선택"));//GUI
			switch(sel) {////////
			case 1: //1명 입력 로직  //gui
				
				int id= Integer.parseInt(JOptionPane.showInputDialog("아이디는?"));
				String name= JOptionPane.showInputDialog("이름은?");
				String tel= JOptionPane.showInputDialog("전화번호는?");
				String sDate= JOptionPane.showInputDialog("날짜는?");
				
				boolean b1 = tidao.db_insert_nametel(id, name, tel, sDate);
				if(b1) //true if(boolean==true) 와 같음
					System.out.println("insert ok");
				else
					System.out.println("insert error");
				break;
				
			case 2://update
				
				String n1 = JOptionPane.showInputDialog("기존 이름은?");
				String n2 = JOptionPane.showInputDialog("바뀔 이름은?");
				
				boolean b2 = tidao.update_name(n1, n2);
				if (b2) System.out.println("update ok");
				else System.out.println("update error");
				break;
			
			case 3://delete
				
				int delid = Integer.parseInt(JOptionPane.showInputDialog("삭제할 아이디는?"));
				
				boolean b3 = tidao.delete_name(delid);
				if(b3) System.out.println("delete ok");
				else System.out.println("delete error");
				break;
				
			
			case 4: //전체출력  =>  DB - DAO - VO - 처리
													//DAO에 있는 전체출력메소드 너 나와
													//DAO에서 올때는 tiarry 를 가지고 옴
				ArrayList<TelInfoVO> tiArray = tidao.getAllInfo();//객체.메소드
				for(TelInfoVO imsi:tiArray) {//하나씩 꺼내서 TelInfoVO에 넣어줌
					System.out.print(imsi.getId()+"\t");
					System.out.print(imsi.getName()+"\t");
					System.out.print(imsi.getTel()+"\t");
					System.out.println(imsi.getD());
				}
				break;
				
			case 5:
				System.out.println("종료합니다");
				System.exit(1);
				break;
				}///switch-end
			}//do-end
		while(sel != 5);
	}//do-while-end
}