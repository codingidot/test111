<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>로그인(연결되는 페이지마다 session 활용)</h1>

<form action="kajaShopping.jsp"  method="get">
아이디 <input type="text" name="id1"><br>
암호 <input type="password" name="pw1"><br>
<input type="submit" value="가자서버로">
<input type="reset" value="취소">
</form>

<!-- .의 위치는 나 ===>webcontent
webcontent아래에 폴더 한단계가 가능 (2단계x)
그러므로 ./ 는 현재위치가 webcontent 아래에 만들라고 명확하게 표현 -->
<a href="./scope2.jsp">scope2.jsp로 한번 가볼까!!!!!!!!!!</a>

</body>
</html>