package com.designco.ntbilling.dao;

import java.util.List;

import javax.servlet.http.HttpSession;

public interface ItemAccMapDao {
	public void save(String code, String desc,String drAccCode,String crAccCode,String enabledFlag,String item_type, HttpSession session);
	public void update(String code, String desc,String drAccCode,String crAccCode,String enabledFlag,String item_type, HttpSession session);
	public void delete(String code, HttpSession session);
	public List getAll() ;
	public List getByCode(String code);
}
