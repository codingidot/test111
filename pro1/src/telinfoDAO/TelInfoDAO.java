package telinfoDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import telInfoDBConn.TelInfoDBConn;
import telinfoVO.TelInfoVO;

public class TelInfoDAO {//TelInfoDAO.java --dao:메소드의 집합

	//이제까지는 insert.java, select.java, update.java, delete.java 로 사용
		//Connection 4개, PreparedStatement 4개, ResultSet ..개씩 있어야함	
		// ====> 공통인 위의 것을 전역으로 사용해서 편리하게 효율적으로 사용
		
		private Connection con;
			//결과적으로 con에는 DBConn 접속객체가 들어간다
			//con은 telinfoDBConn.TelInfoDBConn 에 있음
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;//전역
		
		public TelInfoDAO()  //생성자
				throws ClassNotFoundException, SQLException	{
			con = new TelInfoDBConn().getConnection(); //////접속해결사
			//드라이버 loadign, 실제 hr로 접속을 하여 생긴 con을 가지고 옴
			//접속객체 get -> con
			
		}//TelInfoDAO-생성자-end
	
	
	
	     //CRUD 를 여기에 작성  
	//전체 출력을 위해 메소드 정의문 작성  - R
								//getAllInfo() 전체를 대표하는 메소드
		public ArrayList<TelInfoVO> schedule(int year, int month, int day) throws SQLException{
			ArrayList<TelInfoVO> tiarray = new ArrayList<TelInfoVO>();//generic
			String sql=null;
			if(month==0 && day==0) {
				sql="select * from myschedule "
						+" where substr(sc_date,1,2)=?"
						+" order by sc_id";
			} else if(month!=0 && day==0) {
				sql="select * from myschedule "
						+ " where substr(sc_date,1,2)=? "
						+ " and substr(sc_date,4,2)=?  "
						+ " order by sc_id";
			} else if(month!=0 && day!=0 ) {
				sql="select * from myschedule"
						+ " where substr(sc_date,1,2)=?"
						+ " and substr(sc_date,4,2)=? "
						+ " and substr(sc_date,7,2)=? "
						+ " order by sc_id";

			}

			pstmt = con.prepareStatement(sql);
			if(month==0 && day==0) {
				pstmt.setInt(1, year);
			}  else if(month!=0 && day==0) {
				pstmt.setInt(1, year);
				pstmt.setInt(2, month);
			}  else if(month!=0 && day!=0 ) {
				pstmt.setInt(1, year);
				pstmt.setInt(2, month);
				pstmt.setInt(3, day);
			}
		
			rs = pstmt.executeQuery();
			while(rs.next()) {
			int id = rs.getInt("sc_id");
			String date = rs.getString("sc_date");
			int start = rs.getInt("start_time");
			int finish = rs.getInt("finish_time");
			String contents=rs.getString("sc_contents");

			TelInfoVO tiv=new TelInfoVO(id, date, start,finish, contents);
			//VO객체에 넣기
			tiarray.add(tiv); //VO객체 ->collection에 넣기
		}//while-end
			return tiarray;  //메소드 3형식
	}//schedule()-end
		
		public int  delete_schedule(int id) throws SQLException{
			String sql="DELETE myschedule WHERE SC_ID=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, id);
			int result=pstmt.executeUpdate();
			return result;
			
				
			}
		
		public void search_id(String id) throws SQLException {
			String sql="select mem_id from member_table ";
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			int key=0;
			if(id.equals("")) {
				key=1;
			}
			while(rs.next()) {
				if(id.equals(rs.getString("mem_id")) || key==1) {
					JOptionPane.showConfirmDialog(null, "사용 불가능한 아이디입니다");
				key=1;
				} 
			}
		

			
		
			if(key==0) {
				JOptionPane.showConfirmDialog(null, "사용 가능한 아이디입니다");
				
			}
		}
		
		public void login_go(String id, String pw) throws SQLException {
			String sql=" select mem_id, mem_pw from member_table ";
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			int key=0;
			while(rs.next()) {
				if(id.equals(rs.getString("mem_id")) && pw.equals(rs.getString("mem_pw"))) {
					key=1;
					JOptionPane.showConfirmDialog(null, "로그인 성공");
				}
		}
			if(key==0) {
			JOptionPane.showConfirmDialog(null, "로그인 실패");
			}
			}
		
		
			
			}	
