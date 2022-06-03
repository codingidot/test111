<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <!-- charset은 이페이지에 인코딩 방식 pageEncoding은 응답할때 인코딩방식 -->

   안녕! 방가방가!!!!
   ~~~~오늘도 즐거운 날입니다
   열심히 공부하는 당신은 짱@!@!@!@!@!@!@!@!
  <%--  
   자바스크립트: html+ script
   jsp    : html+ java
   	이때 자바를 사용하려면 <% %>안에 자바 문법을 사용
   	
   	 --%>
   	
   	<%
   	//아래는 자바문법인데 jsp 안에 java문법이 들어갈 때  좌꺽쇠% %우꺽쇠(scriptlet) 안에 자바문법을 사용
   	//만일 결과값을 사용하려면 좌꺽쇠%= %우꺽쇠(expression=표현식)로 입력
   	// con=together   let= hamlet 작은마을
   	String name=request.getParameter("irum");  //jiho
   	//자바변수 name
   	//<input....name="irum" 대신에 ?irum=지호를 사용함
   	//css <style></style>
   	%>
   	
   	그리고 당신의 이름은 <%= name %>이군요