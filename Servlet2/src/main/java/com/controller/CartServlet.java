package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CartServlet
 */
@WebServlet("/Cartro")
public class CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out=response.getWriter(); //jsp�� out ó�� out ��ü ����
		out.print("<html><body>");
		out.print("��ٱ��� ��� <br>");
		
		//���ǰ�ü ���
		HttpSession session=request.getSession(false);
		//true:������ ������ �ش� ������ ��ȯ, ������ ���� ����
		//false: ������ ������ �ش� ������ ��ȯ, ������ null ��ȯ
		//session.setMaxInactiveInterval(5); //500�� ���� ��������
		if(session!=null) {
			ArrayList<String> list1=(ArrayList<String>)session.getAttribute("car");
			out.print("�ڵ���: "+list1+"<br>");
			
		}else {
			out.print("���Ǿ���"+"<br>");
		}
			
		out.print("<a href='car.html'>�ڵ������</a><br>");
		out.print("<a href='CartSakje'>cart����</a><br>");
		out.print("</body></html>");
		
		
		
		
		
	}

}