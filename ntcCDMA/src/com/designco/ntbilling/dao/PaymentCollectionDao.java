package com.designco.ntbilling.dao;

import java.math.BigDecimal;
import java.util.List;

import javax.servlet.http.HttpSession;

public interface PaymentCollectionDao {
	public void saveByCash(String transNo,String nepDate,String transType,String srvNo,String srvName,String accNo,String productId,String receiptNo,String payMode,
			Integer resourceType, BigDecimal osAmt,BigDecimal billAmt,BigDecimal tscAmt,BigDecimal vatAmt,BigDecimal totalAmt,
			BigDecimal tenderAmt,BigDecimal returnAmt,Integer supSeqNo,HttpSession session,String soNbr, String lineStatus ,Long errorCode, String errorDesc);
	
	public void saveByCheque(String transNo,String nepDate,String transType,String srvNo,String srvName,String accNo,String productId,String receiptNo,String payMode,
			Integer resourceType, BigDecimal osAmt,BigDecimal billAmt,BigDecimal tscAmt,BigDecimal vatAmt,BigDecimal totalAmt,
			BigDecimal tenderAmt,BigDecimal returnAmt,Integer supSeqNo,HttpSession session,String chequeNo,String chequeDate,
			String accountNo,String bankName,String bankBranch,String soNbr, String lineStatus,Long errorCode, String errorDesc);
	
	public List getallBetweenDates(String srvNo,String accNo,String fromDate,String toDate);
	public String getReceiptSequence();
	public String getRefundSequence();
	public String getTransSequence();
	public List getCancelledTransaction();
	public List getCancelledTransactionByServiceId(String x) ;
	public List getCancelledTransactionByReceiptNo(Integer x); 
	public List getTransactionWithoutPostedAndCancelled(String srvNo) ;
	public void updateForCancellation(String receiptNo,String cancelSoNumber, HttpSession session);
	public List getTransactionByServiceNoWithoutCancelled(String srvNo);
	public List getTransactionByServiceNoWithoutCancelledTodaysOnly(String srvNo, String ccCode);
	public List getTransactionByReceiptNO(String receiptNo) ;
	public List getTransactionByTransNO(String transNo);
	public void updatePrintCount(String receiptNo);
	public List getTransactionBySystemDate();
}
