// [t0005] 회원가입 기능 추가
// https://github.com/Hx2DEV/BLACKJACK/issues/20
// 작업자 전호형

package server;

import java.io.ObjectOutputStream;

import data.DAO_Signup;
import data.toss;

// 클라이언트 클래스
public class s_t0005{
	
	public void s_t0005() {};
	
	public void s_t0005_send(toss toss, ObjectOutputStream oos) {
		try {
			System.out.println("[t0005] 회원가입 기능 시작");
			DAO_Signup DS = new DAO_Signup(toss);
			toss = DS.signup(toss);			// 회원가입 시도
			oos.writeObject(toss);															// TOSS 객체 전송
	        oos.flush();																			// OOS 비우기
	        System.out.println("[서버] [t0005] 회원가입 기능 완료");	
		} catch (Exception e) {
			e.printStackTrace();
		}
	};
	
	
	
	
}