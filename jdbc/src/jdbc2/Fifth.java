package jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Fifth {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		//Q)Ű����� ����� ������̵�(id)�� �Է¹޾� 
		//DB���� �����Ͻÿ�
		//���������� ����� �Ѵ�
		Connection con = null;

		Class.forName("oracle.jdbc.driver.OracleDriver");

		con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","hr","hr");
		System.out.println("���� �Ϸ�");

		String sql = "delete from teltable5 where id =?";

		PreparedStatement ps = con.prepareStatement(sql);

		Scanner sc = new Scanner(System.in);
		System.out.print("���̵� �Է�(����) : ");
		int id = sc.nextInt();

		ps.setInt(1, id);

		int rowcnt = ps.executeUpdate();

		System.out.println(rowcnt + "�� ������");

		con.close();
		sc.close();
		ps.close();
		System.out.println("���� ����");
	}

}
