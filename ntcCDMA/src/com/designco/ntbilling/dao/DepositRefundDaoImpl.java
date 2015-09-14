package com.designco.ntbilling.dao;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.jdbc.core.JdbcTemplate;

public class DepositRefundDaoImpl extends JdbcTemplate implements DepositRefundDao{ 
	@Override
	public String save(String srvNo, String name,String accNo,String productNo,String depBal,String refBal,String remarks,HttpSession session) throws SQLException  {
		try{
		String user = session.getAttribute("username").toString();
		String sql = "INSERT INTO DEPOSIT_REFUND (trans_no, trans_dt, srv_no, acc_no,product_id,cust_name,dep_bal,refund_amt,remarks,cc_code,created_by, created_date) VALUES" +
				" (to_char(lpad(ref_dep_seq.nextval,8,0)), sysdate, ?,?,?,?,?,?,?,?,?, SYSDATE)";
		this.update(sql, new Object[] { srvNo, accNo,productNo,name,depBal,refBal,remarks,session.getAttribute("ccCode"),user});
		return "Saved Successfully";
		}
		catch(Exception e){
			return e.getCause().toString();
		}
	}

	/*@Override
	public String update(String code, String desc,String regionCode, HttpSession session) throws SQLException{
		try{
		String user = session.getAttribute("username").toString();

		String sql = "UPDATE m_acc_center SET description=?,region_code=?, updated_by=?, updated_date=SYSDATE WHERE acc_cen_code=?";
		this.update(sql, new Object[] { desc,regionCode ,user, code });
		return "Update Successfully";
		}
		catch(Exception e){
			return e.getCause().toString();
		}
	}

	@Override
	public String delete(String code, HttpSession session) throws SQLException {
		try{
		String sql = "DELETE FROM m_acc_center WHERE acc_cen_code=?";
		this.update(sql, new Object[] { code });
		return "Delete Successfully";
		}catch(Exception e){
			return e.getCause().toString();
		}
	}

	@Override
	public List getAll() {
		String sql = "SELECT * FROM m_acc_center";
		return this.queryForList(sql);
	}

	@Override
	public List getByCode(String code) {
		String sql = "SELECT * FROM m_acc_center WHERE acc_cen_code = ?";
		return this.queryForList(sql, new Object[] { code });
	}
	
	@Override
	public List getByRegionCode(String regCode) {
	//	String sql = "SELECT * FROM m_acc_center where  region_code like ?";
		String sql = "SELECT * FROM m_acc_center where  region_code=?";
		return this.queryForList(sql,new Object[] { regCode });
	}
*/	

}
