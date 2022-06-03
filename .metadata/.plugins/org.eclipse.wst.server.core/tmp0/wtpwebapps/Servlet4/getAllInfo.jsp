<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <!-- ============================================ -->
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <!-- ============================================ -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 
	나는 사원전체보기 파일은 getAllInfo.jsp이고 시작과 view 담당을 같이함
	
	시작과 view 담당을 같이함??
	
	시작은 지금여기에서 .jsp로 시작하지만 controller에 가서 계산 or 판단을 한후
	view의 역할을 하는 .jsp로 가서 결과를 출력하는 MVC2 기본원리
	
	요약하면 .jsp로 시작 - 서블릿 컨트롤러로 감- (다시 나에게와서)
	view.jsp 담당(사원전체 출력을 위해)
	
	
	지금 이 파일의 진행은 사원전체보기 임
	체크: 사원명 or id등을 입력하나요> x
	주요작업이 있나요? x
	없으므로 시작시 할일은 진행절차에 의해 controller로 잘보내면됨
	
	
 -->
 
 <h1>사원전체보기</h1>
 <hr>
 <table border="1">
 	<tr>
 		<td colspan="4">
 			<form action="getAllInfo.do" method=get> <!-- front controller이기에 .do로 -->
 				<input type="submit" value="모두보기">
 			</form>
 		</td>
 	</tr>
 	<tr><td>사번</td><td>이름</td><td>전화번호</td><td>입사일</td></tr>	
 
 <c:forEach var="vo1" items="${requestScope.alist1}">
	<tr>
		<td>${vo1.id }</td> 
		<td><a href="telSearchOne.do?name=${vo1.name }">${vo1.name }</a></td>
		<td>${vo1.tel }</td>
		<td>${vo1.d }</td>			
 	</tr>
 </c:forEach>
 
 <table border=0>
 	<tr>
 		<td><a href="sawonInsertForm.jsp">[입력]</a></td>
 		<td><a href="getAllInfo.jsp">[모두보기]</a></td>
    </tr>
 </table>
</tatble>
</body>
</html>