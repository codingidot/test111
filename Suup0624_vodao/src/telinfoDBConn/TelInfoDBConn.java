package telinfoDBConn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TelInfoDBConn { //TelInfoDBConn.java
	private Connection con;//���Ӱ�ü

	public Connection getConnection() { //�޼ҵ� 3����
		return con;//���Ӱ�ü return
	}
	public TelInfoDBConn() //����Ʈ�����ڷ� �����ڰ� �����  //�����ڸ� ���� ���� ã�ư�
			throws ClassNotFoundException, SQLException{
		Class.forName("oracle.jdbc.driver.OracleDriver");//����̺� �ε�
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr","hr");//db ����
	}
}
