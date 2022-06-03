package com.haeva.my;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import telinfoDAO.TelInfoDAO;

public class HaevaTelUpdate implements HaevaImpl {

	@Override
	public void haeva(HttpServletRequest request, HttpServletResponse response) throws Exception {
		 TelInfoDAO dao4 = null;
         String sname3 = request.getParameter("sname");
         
         int id3 = Integer.parseInt(request.getParameter("id"));
         String name3 = request.getParameter("name");
         String tel3 = request.getParameter("tel");
         String d3 = request.getParameter("d");
         
         try {
                 dao4 = new TelInfoDAO();
         } catch (ClassNotFoundException | SQLException e) {
                 // TODO Auto-generated catch block
                 e.printStackTrace();
         }
         try {
                 dao4.update_all(id3, name3, tel3, d3, sname3);
         } catch (SQLException e) {
                 e.printStackTrace();
         }
	}
	
}
