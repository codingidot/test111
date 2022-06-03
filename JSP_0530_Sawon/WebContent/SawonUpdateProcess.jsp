<%@page import="telinfoVO.TelInfoVO"%>
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

	String name = request.getParameter("name");
	String tel = request.getParameter("tel");
	
	TelInfoDAO dao = new TelInfoDAO();
	boolean check = dao.update_sawon(name,tel);
	
	if(check){ 
		response.sendRedirect("SawonAllView.jsp");
	} else { %>
		<a href="SawonAllforUpdate.jsp">사원정보 수정 에러 - 수정 화면으로..</a>
<%	}%>

</body>
</html>