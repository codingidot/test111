<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
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
  String bang = "d:/upbang";
  
  MultipartRequest mr1 = new MultipartRequest(request, bang, 10*1024*1024,
                                  "euc-kr", new DefaultFileRenamePolicy());

  String virum1 = mr1.getParameter("irum1"); //request.getParameter("irum1");
  out.println("사용자 이름은 " +virum1 + "이고"+"<br>");
  out.println("축하해요 파일 올리기 성공");
  
  %>
  </body>
</html>