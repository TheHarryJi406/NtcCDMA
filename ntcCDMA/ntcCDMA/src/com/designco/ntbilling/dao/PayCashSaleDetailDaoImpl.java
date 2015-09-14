package com.designco.ntbilling.dao;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.jdbc.core.JdbcTemplate;

public class PayCashSaleDetailDaoImpl extends JdbcTemplate implements PayCashSaleDetailDao {

	@Override
	public void save(String transNo, String itemCode,String qty,String charge,String tsc, String vat,String remark, HttpSession session) {
		String user = session.getAttribute("username").toString();

		String sql = "INSERT INTO PAY_CASH_SALE_DET (trans_no, item_code,qty,charge,tsc,vat, created_by, created_date,remarks) VALUES (?, ?, ?,?,?,?,?, SYSDATE,?)";
		this.update(sql, new Object[] { transNo, itemCode, qty,charge,tsc,vat,user,remark });
	}

	
	
	@Override
	public List getAll() {
		String sql = "SELECT * FROM PAY_CASH_SALE_DET";
		return this.queryForList(sql);
	}

/*	@Override
	public List getByCode(String code) {
		String sql = "SELECT * FROM lcc_temp WHERE region_code = ?";
		return this.queryForList(sql, new Object[] { code });
	}
*/
}
