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
<h1> 그러니까 ${param.irum }님은 A학점이라는~</h1>

<!-- request 가 잘 전달된 것을 알아보자는 -->
그리고 <%=request.getParameter("irum") %> 님!!
<!-- 이것은 input에서 받아오는데 output이 넘겨받는데
	원래 request를 사용하려면 <input 태그에서 만 가능
	forward()를 통해서 request와 response를 가져왔기에 가능
--> 

<a href="input22.jsp">입력화면으로 가자</a>
</body>
</html>