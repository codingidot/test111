// [t0006] 방 참가 기능 추가
// https://github.com/Hx2DEV/BLACKJACK/issues/21
// 작업자 전호형

package server;

import java.io.ObjectOutputStream;
import data.toss;

public class s_t0006 {
	
	public toss s_t0006_send (toss toss, ObjectOutputStream oos) {
		System.out.println("[서버] [t0006] 방 참가 기능 시작");
		try {	

	        toss.setCode("t0006");																	// 클라이언트가 전송된 코드 분류를 알 수 있도록 객체에 코드명 저장
	                
	        // 방 정보 기록 시작 =========================================================================
	        
	        
	        for (int i = 1; i < 4; i++) {
	        	System.out.println("이자리는?"+ toss.getRoomInfo(i, toss.getIntnote()-1));
	        	if(toss.getRoomInfo(i, toss.getIntnote()-1)==null) {							// 선택한 방의 1~3번째 자리가 null 이면.
	        		toss.setRoomInfo(i, toss.getIntnote()-1, toss.getId());					// 그 자리에 ID 저장
	        		System.out.println("[서버] [t0006] "+ String.valueOf(toss.getIntnote()-1)+"번 방 /"+i+"번 자리에 저장 완료");
	        		break;
	        	}
			}
	        							

	        // 방 정보 기록 완료 =========================================================================       
	        oos.writeObject(toss);																	// TOSS 객체 전송
	        oos.flush();																					// OOS 비우기
	        System.out.println("[서버] [t0006] 방 참가 기능 완료");
	        
		} catch (Exception e) {
			e.printStackTrace();
		}
		return toss;
	};

}
