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
//src-����-class - ��Ű������ telinfoDAO, class���� TelInfoDAO
//main x
public class TelInfoDAO {//TelInfoDAO.java

private Connection con; //����
//��������� con���� DBConn ���Ӱ�ü�� ����
//con�� telinfoDBConn.telInfoDBConn �� ����

PreparedStatement pstmt = null; //����
ResultSet rs = null; //����

public TelInfoDAO() //������(new ��ü�θ��� ó������ ���°�!)
throws ClassNotFoundException, SQLException {
con = new TelInfoDBConn().getConnection();//���� �ذ��
//����̹� loading, ���� hr�� ������ �Ͽ� ���� con�� ������ ��
//���Ӱ�ü get -> con
}//TelInfoDAO-������-end

//��ü����� ���� �޼ҵ� ���ǹ� �ۼ�
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

//table -> ������ �ֱ�
TelInfoVO tv = new TelInfoVO(id, name, tel, d);
//VO��ü�� �ֱ�
tiarray.add(tv); //VO��ü -> collection�� �ֱ�

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
System.out.println("�߰��Ǿ����ϴ�");	
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
		System.out.println("����");
		return false;
	}
	System.out.println("�ٲ���");
	return true;
}

public boolean deleteInfo(int id) {
	String sql="delete from TelTable5 where id=?";
	try {
		pstmt=con.prepareStatement(sql);
		pstmt.setInt(1, id);
		pstmt.executeUpdate();
		
	}catch(SQLException e) {
		System.out.println("����");
		return false;
	}
	System.out.println("����");
	return true;
}


}
