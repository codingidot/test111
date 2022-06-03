<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="naerrorpage.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
int na2Sool=Integer.parseInt(request.getParameter("na2"));

out.println("나이는 "+na2Sool);

%>
</body>
</html>