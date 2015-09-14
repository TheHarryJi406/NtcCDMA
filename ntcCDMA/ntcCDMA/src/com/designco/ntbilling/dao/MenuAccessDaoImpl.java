package com.designco.ntbilling.dao;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.jdbc.core.JdbcTemplate;

public class MenuAccessDaoImpl extends JdbcTemplate implements MenuAccessDao { 
	@Override
	public void save(String role,String[] menu , HttpSession session) {
		String user=session.getAttribute("username").toString();
		for (int i = 0; i < menu.length; i++) {
			//String roleCode = role;
			String menuCode = menu[i];
			save(role, menuCode, user);
		}
	}

	private void save(String role, String menuCode, String user) {
		String sql = "insert into m_menu_access (role_code, menu_code, created_by, created_date) values"
				+ " (?,?,?,sysdate)";
		
		this.update(sql, new Object[] { 
				role, 
				menuCode,
				user, 
				});
			}


	@Override
	public void update(String code, String desc,String itemCategory, HttpSession session) {
		String user = session.getAttribute("username").toString();
		String sql = "UPDATE m_item SET description=?,category_code=?, updated_by=?, updated_date=SYSDATE WHERE item_code=?";
		this.update(sql, new Object[] { desc,itemCategory ,user, code });
	}

	@Override
	public void delete(String code, HttpSession session) {
		String sql = "DELETE FROM m_menu_access WHERE role_code=?";
		this.update(sql, new Object[] { code });
	}

	@Override
	public List getAll() {
		String sql = "SELECT * FROM m_menu order by menu_code";
		return this.queryForList(sql);
	}

	@Override
	public List getAllWithoutMenuHead() {
		String sql = "SELECT * FROM m_menu where parent_menu is not null order by menu_code ";
		return this.queryForList(sql);
	}

	
//	@Override
//	public List getByCode(String code) {
//		String sql = "SELECT * FROM m_item WHERE item_code = ?";
//		return this.queryForList(sql, new Object[] { code });
//	}
	
	@Override
	public List getByRoleCode(String code) {
		String sql = "SELECT m.* FROM m_menu m join m_menu_access ma on(m.menu_code=ma.menu_code) WHERE role_code = ?";
		return this.queryForList(sql, new Object[] { code });
	}

	@Override
	public List getFromMenu() {
		String sql = "SELECT * FROM m_menu";
		return this.queryForList(sql);
	}

	@Override
	public String verify(String menuCode,String code) {
		String sql = "SELECT m.menu_code FROM m_menu m join m_menu_access ma on(m.menu_code=ma.menu_code) WHERE role_code = nvl(?,'A0001') and m.menu_code=?";
		String value = this.queryForList(sql, new Object[] { code , menuCode}).toString();
		if(value!="[]"){
			return "Y";
		}
		else{
			return "N";
		}
	}

//	@Override
//	public List getByCode(String code) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
//	@Override
//	public List search(String code) {
//		String sql = "SELECT * FROM m_item WHERE category_code= ?";
//		return this.queryForList(sql,new Object[] {code});
//	}
	
	@Override
	public List getByMainMenu() {
		String sql = "select * from m_menu where parent_menu is null order by menu_code";
		return this.queryForList(sql);
	}
	
	@Override
	public boolean checkMenuAccessForUser(String userCode, String menuUrl) {
		String sql = "select a.menu_code, b.menu_url  "
					+"from m_menu_access a, m_menu b "
					+"where role_code in(SELECT role_code "
					+"from m_user where user_code=?) "
					+"AND a.menu_code=b.menu_code "
					+"and b.menu_url=? ";
		List  lst=this.queryForList(sql, new Object[] { userCode,menuUrl});
		
		if(lst.isEmpty()){
			return false;
		}
		else {
			return true;
		}
	}
	
	
	
	

}
