<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<% double kab=36.8;
	String kab3=null;
	
%>
<%="�´�" %> <!-- ǥ���� out.println("�´�") -->
${"�´�"} <!-- el(expression language) -->

${"���� ���ϴµ� el �װ� �� �ű⼭ ����"}<br>
${"el"}�� �� �����ؼ� ������ ���δ� �ؾ���<br>

			<!-- el �� �� �����ؼ� ������ ���δ� �ؾ���
			out.println("e1") �� ������ body�� ������ ��� -->
			
			${"���� el�� ���� ����"}<br>
			
			${100} ${100+200} ${100>2 }  ${200.35} ${10%3} <br>
			${false } ${empty kab2} ${empty ""} ${empty "a"} ${null}
			��� ǥ���� ������ <br>
			
			 
</body>
</html>