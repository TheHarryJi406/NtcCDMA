package com.designco.ntbilling.dao;

import java.math.BigDecimal;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.transaction.annotation.Transactional;

public interface ItemRateDao {
	public void save(String itemCode, String date, BigDecimal charge,
			BigDecimal tsc, BigDecimal vat, String activeFlag,
			HttpSession session);

	public void update(String rateId, String itemCode, String date,
			BigDecimal charge, BigDecimal tsc, BigDecimal vat,
			String activeFlag, HttpSession session);

	public void delete(String rateId, HttpSession session);

	@Transactional
	public List getByCode(String code);

	public List getByItemCode(String code);

	public List getAll();

	public List getByDesc(String desc);
	//
	// public List getByCategoryCode(String code);
	//
	// @Transactional
	// public List search(String code);
}
