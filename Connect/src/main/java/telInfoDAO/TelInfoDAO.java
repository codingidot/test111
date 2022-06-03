package telInfoDAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import tellinfoDBConn.TelInfoDBConn;
import tellinfoVO.TelInfoVO;

public class TelInfoDAO {
	  private Connection con;
	    PreparedStatement pstmt = null;
	    ResultSet rs = null;
	    
	    public TelInfoDAO()
	                    throws ClassNotFoundException, SQLException {
	            con = new TelInfoDBConn().getConnection();
	    }
	    
	    //반환형  //메소드 3형식
	    public ArrayList<TelInfoVO> getAllInfo() throws SQLException{
	            ArrayList<TelInfoVO> tiarray = new ArrayList<TelInfoVO>();//generic
	            
	            String sql  ="SELECT * FROM TelTable5 ORDER BY id";
	            pstmt = con.prepareStatement(sql);
	            rs = pstmt.executeQuery();
	            while(rs.next()) {
	                    int id = rs.getInt("id");
	                    String name = rs.getString("name");
	                    String tel = rs.getString("tel");
	                    Date d = rs.getDate("d"); // VO : util        DAO : sql
	                    TelInfoVO tv = new TelInfoVO( id, name, tel,  d); // VO 생성자 활용
	                    tiarray.add(tv); //ArrayList 컬레션에 객체 넣기
	            }
	            return tiarray; //전체내용이 들어있는 해당 컬렉션을 return
	    }
	    
	    
	    public boolean insert_nametel(int id, String name, String tel, String sDate) {
	    	String sql="insert into TelTeable5 values(?,?,?,?)";
	    	try {
	    		pstmt=con.prepareStatement(sql);
	    		pstmt.setInt(1, id);
	    		pstmt.setString(2, name);
	    		pstmt.setString(3,tel);
	    
	    	int year=Integer.parseInt(sDate.substring(0,4))-1900; 
	    	int month=Integer.parseInt(sDate.substring(4,6))-1;
	    	int day=Integer.parseInt(sDate.substring(6,8));
	    	
	    	Date d=new Date(year,month,day);
	    	pstmt.setDate(4, d);
	    	pstmt.executeUpdate();
	    	}catch(SQLException e) {
	    	System.out.println("insert Exception");
	    	return false;
	    	}
	    
	    	return true;
	    	}
	    
	    	
	    public TelInfoVO search_nametel(String oriName) throws SQLException {
	    		TelInfoVO tv=null;
	    		String sql="SELECT * FROM TelTable5 where name=?";
	    		
	    		pstmt=con.prepareStatement(sql);
	    		pstmt.setString(1, oriName);
	    		rs=pstmt.executeQuery();
	    		if(rs.next()) {
	    			int id=rs.getInt("id");
	    			String name=rs.getString("name");
	    			String tel=rs.getString("tel");
	    			Date d=rs.getDate("d");
	    			tv=new TelInfoVO(id,name,tel,d);
	    			
	    		}else {
	    			tv=null;
	    		}
	    		return tv;
	    }
	    
	    
	    public boolean delete_nametel(String name2) {
	    	String sql="delete from TelTable5 where name=?";
	    	
	    	try {
	    		pstmt=con.prepareStatement(sql);
	    		pstmt.setString(1, name2);
	    		pstmt.executeQuery();
	    	}catch(SQLException e) {
	    		System.out.println("delete Exception");
	    		return false;
	    	}
	    		return true;
	    }
	    
	    
	    
	    public boolean update_nametel(String tel2, String name2) {
	    	String sql="update teltable5 set tel=? where name=?";
	    
	    
	    try {
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, tel2);
			pstmt.setString(2, name2);
			pstmt.executeUpdate();
	    } catch (SQLException e) {
	    	System.out.println("update Exception");
	    	return false;
		}
	    return true;
	    
	    
	    }
	    
	    
}
