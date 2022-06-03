package com.aaa.add;

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
 * Servlet implementation class CartAdd
 */
@WebServlet("/CartAdd")
public class CartAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
    ArrayList<String> arrList=new ArrayList<String>();   
    /**
     * @see HttpServlet#HttpServlet()
     */
	
   
	
	public CartAdd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		HttpSession session=request.getSession(true);
		String list=request.getParameter("car");
		PrintWriter out=response.getWriter();
		
		int sw=1;
		int cnt=0;
		
		if(list!=null) {
		
		for(int i=0;i<arrList.size();i++) {
			if(list.equals(arrList.get(i))) {
				cnt=Integer.parseInt(arrList.get(i+1))+1;
				arrList.set(i+1, String.valueOf(cnt));
				sw=0;
			}
		}
		if(list.equals("hey")) {
			list=null;
		}else {
		if(sw==1) {
			arrList.add(list);
			arrList.add("1");
		}
		}
			
		out.print("<html><body>");
		out.print("<h1>��ٱ��� ���</h1>");
			
		out.print("<form action='CartSakje' method='get'>");
		
		
		
		for(int i=0;i<arrList.size();i+=2) {
			
		out.print("<input type='radio' name='select' value='"+arrList.get(i)+"'>"+arrList.get(i)+" "+arrList.get(i+1)+"��"+"\t"+"\n");
			
		}
		
		
		out.print("<input type='submit' value='�����ϱ�'>");
		out.print("</form>");
		out.print("<a href='JangBasket6.html'>������</a>");
		out.print("</body></html>");
		}else {
			response.sendRedirect("JangBasket6.html");
		}
		session.setAttribute("arrList", arrList);	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}
