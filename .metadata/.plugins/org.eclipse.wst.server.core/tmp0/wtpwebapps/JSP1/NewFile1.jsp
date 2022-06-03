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
2가지 logic : presentation logic(view), business logic(계산, 판단)
----------------------------------------------
MVC1과 MVC2의 공통부분: 입력은 html,jsp로 작성

MVC 1 모델: control, view 모두 .jsp로 작성, 배우기 쉽다, 구현도 쉽다, 유지보수가 어렵다, 
중소형 프로젝트에 사용
				
MVC 2 모델: view는 jsp, control은 servlet(웹자바)으로 작성, 배우기 어렵다, 구현도 비교적 어렵다,
 유지보수가 쉽다, 
중대형 프로젝트에 사용

 -->
<%
for(int j=1;j<10; j++){
	out.println("<h1> 5"+"x"+j+"="+5*j+"</h1>");

%>

<br>
<%} %>
</body>
</html>