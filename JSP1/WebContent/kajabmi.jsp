<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
        <h2>당신의 키와 몸무게 BMI 는</h2>
        
        <!-- id1, pw1의 내용이 여기로 온다
                jsp 는 request내장객체를 사용한다
                문법은 request.getParameter(), String으로 전달됨
         -->
        <%
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
         %>
         
         <%
                 String name = request.getParameter("name");
                 int tall = Integer.parseInt(request.getParameter("ki"));
                 int weight = Integer.parseInt(request.getParameter("weight"));
                 double bmi = weight/((tall/100.0)*(tall/100.0));
                 String res = "";
                 
                 if(bmi>30){
                         res = "고도비만";
                 }else if(bmi>25){
                         res = "비만";
                 }else if(bmi>23){
                         res = "과체중";
                 }else if(bmi>18.5){
                         res = "정상";
                 }else {
                         res = "저체중";
                 }
         %>
                이름 : <%=name%> <br>
                키 : <%=tall %> <br>
                몸무게 : <%=weight %> <br>
                BMI : <%=bmi %> / <%=res %>
<p>
        
</body>
</html>