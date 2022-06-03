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
		
	//Q) 사원중에서 급여가 10000이상인 직원 정보를 출력하시오
		//(단, 사원명, 급여만 출력)
		
		String sql="select first_name 이름, salary 봉급 from employees"
				+" where salary>= ?"; 
		
		PreparedStatement pstmt=con1.prepareStatement(sql);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("봉급 얼마이상 다나와?");
		int salary_bada=sc.nextInt();
		
		pstmt.setInt(1, salary_bada);
		ResultSet rs=pstmt.executeQuery();
		
		while(rs.next()) {
			String fname=rs.getString("이름");
			int salary=rs.getInt("봉급");
			System.out.println(rs.getRow()+"\t"+fname+"\t"+salary);
			
		}
		
	con1.close();
	pstmt.close();
	rs.close();
		
		
	}

}
