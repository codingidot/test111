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
		//JDBC �ۼ��ϱ�
		//Q) employees ���̺��� ����� ��ü����� �˻��Ͽ� �ڹٷ� ����Ͻÿ�
		//(��, ����� ���,������ �Ի����� ���)
		
		//select employee_id ���, first_name �����, hire_date �Ի��� from employees;
		 //���̰��� �ڹٿ��� ��� �Ǿ����
		
		String sql2="select * from employees";
		Statement st2=con1.createStatement();
							//���Ӱ�ü.�޼ҵ�()
		ResultSet rs2=st2.executeQuery(sql2);
	        //���̹ڽ�                //���尴ü.execute
			
		//������̵�, �̸�, �Ի���
		
		while(rs2.next()) {
			int id=rs2.getInt("employee_id"); //�÷���, ����, alias�� �ü��ִ�
			
			String fname=rs2.getString("first_name");
			String h_date=rs2.getString("hire_date"); //�ú��ʱ��� ����
			String hire_date=h_date.substring(0,10); //�ú��ʱ��� ���γ����� 2008-01-12�� ���� 10ĭ�� ���
			System.out.println(rs2.getRow()+"\t"+id+"\t"+fname+"\t"+hire_date);
				                //getrow()�� ���ȣ return
			
		}
		
		rs2.close();
		st2.close();
		con1.close();
	
	}

}
