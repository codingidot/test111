<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true" %>
							<!-- pageEncoding="UTF-8" 뒤에 추가 코딩 -->
	<% response.setStatus(200); %>
	<!--  404 500 ... : 간혹 이 페이지를 500으로 처리하는 경우 방지
			정상 200: 이페이지는 오류없당~~ 그러니 결과를 잘 출력해~~~ -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<pre>
다음과 같은 에러가 발생했습니다
계속 에러가 발생되면 상담원에게 전화주시기 바랍니다
전화번호는 02-3456-5557 입니다
</pre>


<hr>
<!--  내장객체
	out request response "exception .... 객체
	exception. ctrl + space
 -->

에러내용은<h3> <%=exception.getMessage() %></h3>
<!-- 예: 나이를 빈칸으로 처리한 경우 에러내용은 For input String:""(너 아무것도 안 넣었어)
	isErrorPage="true" 없으면 exception 객체 사용못함
	c: errno(4069), perror java:message, getMessage()
	 -->
</body>
</html>