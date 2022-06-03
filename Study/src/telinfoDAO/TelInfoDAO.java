package telinfoDAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import telinfoDBConn.TelInfoDBConn;
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
	public ArrayList<TelInfoVO> getAllInfo() throws SQLException{
		ArrayList<TelInfoVO> tiarray = new ArrayList<TelInfoVO>();//generic : vo만 들어갈 수 있는
		//ArrayList<TelInfoVO> : 반환형
		String sql = "select * from myschedule";
		pstmt = con.prepareStatement(sql);
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String tel = rs.getString("tel");
			Date d = rs.getDate("d");
			//4개 기억창고를 vo 객체에 넣어야함 1.생성자 만들거나 2.getter setter 이용
			//우리는 telinfovo 라는 생성자를 만들어 놓음
			//table->변수에 넣기
			TelInfoVO tv = new TelInfoVO(id,name,tel,d);
			//VO객체에 넣기
			tiarray.add(tv); //VO객체 ->collection에 넣기
		}//while-end
			return tiarray;  //메소드 3형식
	}//getAllInfo()-end
	
	
	//DAO는 메소드의 집합, 메소드 순서는 무관
	
	//(1) 자바날짜 이용
	//1명입력   //자바 -DAO-DB        //10        han         010      20180907 가 넘어올것임 main에서
	public boolean insert_nametel(int id,String name, String tel, String sDate) {
																		//실제론 날짜지만 문자니까 s 붙여서 sDate
		String sql = "insert into TelTable5 values(?,?,?,?)";
		try { //error 나면 false반환하고 정상실행되면 true 반환되게 하려고 try문 씀
			pstmt=con.prepareStatement(sql);
			// ? 물음표 순서
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, tel);
			   //"20161123"  ==> 날짜로 변환하여 넣어줘야함
			//(1) 자바를 생각해보자는 Date d1=new가 생각남
			int year = Integer.parseInt(sDate.substring(0,4))-1900;//자바 style  //년도4자리 //2016-1900
																	//Date는 1900 이후부터 카운트되므로 1900 붙여야 함
			int month = Integer.parseInt(sDate.substring(4,6))-1;//11-1  -- 0부터 시작하니까 1빼야함
			int day = Integer.parseInt(sDate.substring(6,8));//23
			
							//(2016-1900,11-1,23)
			Date d = new Date(year,month,day);//Date(년, 월, 일) //"20161123" to sql날짜로 변환
												//dao는 sql쪽이니까 import java.sql 로 해줘야함
			pstmt.setDate(4, d);//문자형 날짜 to  sql날짜 //"20161123" to 날짜
			//import java.sql.date  ==> 날짜정보만 처리
			//import java.util.date ==> 날짜, 시간 정보만 처리
			pstmt.executeUpdate();////////////
			
		}catch(SQLException e) {
			System.out.println("insert Exception");
			return false; //메소드 3형식
		}
		return true;
	}//insert_nametel()-end
	
/*	  java.util.Date, java.sql.Date
 	*  두개 같이 사용해야 할 시, 하나는 import, 하나는 직접 써주면 됌!
    *  import.java.sql.date
    *  java.util Date d = new Date()*/
	
	///(2) db날짜이용
	
	//1명입력     -- 자료입력 메소드정의문	          //10        han         010      20180907 가 넘어올것임 main에서
		public boolean db_insert_nametel(int id,String name, String tel, String sDate) {
																			//실제론 날짜지만 문자니까 s 붙여서 sDate
			String sql = "insert into TelTable5 values(?,?,?,to_date(?))";//to_date(?))
			try { //error 나면 false반환하고 정상실행되면 true 반환되게 하려고 try문 씀
				pstmt=con.prepareStatement(sql);
				// ? 물음표 순서
				pstmt.setInt(1, id);
				pstmt.setString(2, name);
				pstmt.setString(3, tel);
				//지금은 날짜를 DB입장에서 보자는 ~ to_date(문자열)
				//main에서 전달되는 인자의 형식은 "20161206"임
				//문자형태 그대로 넣어도 됨  // pstmt.setString(4, sDate);
				
				pstmt.setString(4, sDate);//"20180907" ==>to_date("20180907")==>18/09/07
				pstmt.executeUpdate();////////////
				
			}catch(SQLException e) {
				System.out.println("insert Exception");
				return false; //메소드 3형식
			}
			return true;
		}//db_insert_nametel()-end
		
		
		//update, insert 를 만들어 보자는 ~~
		//update 는 이름만 변경(hong --> park)
		//delete 는 id를 입력받아 삭제 (예를 들어 3을 입력받아)
		
								//현재이름               //변경될 이름
	public boolean update_name(String name,String name2) {
		String sql = "update TelTable5 set name = ? where name = ?";
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, name2); //변경될 이름
			pstmt.setString(2, name); //현재이름
			pstmt.executeUpdate();
		}catch(SQLException e) {
			System.out.println("update Exception");
			return false;
		}
		return true;
	}
	
	public boolean delete_name(int id) {
		String sql = "delete from TelTable5 where id = ?";
		//throws ...
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, id);
			pstmt.executeUpdate();//////
		} catch(SQLException e){
			System.out.println("delete Exception");
			return false;//
		}
		return true;
	}
}