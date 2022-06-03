// [t0002] 방 생성 기능 추가
// https://github.com/Hx2DEV/BLACKJACK/issues/13

package client;

import java.io.ObjectOutputStream;
import java.io.Serializable;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import data.toss;

// 클라이언트 클래스
public class c_t0002 {
	
	//conn_receive cr = new conn_receive();
	
	public void c_t0002_recv(
			toss toss, JPanel cp_playroom, JLabel lbl_playroom
			) {
		cp_playroom.setVisible(true);
		lbl_playroom.setText("방 생성 성공!, 생성한 방 번호는 " + toss.getIntnote() + "/ 입장한 id는 " + toss.getId());
		
	};

	public void c_t0002_send(toss toss, ObjectOutputStream oos, JPanel contentPane) {
		try {
			System.out.println("[클라] [t0002] 방 생성 기능 시작");
			
			String rname ="";
			int random = (int)(Math.random() * 3) + 1;
			switch (random) {
				case 1:  rname = "블랙잭 한겜";
					break;
				case 2: rname = "재밌는 블랙잭";
					break;
				case 3: rname = "떼돈 ㄱㄱ";
					break;
			}
			
			String tmp = JOptionPane.showInputDialog(contentPane, "방 이름을 입력해주세요.", rname);

			
			if(tmp==null || tmp.equals("")) {																					// 입력을 취소하거나 값이 없다면.
				JOptionPane.showMessageDialog(contentPane, "방 생성이 취소되었습니다.");					// 취소 메세지와, 진행 중지
				System.out.println("[클라] [t0002] 방 생성 기능 취소됨");
			}else if (tmp!=null){																									// 입력 값이 있다면.
				toss.setNote(tmp);																									// 입력 값 toss에 저장
		        toss.setCode("t0002");																							// 코드 값 toss에 저장
		        oos.writeObject(toss);	 																						// toss 발송
		        oos.flush(); 																											// OOS 비우기
		        System.out.println("[클라] [t0002] 방 생성 기능 완료");
			}

		        
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}


	
	
	
	
}