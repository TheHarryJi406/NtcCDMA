package com.designco.ntbilling.dao;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.jdbc.core.JdbcTemplate;

public class ItemAccMapDaoImpl extends JdbcTemplate implements ItemAccMapDao {
	
	@Override
	public void save(String code, String desc,String drAccCode,String crAccCode,String enabledFlag,String item_type, HttpSession session) {
		String user = session.getAttribute("username").toString();
		
		String sql="insert into M_ITEM_ACCT_MAP (item_code,description,dr_ac_code,cr_ac_code,enabled_flag,create_by,item_type)"+
					"values (?,?,?,?,?,?,?)";
		this.update(sql, new Object[] { code, desc,drAccCode,crAccCode,enabledFlag, user,item_type });
	}
	
	
	@Override
	public void update(String code, String desc,String drAccCode,String crAccCode,String enabledFlag,String item_type, HttpSession session) {
		String user = session.getAttribute("username").toString();

		String sql = "UPDATE M_ITEM_ACCT_MAP SET description=?,dr_ac_code=?,cr_ac_code=?,enabled_flag=?, update_by=?, update_dt=SYSDATE,item_type=? WHERE item_code=?";
		this.update(sql, new Object[] { desc,drAccCode,crAccCode,enabledFlag, user,item_type, code });
	}
	
	
	@Override
	public void delete(String code, HttpSession session) {
		String sql = "DELETE FROM M_ITEM_ACCT_MAP WHERE item_code=?";
		this.update(sql, new Object[] { code });
	}

	@Override
	public List getAll() {
		String sql = "SELECT * FROM M_ITEM_ACCT_MAP";
		return this.queryForList(sql);
	}

		@Override
	public List getByCode(String code) {
		String sql = "SELECT * FROM M_ITEM_ACCT_MAP WHERE item_code = ?";
		return this.queryForList(sql, new Object[] { code });
	}
	

}
