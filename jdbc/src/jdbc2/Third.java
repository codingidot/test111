package jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;



public class Third {

        public static void main(String[] args) throws ClassNotFoundException, SQLException{
                
                Connection con1 = null;
        Class.forName("oracle.jdbc.driver.OracleDriver");
        con1 = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:"
                         + "1521:xe","hr","hr");
                
        
        //�ڷ� insert(���⼭ ������ ��¥�� to_date()�� ���� �Է�)
        String sql2 = "insert into teltable5 values(?,?,?,to_date(?))";
        
        PreparedStatement ps2 = con1.prepareStatement(sql2);
        Scanner sc=new Scanner(System.in);
        System.out.println("���̵��?");
        int id = sc.nextInt();
        System.out.println("�̸���?");
        String name = sc.next();
        System.out.println("��ȭ��ȣ��?");
        String tel = sc.next();
        System.out.println("�Ի�����?");
        String ipsail =sc.next(); 
        //������ ��¥�� ��¥�� ==> to_date()
        
        ps2.setInt(1, id);
        ps2.setString(2, name);
        ps2.setString(3, tel);
        ps2.setString(4, ipsail); // to_date�� ���� ��¥�� �����
        
        //ó���� ���
        int rowcnt1 = ps2.executeUpdate(); // executeQuery() x
                                //dml�� ��� executeUpdate
        System.out.println(rowcnt1+"�� insert�߽��ϴ�");
        con1.close();
       System.out.println("���ӳ�");
        }
}