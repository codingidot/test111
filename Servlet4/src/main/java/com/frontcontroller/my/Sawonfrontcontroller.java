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
 * �ҽ� ��򰡿��� Sawonfrontcontroller�� ȣ���ϸ� ???/
 * ���⸦ ã�ƿͼ� 
 * Sawonfromtcontroller Ŭ���� �ȿ��� doget() doPost() ����
 * 
 * .do�� ���� �������� �����ϱ� 
 * *.do�� ���
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
		
		//�׷��� ���.do�� ����� ���Ƿ� ������ �ؾ��ϴ� ��찡 �߻���
		// aa.do�� �Դ��� bb.do�� �Դ���
		//������������ http://localhost:8080/������/Hakjum.do
		
		//�׷��Ƿ� �̰� �����Ͽ� ���н���
		//��, ��ü��θ����� �պκ��� �������� �츮�����ϴ� ������ �̸�
		//Hakjum.do �� ���� �� ����
		
		System.out.println(request.getRequestURI()); ///Servlet4/getAllInfo.do
		System.out.println(request.getContextPath());///Servlet4
		//request.getRequestURL() ��ü�ּ�
		//request.getRequestURI() ������Ʈ ���� ���
		//request.getContextPath() ������Ʈ��
		//request.getServletPath() ��Ű��+���ϸ�
		
		//front controller���� ������ �ϼ��̵Ǹ� front controller�� �� src�� �Ǵ� ���� �翩�ϹǷ�
		//�۾��� �̸� ����� �񼭴��� �ʿ�
		//�׷��ٸ� ������� ����� �����
		//1)�� ������ ���� ����� �޼ҵ� �������� ���ٰ� ������ ����� �ʿ�
		//2) interface �ϳ� ����� ���� �̰��� ó���ϴ� interface���� ����
		//  child���� �����Ű�� ���
		//	 ��) interface�� �޼ҵ� �ϳ� ���� kaja()�� ��� ���𰡴�, ����x
		//			kaja()������ ����Ͽ� child�� kaja()�� ����� ������ �Ѵ�.
		
		String c=request.getRequestURI().substring(request.getContextPath().length());
		//substring�� ���� �ϳ��� ������� 0���ͽ����� ���ڷ� �ű���� ������
		String str=null;
		HaevaImpl h1=null;
		switch(c) {
			
		case "/getAllInfo.do":
			//��� A extends B      A implements B
			//      B�� Ŭ����          B�� interface
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
			str="getAllInfo.jsp"; //view ���
			break;
			
		case "/telInsert.do":
			System.out.println("telInsert.do����");
			
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