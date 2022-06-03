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
<!-- 원래 request.getParameter 를 사용하지 않고 하려면
넘어오는 것을 받아야 하고 그것이 구분해야 하는데....
jstl, el을 사용해서 한다. -->

<c:if test="${param.chimi=='tennis' }">
		<div>아하 데니스</div>
</c:if>
<c:if test="${param.chimi=='soccer' }">
		<div>아하 축구</div>
</c:if>
<c:if test="${param.chimi=='golf' }">
		<div>아하 데니스</div>
</c:if>
</body>
</html>