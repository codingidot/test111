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

�̸� <%=irum %><br>
���� <%=kor+eng %><br>

[el]<br>
�̸� ${param.irum} <br>
���� ${param.kor+param.eng}<br>


</body>
</html>