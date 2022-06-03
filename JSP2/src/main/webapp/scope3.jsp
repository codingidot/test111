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
//scope2.jsp에서 scope3.jsp로 넘어온 것
//getAttribute을 받는다


out.println((String)pageContext.getAttribute("page1")); //null
//return type :Object ---->(String)으로 변환

		
out.println((String)request.getAttribute("req1")); //null


out.println((String)session.getAttribute("ses1")); //seslove
//브라우저 살아있으니 나옴 브라우저를 껐다가 다시 켜서 하면 null

out.println((String)application.getAttribute("app1")); //applove
//was 살아있음 톰캣을 멈줬다가 다시 실행해서 하면 null


//브라우저 모드 닫고 재수행시 null null null applove
//was 내리고 다시 올렸을때 null null null null

%>
<a href="./scope3.jsp">여기서 브라우저 모두 닫고 scope3.jsp 재수행!!! <br>
					 		이어서 was내리고 scope3.jsp 재수행(톰캣을 stop 다시실행)<br>
					 		단, 브라우저를 다른 브라우저로 열어 실행(예:지금이 chrome이면 ms edge로)		</a>
</body>
</html>