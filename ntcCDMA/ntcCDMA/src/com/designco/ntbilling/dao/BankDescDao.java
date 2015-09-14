package com.designco.ntbilling.dao;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpSession;


public interface BankDescDao {

	public void save(String desc,String branch ,HttpSession session);

	public void update(String code, String desc, String branch,
			HttpSession session);

	public String delete(String code, HttpSession session) throws SQLException;

	//public List getByCode(String code);

	public List getAll();
	public List getByDesc(String desc);
	public List getByCode(String code);
	
	public String verify(String desch,String branch); 
/*	
	public List getByCategoryCode(String code);

	@Transactional
	public List search(String code);*/
}
