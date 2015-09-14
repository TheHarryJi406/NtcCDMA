package com.designco.ntbilling.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.designco.ntbilling.util.Context;

public class trial {

	/**
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		RoleDao roleDao= (RoleDao) Context.get().getBean("roleDao");
		List<Map> lst=new ArrayList<>();
		lst=roleDao.getAll();
		for(Map m:lst){
			
			System.out.println(m.get("ROLE_CODE"));
		}
	}

}
