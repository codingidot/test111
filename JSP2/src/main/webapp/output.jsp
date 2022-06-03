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
        //(1) <input type=text ... name값이 넘어온다는
        //    가방 구두 넥타이, select-option 에서는 value값 중요
        
        //(2) session에서 처리하여 장바구니와 연관
        //    input에서는 session 생성 못함(front-end)
        //    back-end인 jsp 여기서 세션을 생성하여 처리
        //    But, 일단 넘어온 내용을 세션에서 꺼내야 장바구니에 넣는데
        //    
        
        //(1)
        String itemValue = request.getParameter("product"); //select 이름
        String cntValue = request.getParameter("cnt"); //수량
                   //5개
        
                   
        //ArrayList도 가능하다
        //세션 속성명의 값을 읽어서 종류가 3개니까 세션도 3가지
        Object obj1 = session.getAttribute("cnts1"); //가방개수
        Object obj2 = session.getAttribute("cnts2"); //구두개수
        Object obj3 = session.getAttribute("cnts3"); //넥타이개수
        
        //처음인가 아니면 구두에 대한 전 것의 갯수가 들어있는가?
        //처음이 아니면 갯수 계산 준비를 시작
        
        int cnt1 = 0, cnt2 = 0, cnt3 = 0, cnt = 0;
        if(obj1 != null) {
                //처음이면(session 없으면 obj1은 null) 아무것도 안함 (다음으로 감)
                cnt1 = (Integer)obj1; //값이 있으면 cnt에 넣음
        }
        
        if(obj2 != null) {
                cnt2 = (Integer)obj2;
        }
        
        if(obj3 != null) {
                cnt3 = (Integer)obj3;
        }
        
        //bag이 5개라면
        cnt = Integer.parseInt(cntValue); //넘어온 수량을 int로
        
        
        
        //어떤 상품인지를 파악
        if("bag".equals(itemValue)) {
                cnt1 += cnt; //세션 속성값을 위해 누적 cnt1에는 3이 누적됨
        }
        if("shoes".equals(itemValue)) {
                cnt2 += cnt;
        }
        if("tie".equals(itemValue)) {
                cnt3 += cnt; //넥타이 10개 선택시 여기에 10개 들어감
        }
       
        //여기서 세션에 제대로 된 속성값 저장
        session.setAttribute("cnts1", cnt1); // 가방 5개, bag
        session.setAttribute("cnts2", cnt2); // 없어 초기치 0, shoes
        session.setAttribute("cnts3", cnt3); // 없어 0, tie
        
        // session.invalidate() 세션삭제 (로그인이 세션으로 진행될 때 로그아웃인 경우 참조)
        // session.removeAttribute("cnts2"); cnts2 속성명 삭제
        
        //Q) 그렇다면 why? 세션 만들고 get 하지않고
        //get 먼저하고 session을 만들었을까?
                        //그 다음 처리를 위해서
%>


        <h2>현재 장바구니 내역</h2>
        <hr>
        
        <%if(cnt1 != 0) { %>가방: <%=cnt1 %> <%} %> <br>
        <%if(cnt2 != 0) { %>구두: <%=cnt2 %> <%} %> <br>
        <%if(cnt3 != 0) { %>넥타이: <%=cnt3 %> <%} %> <br><br>
        
        <a href="input.jsp">계속 산다</a>
</body>
</html>