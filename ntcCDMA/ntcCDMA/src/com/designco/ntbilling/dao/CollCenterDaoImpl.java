package com.designco.ntbilling.dao;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.jdbc.core.JdbcTemplate;

public class CollCenterDaoImpl extends JdbcTemplate implements CollCenterDao{
	@Override
	public String save(String code, String desc, String acc_cen_code,
			HttpSession session) throws SQLException{
		try{
		String user = session.getAttribute("username").toString();

		String sql = "INSERT INTO m_coll_center (cc_code, description, acc_cen_code, created_by, created_date) VALUES (?, ?, ?,?, SYSDATE)";
		this.update(sql, new Object[] { code, desc, acc_cen_code, user });
		return "Sucessfully Saved";
		}catch(Exception e){
			return e.getCause().toString();
		}
	}

	@Override
	public void update(String code, String desc, String acc_cen_code,
			HttpSession session) {
		String user = session.getAttribute("username").toString();
		String sql = "UPDATE m_coll_center SET description=?,acc_cen_code=?, updated_by=?, updated_date=SYSDATE WHERE cc_code=?";
		this.update(sql, new Object[] { desc, acc_cen_code, user, code });
	}

	@Override
	public String delete(String code, HttpSession session) throws SQLException{
		try{
		String sql = "DELETE FROM m_coll_center WHERE cc_code=?";
		this.update(sql, new Object[] { code });
		return "Record Deleted";
		}catch(Exception e){
			return e.getCause().toString();
		}
	}

	@Override
	public List getAll() {
		String sql = "select cc_code,description,acc_cen_code,(select region_code from m_acc_center where acc_cen_code=a.acc_cen_code) region_code," +
				"created_by,created_date,updated_by,updated_date from m_coll_center a ";
		return this.queryForList(sql);
	}

	@Override
	public List getByCode(String code) {
		String sql = "SELECT cc_code,description,acc_cen_code,(select region_code from m_acc_center where acc_cen_code=a.acc_cen_code) region_code," +
				"created_by,created_date,updated_by,updated_date FROM m_coll_center a WHERE cc_code = ?";
		return this.queryForList(sql, new Object[] { code });
	}

	@Override
	public List search(String code) {
		String sql = "SELECT * FROM m_coll_center WHERE acc_cen_code= ?";
		return this.queryForList(sql, new Object[] { code });
	}

	@Override
	public List getByAccountingCenter(String accCenter) {
		String sql = "SELECT cc_code,description,acc_cen_code,(select region_code from m_acc_center where acc_cen_code=a.acc_cen_code) region_code," +
				"created_by,created_date,updated_by,updated_date FROM m_coll_center a WHERE ACC_CEN_CODE=?";
		return this.queryForList(sql, new Object[] { accCenter });
	}

}
