package telinfoDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;

import telinfoDBCONN.TelInfoDBConn;
import telinfoVO.TelInfoVO;

public class TelInfoDAO {
	
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	
	
	public TelInfoDAO() throws ClassNotFoundException, SQLException {
		con = new TelInfoDBConn().getConnection();
	}
	
	
	public ArrayList<TelInfoVO> getAllInfo(){
		ArrayList<TelInfoVO> list = new ArrayList<TelInfoVO>();
		
		String sql = "select * from teltable5 order by id";
		
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				TelInfoVO vo = new TelInfoVO();
				vo.setId(rs.getInt("id"));
				vo.setName(rs.getString("name"));
				vo.setTel(rs.getString("tel"));
				vo.setD(rs.getDate("d"));
				list.add(vo);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}

		return list;
		
	}
	
	public boolean insert_sawon(int id, String name, String tel, String sDate) {
		
		String sql = "insert into teltable5 values(?,?,?,?)";
		
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, tel);
			
			// 문자형으로 들어온 날짜를 DB 날짜형식을 처리
			// to_date 오라클 함수 사용하지 않고 자바만으로 처리 
			// ex) 20180206 입력시 
			int year = Integer.parseInt(sDate.substring(0,4))-1900; //2018-1900 = 118
			int month = Integer.parseInt(sDate.substring(4,6))-1; // 02-1 = 1
			int day = Integer.parseInt(sDate.substring(6,8)); // 06
			Date d = new Date(year,month,day); // 118,1,6 으로 입력하게 되면 
			// java.sql.Date 형식에 20180206 을 입력하는 것임. 
			// 이건 오라클 함수를 쓰지 않고 자바 만으로 처리 하는 전통방식임. 
			
			// 이 방식 대신 to_date 를 사용해도 된다. 
			
			ps.setDate(4, d);
			if(ps.executeUpdate() != 0) {
				System.out.println("사원추가 완료");
			}
		}catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	// 자바 날짜는 java.util.Date
	// SQL 날짜는 java.sql.Date 

	// 이름으로 사원 정보 가져오기 (반환형은 객체) 
	public TelInfoVO search_name(String name) {
		
		TelInfoVO vo = null;
		
		String sql = "select * from teltable5 where name=?";
		
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, name);
			rs = ps.executeQuery();
			if(rs.next()) {
				vo = new TelInfoVO();
				vo.setId(rs.getInt("id"));
				vo.setName(rs.getString("name"));
				vo.setTel(rs.getString("tel"));
				vo.setD(rs.getDate("d"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			// vo = null;
		}
		return vo;
	}
	// 에러시 vo 는 null 반환. 
	// 동명이인이 있을 수 있으므로 좋은 방법은 아니다. 
	
	
	public boolean delete_name(String name) {
		String sql = "delete teltable5 where name=?";
		
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, name);
			if(ps.executeUpdate() != 0) {
				System.out.println("사원 삭제 완료 ");
			}
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println("사원 삭제 에러");
			return false;
		}
		return true;
	}
	
	
	public boolean update_sawon(String name, String tel) {
	
		String sql = "update teltable5 set tel=? where name=?";
		
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, tel);
			ps.setString(2, name);
			ps.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println("수정 에러");
			return false;
		}
		return true;
	}
	

}
