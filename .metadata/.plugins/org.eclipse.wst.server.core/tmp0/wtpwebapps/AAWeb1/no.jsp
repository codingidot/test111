<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<!-- 만일 위의 taglib선언없이 이문장을 사용하면 무시하고 패스 -->
<c:out value="안녕 jstl"/><br>

<% out.println("안녕 jstl"); %>	<br>

<% String aa="chokichi"; %>
<%=aa %>

<c:set var="bb" value="chokichi"></c:set> <br>
${bb}<br>

<% int jumsoo=100; %>
<%=jumsoo %>

<c:set var="jum">100</c:set><br>
${jum }<br>



</body>
</html>