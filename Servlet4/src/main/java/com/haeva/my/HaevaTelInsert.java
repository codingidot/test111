package com.haeva.my;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import telinfoDAO.TelInfoDAO;

public class HaevaTelInsert implements HaevaImpl {

	@Override
	public void haeva(HttpServletRequest request, HttpServletResponse response) throws Exception {
			System.out.println("메서드 들어옴");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		 int id=Integer.parseInt(request.getParameter("id"));
		 String name=request.getParameter("name"); 
		 String tel=request.getParameter("tel");
		 String d=request.getParameter("sDate");
		 
		 TelInfoDAO tidao=new TelInfoDAO();
		  
		 tidao.insert_nametel(id, name, tel, d);
	}

}
