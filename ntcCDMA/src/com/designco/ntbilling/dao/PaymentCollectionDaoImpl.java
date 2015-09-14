package com.designco.ntbilling.dao;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.jdbc.core.JdbcTemplate;

public class PaymentCollectionDaoImpl extends JdbcTemplate implements
		PaymentCollectionDao {

	// ///if cash
	public void saveByCash(String transNo, String nepDate, String transType,
			String srvNo, String srvName, String accNo, String productId,
			String receiptNo, String payMode, Integer resourceType,
			BigDecimal osAmt, BigDecimal billAmt, BigDecimal tscAmt,
			BigDecimal vatAmt, BigDecimal totalAmt, BigDecimal tenderAmt,
			BigDecimal returnAmt, Integer supSeqNo, HttpSession session,
			String soNbr, String lineStatus, Long errorCode, String errorDesc) {

		String user = session.getAttribute("username").toString();
		String ccCode = session.getAttribute("ccCode").toString();
		// System.out.println("tilak"+payMode);
		String sql = "INSERT INTO m_payment_collection"
				+ "(TRANS_NO,TRANS_DT,TRANS_TYPE,SRV_NO, CUST_NAME,ACC_NO,PRODUCT_ID,RECEIPT_NO,PAY_MODE,OS_AMT,"
				+ "BILL_AMT,TSC_AMT,VAT_AMT,TOTAL_AMT,TENDER_AMT,RETURN_AMT,SUP_SEQ_NO,"
				+ "CC_CODE,CREATED_BY,CREATED_DATE,so_number,print_count,resource_type,line_status,error_code,error_desc) values "
				+ " (?,trunc(sysdate),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,sysdate,?,1,?,?,?,?)";

		this.update(sql, new Object[] {
				transNo, // getTransSequence(),
				transType, srvNo, srvName, accNo, productId,
				receiptNo, // getReceiptSequence(),

				// 999,
				payMode, osAmt, billAmt, tscAmt, vatAmt, totalAmt, tenderAmt,
				returnAmt, supSeqNo, ccCode, user, soNbr, resourceType, lineStatus,errorCode, errorDesc});

		// System.out.println("sdfsdfsd*****");
	}

	// if cheque
	public void saveByCheque(String transNo, String nepDate, String transType,
			String srvNo, String srvName, String accNo, String productId,
			String receiptNo, String payMode, Integer resourceType,
			BigDecimal osAmt, BigDecimal billAmt, BigDecimal tscAmt,
			BigDecimal vatAmt, BigDecimal totalAmt, BigDecimal tenderAmt,
			BigDecimal returnAmt, Integer supSeqNo, HttpSession session,
			String chequeNo, String chequeDate, String accountNo,
			String bankName, String bankBranch, String soNbr, String lineStatus , Long errorCode, String errorDesc) {

		String user = session.getAttribute("username").toString();
		String ccCode = session.getAttribute("ccCode").toString();
		String sql = "INSERT INTO m_payment_collection"
				+ " (TRANS_NO,TRANS_DT,TRANS_TYPE,SRV_NO,CUST_NAME,ACC_NO,PRODUCT_ID,RECEIPT_NO,PAY_MODE,OS_AMT,"
				+ "BILL_AMT,TSC_AMT,VAT_AMT,TOTAL_AMT,TENDER_AMT,RETURN_AMT,SUP_SEQ_NO,"
				+ "CC_CODE,CREATED_BY,CREATED_DATE, CHEQUE_NO ,CHEQUE_DT , ACCOUNT_NO, BANK_NAME ,BANK_BRANCH,so_number,print_count,resource_type, line_status,error_code,error_desc) values "
				+ " (?,trunc(sysdate),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,sysdate,?,cmmn1.to_ad(?),?,?,?,?,1,?,?,?,?)";

		this.update(sql, new Object[] { transNo, transType, srvNo, srvName,
				accNo, productId,
				receiptNo,
				// 999,
				payMode, osAmt, billAmt, tscAmt, vatAmt, totalAmt, tenderAmt,
				returnAmt, supSeqNo, ccCode, user, chequeNo, chequeDate,
				accountNo, bankName, bankBranch, soNbr, resourceType, lineStatus,errorCode,errorDesc });

		// System.out.println("sdfsdfsd*****");
	}

	public List getallBetweenDates(String srvNo, String accNo, String fromDate,
			String toDate) {
		String sql = "select * from m_payment_collection where srv_no=? and "
				+ "acc_no=? and trunc(trans_dt) between to_date('" + fromDate
				+ "','mm/dd/yyyy') and to_date('" + toDate + "','mm/dd/yyyy')";
		return this.queryForList(sql, new Object[] { srvNo, accNo });

	}

	public String getReceiptSequence() {
		String sql = "select to_char(sysdate,'yyyymmdd')||lpad(receipt_seq.nextval,6,'0') sss from dual";
		List lst = this.queryForList(sql);
		Map m = (Map) lst.get(0);
		String seq = m.get("SSS").toString();
		return seq;
	}

	public String getTransSequence() {
		String sql = "select lpad(trans_seq.nextval,8,'0') sss from dual";
		List lst = this.queryForList(sql);
		Map m = (Map) lst.get(0);
		String seq = m.get("SSS").toString();

		return seq;

	}

	public String getRefundSequence() {
		String sql = "select lpad(ref_dep_seq.nextval,8,'0') sss from dual";
		List lst = this.queryForList(sql);
		Map m = (Map) lst.get(0);
		String seq = m.get("SSS").toString();

		return seq;

	}

	public List getCancelledTransaction() {
		String sql = " select trans_no, cmmn1.to_bs(trans_dt)  trans_dt,trans_type,srv_no,acc_no,product_id,receipt_no,cheque_no,cheque_dt,account_no,bank_name,bank_branch,os_amt,bill_amt,tsc_amt,vat_amt,penalty,rebate,total_amt,tender_amt,return_amt,sup_seq_no,cancel_status,cancelled_dt,cancelled_by,cc_code,crtb_flag,post_flag,created_by,created_date,own_amt,pay_mode from M_PAYMENT_COLLECTION where cancel_status='X'";
		List lst = this.queryForList(sql);
		return lst;
	}

	public List getCancelledTransactionByServiceId(String x) {
		String sql = "select trans_no, cmmn1.to_bs(trans_dt)  trans_dt,trans_type,srv_no,acc_no,product_id,receipt_no,cheque_no,cheque_dt,account_no,"
				+ "bank_name,bank_branch,os_amt,bill_amt,tsc_amt,vat_amt,penalty,rebate,total_amt,tender_amt,return_amt,sup_seq_no,"
				+ "cancel_status,cancelled_dt,cancelled_by,cc_code,crtb_flag,post_flag,created_by,created_date,own_amt,pay_mode from M_PAYMENT_COLLECTION"
				+ " where cancel_status='X' and srv_no like '" + x + "%'";
		List lst = this.queryForList(sql);
		return lst;
	}

	public List getCancelledTransactionByReceiptNo(Integer x) {
		String sql = "select trans_no, cmmn1.to_bs(trans_dt)  trans_dt,trans_type,srv_no,acc_no,product_id,receipt_no,cheque_no,cheque_dt,account_no,"
				+ "bank_name,bank_branch,os_amt,bill_amt,tsc_amt,vat_amt,penalty,rebate,total_amt,tender_amt,return_amt,sup_seq_no,"
				+ "cancel_status,cancelled_dt,cancelled_by,cc_code,crtb_flag,post_flag,created_by,created_date,own_amt,pay_mode from M_PAYMENT_COLLECTION"
				+ " where cancel_status<>'X' and to_number(receipt_no)=? ";
		List lst = this.queryForList(sql, new Object[] { x });
		return lst;
	}

	public List getTransactionWithoutPostedAndCancelled(String srvNo) {
		String sql = "select trans_no, cmmn1.to_bs(trans_dt)  trans_dt,trans_type,srv_no,acc_no,product_id,receipt_no,cheque_no,cheque_dt,account_no,"
				+ "bank_name,bank_branch,os_amt,bill_amt,tsc_amt,vat_amt,penalty,rebate,total_amt,tender_amt,return_amt,sup_seq_no,"
				+ "cancel_status,cancelled_dt,cancelled_by,cc_code,crtb_flag,post_flag,created_by,created_date,own_amt,pay_mode from M_PAYMENT_COLLECTION"
				+ " where srv_no=? and nvl(cancel_status,' ')<>'X' and post_flag='N'";
		List lst = this.queryForList(sql, new Object[] { srvNo });
		return lst;
	}

	public void updateForCancellation(String receiptNo, String cancelSoNumber,
			HttpSession session) {
		String user = session.getAttribute("username").toString();
		String sql = "update M_PAYMENT_COLLECTION set cancel_status='X',cancelled_by=?, cancel_so_number=?, "
				+ "cancelled_dt=sysdate where receipt_no=? ";
		this.update(sql, new Object[] { user, cancelSoNumber, receiptNo });
	}

	public List getTransactionByServiceNoWithoutCancelled(String srvNo) {
		String sql = "select trans_no, cmmn1.to_bs(trans_dt)  trans_dt,trans_type,srv_no,acc_no,product_id,receipt_no,cheque_no,cheque_dt,account_no,"
				+ "bank_name,bank_branch,os_amt,bill_amt,tsc_amt,vat_amt,penalty,rebate,total_amt,tender_amt,return_amt,sup_seq_no,"
				+ "cancel_status,cancelled_dt,cancelled_by,cc_code,crtb_flag,post_flag,created_by,created_date,own_amt,pay_mode,cust_name,so_number from M_PAYMENT_COLLECTION"
				+ " where srv_no=? and nvl(cancel_status,' ')<>'X'";
		List lst = this.queryForList(sql, new Object[] { srvNo });
		return lst;
	}

	public List getTransactionByServiceNoWithoutCancelledTodaysOnly(
			String srvNo, String ccCode) {
		String sql = "select trans_no, cmmn1.to_bs(trans_dt)  trans_dt,trans_type,srv_no,acc_no,product_id,receipt_no,cheque_no,cheque_dt,account_no,"
				+ "bank_name,bank_branch,os_amt,bill_amt,tsc_amt,vat_amt,penalty,rebate,total_amt,tender_amt,return_amt,sup_seq_no,"
				+ "cancel_status,cancelled_dt,cancelled_by,cc_code,crtb_flag,post_flag,created_by,created_date,own_amt,pay_mode,cust_name,so_number from M_PAYMENT_COLLECTION"
				+ " where srv_no=? and nvl(cancel_status,' ')<>'X' and trunc(trans_dt)=trunc(sysdate) and cc_code=?";
		// System.out.println(sql + " - " + srvNo + " - " + ccCode);
		List lst = this.queryForList(sql, new Object[] { srvNo, ccCode });
		return lst;
	}
	
	
	

	public List getTransactionByReceiptNO(String receiptNo) {
		String sql = "select so_number, resource_type, trans_no, to_char(trans_dt,'dd-Mon-yy') trans_dt_eng, cmmn1.to_bs(trans_dt)  trans_dt,trans_type,srv_no,acc_no,product_id,receipt_no,cheque_no,cheque_dt,account_no," +
				"bank_name,bank_branch,os_amt,bill_amt,tsc_amt,vat_amt,penalty,rebate,total_amt,tender_amt,return_amt,sup_seq_no,cust_name," +
				"cancel_status,cancelled_dt,cancelled_by,cc_code,crtb_flag,post_flag,created_by,created_date,own_amt,pay_mode,print_count from M_PAYMENT_COLLECTION" +
				" where to_number(receipt_no)=? ";

		List lst = this.queryForList(sql, new Object[] { receiptNo });
		return lst;
	}

	public List getTransactionByTransNO(String transNo) {
		String sql = "select so_number, resource_type, trans_no, cmmn1.to_bs(trans_dt)  trans_dt,trans_type,srv_no,acc_no,product_id,receipt_no,cheque_no,cheque_dt,account_no,"
				+ "bank_name,bank_branch,os_amt,bill_amt,tsc_amt,vat_amt,penalty,rebate,total_amt,tender_amt,return_amt,sup_seq_no,cust_name,"
				+ "cancel_status,cancelled_dt,cancelled_by,cc_code,crtb_flag,post_flag,created_by,created_date,own_amt,pay_mode,print_count from M_PAYMENT_COLLECTION"
				+ " where to_number(trans_no)=? ";
		List lst = this.queryForList(sql, new Object[] { transNo });
		return lst;
	}

	public void updatePrintCount(String receiptNo) {
		String sql = "update M_PAYMENT_COLLECTION set print_count=print_count+1 where receipt_no=? ";
		this.update(sql, new Object[] { receiptNo });

	}
	
	
	public List getTransactionBySystemDate() {
		String sql ="select SRV_NO,SO_NUMBER, CANCEL_SO_NUMBER,TOTAL_AMT*100 TOTAL_AMT,to_char(CREATED_DATE, 'yyyy-mm-dd hh24:mm:ss')  CREATED_DATE,CANCEL_STATUS,to_char(CANCELLED_DT, 'yyyy-mm-dd hh24:mm:ss')   CANCELLED_DT,trans_type "+
					"  from M_PAYMENT_COLLECTION where  trunc(trans_dt)=trunc(sysdate) and trans_type<>'CSIA'" ;
		List lst = this.queryForList(sql, new Object[] {  });
		return lst;
	}

}
