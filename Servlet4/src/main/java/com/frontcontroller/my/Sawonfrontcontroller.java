package com.frontcontroller.my;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.haeva.my.HaevaImpl;
import com.haeva.my.HaevaSearchOne;
import com.haeva.my.HaevaTelDelete;
import com.haeva.my.HaevaTelInsert;
import com.haeva.my.HaevaTelUpdate;
import com.haeva.my.HeavaGetAllInfo;

import telinfoDAO.TelInfoDAO;
import telinfoVO.TelInfoVO;

/**
 * Servlet implementation class Sawonfrontcontroller
 */
/* @WebServlet("/Sawonfrontcontroller")
 * 소스 어딘가에서 Sawonfrontcontroller를 호출하면 ???/
 * 여기를 찾아와서 
 * Sawonfromtcontroller 클래스 안에서 doget() doPost() 수행
 * 
 * .do를 전부 이쪽으로 오게하기 
 * *.do를 사용
 * */
@WebServlet("*.do")
public class Sawonfrontcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Sawonfrontcontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		//그런데 모든.do가 여기로 오므로 구분을 해야하는 경우가 발생함
		// aa.do가 왔는지 bb.do가 왔는지
		//서블릿가동은 http://localhost:8080/플젝명/Hakjum.do
		
		//그러므로 이걸 착안하여 구분시작
		//즉, 전체경로명에서 앞부분을 지나가면 우리가원하는 서블릿 이름
		//Hakjum.do 만 얻을 수 있음
		
		System.out.println(request.getRequestURI()); ///Servlet4/getAllInfo.do
		System.out.println(request.getContextPath());///Servlet4
		//request.getRequestURL() 전체주소
		//request.getRequestURI() 프로젝트 이하 경로
		//request.getContextPath() 프로젝트명
		//request.getServletPath() 패키지+파일명
		
		//front controller쓰는 플젝이 완성이되면 front controller가 긴 src가 되는 것은 당여하므로
		//작업시 이를 담당할 비서단이 필요
		//그렇다면 사장단을 만드는 방법은
		//1)긴 내용을 따로 만들어 메소드 형식으로 갔다가 들어오는 방법이 필요
		//2) interface 하나 만들고 실제 이것을 처리하는 interface에서 만든
		//  child에서 실행시키는 방법
		//	 예) interface에 메소드 하나 선언 kaja()의 경우 선언가능, 구현x
		//			kaja()구현은 상속하여 child의 kaja()를 만들어 구현을 한다.
		
		String c=request.getRequestURI().substring(request.getContextPath().length());
		//substring에 인자 하나만 넣을경우 0부터시작한 숫자로 거기부터 끝까지
		String str=null;
		HaevaImpl h1=null;
		switch(c) {
			
		case "/getAllInfo.do":
			//상속 A extends B      A implements B
			//      B는 클래스          B는 interface
			h1=new HeavaGetAllInfo();
			
			try {
				h1.haeva(request,response);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			
			//==========================
			/*
			 * TelInfoDAO tidao1=null;
			 * 
			 * try { tidao1=new TelInfoDAO();
			 * 
			 * } catch (ClassNotFoundException e) { e.printStackTrace(); } catch
			 * (SQLException e) { // TODO Auto-generated catch block e.printStackTrace(); }
			 * ArrayList<TelInfoVO> alist1=null;
			 * 
			 * try { alist1=tidao1.getAllInfo(); } catch (SQLException e) {
			 * e.printStackTrace(); } request.setAttribute("alist1", alist1);
			 */
			//================================
			str="getAllInfo.jsp"; //view 담당
			break;
			
		case "/telInsert.do":
			System.out.println("telInsert.do도착");
			
			h1=new HaevaTelInsert();
			
			try {
				h1.haeva(request, response);
			} catch (Exception e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			
			//=============================================
			/*
			  int id=Integer.parseInt(request.getParameter("id")); String
			  name1=request.getParameter("name"); 
			  String tel=request.getParameter("tel");
			  String d=request.getParameter("sDate");
			  
			  TelInfoDAO tidao=null;
			  
			  try { tidao=new TelInfoDAO(); } catch (ClassNotFoundException e) {
			  e.printStackTrace(); } 
			  catch (SQLException e) { e.printStackTrace(); } 
			  try {
			  tidao.insert_nametel(id, name1, tel, d); } 
			  catch (SQLException e) { 
			   e.printStackTrace(); }
			 */
			//=======================================
			str="getAllInfo.jsp";
			break;
		
		
		case "/telSearchOne.do" :
			h1=new HaevaSearchOne();
			
			try {
				h1.haeva(request, response);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			/*TelInfoDAO tidao11=null;
			TelInfoVO tv=null;
			
			try {
				tidao11=new TelInfoDAO();
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			String name=request.getParameter("name");
			
			try {
				tv=tidao11.getInfo(name);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			request.setAttribute("sname", name);
			request.setAttribute("stv", tv);
			*/
			str="sawonUpdateForm.jsp";
			
			break;
			
			
		case "/telDelete.do":
			h1=new HaevaTelDelete();
			try {
				h1.haeva(request, response);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			/*
			TelInfoDAO tidao1111=null;
				String name1111=request.getParameter("name");
				
			try {
				tidao1111=new TelInfoDAO();
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			try {
				tidao1111.delete_nametel(name1111);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			*/
			str="getAllInfo.jsp";
			break;
			
		case "/telUpdate.do":

			h1=new HaevaTelUpdate();
			try {
				h1.haeva(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			/*
            TelInfoDAO dao4 = null;
            String sname3 = request.getParameter("sname");
            
            int id3 = Integer.parseInt(request.getParameter("id"));
            String name3 = request.getParameter("name");
            String tel3 = request.getParameter("tel");
            String d3 = request.getParameter("d");
            
            try {
                    dao4 = new TelInfoDAO();
            } catch (ClassNotFoundException | SQLException e) {
                    e.printStackTrace();
            }
            try {
                    dao4.update_all(id3, name3, tel3, d3, sname3);
            } catch (SQLException e) {
                    e.printStackTrace();
            }
            */
            str = "getAllInfo.jsp";
			
				
		}
		
		RequestDispatcher rd1=request.getRequestDispatcher(str);
		rd1.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
