<%@page import="telinfoVO.TelInfoVO"%>
<%@page import="java.util.ArrayList"%>
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
<h1>사원 삭제</h1>
<%
	request.setCharacterEncoding("UTF-8");
	response.setCharacterEncoding("UTF-8");
	
	TelInfoDAO dao = new TelInfoDAO();
	ArrayList<TelInfoVO> list = dao.getAllInfo();
%>
<table border ="1">
		<tr>
			<th>사원번호</th>
			<th>사원 이름 </th>
			<th>연락처</th>
			<th>입사일</th>
		</tr>
		<%for(TelInfoVO vo : list){ %>
		<tr>
			<td><%= vo.getId()%></td>
			<td><a href="SawonDeleteForm.jsp?name=<%= vo.getName() %>"><%= vo.getName() %></a></td>
			<td><%= vo.getTel() %></td>
			<td><%= vo.getD() %></td>
		</tr>
	<%}%>
</table>
<table>
<tr>
	<td><a href="SawonAllforUpdate.jsp">[수정]</a></td>
	<td><a href="SawonAllView.jsp">[모두보기]</a></td>
</tr>
</table>


</body>
</html>