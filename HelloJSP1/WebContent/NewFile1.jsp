<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%--     ���⼭ <%@�� (3) ���þ� ���ξ�(directive prefix) 
    <%@ page: �������� ���� ������� ��
    charset=ECU-KR�� �� Ŭ���̾�Ʈ�� �����ϴ� ������ ���ڵ� ���
    pageEncoding="ECU-KR"�� jsp ��ü�� ���ڵ� ��� --%>

<%--�̰�(2) jsp �ּ� --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>

<body>
<h1>�� jsp�� ������?!!</h1>
<%! /* (4)���� �̷��� �����϶� ����ǥ�� ���� */
	String irum="kongjoo"; 
%>



<%  //���� ��¥ ���غ���
	//Date date=new Date(); //ctrl shift o�� �ϸ� �ȵȴ�
	//����� Date���� �Է��ϰ� ������ ���̸� ctrl + spacebar
	Date date=new Date(); 
	//sysout
	//���ó�¥�� Ŭ���̾�Ʈ�� ������ ��½��Ѿ���
	out.println(date);
	//��¥�� ��µǾ��ٸ� .jsp�� ==> .java ==> .class�� ó���Ǿ� ���
	// .java �� �⺻��ġ�� build/classes�� ��ġ
	
	//.jsp�� �����Ͽ� ��������� .java, .class�� ���̴�
	//(ã�ư�����)
	/* ������ Ž����-
	���ݻ���ϴ� �ڱ��ũ�����̽� ����/.metadata/.plugins/
	org/eclipase.wst.server.core/
	tmp(0,1,2)/work/Catalina/localhost/
	������Ʈ��/org/appache/jsp/hellojsp.java */
	/* ���� ���C:\classWorkSpace\.metadata
	\.plugins\org.eclipse.wst.server.core\tmp0
	\work\Catalina\localhost\HelloJSP1\org\apache
	\jsp */
%>

<br>
<% 
out.println("<h2> ondal <h2>"+"<br>");

out.println("<h1> baboondal <h1>"+"<br>");

out.println(irum+"<br>");


%>

<h1>���⼭ ���� �⵵�� ����Ϸ���</h1>
<% 
out.println(date.getYear()+1900);
%>

</body>
</html>