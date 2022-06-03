package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Fourth {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Connection con1=null;
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		con1=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","hr","hr");
		
	//Q) ����߿��� �޿��� 10000�̻��� ���� ������ ����Ͻÿ�
		//(��, �����, �޿��� ���)
		
		String sql="select first_name �̸�, salary ���� from employees"
				+" where salary>= ?"; 
		
		PreparedStatement pstmt=con1.prepareStatement(sql);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("���� ���̻� �ٳ���?");
		int salary_bada=sc.nextInt();
		
		pstmt.setInt(1, salary_bada);
		ResultSet rs=pstmt.executeQuery();
		
		while(rs.next()) {
			String fname=rs.getString("�̸�");
			int salary=rs.getInt("����");
			System.out.println(rs.getRow()+"\t"+fname+"\t"+salary);
			
		}
		
	con1.close();
	pstmt.close();
	rs.close();
		
		
	}

}
