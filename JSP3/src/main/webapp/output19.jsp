<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="2" width="700">
	<tr><td>상품후기를 받았습니다</td></tr>
		<tr></td>
		<textarea cols="50" rows="5">
		<c:out value="${param.tarea }"/>
		</textarea>
					
		</td></tr>
		<tr><td colspan=3> 후기 입력으로 가려면
				<a href="input20.jsp">여기</a>를 누르세요
		</td></tr>		
		
</table>
</body>
</html>