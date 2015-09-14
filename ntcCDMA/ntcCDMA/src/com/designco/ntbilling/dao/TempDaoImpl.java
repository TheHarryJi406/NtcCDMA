package com.designco.ntbilling.dao;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.jdbc.core.JdbcTemplate;

public class TempDaoImpl extends JdbcTemplate implements TempDao {

	@Override
	public void save(String code, String desc, HttpSession session) {
		String user = session.getAttribute("username").toString();

		String sql = "INSERT INTO lcc_temp (region_code, description, created_by, created_date) VALUES (?, ?, ?, SYSDATE)";
		this.update(sql, new Object[] { code, desc, user });
	}

	@Override
	public void update(String code, String desc, HttpSession session) {
		String user = session.getAttribute("username").toString();

		String sql = "UPDATE lcc_temp SET description=?, updated_by=?, updated_date=SYSDATE WHERE region_code=?";
		this.update(sql, new Object[] { desc, user, code });
	}

	
	@Override
	public void delete(String code, HttpSession session) {
		String sql = "DELETE FROM lcc_temp WHERE region_code=?";
		this.update(sql, new Object[] { code });
	}

	@Override
	public List getAll() {
		String sql = "SELECT * FROM lcc_temp";
		return this.queryForList(sql);
	}

	@Override
	public List getByCode(String code) {
		String sql = "SELECT * FROM lcc_temp WHERE region_code = ?";
		return this.queryForList(sql, new Object[] { code });
	}

}
