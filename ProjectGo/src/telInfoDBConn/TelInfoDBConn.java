package telInfoDBConn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//src-����-class - ��Ű������ telinfoDBConn, class���� TelInfoDBConn
//main x
public class TelInfoDBConn { //TelInfoDBConn.java
private Connection con; //���� ���Ӱ�ü �� ���Ͽ� (��������)

public Connection getConnection() { //�޼ҵ�3���� // getter
return con; //���Ӱ�ü return
}

// TelInfoDBConn�� new�ؼ� ��ü�� ����� ������ ���⸦ ���� ������
public TelInfoDBConn() // ����Ʈ�����ڷ� �����ڰ� �����
throws ClassNotFoundException, SQLException {

Class.forName("oracle.jdbc.driver.OracleDriver");
//����Ŭ ����̹� ������ �����ϱ�����
// ������Ʈ�� - ���� - biuld path....-add external jar - ojdbc8.jar
con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
}//
}//TelInfoDBConnŬ���� -end
