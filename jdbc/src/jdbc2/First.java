package jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class First { //4월 7일

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	//	--Q)지역을 입력받아 해당 지역에 근무하는 
	//--        (예: Seattle지역에 근무하는) 
	//--    사원의 이름, 부서명, 입사월을 출력하는 jdbc 프로그램을 작성하시오
 
		
		Connection con1 = null;
         Class.forName("oracle.jdbc.driver.OracleDriver");

         con1 = DriverManager.getConnection
                         ("jdbc:oracle:thin:@127.0.0.1:"
                  + "1521:xe","hr","hr"); // db접속! //무조건 붙여쓸것!

         System.out.println("접속!");      
		
		  String sql2 = "select e.first_name 이름," 
                  +" d.department_name 부서명," 
                  +" l.city 도시명,"                                
          +" substr(hire_date,4,2) 입사월"
          +" from employees e, departments d ,"
          +" locations l"                        
          +" where e.department_id=d.department_id" 
          +" and d.location_id=l.location_id"
          +" and lower(l.city) = ? "
          +" order by 1";
          
  PreparedStatement ps2 = con1.prepareStatement(sql2);
  
  Scanner sc1 = new Scanner(System.in);
  System.out.print("근무지역입력 : ");
  String jiyuk = sc1.next();//S
  
  ps2.setString(1, jiyuk);
  ResultSet rs2 = ps2.executeQuery();
  
  while(rs2.next()) {                        
          String fname = rs2.getString("이름");
          String dname = rs2.getString("부서명");
          String hdate = rs2.getString("입사월");
          System.out.println(rs2.getRow()+"\t"+fname+"\t"+dname+"\t"+hdate);
          }
          con1.close();
          ps2.close();
          rs2.close();
          System.out.println("접속끝");
		
	}

}
