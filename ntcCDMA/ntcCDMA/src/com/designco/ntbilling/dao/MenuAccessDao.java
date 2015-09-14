package com.designco.ntbilling.dao;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.transaction.annotation.Transactional;

public interface MenuAccessDao {
	public void save(String role,String[] menu, HttpSession session);



	public void update(String code, String desc, String category_code,
			HttpSession session);

	public void delete(String code, HttpSession session);

	
	//public List getByCode(String code);
	public List getFromMenu();
	public String verify(String menuCode, String code);

	
	public List getAll();
	public List getAllWithoutMenuHead();
	
	public List getByRoleCode(String code);
	
	public List getByMainMenu();

	public boolean checkMenuAccessForUser(String userCode, String menuUrl);

}
