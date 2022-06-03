<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
//scope1.jsp에서 scope2.jsp로 넘어온 것
//getAttribute을 받는다


out.println((String)pageContext.getAttribute("page1")); //null
//return type :Object ---->(String)으로 변환

		
out.println((String)request.getAttribute("req1")); //null


out.println((String)session.getAttribute("ses1")); //seslove
//브라우저 살아있으니 나옴

out.println((String)application.getAttribute("app1")); //applove
//was 살아있음
%>

<a href="./scope3.jsp">scope3.jsp로 한번 가볼까!!!!!</a>

</body>
</html>