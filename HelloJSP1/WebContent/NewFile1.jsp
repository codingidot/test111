<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%--     여기서 <%@는 (3) 지시어 접두어(directive prefix) 
    <%@ page: 페이지에 대한 지성라는 뜻
    charset=ECU-KR은 웹 클라이언트가 응답하는 페이지 인코딩 방식
    pageEncoding="ECU-KR"은 jsp 자체의 인코딩 방식 --%>

<%--이게(2) jsp 주석 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>

<body>
<h1>나 jsp야 멋지지?!!</h1>
<%! /* (4)선언 이렇게 선언일때 느낌표를 쓴다 */
	String irum="kongjoo"; 
%>



<%  //오늘 날짜 구해보자
	//Date date=new Date(); //ctrl shift o로 하면 안된다
	//방법은 Date까지 입력하고 빨간줄 보이면 ctrl + spacebar
	Date date=new Date(); 
	//sysout
	//오늘날짜를 클라이언트에 보내서 출력시켜야함
	out.println(date);
	//날짜가 출력되었다면 .jsp가 ==> .java ==> .class로 처리되어 출력
	// .java 의 기본위치는 build/classes에 위치
	
	//.jsp로 시작하여 만들어지는 .java, .class의 취이는
	//(찾아가보자)
	/* 윈도우 탐색기-
	지금사용하는 자기워크스페이스 폴더/.metadata/.plugins/
	org/eclipase.wst.server.core/
	tmp(0,1,2)/work/Catalina/localhost/
	프로젝트명/org/appache/jsp/hellojsp.java */
	/* 나의 경우C:\classWorkSpace\.metadata
	\.plugins\org.eclipse.wst.server.core\tmp0
	\work\Catalina\localhost\HelloJSP1\org\apache
	\jsp */
%>

<br>
<% 
out.println("<h2> ondal <h2>"+"<br>");

out.println("<h1> baboondal <h1>"+"<br>");

out.println(irum+"<br>");


%>

<h1>여기서 오늘 년도만 출력하려면</h1>
<% 
out.println(date.getYear()+1900);
%>

</body>
</html>