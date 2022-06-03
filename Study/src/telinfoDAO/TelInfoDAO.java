package telinfoDAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import telinfoDBConn.TelInfoDBConn;
import telinfoVO.TelInfoVO;

public class TelInfoDAO {//TelInfoDAO.java --dao:�޼ҵ��� ����

	//���������� insert.java, select.java, update.java, delete.java �� ���
		//Connection 4��, PreparedStatement 4��, ResultSet ..���� �־����	
		// ====> ������ ���� ���� �������� ����ؼ� ���ϰ� ȿ�������� ���
		
		private Connection con;
			//��������� con���� DBConn ���Ӱ�ü�� ����
			//con�� telinfoDBConn.TelInfoDBConn �� ����
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;//����
		
		public TelInfoDAO()  //������
				throws ClassNotFoundException, SQLException	{
			con = new TelInfoDBConn().getConnection(); //////�����ذ��
			//����̹� loadign, ���� hr�� ������ �Ͽ� ���� con�� ������ ��
			//���Ӱ�ü get -> con
			
		}//TelInfoDAO-������-end
	
	
	
	     //CRUD �� ���⿡ �ۼ�  
	//��ü ����� ���� �޼ҵ� ���ǹ� �ۼ�  - R
								//getAllInfo() ��ü�� ��ǥ�ϴ� �޼ҵ�
	public ArrayList<TelInfoVO> getAllInfo() throws SQLException{
		ArrayList<TelInfoVO> tiarray = new ArrayList<TelInfoVO>();//generic : vo�� �� �� �ִ�
		//ArrayList<TelInfoVO> : ��ȯ��
		String sql = "select * from myschedule";
		pstmt = con.prepareStatement(sql);
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String tel = rs.getString("tel");
			Date d = rs.getDate("d");
			//4�� ���â�� vo ��ü�� �־���� 1.������ ����ų� 2.getter setter �̿�
			//�츮�� telinfovo ��� �����ڸ� ����� ����
			//table->������ �ֱ�
			TelInfoVO tv = new TelInfoVO(id,name,tel,d);
			//VO��ü�� �ֱ�
			tiarray.add(tv); //VO��ü ->collection�� �ֱ�
		}//while-end
			return tiarray;  //�޼ҵ� 3����
	}//getAllInfo()-end
	
	
	//DAO�� �޼ҵ��� ����, �޼ҵ� ������ ����
	
	//(1) �ڹٳ�¥ �̿�
	//1���Է�   //�ڹ� -DAO-DB        //10        han         010      20180907 �� �Ѿ�ð��� main����
	public boolean insert_nametel(int id,String name, String tel, String sDate) {
																		//������ ��¥���� ���ڴϱ� s �ٿ��� sDate
		String sql = "insert into TelTable5 values(?,?,?,?)";
		try { //error ���� false��ȯ�ϰ� �������Ǹ� true ��ȯ�ǰ� �Ϸ��� try�� ��
			pstmt=con.prepareStatement(sql);
			// ? ����ǥ ����
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, tel);
			   //"20161123"  ==> ��¥�� ��ȯ�Ͽ� �־������
			//(1) �ڹٸ� �����غ��ڴ� Date d1=new�� ������
			int year = Integer.parseInt(sDate.substring(0,4))-1900;//�ڹ� style  //�⵵4�ڸ� //2016-1900
																	//Date�� 1900 ���ĺ��� ī��Ʈ�ǹǷ� 1900 �ٿ��� ��
			int month = Integer.parseInt(sDate.substring(4,6))-1;//11-1  -- 0���� �����ϴϱ� 1������
			int day = Integer.parseInt(sDate.substring(6,8));//23
			
							//(2016-1900,11-1,23)
			Date d = new Date(year,month,day);//Date(��, ��, ��) //"20161123" to sql��¥�� ��ȯ
												//dao�� sql���̴ϱ� import java.sql �� �������
			pstmt.setDate(4, d);//������ ��¥ to  sql��¥ //"20161123" to ��¥
			//import java.sql.date  ==> ��¥������ ó��
			//import java.util.date ==> ��¥, �ð� ������ ó��
			pstmt.executeUpdate();////////////
			
		}catch(SQLException e) {
			System.out.println("insert Exception");
			return false; //�޼ҵ� 3����
		}
		return true;
	}//insert_nametel()-end
	
/*	  java.util.Date, java.sql.Date
 	*  �ΰ� ���� ����ؾ� �� ��, �ϳ��� import, �ϳ��� ���� ���ָ� ��!
    *  import.java.sql.date
    *  java.util Date d = new Date()*/
	
	///(2) db��¥�̿�
	
	//1���Է�     -- �ڷ��Է� �޼ҵ����ǹ�	          //10        han         010      20180907 �� �Ѿ�ð��� main����
		public boolean db_insert_nametel(int id,String name, String tel, String sDate) {
																			//������ ��¥���� ���ڴϱ� s �ٿ��� sDate
			String sql = "insert into TelTable5 values(?,?,?,to_date(?))";//to_date(?))
			try { //error ���� false��ȯ�ϰ� �������Ǹ� true ��ȯ�ǰ� �Ϸ��� try�� ��
				pstmt=con.prepareStatement(sql);
				// ? ����ǥ ����
				pstmt.setInt(1, id);
				pstmt.setString(2, name);
				pstmt.setString(3, tel);
				//������ ��¥�� DB���忡�� ���ڴ� ~ to_date(���ڿ�)
				//main���� ���޵Ǵ� ������ ������ "20161206"��
				//�������� �״�� �־ ��  // pstmt.setString(4, sDate);
				
				pstmt.setString(4, sDate);//"20180907" ==>to_date("20180907")==>18/09/07
				pstmt.executeUpdate();////////////
				
			}catch(SQLException e) {
				System.out.println("insert Exception");
				return false; //�޼ҵ� 3����
			}
			return true;
		}//db_insert_nametel()-end
		
		
		//update, insert �� ����� ���ڴ� ~~
		//update �� �̸��� ����(hong --> park)
		//delete �� id�� �Է¹޾� ���� (���� ��� 3�� �Է¹޾�)
		
								//�����̸�               //����� �̸�
	public boolean update_name(String name,String name2) {
		String sql = "update TelTable5 set name = ? where name = ?";
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, name2); //����� �̸�
			pstmt.setString(2, name); //�����̸�
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