<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
request.setCharacterEncoding("UTF-8");
response.setCharacterEncoding("utf-8");

String jong=request.getParameter("jong1");
String[] arr=request.getParameterValues("jepoom");
String goomae=request.getParameter("way1");
%>

    <h1>구입내역</h1>
       <table border=2 width=700>
                <tr>
                        <td>제품종류 번호 및 제목</td>
                        <td><%if(jong!=null){
                        	out.println(jong);	
                        }
                        	%></td>
                        
                </tr>                
                <tr>
                        <td>제품선택</td>
                        <td><% if(arr !=null){
                                for(String i : arr){%>
                                        out.println(i)<br>
                        <%        }
                        }
                        %></td>
                </tr>
                <tr>
                        <td>구입방법</td>
                        <td><%= goomae%></td>
                </tr>
                <tr>
                        <td colspan="2">다시 구입하려면 <a href="NewFile3.html">여기</a> 를 누르세요</td>
                </tr>
        </table>
    
</body>
</html>