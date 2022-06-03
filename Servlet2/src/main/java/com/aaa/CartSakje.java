package com.aaa;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/CartSakje")
public class CartSakje extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CartSakje() {
        super();
    }

    ArrayList<String> arrList=new ArrayList<String>();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	request.setCharacterEncoding("utf-8");
	response.setCharacterEncoding("utf-8");
	String select=request.getParameter("select");
	PrintWriter out=response.getWriter();
	HttpSession session=request.getSession(false);
	ArrayList<String> arrList1=(ArrayList<String>)session.getAttribute("arrList");
	arrList=arrList1;
	int cnt;
	if(session!=null) {
		for(int i=0;i<arrList.size();i++) {
			if(arrList.get(i).equals(select)) {
				 cnt=Integer.parseInt(arrList.get(i+1))-1;
				 	if(cnt==0) {
				 		arrList.remove(i);
				 		arrList.remove(i);
				 	}else {
				 		arrList.set(i+1, String.valueOf(cnt));
				 	}
			}
		}	
			
		session.setAttribute("arrList", arrList);
		out.print("<html><body>");
		for( String imsi: arrList) {
			
			out.println(imsi);
			
		}
		out.print("<a href='JangBasket6.html'>��ǰ���</a>");
		out.print("</html></body>");
		
	}else {
		out.print("<html><body>");
		out.print("�� �ƹ��͵� ����");
		out.print("</html></body>");
	}
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		doGet(request,response);
		
		/*
		 * response.setContentType("text/html; charset=utf-8");
		 * 
		 * PrintWriter out=response.getWriter(); out.print("<html><body>");
		 * out.print("cart empty~~~"); //���ǰ�ü ��� HttpSession
		 * session=request.getSession(false); if(session!=null) { session.invalidate();
		 * }else { out.print("���Ǿ���"+"<br>"); }
		 * 
		 * out.print("<a href='car.html'>car���</a><br>"); out.print("</body></html>");
		 */
	}

}