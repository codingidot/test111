<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
  (Q1)34�� int�� ������ Ȧ������ ¦������ ����ϴ� ���α׷��� <br>
        jsp�� �ۼ��غ��� <br>

<%
	
	int number=34;
	if(number%2==0)
		out.println("¦���Դϴ�");
	else
		out.println("Ȧ���Դϴ�");

%>
<br>

34+7 ǥ�������� <%=34+7 %><br>
�ٸ� ������δ� ��ũ��Ʈ���� �ְ� <%int aa=34; %><br>
����ϸ� <%=aa+7 %><br>

<p>(Q2) �����߾���~~ ���� ¦,Ȧ�� ����� ǥ������ �������� �ۼ��غ���</p>
<% //��ũ��Ʈ���� ǥ���� �� html ȥ���Ͽ� �ۼ��ϸ�
int soo=34;
if(soo%2==0){
	%>
	<h1>�����ϴ� <%=soo%>�� ¦������</h1><br>
	<%} else { %>
	�����ϴ� <%=soo %>�� Ȧ������<br>
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