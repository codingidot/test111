<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
${300}<br>
${300.5} <br>
${null} <br>  <!-- 출력없음 null pointer error가 없음 , flutter2.0도 없다-->
${false} <br>
${100+200} <br>
${100*7} <br>
${100>200} <br>
${50==50} <br>
${50 eq 50} <br>
${(100>3)? "커":"작어"} <br> <!-- 삼항연산 -->
${50 mod 5 }<br> <!-- 나머지 출력  -->
${"oh!!! happy"} <br>
<hr>
${"멋져 VS 박사야"} <br>
<%out.println("멋져 VS 박사야"); %><br>
<%! String foxsun="멋져 VS 박사야"; %> <!-- !가있으면 declaration -->
<%=foxsun %> 
</body>
</html>