package com.haeva.my;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import telinfoDAO.TelInfoDAO;
import telinfoVO.TelInfoVO;

public class HaevaSearchOne implements HaevaImpl {
	
	
	@Override
	public void haeva(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
	
		TelInfoDAO tidao11=null;
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
			e.printStackTrace();
		}
		
		request.setAttribute("sname", name);
		request.setAttribute("stv", tv);
	}

}