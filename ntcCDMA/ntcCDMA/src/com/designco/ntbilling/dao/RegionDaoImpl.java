package com.designco.ntbilling.dao;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class RegionDaoImpl extends JdbcTemplate implements RegionDao {
	@Override
	public String save(String code, String desc, HttpSession session) throws SQLException {
		try{
		String user = session.getAttribute("username").toString();

		String sql = "INSERT INTO m_region (region_code, description, created_by, created_date) VALUES (?, ?, ?, SYSDATE)";
		this.update(sql, new Object[] { code, desc, user });
		return "Saved Successfully";
		}catch(Exception e){
			return e.getCause().toString();
		}
		
		
	}

	@Override
	public void update(String code, String desc, HttpSession session) {
		String user = session.getAttribute("username").toString();

		String sql = "UPDATE m_region SET description=?, updated_by=?, updated_date=SYSDATE WHERE region_code=?";
		this.update(sql, new Object[] { desc, user, code });
	}

	@Override
	public String delete(String code, HttpSession session) throws SQLException{
		try{
		String sql = "DELETE FROM m_region WHERE region_code=?";
		this.update(sql, new Object[] { code });
		return "Delete Successfully";
		}catch(Exception e){
			return e.getCause().toString();
		}
	}

	@Override
	public List getAll() {
		String sql = "SELECT * FROM m_region";
		return this.queryForList(sql);
	}

	@Override
	public List getByCode(String code) {
		String sql = "SELECT * FROM m_region WHERE region_code = ?";
		return this.queryForList(sql, new Object[] { code });
	}

}
