//<body onload="kaja();"> 이렇게 쓰면 mvc패턴에 안맞음//이러면 여기에 html이 들어감
window.onload=function(){ //개체.속성=값 --> .이벤트=이벤트처리함수
//tag 사용 없이 load
	var kong=document.getElementById('kong'); //id="kong"
	//객체
	if(kong!=null){ //객체가 만들어졌으면
		if(kong.addEventListener) 
		kong.addEventListener('click',kaja.JJIK, false);//false는 capture부모가 없음을 말함 
		                      //on없이                    //true는 있음
		else
		kong.attachEvent('onclick',kaja.JJIK);
		
	}
}
//  DOM에서 동적메소드
//  addEventListener   vs    attachEvent
//      표준형                    IE 7,8


var kaja={ //kaja객체, new  x --> kaja.메소드 kaja.속성 
	//브라우저마다 맞춰서 하자 :cross browsing
	JJIK:function(event){// event든 aa든 뭐든 써야 표준형이 된다
		if(document.getElementById('kaja1')!=null
				&& document.getElementById('kaja2')!=null){
					document.getElementById('kaja1').innerHTML="babo"
					document.getElementById('kaja2').innerHTML="ondal"
					
				}
				
		
	}
	
}