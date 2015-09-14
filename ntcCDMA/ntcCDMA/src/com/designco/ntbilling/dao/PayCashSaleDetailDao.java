package com.designco.ntbilling.dao;

import java.util.List;

import javax.servlet.http.HttpSession;

public interface PayCashSaleDetailDao {
	public void save(String transNo, String itemCode,String qty,String charge,String tsc, String vat,String remark,  HttpSession session);
	public List getAll();
}
