<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 
forward() 인자에 request 그래서 request.getParam(irum)
	즉, ${param.irum}이 잘 인식됨
 -->
<h1>${param.irum }님의 점수는 ${param.jum }점 이시군요!!</h1>
<h1> 그러니까 ${param.irum }님은 B학점이라는~</h1>
<a href="input22.jsp">입력화면으로 가자</a>
</body>
</html>