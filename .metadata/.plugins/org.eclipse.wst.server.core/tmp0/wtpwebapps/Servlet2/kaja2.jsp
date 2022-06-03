<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
request.setCharacterEncoding("utf-8"); //post방식으로 했으므로
String irum=(String)request.getParameter("irum");
String na2=(String)request.getParameter("na2");
out.println("여기는 자바스타일로 출력"+irum+","+na2+"<br>");



%>
<!--    자바는 oop방식 ==>클래스방식
	물론 어떤 문제를 해결할때 class를 사용할수도 안할수도 있다.
 	Sawon sawon1=new Sawon()
 	Sawon sawon2=new Sawon()
 	자바는 이렇게 해서 사용
 	
 	스프링은
 	<bean id="객체명" class="패키지명.클래스명" />
 	
 	액션태그로 하면
 	가독성(가능한한 자바식 표현 하지말고 태그로 표현하자는)
 	id는 객체명 class="패키지명.클래스명"

 
 	목적은 가독성(가능한한 자바식 표현 하지말고 태그로 표현하자는)
 -->
 <jsp:useBean id="sawon1" class="sawonpkg.Sawon"/>
<jsp:useBean id="sawon2" class="sawonpkg.Sawon"/>

<!-- setProperty에서는 id가 아니라 name으로 객체명 나타냄
	결과적으로 sawon1객체에는 입력에서 넘어온 irum, na2가 들어간다
	sawon1.setIrum(request.getParameter("irum"))
	sawon1.setNa2(request.getParameter("na2"))
	위의 두개가 밑에 두개랑 같다
-->
<jsp:setProperty name="sawon1" property="irum"/>
<jsp:setProperty name="sawon1" property="na2"/>

<jsp:setProperty name="sawon2" property="*"/>
<!-- set + Irum, Na2() ... 즉, 10개를 set 해도 한줄로 끝 
	
 폼에서 넘어오는 것을 all set, 단, getProperty는 *기호 사용 못함
 즉, setter에 한해서 전부다 넘어오는 역할을 *가 담당함
 그러므로 *는 현재 irum,na2를 set하고 있음
-->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2> jsp:getProperty 출력1</h2>
이름은 <jsp:getProperty property="irum" name="sawon1"/>
나이는 <jsp:getProperty property="na2" name="sawon1"/>

<h2> jsp:getProperty 출력2</h2>
이름은 <jsp:getProperty property="irum" name="sawon2"/>
나이는 <jsp:getProperty property="na2" name="sawon2"/>

</body>
</html>