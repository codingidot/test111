// [t0003] 참가한 방 정보 갱신 기능 추가
// https://github.com/Hx2DEV/BLACKJACK/issues/14
// 작업자 전호형

package client;

import java.io.ObjectOutputStream;

import javax.swing.JLabel;

import data.toss;

public class c_t0003 {
	
	public void c_t0003_recv(toss toss, JLabel lbl_playroom) {
		
		
		System.out.println("[클라] [t0003] c_t0003_recv 참가한 방 정보 갱신 기능 시작");
		String a, b, c = "";
		System.out.println("여기1" + toss.getRoomInfo(1, toss.getIntnote()-1));
		if(toss.getRoomInfo(1, toss.getIntnote()-1)==null)
			a= "없음";	else	a = toss.getRoomInfo(1, toss.getIntnote()-1);
		
		System.out.println("여기2" + toss.getRoomInfo(2, toss.getIntnote()-1));
		if(toss.getRoomInfo(2, toss.getIntnote()-1)==null)
			b= "없음";	else	b = toss.getRoomInfo(2, toss.getIntnote()-1);
		
		System.out.println("여기3" + toss.getRoomInfo(3, toss.getIntnote()-1));
		if(toss.getRoomInfo(3, toss.getIntnote()-1)==null)
			c= "없음";	else	c = toss.getRoomInfo(3, toss.getIntnote()-1);
		
		lbl_playroom.setText("1번 유저: " + a + " // 2번 유저: " + b + " // 3번 유저 :"+ c);
		 System.out.println("[클라] [t0003] c_t0003_recv 참가한 방 정보 갱신 기능 완료");
	}
	
	

	public void c_t0003_send(toss toss, ObjectOutputStream oos) {
		try {
			System.out.println("[클라] [t0003] c_t0003_send 참가한 방 정보 갱신 기능 시작");
				
				toss.setCode("t0003"); 		//코드저장
		        oos.writeObject(toss);	 	// toss 발송
		        oos.flush(); 						// OOS 비우기
		       
	        System.out.println("[클라] [t0003] c_t0003_send 참가한 방 정보 갱신 기능 완료");
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
	
}
