package com.designco.ntbilling.dao;

import java.math.BigDecimal;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.jdbc.core.JdbcTemplate;

public class ItemRateDaoImpl extends JdbcTemplate implements ItemRateDao {
	@Override
	public void save(String itemCode, String date, BigDecimal charge,
			BigDecimal tsc, BigDecimal vat, String activeFlag,
			HttpSession session) {
		String user = session.getAttribute("username").toString();

		String sql = "INSERT INTO m_item_rate (rate_id,item_code, effective_dt, charge, tsc, vat,active_flag, created_by, created_date)"
				+ " VALUES (seq.nextval, ?, cmmn1.to_ad(?),?,?,?,?,?, SYSDATE)";
		this.update(sql, new Object[] { itemCode, date, charge, tsc, vat,
				activeFlag, user });
	}

	@Override
	public void update(String rateId, String itemCode, String date,
			BigDecimal charge, BigDecimal tsc, BigDecimal vat,
			String activeFlag, HttpSession session) {
		String user = session.getAttribute("username").toString();
		String sql = "UPDATE m_item_rate SET item_code=?, effective_dt=cmmn1.to_ad(?), charge=?, tsc=?, vat=?,active_flag=?, updated_by=?, updated_date=SYSDATE WHERE rate_id=?";
		this.update(sql, new Object[] { itemCode, date, charge, tsc, vat,
				activeFlag, user, rateId });
	}

	@Override
	public void delete(String rateId, HttpSession session) {
		String sql = "DELETE FROM m_item_rate WHERE rate_id=?";
		this.update(sql, new Object[] { rateId });
	}

	@Override
	public List getAll() {
		// String sql =
		// "SELECT rate_id,item_code,(select description from m_item where item_code=a.item_code) description ,effective_dt,charge,tsc,vat,own,"
		// +
		// "created_by,created_date,updated_by,updated_date FROM m_item_rate a";
		String sql = "select a.rate_id,a.item_code,b.description,a.effective_dt,charge,tsc,vat,own,nvl(b.is_required,'Y') is_required from m_item_rate a,m_item b where "
				+ "a.item_code=b.item_code";

		return this.queryForList(sql);
	}

	@Override
	public List getByCode(String code) {
		String sql = "SELECT rate_id,item_code,cmmn1.to_bs(effective_dt) effective_dt,charge,tsc,vat,own,active_flag, charge+tsc+vat+own as TOTAL FROM m_item_rate WHERE rate_id = ?";
		return this.queryForList(sql, new Object[] { code });
	}

	@Override
	public List getByDesc(String desc) {
		String sql = "select a.rate_id,a.item_code,b.description,a.effective_dt,charge,tsc,vat,own,nvl(b.is_required,'Y') is_required, charge+tsc+vat+own as TOTAL from m_item_rate a,m_item b where "
				+ "a.item_code=b.item_code and upper(b.description) like upper('"
				+ desc + "')||'%' ";

		// System.out.println(sql);
		return this.queryForList(sql);
	}

	//
	// @Override
	// public List getByCategoryCode(String code) {
	// String sql = "SELECT * FROM m_item WHERE category_code = ?";
	// return this.queryForList(sql, new Object[] { code });
	// }
	//
	// @Override
	// public List search(String code) {
	// String sql = "SELECT * FROM m_item WHERE category_code= ?";
	// return this.queryForList(sql,new Object[] {code});
	// }

	@Override
	public List getByItemCode(String code) {
		String sql = "SELECT ir.rate_id, ir.item_code, ir.active_flag, cmmn1.to_bs(ir.effective_dt) effective_dt, round( ir.charge, 2 ) charge, round(ir.tsc, 2) tsc , round(ir.vat, 2) vat, ir.own, i.description, charge+tsc+vat+own as TOTAL FROM m_item_rate ir join m_item i on(ir.item_code=i.item_code) WHERE ir.item_code = NVL(?, ir.item_code)";
		return this.queryForList(sql, new Object[] { code });
	}

}
