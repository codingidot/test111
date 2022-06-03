<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
  (Q1)34를 int에 넣은후 홀수인지 짝수인지 출력하는 프로그램을 <br>
        jsp로 작성해보삼 <br>

<%
	
	int number=34;
	if(number%2==0)
		out.println("짝수입니다");
	else
		out.println("홀수입니다");

%>
<br>

34+7 표현식으로 <%=34+7 %><br>
다른 방법으로는 스크립트릿을 넣고 <%int aa=34; %><br>
계산하면 <%=aa+7 %><br>

<p>(Q2) 참잘했엉요~~ 위의 짝,홀수 계산을 표현식이 들어간것으로 작성해보자</p>
<% //스크립트릿과 표현식 및 html 혼합하여 작성하면
int soo=34;
if(soo%2==0){
	%>
	<h1>보아하니 <%=soo%>는 짝수군요</h1><br>
	<%} else { %>
	보아하니 <%=soo %>는 홀수군요<br>
	<%} %>
	<br>
<%
for(int i=2;i<10;i++){
	for(int j=1;j<10;j++){%>
		<%=i %>x<%=j %>=<%=i*j %><br>
	<%}%><br><% 
}

%>



</body>
</html>