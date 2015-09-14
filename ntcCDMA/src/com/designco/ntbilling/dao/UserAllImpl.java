package com.designco.ntbilling.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.jdbc.core.JdbcTemplate;

public class UserAllImpl extends JdbcTemplate implements UserAllDao { 
	@Override
	public void save(String code, String password,String roleCode,String userLevel,String startTime,String endTime,String ccCode,String userStatus,String empDesc, Integer empNo, HttpSession session) {
		String user = session.getAttribute("username").toString();
		String sql = "INSERT INTO m_user (user_code,password,role_code,user_level, start_time,end_time,cc_code,user_status, created_by, USER_DESC, EMPNO) " +
				"VALUES (?, app_user_security.get_hash(?,?), ?,?,?,?,?,?,?,?,?)";
		this.update(sql, new Object[] { code.toUpperCase(),code, password,roleCode,userLevel,startTime,endTime,ccCode,userStatus, user, empDesc, empNo });

	}

	@Override
	public void update(String code,String roleCode,String userLevel,String startTime,String endTime,String ccCode,String userStatus, String empDesc, Integer empNo, HttpSession session) {
		String user = session.getAttribute("username").toString();

		String sql = "UPDATE m_user SET role_code=?,user_level=?, start_time=?,end_time=?,cc_code=?,user_status=?, updated_by=?, updated_date=SYSDATE, USER_DESC=?, EMPNO=? WHERE user_code=?";
		this.update(sql, new Object[] {  roleCode, userLevel,startTime,endTime,ccCode,userStatus,user,empDesc, empNo, code });
	}

	@Override
	public void delete(String code, HttpSession session) {
		String sql = "DELETE FROM m_user WHERE user_code=?";
		this.update(sql, new Object[] { code });
	}

	@Override
	public List getAll() {
		String sql = "SELECT * FROM m_user order by user_code";
		return this.queryForList(sql);
	}

	
	@Override
	public List getByCode(String code) {
		String sql = "SELECT * FROM m_user WHERE user_code = ?";
		return this.queryForList(sql, new Object[] { code });
	}
	
	@Override
	public List getByCodeUserLevel(int user_level) {
		String sql = "SELECT * FROM m_user WHERE user_level = ?";
		return this.queryForList(sql, new Object[] { user_level });
	}
	
	@Override
	public String getCcCodeByUserID(String userId) {
		String sql = "SELECT * FROM m_user WHERE user_code = ?";
		List list = this.queryForList(sql, new Object[] { userId });
		Map map = (Map) list.get(0);
		String ccCode = map.get("CC_CODE").toString();
		return ccCode;
	}
	

	@Override
	public List getSupByCCCode(String ccCode) {
		String sql = "SELECT * FROM m_user WHERE cc_code = ? and user_level=1";
		return this.queryForList(sql, new Object[] { ccCode });
	}
	
	@Override
	public List getOptByCCCode(String ccCode) {
		String sql = "SELECT * FROM m_user WHERE cc_code = ? and user_level=2";
		return this.queryForList(sql, new Object[] { ccCode });
	}
	
	public List getByCCCode(String ccCode) {
		String sql = "SELECT * FROM m_user WHERE cc_code = ?";
		return this.queryForList(sql, new Object[] { ccCode });
	}
	
	@Override
	public List getSupervisorUserResults(String key,String ccCode) {
//		"SELECT * FROM m_user WHERE cc_code = ? and user_level=2";
	String sql = "SELECT DISTINCT s.user_code, s.user_desc, s.cc_code, b.description FROM M_USER s, M_COLL_CENTER b "+
	    "WHERE (s.role_code LIKE 'SUP%' OR to_number(user_level) >= 2) AND s.user_status='A' and s.cc_code = b.cc_code AND b.cc_code =? AND s.user_code LIKE '%"+key.toUpperCase()+"%' ORDER BY s.user_desc";
		
		return this.queryForList(sql, new Object[] {ccCode});
	}
	
	@Override
	public List getOperatorUserResults(String key,String ccCode) {
		String sql = "SELECT * FROM m_user where user_code LIKE '%"+key.toUpperCase()+"%' and user_status='A' and cc_code=?  order by user_code";
		return this.queryForList(sql, new Object[] {ccCode});
	}
	
	
	@Override
	public boolean changePassword(String username,String oldPassword, String newPassword) {
		String sql = "select app_user_security.valid_user(?,?) valid from dual";
		List list= this.queryForList(sql, new Object[] { username,oldPassword });
		Map map = (Map) list.get(0);
		String valid = map.get("VALID").toString();
		if(valid.equals("true")){
			String sql1 = "update m_user set password=app_user_security.get_hash(?,?) where user_code=? ";
			this.update(sql1, new Object[] { username, newPassword,username.toUpperCase()});
			return true;
			
		}
		else {
		return false;

		}
	}
	
	public boolean changePasswordByAdmin(String username, String newPassword) {
			String sql1 = "update m_user set password=app_user_security.get_hash(?,?) where user_code=? ";
			this.update(sql1, new Object[] { username, newPassword,username.toUpperCase()});
			return true;

		
	}


	@Override
	public List getForMenu(String code,String parentMenu) {
		String sql = "select distinct m.menu_group, description , menu_url, m.menu_code,m.parent_menu  from m_user u, m_menu_access ma, m_menu m "+
                " where m.menu_code=ma.MENU_CODE and ma.ROLE_CODE=u.role_code and u.user_code=? and m.parent_menu=? order by m.menu_code";
		return this.queryForList(sql, new Object[] { code,parentMenu });
	}
	

	@Override
	public void loginSave(String code, Date date) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO m_user_log (user_code,login_time) " +
				"VALUES (?,?)";
		this.update(sql, new Object[] { code,date });

		
	}

	@Override
	public void logoutSave(String code, String time) {
		// TODO Auto-generated method stub
		String sql = "UPDATE m_user_log set user_code=?,logout_time=sysdate "+
						"where to_char(login_time,'yyyy/MM/dd hh:mi:ss') =?" ;
				
		this.update(sql, new Object[] { code, time });
		
	}


	

}
