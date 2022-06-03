package eight;

import java.text.SimpleDateFormat;
import java.util.Date;

public class first {
	// 오늘만난 사람과 만난지 100일 되는 날이 몇년 몇월 몇일인지를 출력하시오
	//예) 2022.3.17 오전 09:02:53 목요일
	//(만난지 100일 되는 날은 2022년 6월 24일 금요일 입니다 라고 출력)
	
	//direct 검색
	
	//내장클래스 ==> import
	//현재 내가 작성하고 있는 패키지==> package
	
	//날짜 클래스(내장클래스:정의-생성-사용이 기본인데 내장클래스튼 이미 정의가 있음)
	// Date d1=new Date();  ctrl+shift+o   힙메모리에 오늘날짜와 시간이 들어가고 d1이 위치를 알고있다.
	// 오늘 날짜를 출력하시오
	public static void main(String[] args) {
	Date d1=new Date();
	System.out.println(d1); //영어로 나옴
	System.out.println(d1.toLocaleString()); //우리말로
	
	SimpleDateFormat d=new SimpleDateFormat("YYYY/MM/dd");
	
	Date d7=new Date();
	d7.setDate(d1.getDate()+100-1);
	System.out.println(d7.toLocaleString());
	
	//Q) 만난지 100일 되는 날은 2022년 0월 00일 0요일 입니다 라고 출력하도록 작성하시오
	String[] arr= {"일","월","화","수","목","금","토"};
	String str1="만난지 100일 되는 날은 ";
	str1+=(d7.getYear()+1900)+"년";
	str1+=(d7.getMonth()+1)+"월";
	str1+=(d7.getDate())+"일";
	str1+=(arr[d7.getDay()])+"요일 입니다";
	
			System.out.println(str1);
	
	
			
			/* 1996.08.20일생이 살아온 날은 0000일 이라는 */
			
			Date d5=new Date();
			Date birth1=new Date(1994-1900, 9-1, 26);
			long cha=d5.getTime()- birth1.getTime();
			//getTime :1970.1.1부터의 경과시간을 ms로 변환
			long nal=cha/1000/3600/24;
			System.out.println(nal);
		
	
	}
	

}
