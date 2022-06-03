package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Fifth {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		
		//Q) �̸��� S�� �����ϴ� ��������� ����Ͻÿ�
		//��, ������̵�, �̸��� �Ի��ϸ� ���
		
         Connection con1=null;
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		con1=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","hr","hr");
		
	
		
		String sql="select * from employees"
				+" where first_name like ?"; 
		
		PreparedStatement pstmt=con1.prepareStatement(sql);
		Scanner sc=new Scanner(System.in);
		String irum=sc.next();
		
		pstmt.setString(1, irum+"%");
		ResultSet rs=pstmt.executeQuery();
		
		while(rs.next()) {
			String id=rs.getString("employee_id");
			String name=rs.getString("first_name");
			String hire=rs.getString("hire_date");
			System.out.println(rs.getRow()+"\t"+id+"\t"+name+"\t"+hire);
			
		}
		
	con1.close();
	pstmt.close();
	rs.close();
	
	
	
	//Q) ������ �Է¹޾� �ش� ������ �ٹ��ϴ� 
	//(��: Seattle ������ �ٹ��ϴ�)
	//����� �̸�, �μ���, �Ի���� ����ϴ� jdbc ���α׷��� �ۼ��Ͻÿ�
	//���� �Ұ�
	
	
	
	}

}
