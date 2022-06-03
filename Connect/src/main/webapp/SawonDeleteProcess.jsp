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
	
	boolean b1=tidao.delete_nametel(name);
	
	if(b1)
		response.sendRedirect("SawonAllView.jsp");
	else{%>
		<a href="SawonAllforDelete.jsp">사원삭제 에러-삭제화면으로</a>
<% 	}
%>
</body>
</html>