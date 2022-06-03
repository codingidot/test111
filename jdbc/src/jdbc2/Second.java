package jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Second {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		//Q) Toronto가 지역이면서 매니저아이디가 200 이상인 사원의 사원명 
	//사원명, 봉급, 매니저아이디, 지역, 나라이름을 출력하시오

		Connection con1 = null;
        Class.forName("oracle.jdbc.driver.OracleDriver");

        con1 = DriverManager.getConnection
                        ("jdbc:oracle:thin:@127.0.0.1:"
                 + "1521:xe","hr","hr"); // db접속! //무조건 붙여쓸것!

        System.out.println("접속!");      
		
        String sql2 = 
                "select e.first_name 이름, e.salary 봉급, e.manager_id 매니저아이디," +
                " l.city 지역, c.country_name 나라이름" +
                " from employees e,departments d, locations l , countries c" +
                " where e.department_id=d.department_id and d.location_id=l.location_id" +
                " and l.country_id=c.country_id" +
                " and lower(l.city)= ? and e.manager_id >= ? ";
                       
 PreparedStatement st2 = con1.prepareStatement(sql2);//괄호안내용주의
 
  Scanner sc1=new Scanner(System.in);
        
        System.out.print("지역이름: ");
        String jiyukname=sc1.next();
        
        System.out.print("매니저아이디: ");
        int mg_id=sc1.nextInt();
        
        st2.setString(1,jiyukname);
        st2.setInt(2, mg_id);

        
 ResultSet rs2 = st2.executeQuery(); //괄호안 없음

   
 while(rs2.next()){////////////////
         
         String fname=rs2.getString("이름");
         int salary=rs2.getInt("봉급");
     int m_id=rs2.getInt("매니저아이디");
         String jiyuk=rs2.getString("지역");//////////
         String n_name=rs2.getString("나라이름");
         System.out.println(rs2.getRow()+"\t"+fname+"\t"+salary+"\t"+m_id+"\t"
                  +jiyuk+"\t"+n_name);
   
 }
con1.close();//////////////////////
System.out.println("접속끝");        //////////////

       }

}