package com.designco.ntbilling.dao;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.designco.ntbilling.util.Context;

public class BillingDaoImpl extends JdbcTemplate implements BillingDao {

	@Transactional
	public void cashSale(String transNo, String transType, String srvNo,
			String name, String accNo, String productId, String receiptNo,
			String payMode, BigDecimal osAmt, BigDecimal billAmt,
			BigDecimal tscAmt, BigDecimal vatAmt, BigDecimal totalAmt,
			BigDecimal tenderAmt, BigDecimal returnAmt, Integer supSeqNo,
			HttpSession session, String chequeNo, String chequeDate,
			String accountNo, String bankName, String bankBranch,
			String[] codes, String[] qtys, String[] amounts, String[] tscs,
			String[] vats, String[] totals, String[] remarks, String lineStatus) {

		PaymentCollectionDao paymentCollectionDao = (PaymentCollectionDao) Context
				.get().getBean("paymentCollectionDao");
		SequenceDao sequenceDao = (SequenceDao) Context.get().getBean(
				"sequenceDao");
		PayCashSaleDetailDao payCashSaleDetailDao = (PayCashSaleDetailDao) Context
				.get().getBean("payCashSaleDetailDao");

		if (payMode.equals("CSH")) {
			// System.out.println("cash");
			paymentCollectionDao.saveByCash(transNo, "", transType, srvNo,
					name, accNo, productId, receiptNo, payMode, 0, osAmt,
					billAmt, tscAmt, vatAmt, totalAmt, tenderAmt, returnAmt,
					supSeqNo, session, null, lineStatus,null,null);
		} else if (payMode.equals("CHQ")) {
			paymentCollectionDao.saveByCheque(transNo, "", transType, srvNo,
					name, accNo, productId, receiptNo, payMode, 0, osAmt,
					billAmt, tscAmt, vatAmt, totalAmt, tenderAmt, returnAmt,
					supSeqNo, session, chequeNo, chequeDate, accountNo,
					bankName, bankBranch, null, lineStatus,null,null);
		}

		sequenceDao.update(supSeqNo);
		for (int i = 0; i < codes.length; i++) {
			payCashSaleDetailDao.save(transNo, codes[i], qtys[i], amounts[i],
					tscs[i], vats[i], remarks[i], session);

		}

	}

	@Transactional
	public String receiptOrDeposit(String transNo, String transType,
			String srvNo, String name, String accNo, String productId,
			String receiptNo, String payMode, Integer resourceType,
			BigDecimal osAmt, BigDecimal billAmt, BigDecimal tscAmt,
			BigDecimal vatAmt, BigDecimal totalAmt, BigDecimal tenderAmt,
			BigDecimal returnAmt, Integer supSeqNo, HttpSession session,
			String chequeNo, String chequeDate, String accountNo,
			String bankName, String bankBranch, String soNbr, String lineStatus, Long errorCode, String errorDesc )
			throws SQLException {

		PaymentCollectionDao paymentCollectionDao = (PaymentCollectionDao) Context
				.get().getBean("paymentCollectionDao");
		SequenceDao sequenceDao = (SequenceDao) Context.get().getBean(
				"sequenceDao");
		try {

			if (payMode.equals("CSH")) {
				paymentCollectionDao.saveByCash(transNo, "", transType, srvNo,
						name, accNo, productId, receiptNo, payMode,
						resourceType, osAmt, billAmt, tscAmt, vatAmt, totalAmt,
						tenderAmt, returnAmt, supSeqNo, session, soNbr, lineStatus,errorCode,errorDesc);

			} else if (payMode.equals("CHQ")) {
				paymentCollectionDao.saveByCheque(transNo, "", transType,
						srvNo, name, accNo, productId, receiptNo, payMode,
						resourceType, osAmt, billAmt, tscAmt, vatAmt, totalAmt,
						tenderAmt, returnAmt, supSeqNo, session, chequeNo,
						chequeDate, accountNo, bankName, bankBranch, soNbr, lineStatus,errorCode,errorDesc);
			}

			sequenceDao.update(supSeqNo);
			return "success";

		} catch (Exception e) {
			return e.getCause().toString();
		}

	}

	@Transactional
	public void deposit(String transType, String srvNo, String accNo,
			String productId, String receiptNo, String payMode,
			BigDecimal osAmt, BigDecimal billAmt, BigDecimal tscAmt,
			BigDecimal vatAmt, BigDecimal totalAmt, BigDecimal tenderAmt,
			BigDecimal returnAmt, String supSeqNo, String ccCode,
			HttpSession session, String oprSeq, String chequeNo,
			String chequeDate, String accountNo, String bankName,
			String bankBranch, String lineStatus) {

		if (payMode.equals("cq")) {

		} else if (payMode.equals("cs")) {

		}

	}

	@Transactional
	public void receiptCash(String nepDate, String transType, String srvNo,
			String accNo, String productId, String receiptNo, String payMode,
			BigDecimal osAmt, BigDecimal billAmt, BigDecimal tscAmt,
			BigDecimal vatAmt, BigDecimal totalAmt, BigDecimal tenderAmt,
			BigDecimal returnAmt, String supSeqNo, String ccCode,
			HttpSession session, String oprSeq, String lineStatus) {

		UtilityDao utilityDao = (UtilityDao) Context.get()
				.getBean("utilityDao");
		BillingDao billingDao = (BillingDao) Context.get()
				.getBean("billingDao");
		PaymentCollectionDao paymentCollectionDao = (PaymentCollectionDao) Context
				.get().getBean("paymentCollectionDao");
		SequenceDao sequenceDao = (SequenceDao) Context.get().getBean(
				"sequenceDao");
		List list = sequenceDao.getByOprSeq(oprSeq);
		Map map = (Map) list.get(0);

		int seqVal = Integer.parseInt(map.get("SEQ_VAL").toString());
		int supSeq = Integer.parseInt(map.get("SUP_SEQ").toString());
		int noOfSeq = Integer.parseInt(map.get("NO_OF_SEQ").toString());
		if (seqVal != noOfSeq) {

			// paymentCollectionDao.save(nepDate,"PMTB",srvNo,accNo,productId,"receiptNo",payMode,osAmt,billAmt,tscAmt,vatAmt,totalAmt,tenderAmt,returnAmt,supSeqNo,ccCode,session);
			// sequenceDao.update(seqVal+1,supSeq+1,oprSeq);
			System.out.println("tilak**pass ");
		} else {
			System.out.println("Permission by supervisor is finished");
		}

	}

