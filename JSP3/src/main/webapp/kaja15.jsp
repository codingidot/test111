<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  <!-- ==========format==================== -->  
      <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
   <!-- ========================================== -->   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3> JSTL & EL 스타일</h3>
<!-- request.setCharacterEncoding("UTF-8"); -->
<fmt:requestEncoding value="UTF-8"></fmt:requestEncoding>
<!-- 위에 taglib ..fmt 선언 해야 사용할수있다 -->

아하 이름은 <c:out value="${param.irum }"></c:out>

그리고 전화번호는 <c:out value="${param.tel }"></c:out>
</body>
</html>