package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AA {// 4�� 6�� first

	public static void main(String[] args) 
	throws  SQLException, ClassNotFoundException{

	/* #.driver ������ ���� add external jar�� ���
	 * 
	 * ����-����-build path- configure build path
	 * -library �� - add exxternal jar
	 * -ojdbc8.jar ���� ��- apply and close
	
	 *class path�� ojdbc8 ����
	 */
		
	/*
	 * (����Ȯ��) 
	 *     �� Referenced libraries�� ojdbc8.jar ����
	 */
	//----------------------------------------
	//���� ���α׷��� �ڹٿ� db������ �ϰ��ؼ� ���ӵǴ����� Ȯ��
	Connection con1=null; //���� ��ü con1���� //ctrl + shift + o�� import
	//                  ��ҹ���, ���� x
	Class.forName("oracle.jdbc.driver.OracleDriver"); //����Ŭ ����̹��ε�
	//����ƽ�޼ҵ� (new���� ���)   //��ü.�޼ҵ�() ==>Ŭ����.�޼ҵ�()
	con1=DriverManager.getConnection
			("jdbc:oracle:thin:@127.0.0.1:1521:xe","hr","hr");
     //jdbc:oracle:thin ����Ŭ�� ����ϴ°���
	//@127.0.0.1  ���� ������ �����Ҷ� ��� localhost�ε� ��밡��
	//�ܺο��� �����Ҷ��� @192.168.0.13
	//��Ʈ��ȣ 1521
	//xe ��¥����
	//hr �������̵�
	//hr ��й�ȣ
	System.out.println("�������� ���Դϴ�");
	
	//�����Ҷ� AA.java�� �����ϰ� Run ad���� java application���� ����
	
	
	
	con1.close();
	}

}
