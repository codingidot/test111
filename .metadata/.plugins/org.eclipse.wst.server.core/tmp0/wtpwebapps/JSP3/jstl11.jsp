<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- standard.jar와 jstl.jar를 lib에 추가하거나 classbuildpath에  넣어줘야한다-->
    <!-- ====================================== -->
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<!-- ========================================= -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstl</title>
</head>
<body>

<!-- 만일 위의 taglib 선언없이 이문장을 사용하면 그냥 무시하고 패스 -->
<c:out value="안녕 jstl"/><br>

<% out.println("안녕 jstl"); %><br>

<% String aa="chokichi"; %>
<%=aa %>

<c:set var="bb" value="chokichi"></c:set><br>
${bb }<br>  <!-- jstl과 el 합작품 -->
</body>
</html>

<!-- 
###### jstl
	jstl : jsp standard tag library
				(standard, custom)
				<br> 형태를 만들어서 사용하자는~~~~

 -->