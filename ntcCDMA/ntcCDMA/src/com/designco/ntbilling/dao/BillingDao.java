package com.designco.ntbilling.dao;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpSession;

public interface BillingDao {

	public void cashSale(String transNo, String transType, String srvNo,
			String name, String accNo, String productId, String receiptNo,
			String payMode, BigDecimal osAmt, BigDecimal billAmt,
			BigDecimal tscAmt, BigDecimal vatAmt, BigDecimal totalAmt,
			BigDecimal tenderAmt, BigDecimal returnAmt, Integer supSeqNo,
			HttpSession session, String chequeNo, String chequeDate,
			String accountNo, String bankName, String bankBranch,
			String[] codes, String[] qtys, String[] amounts, String[] tscs,
			String[] vats, String[] totals, String[] remarks, String lineStatus);

	public String receiptOrDeposit(String transNo, String transType,
			String srvNo, String name, String accNo, String productId,
			String receiptNo, String payMode, Integer resourceType,
			BigDecimal osAmt, BigDecimal billAmt, BigDecimal tscAmt,
			BigDecimal vatAmt, BigDecimal totalAmt, BigDecimal tenderAmt,
			BigDecimal returnAmt, Integer supSeqNo, HttpSession session,
			String chequeNo, String chequeDate, String accountNo,
			String bankName, String bankBranch, String soNbr, String lineStatus ,Long errorCode, String errorDesc)
			throws SQLException;

	public void receiptCash(String nepDate, String transType, String srvNo,
			String accNo, String productId, String receiptNo, String payMode,
			BigDecimal osAmt, BigDecimal billAmt, BigDecimal tscAmt,
			BigDecimal vatAmt, BigDecimal totalAmt, BigDecimal tenderAmt,
			BigDecimal returnAmt, String supSeqNo, String ccCode,
			HttpSession session, String oprSeq, String lineStatus);

	public void receiptCheque(String nepDate, String transType, String srvNo,
			String accNo, String productId, String receiptNo, String payMode,
			BigDecimal osAmt, BigDecimal billAmt, BigDecimal tscAmt,
			BigDecimal vatAmt, BigDecimal totalAmt, BigDecimal tenderAmt,
			BigDecimal returnAmt, String supSeqNo, String ccCode,
			HttpSession session, String oprSeq, String chequeNo,
			String chequeDate, String accountNo, String bankNo,
			String bankBranch, String lineStatus);

	public void depositRefund(String transNo, String srvNo, String custName,
			String AccNo, BigDecimal depBal, BigDecimal refundAmt,
			String ccCode, String createdBy, String soNo, Integer resourceType);
	
	public void insertPaymentErrorLog(String srvNo,String transType, BigDecimal osAmt,
			BigDecimal billAmt, BigDecimal tsc, BigDecimal vat,
			BigDecimal totalAmt,
			String ccCode, String createdBy, String soNumber,
			String lineStatus, Long errorCode, String errDesc,
			String custName,BigDecimal tenderAmt,BigDecimal  retAmt,String  bankName,String  bankBranch,String  chequeDt,String  chequeNo,String payMode);
	
	public boolean getTerminatedNumber(String srvNo);
	
	public void updateTerminateNo(String srvNo,String receiptNo, HttpSession session);

}
