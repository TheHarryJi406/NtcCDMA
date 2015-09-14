package com.designco.ntbilling.dao;

import java.util.List;

import javax.servlet.http.HttpSession;

public interface TempDao {
	public void save(String code, String desc, HttpSession session);
	public void update(String code, String desc, HttpSession session);
	public void delete(String code, HttpSession session);
	public List getByCode(String code);
	public List getAll();
}
