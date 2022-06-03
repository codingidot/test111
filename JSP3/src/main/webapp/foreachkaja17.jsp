<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
         <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2> 강남스타일 아니죠- 자사스타일</h2>
<%
	String[] kwail=(String[])session.getAttribute("kwail");
	for(String imsi:kwail){
		out.println(imsi+"<br>");
		//자바는 for-콜론(..:..)
		//자바스크립트에서는 for-in(..in..)
	}

%>


<h2>jstl + EL 스타일</h2>
	<c:forEach var="imsi" items="${sessionScope.kwail}">
	${imsi }<br>
	</c:forEach>
</body>
</html>