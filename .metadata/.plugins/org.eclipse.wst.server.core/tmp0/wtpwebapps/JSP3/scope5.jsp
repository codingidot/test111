<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
//여기는 scriptlet
//범위에서 해당 값 인식을 위해
// scope.저장메소드("속성명","속성값") //setter, getter
pageContext.setAttribute("page1", "pagelove"); //페이지범위
request.setAttribute("req1", "reqlove"); //요청범위
session.setAttribute("ses1", "seslove"); //브라우저살아있는 동안 //1browser-1 session
application.setAttribute("app1", "applove");  //WAS가 계속 가동되는 동안
%>


${pageScope.page1 }<br>
${requestScope.req1 }<br>
 ${sessionScope.ses1 }<br>
  ${applicationScope.app1 }<br>

<a href="./scope2el6.jsp">scope2el6.jsp로 한번 가볼까</a>
</body>
</html>