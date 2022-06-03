<%@page import="telinfoVO.TelInfoVO"%>
<%@page import="telinfoDAO.TelInfoDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사원 삭제 </title>
</head>
<body>
<!-- Form 에서 Process 로 이동  -->
<!-- SawonAllforDelete.jsp 에서 SawonDeleteForm.jsp 로 넘어올때
	이름을 가지고 온다.  -->
<h1>삭제할 사원의 정보</h1>
<%
	request.setCharacterEncoding("UTF-8");

	String name = request.getParameter("name");
	TelInfoDAO tidao = new TelInfoDAO();
	TelInfoVO vo1 = tidao.search_name(name);
	
%>

<form action="SawonDeleteProcess.jsp" method="post">
	<table border ="2">
			<tr>
				<th>사원번호</th>
				<th>사원 이름 </th>
				<th>연락처</th>
				<th>입사일</th>
			</tr>
			<tr>
				<td><%=vo1.getId() %></td>
				<td><%=vo1.getName() %></td>
				<td><%=vo1.getTel() %></td>
				<td><%=vo1.getD() %></td>
				<input type="hidden" name="name" value=<%=vo1.getName() %>>
			</tr>
			<tr>
				<td colspan="4">
					<input type="submit" value="삭제하자">
				</td>
			</tr>
	</table>
</form>

<table>
	<tr>
		<td><a href="SawonAllView.jsp">[모두보기]</a></td>
	</tr>
</table>
<!-- form action 이 실행될 input 태그로 입력받은 값이 따로 없고 
	구한 값을 가져오기만 했기 때문에 다음 페이지로 넘어가면 vo객체의 값은 넘어가지 않는다.
	따라서 input type="hidden" 으로 이름을 다음 페이지로 넘겨주는것. 
	 -->
</body>
</html>