<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
        <h2>upload하자</h2>
<%
        String bang = "d:/upbang"; //프로젝트 내부가 아닌 외부 드라이브 폴더
        
        //String wcontent1 = request.getSession().getServletContext().getRealPath("/");
        //String bang = wcontent1 + "/upbang";
        
        //임폴트 : ctrl + spacebar
                        //cos.jar          //아래부분이 실제로 업로드 되는 문장
        MultipartRequest mr1 = new MultipartRequest(request, bang, 10*1024*1024,
                                                                                        "euc-kr", new DefaultFileRenamePolicy());
                                //요청, 들어갈 폴더, 파일 최대크기, 글형식, ex) aa.jpg 있는데 aa.jpg 추가시 덮어쓰지 않고 aa(1).jpg


    //request 사용 못하므로 대신 MultipartRequest 객체 mr1 사용
    //mr1한테 권한을 넘겼으므로
        String virum1 = mr1.getParameter("irum1"); //request.getParameter("irum1"); x
        String vfilename1 = mr1.getFilesystemName("file1");
        String vfilename2 = mr1.getFilesystemName("file2");                                                //파일의 이름얻기
        String vfilename3 = mr1.getFilesystemName("file3");
        
        
 		
 		
        if(vfilename1 != null) {
                out.println("사용자 이름은 " +virum1 + "이고"+"<br>");
                out.println("축하해요 "+vfilename1+"라는 파일 올리기 성공");
        } 
        if(vfilename2 != null) {
            out.println("사용자 이름은 " +virum1 + "이고"+"<br>");
            out.println("축하해요 "+vfilename2+"라는 파일 올리기 성공");
    }
        if(vfilename3 != null) {
            out.println("사용자 이름은 " +virum1 + "이고"+"<br>");
            out.println("축하해요 "+vfilename3+"라는 파일 올리기 성공");
    }
        else 
                out.println("에러");
%>


</body>
</html>
