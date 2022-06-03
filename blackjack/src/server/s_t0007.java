// [t0007] playroom에서 종료 시 해당 유저 정보 삭제 기능 추가
// https://github.com/Hx2DEV/BLACKJACK/issues/24
// 작업자 전호형

package server;

import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.HashMap;

import data.toss;

// 클라이언트 클래스
public class s_t0007{
	
	public void s_t0007() {};
	
	public String[][] s_t0007_send(toss toss, String[][] roomInfo, String tmp_id, HashMap<String, ObjectOutputStream> userOOSMap) {

			System.out.println("[서버] [t0007] playroom에서 종료 시 해당 유저 정보 삭제 시작");
			
			for (int i = 0; i < 10; i++) {
				for (int j = 1; j < 4; j++) {
					if (roomInfo[j][i]!=null) {
						if (roomInfo[j][i].equals(tmp_id)){
							toss.setIntnote(Integer.parseInt(roomInfo[0][i]));											// 대상 방번호 임시 저장
							roomInfo[j][i] = null;																				// 자기 ID 방에서 초기화
							
							if(roomInfo[1][i]==null && roomInfo[2][i]==null && roomInfo[3][i]==null){		// 1~3번 유저 자리가 null 이면 (빈 방이면).
								roomInfo[0][i] = null;																			// 방 초기화
								roomInfo[4][i] = null;																			// 방 제목 초기화
							}else {																									// 빈방이 아니면
								s_t0003 t0003 = new s_t0003();
								toss.setRoomInfo_all(roomInfo);
								t0003.s_t0003_send(toss, userOOSMap);

							}
						}
					}
				}
			}
		
	        System.out.println("[서버] [t0007] playroom에서 종료 시 해당 유저 정보 삭제 완료");

		return roomInfo;
	}

	
	
	
}