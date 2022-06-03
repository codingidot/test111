package data;

import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class DAO_Login {
		
		private Connection con;
		int rowcnt;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String Cryptogram;
		SHA256 sha256 = new SHA256();
		
		public DAO_Login(toss toss) {
			con = new conn(toss).getConnection();
		}

		
		
		public int login(String id, String pw)  {	

		// PASSWORD 암호화 시작 =========================
		try {
			Cryptogram = sha256.encrypt(pw);
		} catch (NoSuchAlgorithmException e1) {
			System.out.println("DAO_Login; login 암호화 에러");
			e1.printStackTrace();
		}
		// PASSWORD 암호화 완료 =========================
		
		
		if(id.equals("") || pw.equals("")) {// ID or PW 공란 에러출력
			System.out.println("아이디, 패스워드 모두 입력해주세요.");
			//JOptionPane.showMessageDialog(null, "아이디, 패스워드를 입력해주세요.");
			
			return 2;
		}		
		
		// 로그인 시작 =====================================
		String sql = "SELECT * FROM USERINFO WHERE id = ? AND pw = ?";
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, Cryptogram);
			rowcnt = ps.executeUpdate(); // ID/PW 일치 체크
		} catch(SQLException e){
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!Login_DAO.login' ID/PW 에러");
			return 3;
    	}finally {
    		try { rs.close(); } catch (Exception e) { /* ignored */ }
		    try { ps.close(); } catch (Exception e) { /* ignored */ }
    	}	
		// 로그인 종료 =====================================
		
		
		if(rowcnt==1){
			System.out.println("Login_DAO.login; 로그인성공");
			return 1;
		}else{
			System.out.println("아이디, 패스워드를 확인해 주세요.");
			//JOptionPane.showMessageDialog(null, "아이디, 패스워드를 확인해 주세요.");
			
			return 4;
		}
		
		
			
	}
}


	 
