<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- request ==> 내정보도 같이감 ==> window, browser

 브라우저 알아내기,
브라우저 엔진(크롬, opera -Blink, 애플의 사파리-webkit, 파폭-getko(모질라),
	IE-Trident, MAC IE에 탑재된것은 Tasman(ms의 레이아웃 엔진)
	layout engine: Rendering engine 이라고도 하며
	html,css 정의 형태대로 화면에 보여주는 sw
	
 -->
 
 getHeader --> <%=request.getHeader("user-agent") %><br>
 
 RequestURI --> <%=request.getRequestURI() %> <br>
 RequestURL --> <%=request.getRequestURL() %> <br>
 Servletpath --> <%=request.getServletPath() %><br>
 contextpath --> <%=request.getContextPath() %><br>
 ServerName --> <%=request.getServerName() %><br> <!-- localhost -->
 ServerPort --> <%=request.getServerPort() %><br> <!-- 8080 -->
 Protocol --> <%=request.getProtocol() %><br> <!--  http -->
 Method --> <%=request.getMethod() %> <!-- get -->	 

</body>
</html>