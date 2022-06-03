// [t0006] 방 참가 기능 추가
// https://github.com/Hx2DEV/BLACKJACK/issues/21
// 작업자 전호형

package client;

import java.io.ObjectOutputStream;

import data.toss;

public class c_t0006 {
	
	public void c_t0006_recv(toss toss) {
		
		
	}
	
	

	public void c_t0006_send(toss toss, ObjectOutputStream oos) {
		try {
			System.out.println("[클라] [t0006] 방 참가 기능 시작");
				
				toss.setCode("t0006");		// 코드 저장
		        oos.writeObject(toss);	 	// toss 발송
		        oos.flush(); 						// OOS 비우기						
		        System.out.println("[클라] [t0002] 방 생성 기능 완료");
       
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
	
}
