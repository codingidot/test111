package jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Second {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		//Q) Toronto�� �����̸鼭 �Ŵ������̵� 200 �̻��� ����� ����� 
	//�����, ����, �Ŵ������̵�, ����, �����̸��� ����Ͻÿ�

		Connection con1 = null;
        Class.forName("oracle.jdbc.driver.OracleDriver");

        con1 = DriverManager.getConnection
                        ("jdbc:oracle:thin:@127.0.0.1:"
                 + "1521:xe","hr","hr"); // db����! //������ �ٿ�����!

        System.out.println("����!");      
		
        String sql2 = 
                "select e.first_name �̸�, e.salary ����, e.manager_id �Ŵ������̵�," +
                " l.city ����, c.country_name �����̸�" +
                " from employees e,departments d, locations l , countries c" +
                " where e.department_id=d.department_id and d.location_id=l.location_id" +
                " and l.country_id=c.country_id" +
                " and lower(l.city)= ? and e.manager_id >= ? ";
                       
 PreparedStatement st2 = con1.prepareStatement(sql2);//��ȣ�ȳ�������
 
  Scanner sc1=new Scanner(System.in);
        
        System.out.print("�����̸�: ");
        String jiyukname=sc1.next();
        
        System.out.print("�Ŵ������̵�: ");
        int mg_id=sc1.nextInt();
        
        st2.setString(1,jiyukname);
        st2.setInt(2, mg_id);

        
 ResultSet rs2 = st2.executeQuery(); //��ȣ�� ����

   
 while(rs2.next()){////////////////
         
         String fname=rs2.getString("�̸�");
         int salary=rs2.getInt("����");
     int m_id=rs2.getInt("�Ŵ������̵�");
         String jiyuk=rs2.getString("����");//////////
         String n_name=rs2.getString("�����̸�");
         System.out.println(rs2.getRow()+"\t"+fname+"\t"+salary+"\t"+m_id+"\t"
                  +jiyuk+"\t"+n_name);
   
 }
con1.close();//////////////////////
System.out.println("���ӳ�");        //////////////

       }

}