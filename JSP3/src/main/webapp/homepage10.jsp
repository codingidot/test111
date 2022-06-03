<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
${sessionScope.sirum }님 !!!<br>
우리 홈페이지에 오신걸 환영합니다 <br>
전화번호는 ${sessionScope.stel }이시군요<br>

<!-- 이건 DB사용 안하고 session으로 처리하고 있다는 -->
</body>
</html>