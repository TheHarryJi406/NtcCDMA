package com.designco.ntbilling.dao;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.jdbc.core.JdbcTemplate;

public class BankDescDaoImpl extends JdbcTemplate implements BankDescDao { 
	@Override
	public void save(String desc,String branch ,HttpSession session) {
		String user = session.getAttribute("username").toString();

		String sql = "INSERT INTO m_bank_desc (code, description, branch, created_by, created_date) VALUES (seq.nextval, ?, ?,?, SYSDATE)";
		this.update(sql, new Object[] { desc,branch ,user });
	}

	@Override
	public void update(String code, String desc,String branch, HttpSession session) {
		String user = session.getAttribute("username").toString();
		String sql = "UPDATE m_bank_desc SET description=?,branch=?, updated_by=?, updated_date=SYSDATE WHERE code=?";
		this.update(sql, new Object[] { desc, branch ,user, code });
	}

	@Override
	public String delete(String code, HttpSession session) throws SQLException{
		try{
		String sql = "DELETE FROM m_bank_desc WHERE code=?";
		this.update(sql, new Object[] { code });
		return "Record Deleted";
		}catch(Exception e){
			return e.getCause().toString();
		}
	}

	@Override
	public List getAll() {
		String sql = "select * from m_bank_desc";
		return this.queryForList(sql);
	}

	@Override
	public List getByDesc(String desc) {
		String sql = "select * from m_bank_desc where upper(description) like '%"+desc+"%'";
//		System.out.println(sql);
		return this.queryForList(sql);
	}
	/*	
	@Override
	public List getByCategoryCode(String code) {
		String sql = "SELECT * FROM m_item WHERE category_code = ?";
		return this.queryForList(sql, new Object[] { code });
	}
	
	@Override
	public List search(String code) {
		String sql = "SELECT * FROM m_item WHERE category_code= ?";
		return this.queryForList(sql,new Object[] {code});
	}
*/

	@Override
	public List getByCode(String code) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM m_bank_desc WHERE code = ?";
		return this.queryForList(sql, new Object[] { code });
	}
	
	public String verify(String desc,String branch) {
		String sql = "select description,branch from m_bank_desc where description=? and branch=?";
		List lst = this.queryForList(sql, new Object[] { desc , branch});
		
		if(lst.isEmpty()){
			return "N";
		}
		
		else {
			return "Y";
		}
		
	}



}
