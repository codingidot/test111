package jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class First { //4�� 7��

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	//	--Q)������ �Է¹޾� �ش� ������ �ٹ��ϴ� 
	//--        (��: Seattle������ �ٹ��ϴ�) 
	//--    ����� �̸�, �μ���, �Ի���� ����ϴ� jdbc ���α׷��� �ۼ��Ͻÿ�
 
		
		Connection con1 = null;
         Class.forName("oracle.jdbc.driver.OracleDriver");

         con1 = DriverManager.getConnection
                         ("jdbc:oracle:thin:@127.0.0.1:"
                  + "1521:xe","hr","hr"); // db����! //������ �ٿ�����!

         System.out.println("����!");      
		
		  String sql2 = "select e.first_name �̸�," 
                  +" d.department_name �μ���," 
                  +" l.city ���ø�,"                                
          +" substr(hire_date,4,2) �Ի��"
          +" from employees e, departments d ,"
          +" locations l"                        
          +" where e.department_id=d.department_id" 
          +" and d.location_id=l.location_id"
          +" and lower(l.city) = ? "
          +" order by 1";
          
  PreparedStatement ps2 = con1.prepareStatement(sql2);
  
  Scanner sc1 = new Scanner(System.in);
  System.out.print("�ٹ������Է� : ");
  String jiyuk = sc1.next();//S
  
  ps2.setString(1, jiyuk);
  ResultSet rs2 = ps2.executeQuery();
  
  while(rs2.next()) {                        
          String fname = rs2.getString("�̸�");
          String dname = rs2.getString("�μ���");
          String hdate = rs2.getString("�Ի��");
          System.out.println(rs2.getRow()+"\t"+fname+"\t"+dname+"\t"+hdate);
          }
          con1.close();
          ps2.close();
          rs2.close();
          System.out.println("���ӳ�");
		
	}

}
