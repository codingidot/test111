<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>나는 로그인 받는 서버</h2>
자바-스크립트릿과 표현식으로 처리하면<br>

<%
request.setCharacterEncoding("utf-8");
response.setCharacterEncoding("utf-8");

String id=request.getParameter("id1");
String pw=request.getParameter("pw1");

%>

아이디는 <%=id %> 이고 암호는 <%=pw %>이구만 <p>

<hr>
여기는 표현식으로<br>
el로 처리하면<br>
아이디는 ${param.id1}이고 암호는 ${param.pw1 }이구만 <p>
<!-- getParameter("id1") + out.println(id1) -->

</body>
</html>