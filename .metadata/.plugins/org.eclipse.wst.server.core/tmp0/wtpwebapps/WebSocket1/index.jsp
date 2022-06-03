<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>채팅채팅 </title>
</head>
<body>
<!--index.html 도 하ㅏㄴ 더 생성  .. 하나는 서버, 하나는 클라이언트라고 생각하면 됨. -->


<h3> 채팅 </h3>

<textarea rows="10" cols="50" readonly id="ta1"></textarea> <br>

<h3>닉네임</h3>
<input type="text" id="who1" value="홍길동">

<h3>보낼 글 </h3>
<input type="text" id="chat1" onkeyup="enterkey()">
<!-- onkeyup : down이 누르는거고 on 은 눌렀다 뗐을 때  -->
<input type="submit" value="가자" onclick="kajaChool();">

<script>
function enterkey(){
	if(window.event.keyCode == 13){ // ascii code 에서 엔터키 13 
		kajaChool();
	}
}

function kajaChool(){               // 비활성화 
	document.getElementById("who1").disabled=true; // 이름 한번 정하면 변경 불가 
	
	ta1.value += "[" + who1.value + "] " + chat1.value + "\n";
	// [홍길동] 이먼저 출력되고 그 다음 입력한 채팅 내용 출력 
	
	ws1.send("[" + who1.value +"] " + chat1.value );
	//그리고 상대방에게도 [홍길동] 및 채팅내용이 출력되게 함 
	
	chat1.value = "";
	chat1.focus();
	
}
</script>

<script>

// ws(웹 소켓) 은 시작을 http 로 했다가 websocket 으로 바뀜.
//  -> 서버에서도 websocket에 접근이 가능.. 따라서 상호요청이 가능한 것. 
var ws1 = new WebSocket("ws://localhost:8080" + "<%=request.getContextPath()%>/kaja");
// request 가 가지고 있는 메소드 중 하나 .getContextPath() : 프로젝트 경로를 찾아감. 
// 프로젝트경로/kaja 로 가는 것. 
// .java 에도 @ServerEndpoint("/kaja") 로 되어 있음. 

// index.jsp 를 실행하면 url 주소창에는 index.jsp 로 끝나겠지만 실제 찾아가는 곳은 /kaja 라는 것. 

var chat1 = document.getElementById('chat1');
var ta1 = document.getElementById('ta1');

ws1.onerror = function(aa){
	alert('error');
};

ws1.onopen = function(aa){
	alert("[채팅 시작하세요 ]")
	who1.focus();
	who1.select();
}

ws1.onmessage = function(aa){
	
	ta1.value += aa.data + "\n";
}




</script>


</body>
</html>