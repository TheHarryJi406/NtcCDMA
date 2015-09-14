package com.designco.ntbilling.dao;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.jdbc.core.JdbcTemplate;

public class SrvDetailDaoImpl extends JdbcTemplate implements SrvDetailDao {


	@Override
	public List getByCode(String srvNo) {
		String sql = "SELECT * FROM m_srv_det WHERE service_no = ?";
		return this.queryForList(sql, new Object[] { srvNo });
	}

}
