package com.mgr.sawon.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.mgr.dbconn.TelInfoDBConn;
import com.mgr.sawon.vo.TelInfoVO;

@Repository //// 자신이 DAO임을 나타냄
public class TelInfoDAO {
	private Connection con;
	PreparedStatement pst = null;
	ResultSet rs = null;

	public TelInfoDAO() throws ClassNotFoundException, SQLException {
		con = new TelInfoDBConn().getConnection();
	}

	public ArrayList<TelInfoVO> getAllTelinfo(TelInfoVO vo1) throws SQLException {
		ArrayList<TelInfoVO> tiarray = new ArrayList<TelInfoVO>();
		String sql = "select * from TelTable55 order by id";

		pst = con.prepareStatement(sql);
		rs = pst.executeQuery();
		while (rs.next()) {
			TelInfoVO telInfoVO = new TelInfoVO();
			telInfoVO.setId(rs.getInt("id"));
			telInfoVO.setName(rs.getString("name"));
			telInfoVO.setTel(rs.getString("tel"));

			tiarray.add(telInfoVO);

		}

		return tiarray;

	}

	public void insertTelinfo(TelInfoVO vo1) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "insert into TelTable55 values(?,?,?)";

		pst = con.prepareStatement(sql);
		pst.setInt(1, vo1.getId());
		pst.setString(2, vo1.getName());
		pst.setString(3, vo1.getTel());

		pst.executeUpdate();

	}

	public TelInfoVO getTelinfo(TelInfoVO vo1) throws SQLException {
		TelInfoVO telInfoVO = null;
		String sql = "select * from TelTable55 where name = ? ";
		pst = con.prepareStatement(sql);
		pst.setString(1, vo1.getName()); // 검색
		rs = pst.executeQuery();
		if (rs.next()) {
			telInfoVO = new TelInfoVO();
			telInfoVO.setId(rs.getInt("id"));
			telInfoVO.setName(rs.getString("name"));
			telInfoVO.setTel(rs.getString("tel"));
		}
		return telInfoVO;
	}

	public void updateTelinfo(TelInfoVO vo1) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "UPDATE TelTable55 SET id=?, tel=? WHERE name = ?";

		pst = con.prepareStatement(sql);
		pst.setInt(1, vo1.getId());
		pst.setString(2, vo1.getTel());
		pst.setString(3, vo1.getName());
		pst.executeUpdate();
	}

	public void deleteTelinfo(TelInfoVO vo1) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "delete from TelTable55 WHERE name = ?";

		pst = con.prepareStatement(sql);
		pst.setString(1, vo1.getName());
		pst.executeUpdate();
	}

}
