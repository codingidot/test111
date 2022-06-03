package tellinfoDBConn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TelInfoDBConn {
	private Connection con;
	
	public Connection getConnection() {
		return con;
	}
	
	public TelInfoDBConn() throws ClassNotFoundException, SQLException {
		Class.forName("orable.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
	}
}
