// [t0003] 참가한 방 정보 갱신 기능 추가
// https://github.com/Hx2DEV/BLACKJACK/issues/14
// 작업자 전호형

package server;

import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.util.HashMap;

import data.toss;

public class s_t0003{
	
	public toss s_t0003_send (toss toss, HashMap<String, ObjectOutputStream> userOOSMap) {
		System.out.println("[서버] [t0003] 참가한 방 정보 갱신 기능 시작");
		try {	

	        toss.setCode("t0003");																							// 클라이언트가 전송된 코드 분류를 알 수 있도록 객체에 코드명 저장
	        ObjectOutputStream oos;
	        
	        System.out.println("유저1" + toss.getRoomInfo(1, toss.getIntnote()-1));
	        if(toss.getRoomInfo(1, toss.getIntnote()-1)!=null) {														//	선택한 방의 첫번째 자리의 유저가 null이 아니면.
	        	oos = userOOSMap.get(toss.getRoomInfo(1, toss.getIntnote()-1));								//	유저 ID에 해당하는 OOS를 불러와 재정의
	        	oos.writeObject(toss);																						//	재정의한 OOS 전송
	        	oos.flush();																										//	OOS 비우기
	        	System.out.println("1번 유저 성공");
	        }
	        System.out.println("유저2" + toss.getRoomInfo(2, toss.getIntnote()-1));
	        if(toss.getRoomInfo(2, toss.getIntnote()-1)!=null) {
	        	System.out.println("2번 유저"+ toss.getRoomInfo(2, toss.getIntnote()-1));
	        	oos = userOOSMap.get(toss.getRoomInfo(2, toss.getIntnote()-1));
	        	oos.writeObject(toss);
	        	oos.flush();
	        	System.out.println("2번 유저 성공");
	        }
	        
	        if(toss.getRoomInfo(3, toss.getIntnote()-1)!=null) {
	        	System.out.println("3번 유저"+ toss.getRoomInfo(3, toss.getIntnote()-1));
	        	oos = userOOSMap.get(toss.getRoomInfo(3, toss.getIntnote()-1));
	        	oos.writeObject(toss);
	        	oos.flush();
	        	System.out.println("3번 유저 성공");
	        }
      
	        System.out.println("[서버] [t0003] 참가한 방 정보 갱신 기능 완료 ");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return toss;
	};

}
