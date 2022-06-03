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
			//VO��ü�� �ֱ�
			tiarray.add(tiv); //VO��ü ->collection�� �ֱ�
		}//while-end
			return tiarray;  //�޼ҵ� 3����
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
					JOptionPane.showConfirmDialog(null, "��� �Ұ����� ���̵��Դϴ�");
				key=1;
				} 
			}
		

			
		
			if(key==0) {
				JOptionPane.showConfirmDialog(null, "��� ������ ���̵��Դϴ�");
				
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
					JOptionPane.showConfirmDialog(null, "�α��� ����");
				}
		}
			if(key==0) {
			JOptionPane.showConfirmDialog(null, "�α��� ����");
			}
			}
		
		
			
			}	
