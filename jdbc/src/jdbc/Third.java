package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Third {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		//========================
	    //Q) �̸��� Nancy�� ����� ������ ����Ͻÿ�
		// String str1="select * from employees where upper(first_name)='NANCY'"
		
		//Q) ����̸��� �Է¹޾� �ش� ����� ������ ����Ͻÿ�
	    //�Է��� Scanner
		
		Connection con1=null;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		con1=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","hr","hr");
		
		Scanner sc=new Scanner(System.in);
		Statement stm=con1.createStatement();
		
		
		
		System.out.println("�̸��� �Է��ϼ���(�빮�ڷθ� �Է�)");
		String name=sc.next();
		String str1="select * from employees where upper(first_name)='"+name+"'";

		ResultSet rs=stm.executeQuery(str1);
		    while(rs.next()) {
			int id=rs.getInt("employee_id");
			String fname=rs.getString("first_name");
			String h_date=rs.getString("hire_date"); 
			String hire_date=h_date.substring(0,10); 
			System.out.println(rs.getRow()+"\t"+id+"\t"+fname+"\t"+hire_date);
			
		}
		    
		    
		    con1.close();
		    stm.close();
		    rs.close();
		  
				
	}

}
