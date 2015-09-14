package com.designco.ntbilling.dao;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

public interface UserAllDao {
	public void save(String code, String password,String roleCode,String userLevel,String startTime,String endTime,String ccCode,String userStatus,String empDesc, Integer empNo, HttpSession session) ;
	public void update(String code,String roleCode,String userLevel,String startTime,String endTime,String ccCode,String userStatus, String empDesc, Integer empNo, HttpSession session);
	public void delete(String code, HttpSession session);
	public List getByCode(String code);
	public List getAll();
	public List getByCCCode(String ccCode);
	public List getByCodeUserLevel(int user_level);
	public String getCcCodeByUserID(String userId);
	public List getSupByCCCode(String ccCode);
	public List getOptByCCCode(String ccCode);
	public List getSupervisorUserResults(String key,String ccCode) ;
	public List getOperatorUserResults(String key,String ccCode);
	public boolean changePassword(String username,String oldPassword, String newPassword) ;
	public boolean changePasswordByAdmin(String username, String newPassword);
	public List getForMenu(String code,String parentMenu);
	public void loginSave(String code, Date date);
	public void logoutSave(String code, String time) ;
}
