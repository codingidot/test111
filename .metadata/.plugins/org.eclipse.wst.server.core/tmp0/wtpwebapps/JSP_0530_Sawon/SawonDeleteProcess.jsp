<%@page import="telinfoDAO.TelInfoDAO"%>
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
	request.setCharacterEncoding("UTF-8");

	TelInfoDAO dao1 = new TelInfoDAO();
	
	String name = request.getParameter("name");
	
	boolean check = dao1.delete_name(name);
	
	if(check){
		response.sendRedirect("SawonAllView.jsp"); 
	}else { %>
		<a href="SawonAllforDelete.jsp">사원삭제 에러 - 삭제화면으로</a>
	<%} %>


</body>
</html>