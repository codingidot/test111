package fourteen;

public class First {

	//#### db 종류
	//- 계층 db(hierarchical) (hdbms) : tree 구조(상하가 서로 종속적), 빠른 검색, 변화가 있는 경우 대응이 늦자
	//                                관계가 복잡한 경우 x, 큰 규모db x
	
	//- network db(ndbms): 동등구조, nodes와 set 구조로 구성, 빠른 검색, 구조변경은 어렵다.
						// 큰 규모 db x
	
	//-객체지향 db(object oriented db)(odbms): 객체(class)형태 +계층형태, 비정형데이터 db 가능
											//상용화는 되었지만 확장은 x, 거의 사용안함
	//-관계형 db(retational db)(rdbms): 데이터 형태, 자료가 대규모인 경우 o, 1980년대 상용화시작으로 현재 굳건한 위치를 유지함
	
	
	//데이터베이스- not raw data (특정자료를 모아놓은것이 되야함)
	//ㅇㅖ) 야구선수명단(이름, 나이, 등번호, 타율)
	// 테이브릉ㄹ 사용하여 만듬(db는 테이블의 집합체)
	//dbms: db를 잘 활용할수 있도록 하는 관리시스템(sw)
	
	//자료와 정보의 차이점
	//자료는 날것, 정보는 정리된것
	
	//데이터베이스가 되려면?(데이터베이스 정의 4가지)
					//(stand alone vs  multi user system
	//1) 공유 데이터(shared data): 에러 sw(사원) 등이 공동으로 사용
	//2) 통합 데이터(intergrated data): 중복을 최소화
	//3) 저장 데이터(stored data): 디스크, M.T 저장되어 있어야( not 메모지, 스티커)
	//4) 운영 데이터(operation미 data): 운영을 유지, 회사의 본래적 기능, 운영하여 유익을 발생시키는(사원관리, 고객관리)

	//세로줄 column, attribute 가로줄 row, record, tuple
	//column과 row가 만나는 자리가 필드
	//primary key(기본키)-- 어떤걸 찾을때 중요한 조건이 되는것(중복x, null값 허용 x) PK
	//delete insert update select
	//foreign key(외래키)- 다른테이블에 있는 기본키를 참조한다(reference) FK (중복이나 null 허용)
	
	
	//modeling : modeler
	//db 개발다- sql언어(Structured Query Language): 구조화된 조회언어
	// select * from ...
	//tunning- sql 튜닝, network 튜닝, 메모리튜닝 ....(db 개발자)
	
	//ERD(entity relationship diagram)
	
	//sql(structured query language) 언어 !="sql*plus"dms tool
	//1) query문: select (crud의 R), 삽입, 검색, 수정, 삭제
	//2) dml(data manipulation language) 데이터 조작(작동) 언어
	//3) ddl(data definition language) create, ....
	
	// 주석은 설명문에 불과 (COMMENT)
	/* 주석은 설명문에 불과 */
	// -- SQL 주석은 하이픈하이픈이다
	
	//KEYWORD는 대문자  SELECT ... FROM regions
	//소문자로 해도 에러는 안나지만 대문자가 원칙
	//==> compile, parsing할때 똑같은 명령문이여도 대문자 소문자 각자 파싱함
	
	//절단위로 줄을 바꿈
	//SELECT ...
	//FROM regions;
	
	//문장의 끝에는 ;
	
	

	
	
	
	
}
