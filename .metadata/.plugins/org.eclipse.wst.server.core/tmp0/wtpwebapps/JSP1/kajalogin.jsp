<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head><!--  서버로 넘겨주고 넘겨받는 과정 -->
<meta charset="UTF-8">
<title>request</title>
</head>
<body>
<h2>나는 로그인 받는 서버</h2>

<!-- id1의 내용, pw1의 내용이 여기로 옴 
	request 내장 객체를 사용하여 받음
	문법은 request.getParameter(), 당연히 글장자에서 오므로 type은 String
-->
<%
request.setCharacterEncoding("UTF-8"); //post의 한글처리방식 //습관적으로 씀
response.setCharacterEncoding("UTF-8");

%>

<!--  get 방식에서 
톰캣-server.xml에서 63번째 라인에 <connector에 
URIEncoding="UTF-8"
-->
<% //scriptlet, 스크립트릿 
	//getParameter
		//자바변수("박미래")    //input 태그 name
String id1=request.getParameter("id1");
//글상자 이므로 문자로 넘어옴
			//http://url?id1=값&pw1=값
String pw1=request.getParameter("pw1");
			//request는 내장객체

int na2=Integer.parseInt(request.getParameter("na1"));
%>

아이디는 <%=id1 %> 이고 암호는 <%=pw1 %> 이구만 <p>
<p> 그리고 <%=2022-na2 %>년생 이시군요</p>
</body>
</html>