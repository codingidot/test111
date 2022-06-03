package jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Fifth {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		//Q)키보드로 퇴사한 사원아이디(id)를 입력받아 
		//DB에서 삭제하시오
		//동명이인이 없어야 한다
		Connection con = null;

		Class.forName("oracle.jdbc.driver.OracleDriver");

		con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","hr","hr");
		System.out.println("접속 완료");

		String sql = "delete from teltable5 where id =?";

		PreparedStatement ps = con.prepareStatement(sql);

		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 입력(숫자) : ");
		int id = sc.nextInt();

		ps.setInt(1, id);

		int rowcnt = ps.executeUpdate();

		System.out.println(rowcnt + "행 삭제함");

		con.close();
		sc.close();
		ps.close();
		System.out.println("접속 종료");
	}

}
