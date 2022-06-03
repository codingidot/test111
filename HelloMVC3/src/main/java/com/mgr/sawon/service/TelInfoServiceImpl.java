package com.mgr.sawon.service;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mgr.sawon.dao.TelInfoDAO;
import com.mgr.sawon.vo.TelInfoVO;

@Service("TelInfoService")
public class TelInfoServiceImpl implements TelInfoService{
	@Autowired
	private TelInfoDAO telinfoDAO;
	// new DAO()와 같은 역할
	
	public ArrayList<TelInfoVO> getAllTelinfo(TelInfoVO vo1) throws SQLException {
		return telinfoDAO.getAllTelinfo(vo1);
	}

	@Override
	public TelInfoVO getTelInfo(TelInfoVO vo1) throws SQLException {
		// TODO Auto-generated method stub
		return telinfoDAO.getTelinfo(vo1);
	}

	@Override
	public void updateTelinfo(TelInfoVO vo1) throws SQLException {
		// TODO Auto-generated method stub
		telinfoDAO.updateTelinfo(vo1);
	}

	@Override
	public void insertTelinfo(TelInfoVO vo1) throws SQLException {
		// TODO Auto-generated method stub
		telinfoDAO.insertTelinfo(vo1);
		
	}

	@Override
	public void deleteTelinfo(TelInfoVO vo1) throws SQLException {
		// TODO Auto-generated method stub
		telinfoDAO.deleteTelinfo(vo1);
	}

}
