package com.designco.ntbilling.dao;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ItemDao {
	@Transactional
	public String save(String desc,String acc_cen_code ,HttpSession session) throws SQLException;

	@Transactional
	public void update(String code, String desc, String category_code,
			HttpSession session);

	@Transactional
	public String delete(String code, HttpSession session) throws SQLException;

	@Transactional
	public List getByCode(String code);

	@Transactional
	public List getAll();
	
	public List getByCategoryCode(String code);

	@Transactional
	public List search(String code);
}
