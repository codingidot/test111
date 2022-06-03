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
		
		PrintWriter out=response.getWriter(); //jsp의 out 처럼 out 객체 생성
		out.print("<html><body>");
		out.print("장바구니 목록 <br>");
		
		//세션객체 얻기
		HttpSession session=request.getSession(false);
		//true:세션이 있으면 해당 세션을 반환, 없으면 새로 생성
		//false: 세션이 있으면 해당 세션을 반환, 없으면 null 반환
		//session.setMaxInactiveInterval(5); //500초 동안 세션유지
		if(session!=null) {
			ArrayList<String> list1=(ArrayList<String>)session.getAttribute("car");
			out.print("자동차: "+list1+"<br>");
			
		}else {
			out.print("세션없음"+"<br>");
		}
			
		out.print("<a href='car.html'>자동차골라</a><br>");
		out.print("<a href='CartSakje'>cart비우기</a><br>");
		out.print("</body></html>");
		
		
		
		
		
	}

}
