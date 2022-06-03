<%@page import="tellinfoVO.TelInfoVO"%>
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
	String oriName=request.getParameter("name");
	
	TelInfoVO tv2=tidao.search_nametel(oriName);
%>

<form action="SawonDeleteProcess.jsp" method="post">
<table border=2>
<tr>
<th>사번</th><th>이름</th><th>전화번호</th><th>입사일</th>
</tr>
<tr>
	<td><%=tv2.getId() %></td>
	<td><%=tv2.getName() %></td>
	<td><%=tv2.getTel() %></td>
	<td><%=tv2.getD() %></td>
<!-- =========================== -->
<input type="hidden" name=name value=<%=tv2.getName() %>>
<!-- ============================ -->
</tr>
<tr><td colspan=4><input type="submit" value="삭제하자">
</td></tr>
</table>
</form>
</body>
</html>