package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class conn {
	
		private Connection con;
		public Connection getConnection() {
			return con;
		}
		
		public conn(toss toss){
			
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
				
				try {
					String dbIP = toss.getDbIP();
					String dbPT = toss.getDbPT();
					String dbSID = toss.getDbSID();
					String dbSNAME = toss.getDbSNAME();
					String dbID = toss.getDbID();
					String dbPW = toss.getDbPW();
					String address = "jdbc:oracle:thin:@"+dbIP+":"+dbPT+"/"+dbSNAME;
					
					//System.out.println("jdbc:oracle:thin:@"+dbIP+":"+dbPT+"/"+dbSNAME+","+dbID+","+dbPW);
					
					con=DriverManager.getConnection(address,dbID,dbPW);
					//con=DriverManager.getConnection("jdbc:oracle:thin:@"+dbIP+":"+dbPT+"/"+dbSNAME+","+dbID+","+dbPW);
					//con=DriverManager.getConnection("jdbc:oracle:thin:@shared00.iptime.org:32779/XEPDB1", "DEV2", "test1234");
					
					
				} catch (SQLException e) {
					System.out.println("▦▦▦▦▦서버와 연결되지 않았습니다.▦▦▦▦▦");
					JOptionPane.showMessageDialog(null, "서버와 접속되지 않았습니다.", "BLACKJACK", JOptionPane.ERROR_MESSAGE, null);
					e.printStackTrace();
				}
				System.out.println("[서버] conn.conn; DB접속 성공");
		}
		
} // Conn class-end


