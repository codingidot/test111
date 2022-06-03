<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<!-- 여기서는 일단 한명을 보여준 다음 수정 또는 삭제를 선택하는 로직이 필요하다
수정을 선택하면 controller의 수정로직으로 보내고 삭제를 선택하면
controller의 삭제 로직으로 보낸다 -->
<body>
<h1>사원 한명 보기 그리고 나서 수정 or 삭제 할 예정 </h1>
<form action="telUpdate.do?sname=${stv.name }" method="get">
	<table border=1>
	<tr><td>사번</td><td>이름</td><td>전화번호</td><td>입사일</td></tr>
	<tr>
		<td><input type="text" value="${stv.id }" name="id"></td>
		<td><input type="text" value="${stv.name }" name="name"></td>
		<td><input type="text" value="${stv.tel }" name="tel"></td>
		<td><input type="text" value="${stv.d }" name="d"></td>
		<td><input type="hidden" value="${stv.name }" name="sname"></td>
	
	</tr><tr><td colspan="4">
		<input type="submit" value="수정">
		<input type="reset" value="취소"></td></tr>
	</table>
</form><br>
<!-- JSO 방식으로는 <!--<=request.getContextPath()%>--> -->
<!-- 아래처럼 사용하는 이유는 예를들어 프로젝트 명이 변경되어도 잘 진행하도록
	http://localhost:8081/프로젝트명/getAllInfo.jsp에서
	프로젝트명이 변경되더라도 소스수정 안해도 됨	
                                   -->
<a href="${pageContext.request.contextPath }/getAllInfo.jsp">
			모두보기</a>
<a href="telDelete.do?name=${stv.name}">삭제</a>			
</body>
</html>