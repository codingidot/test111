// [t0000] 로그인 기능 추가
// https://github.com/Hx2DEV/BLACKJACK/issues/16
// 작업자 전호형

package server;

import java.io.ObjectOutputStream;
import java.net.Socket;

import data.DAO_Login;
import data.toss;

// 클라이언트 클래스
public class s_t0000{
	
	public void s_t0000() {};
	
	public toss s_t0000_send(toss toss, ObjectOutputStream oos) {
		try {
			System.out.println("[서버] [t0000] 로그인 기능 시작");
			DAO_Login DL = new DAO_Login(toss);									// DB 연결 시도
			int login_check = DL.login(toss.getId(), toss.getPw());			// 로그인 시도
			
			toss.setIntnote(login_check);													// 로그인 시도 결과 저장
			oos.writeObject(toss);															// TOSS 객체 내용 전송
	        oos.flush();																			// OOS 비움
	        System.out.println("[서버] [t0000] 로그인 기능 완료");	
		} catch (Exception e) {
			e.printStackTrace();
		}
		return toss;
	};
	
	
	
	
}