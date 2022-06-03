<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% //scriptlet
	String irum=request.getParameter("irum");
	String jum1=request.getParameter("jum");
	int jum=Integer.parseInt(jum1);

String kaja=null;

if(jum>=90)
		kaja="A";
else if(jum>=80)
		kaja="B";
else if(jum>=70)
	kaja="C";
else if(jum>=60)
	kaja="D";
else
	kaja="F";

%>
<!-- 

MVC1: view를 jsp control도 jsp (계산, 판단)
MVC2: view를 jsp control은 servlet(웹자바)

 -->
<!-- presentation(view) logic도 jsp가 담당(view)====== -->
아하 이름은 <%=irum %>이시고 <br>
학점은 <%=kaja %> 학점 이시군요


</body>
</html>