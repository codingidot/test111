<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<pre>
원래는 이화면이 출력되는 것인데 
변신을 해서 다른 화면이 출력된다
</pre>
<%
	response.sendRedirect("ddokaja1.jsp");
%>
로그인 하고 왔어~ 안했어~ 다시 로그인화면으로 보내자
</body>
</html>