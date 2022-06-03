package telinfoDBconn;

public class First {


	//############
	//메뉴
	
	/*
	 * 사원관리
	 * 
	 * 1. 사원 입력 
	 * 2. 사원 수정 
	 * 3. 사원 삭제 
	 * 4. 사원 검색 
	 * 5. 종료
	 * 
	 * 선택하시오 4
	 */
	   
	 //  4번을 선택하면 .....
	 //  사원명단이 출력
	//(미리 db접속이, 전체결과를 출력)
	//다시 1번을 선택하면 
	// 사원입력화면이 나오고 => db에 저장
	//(미리 db접속)
	
	//<문제점>
	//결과적으로 접속상의 번거로움 발생
	//이렇게하면 모든 플젝마다 이렇게 해야함
	
	//<해결하기>
	//공통 접속 객체를 하나 만들어 필요한 곳에서 갖다 쓴다
	
	//<문제점2>
	//db에서 자료를 꺼내서 어디에 넣죠?
	//자바 변수 int, String
	//==>각자 변수로 처리하면 핸들링하기 어렵다
	//<해결하기>
	//oop 객체, 클래스 
	
	//그러므로
	//vo:Value Object(DTO: data transfer object)
	
	//<java>     int id            String name
	//<db>      id number(6)        name varchar2(20)
	
	
	//자바(vo)class--DAO(Data Access Object)insert, update, delete, select--db 
	
	//(1)공통 접속객체 
	//(2)자바 클래스
	//(3)DAO
	//(4)main program
}
