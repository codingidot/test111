package jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Second {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con1=null;
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		con1=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:"
				+"1521:xe","hr","hr");
		//JDBC 작성하기
		//Q) employees 테이블에서 사원의 전체명단을 검색하여 자바로 출력하시오
		//(단, 출력은 사번,사원명과 입사일을 출력)
		
		//select employee_id 사번, first_name 사원명, hire_date 입사일 from employees;
		 //ㄴ이것을 자바에서 출력 되어야함
		
		String sql2="select * from employees";
		Statement st2=con1.createStatement();
							//접속객체.메소드()
		ResultSet rs2=st2.executeQuery(sql2);
	        //종이박스                //문장객체.execute
			
		//사원아이디, 이름, 입사일
		
		while(rs2.next()) {
			int id=rs2.getInt("employee_id"); //컬럼명, 순번, alias가 올수있다
			
			String fname=rs2.getString("first_name");
			String h_date=rs2.getString("hire_date"); //시분초까지 나옴
			String hire_date=h_date.substring(0,10); //시분초까지 전부나오니 2008-01-12와 같이 10칸만 출력
			System.out.println(rs2.getRow()+"\t"+id+"\t"+fname+"\t"+hire_date);
				                //getrow()는 행번호 return
			
		}
		
		rs2.close();
		st2.close();
		con1.close();
	
	}

}
