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
String irum=request.getParameter("irum");
String jum1=request.getParameter("jum");
int jum=Integer.parseInt(jum1);

String kaja=null;

if(jum>=90)
		kaja="A";
else if(jum>=80)
		kaja="B";
else if(jum>=70)
	kaja="C";
else if(jum>=60)
	kaja="D";
else
	kaja="F";
//조금전에는 view를 여기 밑에 만들었다
//즉 controller와 view가 같은 파일에 만들엇었다. 
//그러므로 mvc1이 되려면 view를 별도로 작성해야 한다
//계산한 학점을 view로 보내서 출력가능하게 해야한다.

//만일 출력을 따로 한다면 방향을 바꾸어서 해야하므로
//response.sendRedirect()
// But sendRedirect는 방향만 바꿈 학점 계산한걸 보내지 못한다
//이때 RequestDispatcher객체.forward()로 문제 해결
//forward()메소드가 인자를 2개 사용
//forward(request, response) 를 사용하면 인자전달로 값을 가져갈수 있다.
%>
<% 
RequestDispatcher rd1=request.getRequestDispatcher("/jspview/"+kaja+".jsp");
rd1.forward(request,response);
//줄여쓰면
//request.getRequestDispatcher("/jspview/"+kaja+".jsp").forward(request, response);

%>
</body>
</html>