<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사원 전체 보기</title>
</head>
<body>
	<h1>사원 전체 보기</h1>
	
	<table border="1">
	<tr><td>사번</td><td>이름</td><td>전화번호</td></tr>
	
		<c:forEach var="alltelinfo1" items="${mAllTelinfo}">
			<tr>
				<td>${alltelinfo1.id}</td>
				<td><a href= "getTelinfo.do?name=${alltelinfo1.name}">${alltelinfo1.name}</a></td>
				<td>${alltelinfo1.tel}</td>
			<tr>
		</c:forEach>

	</table>
	
		<table border="0">
			<tr>
				<td><a href="sawonInsertTelinfo.jsp">[입력]</a></td>
				<td><a href="getAllTelinfo.do">[모두보기]</a></td>
			</tr>
		</table>

</body>
</html>