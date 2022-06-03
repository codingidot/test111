// [t0005] 회원가입 기능 추가
// https://github.com/Hx2DEV/BLACKJACK/issues/20
// 작업자 전호형

package client;

import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import data.toss;

public class c_t0005 {
	
	public void c_t0005_recv(toss toss, ObjectOutputStream oos, JPanel cp_login, JPanel cp_signup) {
		switch (toss.getIntnote()) {		// 처리결과가
		case 0:	// 가입성공
			JOptionPane.showMessageDialog(null, "회원가입이 완료 되었습니다.", "BLACKJAC", JOptionPane.INFORMATION_MESSAGE, null);
			cp_login.setVisible(true);
			cp_signup.setVisible(false);
			break;
		case 1:	// ID PW 불일치
			JOptionPane.showMessageDialog(null, "PW, PW(re)가 일치하지 않습니다.", "BLACKJAC", JOptionPane.ERROR_MESSAGE, null);
			break;
		case 2:	// 누락 항목 있음
			JOptionPane.showMessageDialog(null, "ID, PW, PW(re) 모두 작성해주세요.", "BLACKJAC", JOptionPane.ERROR_MESSAGE, null);
			break;
		case 3:	// 아이디 중복
			JOptionPane.showMessageDialog(null, "이미 존재하는 아이디 입니다.", "BLACKJAC", JOptionPane.ERROR_MESSAGE, null);
			break;
		}
	}
	
	public void c_t0005_send(toss toss, ObjectOutputStream oos) {
		try {
			System.out.println("[t0005] 회원가입 기능 시작");
	        toss.setCode("t0005");		//객체에 코드 저장
	        oos.writeObject(toss);	 	//TOSS 전송
	        oos.flush(); 						//OOS 비우기
	        System.out.println("[t0005] 회원가입 기능 완료");
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
}
