// [t0002] 방 생성 기능 추가
// https://github.com/Hx2DEV/BLACKJACK/issues/13
// 작업자 전호형

package server;

import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.Socket;

import data.toss;

// 클라이언트 클래스
public class s_t0002 implements Serializable{
		
	public toss s_t0002_send (toss toss, ObjectOutputStream oos) {
		System.out.println("[서버] [t0002] 방 생성 시작");
		try {	

	        toss.setCode("t0002");																	// 클라이언트가 전송된 코드 분류를 알 수 있도록 객체에 코드명 저장
	                
	        // 방 정보 기록 시작 =========================================================================
	        if(toss.getRoomInfo(0, 0)==null) {													// 1번방이 존재하지 않을경우
	        	toss.setRoomInfo(0, 0, "1");															// 1번방 생성 및 정보 기록
	        	toss.setRoomInfo(1, 0, toss.getId()); 												// Master 아이디 저장
	        	toss.setIntnote(1);																		// 클라이언트에게 방 번호 전달용
	        	toss.setRoomInfo(4, 0, toss.getNote());											// 방 제목 서버에 저장
	        	System.out.println("[서버] [t0002] 1번 방 생성 성공");
        	} else {																						// 1번방이 존재하는 경우
        		for (int i = 1; i < 10; i++) {
        			if(toss.getRoomInfo(0, i)==null){												// i번 방이 존재 하지 않는 경우
        				toss.setRoomInfo(0, i, String.valueOf(i+1));								// i번 방에 생성 및 정보 기록		
        				toss.setRoomInfo(1, i, toss.getId()); 										// Master 아이디 저장
        				toss.setIntnote(i+1);															// 클라이언트에게 방 번호 전달용
        				toss.setRoomInfo(4, i, toss.getNote());									// 방 제목 서버에 저장
        				System.out.println("[서버] [t0002] "+(i+1)+"번 방 생성 성공");
                		break;																				// 방 생성 했다면. for 종료
        			}
	        	}
			}
	        // 방 정보 기록 완료 =========================================================================       
	        oos.writeObject(toss);																	// TOSS 객체 내용 전송
	        oos.flush();																					// OOS 비우기
	        System.out.println("[서버] [t0002] 방 생성 완료");
	        
		} catch (Exception e) {
			e.printStackTrace();
		}
		return toss;
	};
}