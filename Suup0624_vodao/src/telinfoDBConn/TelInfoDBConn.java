package telinfoDBConn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TelInfoDBConn { //TelInfoDBConn.java
	private Connection con;//접속객체

	public Connection getConnection() { //메소드 3형식
		return con;//접속객체 return
	}
	public TelInfoDBConn() //디폴트생성자로 개발자가 만든것  //생성자를 제일 먼저 찾아감
			throws ClassNotFoundException, SQLException{
		Class.forName("oracle.jdbc.driver.OracleDriver");//드라이브 로딩
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr","hr");//db 접속
	}
}
