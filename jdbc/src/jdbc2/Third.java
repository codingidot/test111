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
                
        
        //자료 insert(여기서 문자형 날짜를 to_date()를 통해 입력)
        String sql2 = "insert into teltable5 values(?,?,?,to_date(?))";
        
        PreparedStatement ps2 = con1.prepareStatement(sql2);
        Scanner sc=new Scanner(System.in);
        System.out.println("아이디는?");
        int id = sc.nextInt();
        System.out.println("이름은?");
        String name = sc.next();
        System.out.println("전화번호는?");
        String tel = sc.next();
        System.out.println("입사일은?");
        String ipsail =sc.next(); 
        //문자형 날짜를 날짜로 ==> to_date()
        
        ps2.setInt(1, id);
        ps2.setString(2, name);
        ps2.setString(3, tel);
        ps2.setString(4, ipsail); // to_date에 의해 날짜로 변경됨
        
        //처리된 행수
        int rowcnt1 = ps2.executeUpdate(); // executeQuery() x
                                //dml은 모두 executeUpdate
        System.out.println(rowcnt1+"행 insert했습니다");
        con1.close();
       System.out.println("접속끝");
        }
}