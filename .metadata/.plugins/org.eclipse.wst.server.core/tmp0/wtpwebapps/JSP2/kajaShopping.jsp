<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>뭘 살까???</h2>
<% 
String vid1=request.getParameter("id1");
String vpw1=request.getParameter("pw1");
%>

<%
session.setAttribute("sid1", vid1);
session.setAttribute("spw1", vpw1); //브라우저 살아있는 동안
//로그아웃은 세션정보가 없어지는거고 탈퇴는 아이디와 비밀번호가 데이터베이스에서 삭제
//session.invalidate()을 사용하여 세션을 없앰
%>
아하 id는 <%=vid1 %>이고 암호는  <%=vpw1 %>이군요 <p>


가방 쇼핑은 <a href=kabang.jsp>여기</a>를 누르세요<br>
구두 쇼핑은 <a href=koodoo.jsp>여기</a>를 누르세요

<!-- 여기서는 알고있음 id aa pw aa
쇼핑페이지로 넘어갈예정 이므로 id,pw를 가졍가야만 정상을 인정 
getParameter x , session 사요이 굿
넘기기 전에 무슨작업?
세션에 id, pw를 저장
session.setAttribute으로
-->
</body>
</html>