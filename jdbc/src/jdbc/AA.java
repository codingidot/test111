package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AA {// 4월 6일 first

	public static void main(String[] args) 
	throws  SQLException, ClassNotFoundException{

	/* #.driver 연동을 위해 add external jar로 사용
	 * 
	 * 플젝-마오-build path- configure build path
	 * -library 탭 - add exxternal jar
	 * -ojdbc8.jar 선택 후- apply and close
	
	 *class path에 ojdbc8 넣음
	 */
		
	/*
	 * (구조확인) 
	 *     ㄴ Referenced libraries에 ojdbc8.jar 보임
	 */
	//----------------------------------------
	//지금 프로그램은 자바와 db연동을 하게해서 접속되는지만 확인
	Connection con1=null; //접속 객체 con1선언 //ctrl + shift + o로 import
	//                  대소문자, 띄어쓰기 x
	Class.forName("oracle.jdbc.driver.OracleDriver"); //오라클 드라이버로딩
	//스테틱메소드 (new없이 사용)   //객체.메소드() ==>클래스.메소드()
	con1=DriverManager.getConnection
			("jdbc:oracle:thin:@127.0.0.1:1521:xe","hr","hr");
     //jdbc:oracle:thin 오라클을 얘기하는거임
	//@127.0.0.1  내가 나한테 접속할때 사용 localhost로도 사용가능
	//외부에서 접속할때는 @192.168.0.13
	//포트번호 1521
	//xe 공짜버전
	//hr 유저아이디
	//hr 비밀번호
	System.out.println("접속했지 말입니다");
	
	//실행할때 AA.java에 마오하고 Run ad에서 java application으로 실행
	
	
	
	con1.close();
	}

}
