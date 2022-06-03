<%@page import="telinfoDAO.TelInfoDAO"%>
<%@page import="telinfoVO.TelInfoVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>사원추가</h1>

<%
	request.setCharacterEncoding("UTF-8");
	response.setCharacterEncoding("UTF-8");
	
	TelInfoDAO dao = new TelInfoDAO();
	
	int id = Integer.parseInt(request.getParameter("id"));
	String name = request.getParameter("irum");
	String tel= request.getParameter("tel");
	String sdate = request.getParameter("d"); 
	// 날짜는 20160219 형식
	
	boolean check = dao.insert_sawon(id,name,tel,sdate);
	
	if(check){
		response.sendRedirect("SawonAllView.jsp"); //
	// 인자를 가져가지 않고 방향을 바꿔서 이동. 
	}else{%>
		<a href="SawonInsertForm.jsp">사원입력 에러 - 입력화면으로 </a>
<%	}  %>
	
</body>
</html>