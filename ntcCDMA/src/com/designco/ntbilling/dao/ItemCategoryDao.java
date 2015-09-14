package com.designco.ntbilling.dao;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.transaction.annotation.Transactional;


public interface ItemCategoryDao {

	public String save(String code, String desc, HttpSession session) throws SQLException;


	public void update(String code, String desc, HttpSession session);


	public String delete(String code, HttpSession session) throws SQLException;


	public List getByCode(String code);


	public List getAll();
}
