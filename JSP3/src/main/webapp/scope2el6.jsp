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
원래는 다음과같이 꺼내고 출력을 해야한다
out.println((String)pageContext.getAttribute("page1")); //null
//return type :Object ==>(String)으로 변환

		
out.println((String)request.getAttribute("req1")); //null


out.println((String)session.getAttribute("ses1")); //seslove
//브라우저 살아있으니 나옴 브라우저를 껐다가 다시 켜서 하면 null

out.println((String)application.getAttribute("app1")); //applove
//was 살아있음 톰캣을 멈줬다가 다시 실행해서 하면 null

 -->
<!-- el언어를 쓰면 꺼내고 출력할 필요없이 바로 출력이 가능하다 --> 
 ${pageScope.page1 }<br>
  ${requestScope.req1 }<br>
   ${sessionScope.ses1 }<br>
    ${applicationScope.app1 }<br>
 
 <a href="./scope2el6.jsp">scope2el6.jsp 한번더 가볼까!! 여기서 브라우저 모두 닫고 scope3.jsp 재수행<br>
	이어서 was 내리고  재수행 </a>
</body>
</html>