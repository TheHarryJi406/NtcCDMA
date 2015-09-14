package com.designco.ntbilling.dao;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.jdbc.core.JdbcTemplate;

public class AccCenterDaoImpl extends JdbcTemplate implements AccCenterDao { 
	@Override
	public String save(String code, String desc,String regionCode ,HttpSession session) throws SQLException  {
		try{
		String user = session.getAttribute("username").toString();
		String sql = "INSERT INTO m_acc_center (acc_cen_code, description, region_code, created_by, created_date) VALUES (?, ?, ?,?, SYSDATE)";
		this.update(sql, new Object[] { code, desc,regionCode ,user });
		return "Saved Successfully";
		}
		catch(Exception e){
			return e.getCause().toString();
		}
	}

	@Override
	public String update(String code, String desc,String regionCode, HttpSession session) throws SQLException{
		try{
		String user = session.getAttribute("username").toString();

		String sql = "UPDATE m_acc_center SET description=?,region_code=?, updated_by=?, updated_date=SYSDATE WHERE acc_cen_code=?";
		this.update(sql, new Object[] { desc,regionCode ,user, code });
		return "Update Successfully";
		}
		catch(Exception e){
			return e.getCause().toString();
		}
	}

	@Override
	public String delete(String code, HttpSession session) throws SQLException {
		try{
		String sql = "DELETE FROM m_acc_center WHERE acc_cen_code=?";
		this.update(sql, new Object[] { code });
		return "Delete Successfully";
		}catch(Exception e){
			return e.getCause().toString();
		}
	}

	@Override
	public List getAll() {
		String sql = "SELECT * FROM m_acc_center";
		return this.queryForList(sql);
	}

	@Override
	public List getByCode(String code) {
		String sql = "SELECT * FROM m_acc_center WHERE acc_cen_code = ?";
		return this.queryForList(sql, new Object[] { code });
	}
	
	@Override
	public List getByRegionCode(String regCode) {
	//	String sql = "SELECT * FROM m_acc_center where  region_code like ?";
		String sql = "SELECT * FROM m_acc_center where  region_code=?";
		return this.queryForList(sql,new Object[] { regCode });
	}
	

}
