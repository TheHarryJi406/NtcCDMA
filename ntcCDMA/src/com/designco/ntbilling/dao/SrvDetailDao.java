package com.designco.ntbilling.dao;

import java.util.List;

import javax.servlet.http.HttpSession;

public interface SrvDetailDao {
	public List getByCode(String srvNo);
	
}
