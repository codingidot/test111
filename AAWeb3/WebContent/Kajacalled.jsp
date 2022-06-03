<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
[scriptlet]<br>

<%
	String irum=request.getParameter("irum");
int kor=Integer.parseInt(request.getParameter("kor"));
int eng=Integer.parseInt(request.getParameter("eng"));
%>

이름 <%=irum %><br>
총점 <%=kor+eng %><br>

[el]<br>
이름 ${param.irum} <br>
총점 ${param.kor+param.eng}<br>


</body>
</html>