	@Transactional
	public void receiptCheque(String nepDate, String transType, String srvNo,
			String accNo, String productId, String receiptNo, String payMode,
			BigDecimal osAmt, BigDecimal billAmt, BigDecimal tscAmt,
			BigDecimal vatAmt, BigDecimal totalAmt, BigDecimal tenderAmt,
			BigDecimal returnAmt, String supSeqNo, String ccCode,
			HttpSession session, String oprSeq, String chequeNo,
			String chequeDate, String accountNo, String bankNo,
			String bankBranch, String lineStatus) {

		UtilityDao utilityDao = (UtilityDao) Context.get()
				.getBean("utilityDao");
		BillingDao billingDao = (BillingDao) Context.get()
				.getBean("billingDao");
		PaymentCollectionDao paymentCollectionDao = (PaymentCollectionDao) Context
				.get().getBean("paymentCollectionDao");
		SequenceDao sequenceDao = (SequenceDao) Context.get().getBean(
				"sequenceDao");
		List list = sequenceDao.getByOprSeq(oprSeq);
		Map map = (Map) list.get(0);

		int seqVal = Integer.parseInt(map.get("SEQ_VAL").toString());
		int supSeq = Integer.parseInt(map.get("SUP_SEQ").toString());
		int noOfSeq = Integer.parseInt(map.get("NO_OF_SEQ").toString());
		if (seqVal != noOfSeq) {

			// paymentCollectionDao.saveByCheque(nepDate,"PMTB",srvNo,accNo,productId,"receiptNo",payMode,osAmt,billAmt,tscAmt,vatAmt,totalAmt,
			// tenderAmt,returnAmt,supSeqNo,ccCode,session,chequeNo,chequeDate,accountNo,bankNo,bankBranch);
			// sequenceDao.update(seqVal+1,supSeq+1,oprSeq);
			System.out.println("tilak**pass ");
		} else {
			System.out.println("Permission by supervisor is finished");
		}

	}

	public void depositRefund(String transNo, String srvNo, String custName,
			String AccNo, BigDecimal depBal, BigDecimal refundAmt,
			String ccCode, String createdBy, String soNo, Integer resourceType) {
		// String user = session.getAttribute("username").toString();

		String sql = "INSERT INTO deposit_refund (trans_no, trans_dt, srv_no, cust_name,acc_no,dep_bal,refund_amt,cc_code,created_by,created_date,so_number,resource_type)"
				+ "VALUES (?,trunc(sysdate),?, ?, ?,?,?,?,?,SYSDATE,?,?)";
		this.update(sql, new Object[] { transNo, srvNo, custName, AccNo,
				depBal, refundAmt, ccCode, createdBy, soNo, resourceType });

	}

	@Override
	public void insertPaymentErrorLog(String srvNo,String transType, BigDecimal osAmt,
			BigDecimal billAmt, BigDecimal tsc, BigDecimal vat,
			BigDecimal totalAmt,
			String ccCode, String createdBy, String soNumber,
			String lineStatus, Long errorCode, String errDesc,
			String custName,BigDecimal tenderAmt,BigDecimal  retAmt,String  bankName,String  bankBranch,String  chequeDt,String  chequeNo,String payMode) {
		
		String sql = "INSERT INTO M_PAYMENT_ERROR_LOG (SRV_NO, trans_type, OS_AMT, BILL_AMT, " +
				"TSC_AMT,VAT_AMT,TOTAL_AMT,CC_CODE,CREATED_BY,SO_NUMBER,LINE_STATUS,error_code,error_desc,CUST_NAME,TENDER_AMT,RETURN_AMT,BANK_NAME,BANK_BRANCH,CHEQUE_DT,CHEQUE_NO,PAY_MODE ) " +
				"VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?, ?,?,?,?,?,cmmn1.to_ad(?),?,?    )";
		this.update(sql, new Object[] { srvNo,transType,osAmt,billAmt,tsc,vat,totalAmt,ccCode,createdBy,soNumber,lineStatus,errorCode,errDesc,
								custName,tenderAmt,retAmt,bankName,bankBranch,chequeDt,chequeNo,payMode});
	}
	
	@Override
	public boolean getTerminatedNumber(String srvNo) {
		String sql = "SELECT * FROM M_TERMINATE_LIST WHERE srv_no= ? and flag='Y'";
		List list=queryForList(sql, new Object[] { srvNo });
		if(list.isEmpty()){
			return false;
		}
		
		else{
			return true;
		}
		
	}
	
	@Override
	public void updateTerminateNo(String srvNo,String receiptNo, HttpSession session) {
		String user = session.getAttribute("username").toString();
		String sql = "UPDATE M_TERMINATE_LIST SET flag='N',updated_by=?,receipt_no=?  updated_date=SYSDATE WHERE srv_no=?";
		this.update(sql, new Object[] { user,receiptNo,srvNo});
	}
}
