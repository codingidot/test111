<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>학점계산</h1> <!-- mvc1모델 전부 jsp로 -->
<form method="post" action="output21.jsp">
이름<input type="text" name="irum"><br>
점수입력<input type="text" name="jum"><br>
<input type="submit" value="가자 서버로">
<input type="reset" value="취소">
</form>
</body>
</html>