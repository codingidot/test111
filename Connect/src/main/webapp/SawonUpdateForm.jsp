<%@page import="tellinfoVO.TelInfoVO"%>
<%@page import="telInfoDAO.TelInfoDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>사원 수정폼</h1>
<%
  request.setCharacterEncoding("euc-kr");
 TelInfoDAO tidao = new TelInfoDAO(); //DAO handling위해
 String oriName=request.getParameter("name");
       //<a>태그 선택한것   .jsp?name=홍길동   
                                       //홍길동 
  TelInfoVO tv2 = tidao.search_nametel(oriName);///////////////
     //홍길동 한사람 정보를  db에서 찾아내는 작업 , 받을때는 객체로 받는다 
 %>
<form action="SawonUpdateProcess.jsp" method="post">
<table border=2 >
 <tr><th>사번</th><th>이름</th><th>전화번호</th><th>입사일</th></tr>

 <tr>  <!-- 한사람에 대한 정보를 화면에 출력  -->
    <td><%=tv2.getId() %> </td> <!-- 출력only -->
    <td><%=tv2.getName() %> </td>
    <td>
 <input type="text" name="tel" value=<%=tv2.getTel()%>>
       <!--  글상자 = 출력 + 입력, 그러므로 수정은 이것만 가능 -->
   </td>
    <td><%=tv2.getD() %> </td>
<input type="hidden" name="name" value=<%=tv2.getName()%>> 
 </tr> 
 <tr>
  <td colspan=4><input type="submit" value="수정하자"></td>
</tr>
</table>
<table border=0>
<tr><td><a href="SawonInsertForm.jsp">[입력]</a></td>
    <td><a href="SawonDeleteForm.jsp">[삭제]</a></td>
    <td><a href="SawonAllView.jsp">[모두보기]</a></td></tr>
</table>
</form>
</body>
</html>