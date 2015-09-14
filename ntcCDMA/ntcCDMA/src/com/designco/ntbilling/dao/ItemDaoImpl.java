package com.designco.ntbilling.dao;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.jdbc.core.JdbcTemplate;

public class ItemDaoImpl extends JdbcTemplate implements ItemDao { 
	@Override
	public String save(String desc,String acc_cen_code ,HttpSession session) throws SQLException{
		try{
		String user = session.getAttribute("username").toString();

		String sql = "INSERT INTO m_item (item_code, description, category_code, created_by, created_date) VALUES (seq.nextval, ?, ?,?, SYSDATE)";
		
		this.update(sql, new Object[] { desc,acc_cen_code ,user });
		return "Saved Successfully";
		}catch(Exception e){
			return e.getCause().toString();
		}
	}

	@Override
	public void update(String code, String desc,String category_code, HttpSession session) {
		String user = session.getAttribute("username").toString();
		String sql = "UPDATE m_item SET description=?,category_code=?, updated_by=?, updated_date=SYSDATE WHERE item_code=?";
		this.update(sql, new Object[] { desc,category_code ,user, code });
	}

	@Override
	public String delete(String code, HttpSession session) throws SQLException{
		try{
		String sql = "DELETE FROM m_item WHERE item_code=?";
		this.update(sql, new Object[] { code });
		return "Record Deleted";
		}catch(Exception e){
			return e.getCause().toString();
		}
	}

	@Override
	public List getAll() {
		String sql = "SELECT * FROM m_item";
		return this.queryForList(sql);
	}

	@Override
	public List getByCode(String code) {
		String sql = "SELECT * FROM m_item WHERE item_code = ?";
		return this.queryForList(sql, new Object[] { code });
	}
	
	@Override
	public List getByCategoryCode(String code) {
		String sql = "SELECT i.item_code, i.description description, i.category_code, ci.description cat_description"+
				" FROM m_item i join m_item_category ci on( i.category_code=ci.category_code) "+
				"WHERE i.category_code = NVL(?,i.category_code)";
		return this.queryForList(sql, new Object[] { code });
	}
	
	@Override
	public List search(String code) {
		String sql = "SELECT * FROM m_item WHERE category_code= ?";
		return this.queryForList(sql,new Object[] {code});
	}
	

}
