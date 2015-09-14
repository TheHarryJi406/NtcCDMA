package com.designco.ntbilling.dao;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface DepositRefundDao {
	@Transactional
	public String save(String serNo, String name,String accNo,String productNo,String depBal,String refBal,String remarks,HttpSession session)
			throws SQLException;

	/*@Transactional
	public String update(String code, String desc, String regionCode,
			HttpSession session) throws SQLException;

	@Transactional
	public String delete(String code, HttpSession session) throws SQLException;

	@Transactional
	public List getByCode(String code);

	@Transactional
	public List getAll();

	@Transactional
	public List getByRegionCode(String regCode);*/
}
