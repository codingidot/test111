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
<%="온달" %> <!-- 표현식 out.println("온달") -->
${"온달"} <!-- el(expression language) -->

${"형이 말하는데 el 네가 왜 거기서 나와"}<br>
${"el"}은 참 간단해서 좋지만 공부는 해야해<br>

			<!-- el 은 참 간단해서 좋지만 공부는 해야해
			out.println("e1") 위 문장은 body에 있으니 출력 -->
			
			${"다음 el의 답은 뭘까"}<br>
			
			${100} ${100+200} ${100>2 }  ${200.35} ${10%3} <br>
			${false } ${empty kab2} ${empty ""} ${empty "a"} ${null}
			등같은 표현이 가능해 <br>
			
			 
</body>
</html>