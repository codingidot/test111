package eight;

import java.text.SimpleDateFormat;
import java.util.Date;

public class first {
	// ���ø��� ����� ������ 100�� �Ǵ� ���� ��� ��� ���������� ����Ͻÿ�
	//��) 2022.3.17 ���� 09:02:53 �����
	//(������ 100�� �Ǵ� ���� 2022�� 6�� 24�� �ݿ��� �Դϴ� ��� ���)
	
	//direct �˻�
	
	//����Ŭ���� ==> import
	//���� ���� �ۼ��ϰ� �ִ� ��Ű��==> package
	
	//��¥ Ŭ����(����Ŭ����:����-����-����� �⺻�ε� ����Ŭ����ư �̹� ���ǰ� ����)
	// Date d1=new Date();  ctrl+shift+o   ���޸𸮿� ���ó�¥�� �ð��� ���� d1�� ��ġ�� �˰��ִ�.
	// ���� ��¥�� ����Ͻÿ�
	public static void main(String[] args) {
	Date d1=new Date();
	System.out.println(d1); //����� ����
	System.out.println(d1.toLocaleString()); //�츮����
	
	SimpleDateFormat d=new SimpleDateFormat("YYYY/MM/dd");
	
	Date d7=new Date();
	d7.setDate(d1.getDate()+100-1);
	System.out.println(d7.toLocaleString());
	
	//Q) ������ 100�� �Ǵ� ���� 2022�� 0�� 00�� 0���� �Դϴ� ��� ����ϵ��� �ۼ��Ͻÿ�
	String[] arr= {"��","��","ȭ","��","��","��","��"};
	String str1="������ 100�� �Ǵ� ���� ";
	str1+=(d7.getYear()+1900)+"��";
	str1+=(d7.getMonth()+1)+"��";
	str1+=(d7.getDate())+"��";
	str1+=(arr[d7.getDay()])+"���� �Դϴ�";
	
			System.out.println(str1);
	
	
			
			/* 1996.08.20�ϻ��� ��ƿ� ���� 0000�� �̶�� */
			
			Date d5=new Date();
			Date birth1=new Date(1994-1900, 9-1, 26);
			long cha=d5.getTime()- birth1.getTime();
			//getTime :1970.1.1������ ����ð��� ms�� ��ȯ
			long nal=cha/1000/3600/24;
			System.out.println(nal);
		
	
	}
	

}
