package telinfoDAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import telInfoDBConn.TelInfoDBConn;
import telinfoVO.TelInfoVO;
import teli\nfoDBConn.TelInfoDBConn;
import telinfoVO.TelInfoVO;
import telInfoDBConn.
import telInfoVO.TelInfoVO;
//src-마오-class - 페키지명은 telinfoDAO, class명은 TelInfoDAO
//main x
public class TelInfoDAO {//TelInfoDAO.java

private Connection con; //전역
//결과적으로 con에는 DBConn 접속객체가 들어간다
//con은 telinfoDBConn.telInfoDBConn 에 있음

PreparedStatement pstmt = null; //전역
ResultSet rs = null; //전역

public TelInfoDAO() //생성자(new 객체부르면 처음으로 오는곳!)
throws ClassNotFoundException, SQLException {
con = new TelInfoDBConn().getConnection();//접속 해결사
//드라이버 loading, 시제 hr로 접속을 하여 생긴 con을 가지고 옴
//접속객체 get -> con
}//TelInfoDAO-생성자-end

//전체룰력을 위해 메소드 정의문 작성
public ArrayList<TelInfoVO> schedule(int year, int month, int day) throws SQLException{
ArrayList<TelInfoVO> tiarray = new ArrayList<TelInfoVO>();//generic

if(month==0 && day==0) {
	sql="select * from myschedule "
			+" where substr(sc_date,1,2)=?"
			+" order by sc_id";
}

pstmt = con.prepareStatement(sql);
pstmt.setInt(1, year);
rs = pstmt.executeQuery();
while(rs.next()) {
int id = rs.getInt("sc_id");
Date date = rs.getDate("sc_date");
int start = rs.getInt("start_time");
int finish = rs.getInt("finish_time");
String contents=rs.getString("sc_contents");

//table -> 변수에 넣기
TelInfoVO tv = new TelInfoVO(id, name, tel, d);
//VO객체에 넣기
tiarray.add(tv); //VO객체 -> collection에 넣기

}//while-end
return tiarray;
}//getAllInfo()-END



public boolean insertInfo(int id, String name, String tel, String date){
try {	
	String sql="INSERT INTO TelTable5 VALUES(?,?,?,to_date(?))";
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, tel);
			pstmt.setString(4, date);
			
			pstmt.executeUpdate();
			
	} catch(SQLException e) {
		System.out.println("insert Exception");
	return false;
	}
System.out.println("추가되었습니다");	
return true;
	
}

public boolean updateInfo(int id, String name, String tel, String date) {
	String sql="UPDATE TelTable5 SET name=?, tel=?, d=to_date(?) WHERE id=?";
	try {
	pstmt=con.prepareStatement(sql);
	pstmt.setString(1, name);
	pstmt.setString(2, tel);
	pstmt.setString(3, date);
	pstmt.setInt(4, id);
	pstmt.executeUpdate();
	} catch(SQLException e) {
		System.out.println("실패");
		return false;
	}
	System.out.println("바꼈다");
	return true;
}

public boolean deleteInfo(int id) {
	String sql="delete from TelTable5 where id=?";
	try {
		pstmt=con.prepareStatement(sql);
		pstmt.setInt(1, id);
		pstmt.executeUpdate();
		
	}catch(SQLException e) {
		System.out.println("실패");
		return false;
	}
	System.out.println("성공");
	return true;
}


}
