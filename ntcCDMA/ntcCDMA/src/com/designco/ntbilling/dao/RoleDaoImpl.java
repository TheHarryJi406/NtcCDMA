package com.designco.ntbilling.dao;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.jdbc.core.JdbcTemplate;

import com.designco.ntbilling.util.Context;


public class RoleDaoImpl extends JdbcTemplate implements RoleDao {
	@Override
	public String save(String code, String desc, HttpSession session) throws SQLException {
		
		try {
			
			String user = session.getAttribute("username").toString();
			String sql = "INSERT INTO m_role (role_code, description, created_by, created_date) VALUES (?, ?, ?, SYSDATE)";
			this.update(sql, new Object[] { code, desc, user });
			return "Saved Successfully";
		} catch (Exception e) {
		    return e.getCause().toString();
			// TODO: handle exception
		}
		

	}

	@Override
	public void update(String code, String desc, HttpSession session) {
		String user = session.getAttribute("username").toString();

		String sql = "UPDATE m_role SET description=?, updated_by=?, updated_date=SYSDATE WHERE role_code=?";
		this.update(sql, new Object[] { desc, user, code });
	}

	@Override
	public void delete(String code, HttpSession session) {
		String sql = "DELETE FROM m_role WHERE role_code=?";
		this.update(sql, new Object[] { code });
	}

	@Override
	public List getAll() {
		String sql = "SELECT * FROM m_role";
		return this.queryForList(sql);
	}

	@Override
	public List getByCode(String code) {
		String sql = "SELECT * FROM m_role WHERE role_code = ?";
		return this.queryForList(sql, new Object[] { code });
	}

}
