package com.designco.ntbilling.dao;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.designco.ntbilling.util.Context;

public class ItemCategoryDaoImpl extends JdbcTemplate implements ItemCategoryDao {
	@Override
	public String save(String code, String desc, HttpSession session) throws SQLException{
		try{ 
		String user = session.getAttribute("username").toString();

		String sql = "INSERT INTO m_item_category (category_code, description, created_by, created_date) VALUES (?, ?, ?, SYSDATE)";
		this.update(sql, new Object[] { code, desc, user });
		return "Saved Sucessfully";
		}catch(Exception e){
			return e.getCause().toString();
		}

		// RegionDao regionDao=(RegionDao)Context.get().getBean("regionDao");
		// regionDao.save("", "", session);

		// throw new RuntimeException("asdfsadf");
	}

	@Override
	public void update(String code, String desc, HttpSession session) {
		String user = session.getAttribute("username").toString();

		String sql = "UPDATE m_item_category SET description=?, updated_by=?, updated_date=SYSDATE WHERE category_code=?";
		this.update(sql, new Object[] { desc, user, code });
	}

	@Override
	public String delete(String code, HttpSession session) throws SQLException {
		try{
		String sql = "DELETE FROM m_item_category WHERE category_code=?";
		this.update(sql, new Object[] { code });
		return "Record Deleted";
		}catch( Exception e){
			return e.getCause().toString();
		}
	}

	@Override
	public List getAll() {
		String sql = "SELECT * FROM m_item_category";
		return this.queryForList(sql);
	}

	@Override
	public List getByCode(String code) {
		String sql = "SELECT * FROM m_item_category WHERE category_code = ?";
		return this.queryForList(sql, new Object[] { code });
	}

}
