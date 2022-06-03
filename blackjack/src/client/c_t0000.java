// [t0000] 로그인 기능 추가
// https://github.com/Hx2DEV/BLACKJACK/issues/16
// 작업자 전호형

package client;

import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import data.toss;

public class c_t0000 {
	
	
	
	public void c_t0000_send(toss toss, ObjectOutputStream oos) {
		try {
			System.out.println("[클라] [t0000] 로그인 기능 시작");
	        toss.setCode("t0000");		//객체에 코드 저장
	        oos.writeObject(toss);	 	//toss 발송
	        oos.flush(); 						//oos 비우기
	        System.out.println("[클라] [t0000] 로그인 기능 완료");
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}


}
