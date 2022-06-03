// [t0001] 방 목록 갱신 기능 추가
// https://github.com/Hx2DEV/BLACKJACK/issues/10
// 작업자 전호형

package client;

import java.io.ObjectOutputStream;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import   javax.script.ScriptEngine ;
import   javax.script.ScriptEngineManager ;

import data.toss;

// 클라이언트 클래스
public class c_t0001{
	
	public void c_t0001_recv(
			toss toss, 
			JLabel lbl_room1_UI_userimg1, JLabel lbl_room1_UI_userimg2, JLabel lbl_room1_UI_userimg3, JLabel lbl_room2_UI_userimg1, JLabel lbl_room2_UI_userimg2, JLabel lbl_room2_UI_userimg3, 
			JLabel lbl_room3_UI_userimg1, JLabel lbl_room3_UI_userimg2, JLabel lbl_room3_UI_userimg3, JLabel lbl_room4_UI_userimg1, JLabel lbl_room4_UI_userimg2, JLabel lbl_room4_UI_userimg3, 
			JLabel lbl_room5_UI_userimg1, JLabel lbl_room5_UI_userimg2, JLabel lbl_room5_UI_userimg3, JLabel lbl_room6_UI_userimg1, JLabel lbl_room6_UI_userimg2, JLabel lbl_room6_UI_userimg3, 
			JLabel lbl_room7_UI_userimg1, JLabel lbl_room7_UI_userimg2, JLabel lbl_room7_UI_userimg3, JLabel lbl_room8_UI_userimg1, JLabel lbl_room8_UI_userimg2, JLabel lbl_room8_UI_userimg3,
			JLabel lbl_room9_UI_userimg1, JLabel lbl_room9_UI_userimg2, JLabel lbl_room9_UI_userimg3, JLabel lbl_room10_UI_userimg1, JLabel lbl_room10_UI_userimg2, JLabel lbl_room10_UI_userimg3, 
			
			JLabel lbl_room1_UI_stats_btn, JLabel lbl_room2_UI_stats_btn, JLabel lbl_room3_UI_stats_btn, JLabel lbl_room4_UI_stats_btn, JLabel lbl_room5_UI_stats_btn, 
			JLabel lbl_room6_UI_stats_btn, JLabel lbl_room7_UI_stats_btn, JLabel lbl_room8_UI_stats_btn, JLabel lbl_room9_UI_stats_btn, JLabel lbl_room10_UI_stats_btn, 
			
			JPanel cp_room1, JPanel cp_room2, JPanel cp_room3, JPanel cp_room4, JPanel cp_room5, JPanel cp_room6, JPanel cp_room7, JPanel cp_room8, JPanel cp_room9, JPanel cp_room10,
			
			JLabel lbl_room1_title, JLabel lbl_room2_title, JLabel lbl_room3_title, JLabel lbl_room4_title, JLabel lbl_room5_title, 
			JLabel lbl_room6_title, JLabel lbl_room7_title, JLabel lbl_room8_title, JLabel lbl_room9_title, JLabel lbl_room10_title
			) {
		
		System.out.println("[클라] [t0001] 방 전체 정보 : "+toss.getRoomMap_all());

		switch(toss.getRoomMap(1)) { // 1번방
		case 0 :
			cp_room1.setVisible(false);
			break;
		case 1 :
			lbl_room1_UI_userimg1.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));			// 유저1 아이콘 변경
			lbl_room1_UI_userimg2.setIcon(new ImageIcon(client.class.getResource("/img/user0.png")));			// 유저2 아이콘 변경
			lbl_room1_UI_userimg3.setIcon(new ImageIcon(client.class.getResource("/img/user0.png")));			// 유저3 아이콘 변경
			lbl_room1_UI_stats_btn.setIcon(new ImageIcon(client.class.getResource("/img/stats_btn0.png")));		// 대기중 / 진행중(?) 아이콘 변경
			lbl_room1_title.setText(toss.getRoomInfo(4, 0));																		// 방이름 저장
			cp_room1.setVisible(true);																									// 1번 방 출력
			break;
		case 2 :
			lbl_room1_UI_userimg1.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
			lbl_room1_UI_userimg2.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
			lbl_room1_UI_userimg3.setIcon(new ImageIcon(client.class.getResource("/img/user0.png")));
			lbl_room1_UI_stats_btn.setIcon(new ImageIcon(client.class.getResource("/img/stats_btn0.png")));
			lbl_room1_title.setText(toss.getRoomInfo(4, 0));
			cp_room1.setVisible(true);
			break;
		case 3 :
			lbl_room1_UI_userimg1.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
			lbl_room1_UI_userimg2.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
			lbl_room1_UI_userimg3.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
			lbl_room1_UI_stats_btn.setIcon(new ImageIcon(client.class.getResource("/img/stats_btn1.png")));
			lbl_room1_title.setText(toss.getRoomInfo(4, 0));
			cp_room1.setVisible(true);
			break;							
		}

		switch(toss.getRoomMap(2)) { // 2번방
		case 0 :
			cp_room2.setVisible(false);
			break;
		case 1 :
			lbl_room2_UI_userimg1.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
			lbl_room2_UI_userimg2.setIcon(new ImageIcon(client.class.getResource("/img/user0.png")));
			lbl_room2_UI_userimg3.setIcon(new ImageIcon(client.class.getResource("/img/user0.png")));
			lbl_room2_UI_stats_btn.setIcon(new ImageIcon(client.class.getResource("/img/stats_btn0.png")));
			lbl_room2_title.setText(toss.getRoomInfo(4, 1));
			cp_room2.setVisible(true);
			break;
		case 2 :
			lbl_room2_UI_userimg1.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
			lbl_room2_UI_userimg2.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
			lbl_room2_UI_userimg3.setIcon(new ImageIcon(client.class.getResource("/img/user0.png")));
			lbl_room2_UI_stats_btn.setIcon(new ImageIcon(client.class.getResource("/img/stats_btn0.png")));
			lbl_room2_title.setText(toss.getRoomInfo(4, 1));
			cp_room2.setVisible(true);
			break;
		case 3 :
			lbl_room2_UI_userimg1.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
			lbl_room2_UI_userimg2.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
			lbl_room2_UI_userimg3.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
			lbl_room2_UI_stats_btn.setIcon(new ImageIcon(client.class.getResource("/img/stats_btn1.png")));
			lbl_room2_title.setText(toss.getRoomInfo(4, 1));
			cp_room2.setVisible(true);
			break;							
		}
		
		switch(toss.getRoomMap(3)) { // 3번방
		case 0 :
			cp_room3.setVisible(false);
			break;
		case 1 :
			lbl_room3_UI_userimg1.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
			lbl_room3_UI_userimg2.setIcon(new ImageIcon(client.class.getResource("/img/user0.png")));
			lbl_room3_UI_userimg3.setIcon(new ImageIcon(client.class.getResource("/img/user0.png")));
			lbl_room3_UI_stats_btn.setIcon(new ImageIcon(client.class.getResource("/img/stats_btn0.png")));
			lbl_room3_title.setText(toss.getRoomInfo(4, 2));
			cp_room3.setVisible(true);
			break;
		case 2 :
			lbl_room3_UI_userimg1.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
			lbl_room3_UI_userimg2.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
			lbl_room3_UI_userimg3.setIcon(new ImageIcon(client.class.getResource("/img/user0.png")));
			lbl_room3_UI_stats_btn.setIcon(new ImageIcon(client.class.getResource("/img/stats_btn0.png")));
			lbl_room3_title.setText(toss.getRoomInfo(4, 2));
			cp_room3.setVisible(true);
			break;
		case 3 :
			lbl_room3_UI_userimg1.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
			lbl_room3_UI_userimg2.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
			lbl_room3_UI_userimg3.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
			lbl_room3_UI_stats_btn.setIcon(new ImageIcon(client.class.getResource("/img/stats_btn1.png")));
			lbl_room3_title.setText(toss.getRoomInfo(4, 2));
			cp_room3.setVisible(true);
			break;							
		}				
		
		switch(toss.getRoomMap(4)) { // 4번방
		case 0 :
			cp_room4.setVisible(false);
			break;
		case 1 :
			lbl_room4_UI_userimg1.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
			lbl_room4_UI_userimg2.setIcon(new ImageIcon(client.class.getResource("/img/user0.png")));
			lbl_room4_UI_userimg3.setIcon(new ImageIcon(client.class.getResource("/img/user0.png")));
			lbl_room4_UI_stats_btn.setIcon(new ImageIcon(client.class.getResource("/img/stats_btn0.png")));
			lbl_room4_title.setText(toss.getRoomInfo(4, 3));
			cp_room4.setVisible(true);
			break;
		case 2 :
			lbl_room4_UI_userimg1.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
			lbl_room4_UI_userimg2.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
			lbl_room4_UI_userimg3.setIcon(new ImageIcon(client.class.getResource("/img/user0.png")));
			lbl_room4_UI_stats_btn.setIcon(new ImageIcon(client.class.getResource("/img/stats_btn0.png")));
			lbl_room4_title.setText(toss.getRoomInfo(4, 3));
			cp_room4.setVisible(true);
			break;
		case 3 :
			lbl_room4_UI_userimg1.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
			lbl_room4_UI_userimg2.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
			lbl_room4_UI_userimg3.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
			lbl_room4_UI_stats_btn.setIcon(new ImageIcon(client.class.getResource("/img/stats_btn1.png")));
			lbl_room4_title.setText(toss.getRoomInfo(4, 3));
			cp_room4.setVisible(true);
			break;							
		}		
		
		switch(toss.getRoomMap(5)) { // 5번방
		case 0 :
			cp_room5.setVisible(false);
			break;
		case 1 :
			lbl_room5_UI_userimg1.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
			lbl_room5_UI_userimg2.setIcon(new ImageIcon(client.class.getResource("/img/user0.png")));
			lbl_room5_UI_userimg3.setIcon(new ImageIcon(client.class.getResource("/img/user0.png")));
			lbl_room5_UI_stats_btn.setIcon(new ImageIcon(client.class.getResource("/img/stats_btn0.png")));
			lbl_room5_title.setText(toss.getRoomInfo(4, 4));
			cp_room5.setVisible(true);
			break;
		case 2 :
			lbl_room5_UI_userimg1.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
			lbl_room5_UI_userimg2.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
			lbl_room5_UI_userimg3.setIcon(new ImageIcon(client.class.getResource("/img/user0.png")));
			lbl_room5_UI_stats_btn.setIcon(new ImageIcon(client.class.getResource("/img/stats_btn0.png")));
			lbl_room5_title.setText(toss.getRoomInfo(4, 4));
			cp_room5.setVisible(true);
			break;
		case 3 :
			lbl_room5_UI_userimg1.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
			lbl_room5_UI_userimg2.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
			lbl_room5_UI_userimg3.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
			lbl_room5_UI_stats_btn.setIcon(new ImageIcon(client.class.getResource("/img/stats_btn1.png")));
			lbl_room5_title.setText(toss.getRoomInfo(4, 4));
			cp_room5.setVisible(true);
			break;							
		}
		
		switch(toss.getRoomMap(6)) { // 6번방
		case 0 :
			cp_room6.setVisible(false);
			break;
		case 1 :
			lbl_room6_UI_userimg1.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
			lbl_room6_UI_userimg2.setIcon(new ImageIcon(client.class.getResource("/img/user0.png")));
			lbl_room6_UI_userimg3.setIcon(new ImageIcon(client.class.getResource("/img/user0.png")));
			lbl_room6_UI_stats_btn.setIcon(new ImageIcon(client.class.getResource("/img/stats_btn0.png")));
			lbl_room6_title.setText(toss.getRoomInfo(4, 5));
			cp_room6.setVisible(true);
			break;
		case 2 :
			lbl_room6_UI_userimg1.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
			lbl_room6_UI_userimg2.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
			lbl_room6_UI_userimg3.setIcon(new ImageIcon(client.class.getResource("/img/user0.png")));
			lbl_room6_UI_stats_btn.setIcon(new ImageIcon(client.class.getResource("/img/stats_btn0.png")));
			lbl_room6_title.setText(toss.getRoomInfo(4, 5));
			cp_room6.setVisible(true);
			break;
		case 3 :
			lbl_room6_UI_userimg1.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
			lbl_room6_UI_userimg2.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
			lbl_room6_UI_userimg3.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
			lbl_room6_UI_stats_btn.setIcon(new ImageIcon(client.class.getResource("/img/stats_btn1.png")));
			lbl_room6_title.setText(toss.getRoomInfo(4, 5));
			cp_room6.setVisible(true);
			break;							
		}	
		
		switch(toss.getRoomMap(7)) { // 7번방
		case 0 :
			cp_room7.setVisible(false);
			break;
		case 1 :
			lbl_room7_UI_userimg1.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
			lbl_room7_UI_userimg2.setIcon(new ImageIcon(client.class.getResource("/img/user0.png")));
			lbl_room7_UI_userimg3.setIcon(new ImageIcon(client.class.getResource("/img/user0.png")));
			lbl_room7_UI_stats_btn.setIcon(new ImageIcon(client.class.getResource("/img/stats_btn0.png")));
			lbl_room7_title.setText(toss.getRoomInfo(4, 6));
			cp_room7.setVisible(true);
			break;
		case 2 :
			lbl_room7_UI_userimg1.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
			lbl_room7_UI_userimg2.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
			lbl_room7_UI_userimg3.setIcon(new ImageIcon(client.class.getResource("/img/user0.png")));
			lbl_room7_UI_stats_btn.setIcon(new ImageIcon(client.class.getResource("/img/stats_btn0.png")));
			lbl_room7_title.setText(toss.getRoomInfo(4, 6));
			cp_room7.setVisible(true);
			break;
		case 3 :
			lbl_room7_UI_userimg1.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
			lbl_room7_UI_userimg2.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
			lbl_room7_UI_userimg3.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
			lbl_room7_UI_stats_btn.setIcon(new ImageIcon(client.class.getResource("/img/stats_btn1.png")));
			lbl_room7_title.setText(toss.getRoomInfo(4, 6));
			cp_room7.setVisible(true);
			break;							
		}	
		
		switch(toss.getRoomMap(8)) { // 8번방
		case 0 :
			cp_room8.setVisible(false);
			break;
		case 1 :
			lbl_room8_UI_userimg1.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
			lbl_room8_UI_userimg2.setIcon(new ImageIcon(client.class.getResource("/img/user0.png")));
			lbl_room8_UI_userimg3.setIcon(new ImageIcon(client.class.getResource("/img/user0.png")));
			lbl_room8_UI_stats_btn.setIcon(new ImageIcon(client.class.getResource("/img/stats_btn0.png")));
			lbl_room8_title.setText(toss.getRoomInfo(4, 7));
			cp_room8.setVisible(true);
			break;
		case 2 :
			lbl_room8_UI_userimg1.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
			lbl_room8_UI_userimg2.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
			lbl_room8_UI_userimg3.setIcon(new ImageIcon(client.class.getResource("/img/user0.png")));
			lbl_room8_UI_stats_btn.setIcon(new ImageIcon(client.class.getResource("/img/stats_btn0.png")));
			lbl_room8_title.setText(toss.getRoomInfo(4, 7));
			cp_room8.setVisible(true);
			break;
		case 3 :
			lbl_room8_UI_userimg1.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
			lbl_room8_UI_userimg2.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
			lbl_room8_UI_userimg3.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
			lbl_room8_UI_stats_btn.setIcon(new ImageIcon(client.class.getResource("/img/stats_btn1.png")));
			lbl_room8_title.setText(toss.getRoomInfo(4, 7));
			cp_room8.setVisible(true);
			break;							
		}	
		
		switch(toss.getRoomMap(9)) { // 9번방
		case 0 :
			cp_room9.setVisible(false);
			break;
		case 1 :
			lbl_room9_UI_userimg1.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
			lbl_room9_UI_userimg2.setIcon(new ImageIcon(client.class.getResource("/img/user0.png")));
			lbl_room9_UI_userimg3.setIcon(new ImageIcon(client.class.getResource("/img/user0.png")));
			lbl_room9_UI_stats_btn.setIcon(new ImageIcon(client.class.getResource("/img/stats_btn0.png")));
			lbl_room9_title.setText(toss.getRoomInfo(4, 8));
			cp_room9.setVisible(true);
			break;
		case 2 :
			lbl_room9_UI_userimg1.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
			lbl_room9_UI_userimg2.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
			lbl_room9_UI_userimg3.setIcon(new ImageIcon(client.class.getResource("/img/user0.png")));
			lbl_room9_UI_stats_btn.setIcon(new ImageIcon(client.class.getResource("/img/stats_btn0.png")));
			lbl_room9_title.setText(toss.getRoomInfo(4, 8));
			cp_room9.setVisible(true);
			break;
		case 3 :
			lbl_room9_UI_userimg1.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
			lbl_room9_UI_userimg2.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
			lbl_room9_UI_userimg3.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
			lbl_room9_UI_stats_btn.setIcon(new ImageIcon(client.class.getResource("/img/stats_btn1.png")));
			lbl_room9_title.setText(toss.getRoomInfo(4, 8));
			cp_room9.setVisible(true);
			break;							
		}	
		
		switch(toss.getRoomMap(10)) { // 9번방
		case 0 :
			cp_room10.setVisible(false);
			break;
		case 1 :
			lbl_room10_UI_userimg1.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
			lbl_room10_UI_userimg2.setIcon(new ImageIcon(client.class.getResource("/img/user0.png")));
			lbl_room10_UI_userimg3.setIcon(new ImageIcon(client.class.getResource("/img/user0.png")));
			lbl_room10_UI_stats_btn.setIcon(new ImageIcon(client.class.getResource("/img/stats_btn0.png")));
			lbl_room10_title.setText(toss.getRoomInfo(4, 9));
			cp_room10.setVisible(true);
			break;
		case 2 :
			lbl_room10_UI_userimg1.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
			lbl_room10_UI_userimg2.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
			lbl_room10_UI_userimg3.setIcon(new ImageIcon(client.class.getResource("/img/user0.png")));
			lbl_room10_UI_stats_btn.setIcon(new ImageIcon(client.class.getResource("/img/stats_btn0.png")));
			lbl_room10_title.setText(toss.getRoomInfo(4, 9));
			cp_room10.setVisible(true);
			break;
		case 3 :
			lbl_room10_UI_userimg1.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
			lbl_room10_UI_userimg2.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
			lbl_room10_UI_userimg3.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
			lbl_room10_UI_stats_btn.setIcon(new ImageIcon(client.class.getResource("/img/stats_btn1.png")));
			lbl_room10_title.setText(toss.getRoomInfo(4, 9));
			cp_room10.setVisible(true);
			break;							
		}		
	}
	

	public void c_t0001_send(toss toss, ObjectOutputStream oos) {
		try {
			System.out.println("[클라] [t0001] 방 목록 갱신 시작");
	        toss.setCode("t0001");			//객체에 코드 저장
	        oos.writeObject(toss);	 		//toss 발송
	        oos.flush(); 							//OOS 비우기
			System.out.println("[클라] [t0001] 방 목록 갱신 완료");
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	};
	
	
	
	
}