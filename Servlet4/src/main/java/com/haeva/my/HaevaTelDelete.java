package com.haeva.my;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import telinfoDAO.TelInfoDAO;

public class HaevaTelDelete implements HaevaImpl {

	@Override
	public void haeva(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		
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
	}

}