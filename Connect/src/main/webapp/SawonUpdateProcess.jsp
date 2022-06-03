<%@page import="telInfoDAO.TelInfoDAO"%>
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
request.setCharacterEncoding("utf-8");
TelInfoDAO tidao=new TelInfoDAO();

String name=request.getParameter("name");
String tel=request.getParameter("tel");

boolean b1=tidao.update_nametel(tel,name);

if(b1)
	response.sendRedirect("SawonAllView.jsp");
else{
%>
<a href="SawonUpdateForm.jsp">사원수정 에러-수정화면으로</a>
<%} %>
</body>
</html>