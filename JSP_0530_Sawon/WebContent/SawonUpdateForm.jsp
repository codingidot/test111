<%@page import="telinfoVO.TelInfoVO"%>
<%@page import="telinfoDAO.TelInfoDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사원 정보 수정</title>
</head>
<body>

<h1>사원 정보 수정</h1>
<%
	request.setCharacterEncoding("UTF-8");

	String name = request.getParameter("name");
	TelInfoDAO dao = new TelInfoDAO();
	TelInfoVO vo = dao.search_name(name);
	
%>

<form action="SawonUpdateProcess.jsp" method="post">
	<table border="2">
		<tr>
			<th>사원번호</th>
			<th>사원 이름 </th>
			<th>연락처</th>
			<th>입사일</th>
		</tr>
		<tr>
			<td><%=vo.getId() %></td>
			<td><%=vo.getName() %></td>
			<td><input type="text" name="tel" value=<%=vo.getTel() %>></td>
			<td><%=vo.getD() %></td>
			<input type="hidden" name="name" value=<%=vo.getName() %>>
		</tr>
		<tr>
			<td colspan="4">
				<input type="submit" value="수정하자">
			</td>
		</tr>
	</table>
</form>

<table>
	<tr>
		<td><a href="SawonAllView.jsp">[모두보기]</a></td>
	</tr>
</table>

</body>
</html>