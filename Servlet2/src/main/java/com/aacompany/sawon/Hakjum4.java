package com.aacompany.sawon;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hakjum4
 */
//annotation <-----환경설정파일 web.xml 대신 사용
//URL mapping
@WebServlet("/Hakjum4") //서블릿이름을 Hakjum4 
public class Hakjum4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hakjum4() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request,response); //메소드 호출문 2형식
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");
		
		String irum=request.getParameter("irum");
		String jum1=request.getParameter("jum");
		int jum=Integer.parseInt(jum1);
	
	
		String kaja=null;
		if(jum>=90) {
			kaja="A.jsp";
			
		}else if(jum>=80) {
			kaja="B.jsp";
		}else if(jum>=70) {
			kaja="C.jsp";
		}else if(jum>=60) {
			kaja="D.jsp";
		}else {
			kaja="F.jsp";
		}
		
		RequestDispatcher rd1
		=request.getRequestDispatcher("./jspview/"+kaja);
		
		rd1.forward(request, response);
		
		
	}

}
