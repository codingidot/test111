package com.haeva.my;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import telinfoDAO.TelInfoDAO;
import telinfoVO.TelInfoVO;

public class HeavaGetAllInfo implements HaevaImpl {

	@Override
	public void haeva(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		TelInfoDAO tidao1=null;
		
		
		tidao1=new TelInfoDAO();
		ArrayList<TelInfoVO> alist1=null;
		alist1=tidao1.getAllInfo();
		request.setAttribute("alist1", alist1);
				
	}
	

}
