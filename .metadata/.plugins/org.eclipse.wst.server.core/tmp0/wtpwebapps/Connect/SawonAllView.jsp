
<%@page import="tellinfoVO.TelInfoVO"%>
<%@page import="telInfoDAO.TelInfoDAO"%>
<%@page import="java.util.ArrayList" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>사원 전체 명단 </h1>
<%
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        
        TelInfoDAO dao = new TelInfoDAO();
        ArrayList<TelInfoVO> list = dao.getAllInfo();
%>

<table border ="1">
                <tr>
                        <th>사원번호</th>
                        <th>사원 이름 </th>
                        <th>연락처</th>
                        <th>입사일</th>
                </tr>
                <%for(TelInfoVO vo : list){ %>
                <tr>
                        <td><%= vo.getId()%></td>
                        <td><%= vo.getName() %> </td>
                        <td><%= vo.getTel() %></td>
                        <td><%= vo.getD() %></td>
                </tr>
        <%}%>
</table>
<table>
<tr>
        <td><a href="SawonInsertForm.jsp">[입력]</a></td>
        <td><a href="SawonAllforUpdate.jsp">[수정]</a></td>
        <td><a href="SawonAllforDelete.jsp">[삭제]</a></td>
</tr>
</table>
</body>
</html>