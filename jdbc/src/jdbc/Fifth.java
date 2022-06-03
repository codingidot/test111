package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Fifth {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		
		//Q) 이름이 S로 시작하는 사원정보를 출력하시오
		//단, 사원아이디, 이름과 입사일만 출력
		
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
	
	
	
	//Q) 지역을 입력받아 해당 지역에 근무하는 
	//(예: Seattle 지역에 근무하는)
	//사원의 이름, 부서명, 입사월을 출력하는 jdbc 프로그램을 작성하시오
	//내일 할것
	
	
	
	}

}
