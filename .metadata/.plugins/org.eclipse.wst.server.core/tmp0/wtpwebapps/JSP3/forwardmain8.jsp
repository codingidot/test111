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
String irum=request.getParameter("irum");
String tel=request.getParameter("tel"); //전화번호를 특정암호로 할예정
										//"bimil"이면 관리자모드

//아래에서 다른 jsp 페이지로 forward(넘어가는것) 할때를 대비하여 session에 넣어준다										
session.setAttribute("sirum", irum);
session.setAttribute("stel", tel);

%>


<% if(tel.equals("bimil")){%>
<jsp:forward page="impossible9.jsp"/> <!-- response.sendRedirect()와 같음 -->
<!-- 관리자모드 -->
<%} else { %>
<!-- 일반 고객모드 -->
<jsp:forward page="homepage10.jsp"/>
<%} %>
</body>
</html>