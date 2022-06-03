package jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Fourth {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		  
        Connection con1 = null;
Class.forName("oracle.jdbc.driver.OracleDriver");
con1 = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:"
                 + "1521:xe","hr","hr");
        

String sql2="update teltable5 set tel=? where name=?";

PreparedStatement pstmt=con1.prepareStatement(sql2);

Scanner sc=new Scanner(System.in);
System.out.println("수정하기위해 검색할 이름은: ");
String name=sc.nextLine();
System.out.println("바꿀 전화번호는 ?");
String tel=sc.nextLine();

pstmt.setString(1, tel);
pstmt.setString(2, name);


int rowcnt1=pstmt.executeUpdate();
System.out.println(rowcnt1+"행 update");
con1.close();
System.out.println("접속끝");

	}

}
