<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- jsp 내장객체 9개
out, request, response......
 <!-- 장바구니 (shopping carter)
         아마존고 시애틀
         진열대에서 물건을 집으면 산것으로 간주
         
         노트북 => 장바구니, 청바지 매장으로 들어가서 search 후
         다시 노트북으로 왔더니
         페이지를 옮기다 보니 장바구니 노트북이 없어짐
         
         범위(scope) 
         ==> 이 경우는 사용자가 수많은 웹페이지가 왔다 갔다 하게 됨
         ==> 쳥바지는 웹페이지를 아무리 옮겨다녀도 그대로 존재
         그러므로 특별한 형태가 유지되어야 한다
         
         예) 다른 페이지로 넘어가면 전페이지를 모른다
         한 페이지는 ok인데 두 페이지로 가므로 모른다.
         즉, 계속 유지되어야 한다
         
         
         그래서 이것을 범위로 얘기해보자
         scope(범위)
         pageContext < request < session < application
                                                         (feat. 웹소켓에서 session interface)
                                                         
         pageContext: 한 페이지에서만 알아들음                                                
         request: aa.jsp => bb.jsp (요청에서 응답까지만, 서블릿의 forward)
         session: 1 browser 1 session 형식
         application 1 was 1 application
         -->
 
 
 
 


<%
//여기는 scriptlet
//범위에서 해당 값 인식을 위해
// scope.저장메소드("속성명","속성값") //setter, getter
pageContext.setAttribute("page1", "pagelove"); //페이지범위
request.setAttribute("req1", "reqlove"); //요청범위
session.setAttribute("ses1", "seslove"); //브라우저살아있는 동안 //1browser-1 session
application.setAttribute("app1", "applove");  //WAS가 계속 가동되는 동안

%>


<a href="./scope2.jsp">scope2.jsp로 한번 가볼까!!!!!</a>
</body>
</html>