package com.designco.ntbilling.util;

import java.math.BigDecimal;

import org.springframework.transaction.support.ResourceTransactionManager;

import com.ailk.openbilling.service.imsintf.CancelPaymentInfo;
import com.ailk.openbilling.service.imsintf.DoCancelPaymentResponse2;
import com.ailk.openbilling.service.imsintf.DoPaymentAndBillAdjustResponse2;
import com.ailk.openbilling.service.imsintf.DoQueryResponse2;
import com.ailk.openbilling.service.imsintf.DoSMngDepositResponse;
import com.ailk.openbilling.service.imsintf.DoSMngQueryDepositResponse;
import com.ailk.openbilling.service.imsintf.IInfoMgntService;
import com.ailk.openbilling.service.imsintf.PaymentInfo;
import com.ailk.openbilling.service.imsintf.PaymentItem;
import com.ailk.openbilling.service.imsintf.PaymentItemList;
import com.ailk.openbilling.service.imsintf.QueryType;
import com.ailk.openbilling.service.imsintf.QueryTypeList;
import com.ailk.openbilling.service.imsintf.SDeposit;
import com.ailk.openbilling.service.imsintf.SDepositOper;
import com.ailk.openbilling.service.imsintf.SMngDepositReq;
import com.ailk.openbilling.service.imsintf.SMngQueryDepositReq;
import com.ailk.openbilling.service.imsintf.SOperInfo;
import com.ailk.openbilling.service.imsintf.SPaymentReq;
import com.ailk.openbilling.service.imsintf.SQueryParam;
import com.designco.ntbilling.dao.UtilityDao;

public class Wsutil {

	public DoQueryResponse2 getCustomerInfo(String phoneNo) {
		UtilityDao utilityDao = (UtilityDao) Context.get()
				.getBean("utilityDao");
		IInfoMgntService info = new IInfoMgntService();
		SOperInfo oper = new SOperInfo();

		oper.setSoNbr(utilityDao.getTimeForWs());
		oper.setBusiCode(6023);
		oper.setSoMode((short) 1);
		oper.setChargeFlag((short) 1);
		oper.setRemark("");

		QueryTypeList qtl = new QueryTypeList();
		QueryType qt = new QueryType();
		qt.setQueryType((short) 1);
		qtl.getQueryTypeItem().add(qt);

		SQueryParam qp = new SQueryParam();
		qp.setPhoneId(phoneNo);

		DoQueryResponse2 first = info.getIInfoMgntService().doQuery(oper, qtl,
				qp);
		return first;
	}

	public DoQueryResponse2 getBillInfo(String phoneNo) {
		UtilityDao utilityDao = (UtilityDao) Context.get()
				.getBean("utilityDao");
		IInfoMgntService info = new IInfoMgntService();
		SOperInfo oper = new SOperInfo();

		oper.setSoNbr(utilityDao.getTimeForWs());
		oper.setBusiCode(6023);
		oper.setSoMode((short) 1);
		oper.setChargeFlag((short) 1);
		oper.setRemark("");

		oper.setSoNbr(utilityDao.getTimeForWs());

		QueryTypeList qtl = new QueryTypeList();
		QueryType qt = new QueryType();
		qt.setQueryType((short) 26);
		qtl.getQueryTypeItem().add(qt);

		SQueryParam qp = new SQueryParam();
		qp.setPhoneId(phoneNo);

		DoQueryResponse2 second = info.getIInfoMgntService().doQuery(oper, qtl,
				qp);

		return second;
	}

	public DoPaymentAndBillAdjustResponse2 doPayment(String phoneNo, String invoiceNumber, BigDecimal amount, String soNbr){
		UtilityDao utilityDao = (UtilityDao) Context.get()
				.getBean("utilityDao");
		IInfoMgntService info = new IInfoMgntService();
		
		SOperInfo oper = new SOperInfo();
		oper.setSoNbr(soNbr);
		oper.setBusiCode(3007);
		oper.setSoMode((short) 1);
		oper.setChargeFlag((short) 1);
//		oper.setRemark("");
		
		SPaymentReq req = new SPaymentReq();
		req.setPaymentChannel((short) 1);
		req.setPaymentType((short) 2);
		req.setOrderType((short) 0);
		
		PaymentInfo pi = new PaymentInfo();
		pi.setPhoneId(phoneNo);
		pi.setPayType((short) 0);
		pi.setCurrency((short) 11301);
		PaymentItem item = new PaymentItem();
//		item.setAmount(100l);
		Long amt = amount.multiply(new BigDecimal(100)).longValue();
		item.setAmount(amt);
		PaymentItemList pitemList = new PaymentItemList();
		pitemList.getPaymentItemItem().add(item);

		pi.setPaymentList(pitemList);
		
		req.setPaymentInfo(pi);
		
		
		DoPaymentAndBillAdjustResponse2 third = info.getIInfoMgntService().doPaymentAndBillAdjust(oper, req);

		return third;
		
	}
	
	public DoCancelPaymentResponse2  doCancel(Long oldSoNbr){
		UtilityDao utilityDao = (UtilityDao) Context.get()
				.getBean("utilityDao");
		
		IInfoMgntService info = new IInfoMgntService();
		SOperInfo oper = new SOperInfo();

		oper.setSoNbr(utilityDao.getTimeForWs());
		oper.setBusiCode(2003);
		oper.setSoMode((short) 1);
		oper.setChargeFlag((short) 1);
		oper.setRemark("");

		CancelPaymentInfo cpi = new CancelPaymentInfo();
		cpi.setOrignSoNbr(oldSoNbr);
		cpi.setCancelDate(utilityDao.getDateAndTime());
		cpi.setRemark("");

		DoCancelPaymentResponse2 doCancelPaymentResponse2	=	info.getIInfoMgntService().doCancelPayment(oper, cpi);
		return doCancelPaymentResponse2;
	}
	
	public DoSMngDepositResponse doDeposit(String phoneNo, Double amount,int resourceType ){
		UtilityDao utilityDao = (UtilityDao) Context.get()
				.getBean("utilityDao");
		IInfoMgntService info = new IInfoMgntService();
		SOperInfo oper = new SOperInfo();

		oper.setSoNbr(utilityDao.getTimeForWs());
		oper.setBusiCode(1068);
		oper.setSoMode((short) 1);
		oper.setChargeFlag((short) 1);
		oper.setRemark("");

		
		SMngDepositReq req = new SMngDepositReq();
		req.setPhoneId(phoneNo);
		req.setResourceType(resourceType);
		SDepositOper depOper = new SDepositOper();
		req.setSDepositOper(depOper);

		depOper.setOperType((short)0);

		SDeposit deposit = new SDeposit();
		depOper.setSDeposit(deposit);

		deposit.setAmount(amount);
		deposit.setMeasureId(11301);
		deposit.setValidDate(utilityDao.getDateAndTime());
		deposit.setExpireDate(utilityDao.getDateAndTime200());
		deposit.setBookItem(302000000);//this is cash
		DoSMngDepositResponse resp = info.getIInfoMgntService().doManageDeposit(oper, req);
		return resp;
	}
	
	public DoSMngQueryDepositResponse  doDepositQuery(){
		
		UtilityDao utilityDao = (UtilityDao) Context.get().getBean("utilityDao");
		IInfoMgntService info = new IInfoMgntService();
		SOperInfo oper = new SOperInfo();

		oper.setSoNbr(utilityDao.getTimeForWs());
		oper.setBusiCode(1069);
		oper.setSoMode((short) 1);
		oper.setSoDate(utilityDao.getSoDate());
		oper.setChargeFlag((short) 1);
		oper.setRegionCode((short)0);
		oper.setCountyCode((short)1);
		
		
		
		SMngQueryDepositReq req=new SMngQueryDepositReq();
		req.setOuterAcctId("234234");
		req.setValidDate(utilityDao.getDateAndTime());
		req.setExpireDate(utilityDao.getDateAndTime200());
		
		DoSMngQueryDepositResponse resp = 	info.getIInfoMgntService().doQueryDeposit(oper, req);
		return resp;

	}
	
	public static String getCustomerStatusByJptCode(short code) {
		if (code == 1000)
			return "Idle/Initial";
		else if (code == 1001)
			return "Active";
		else if (code == 1002)
			return "Suspend-request";
		else if (code == 1003)
			return "Suspend Debt";
		else if (code == 1004)
			return "Suspend Fraud";
		else if (code == 1005)
			return "SuspendCreditLimit";
		else if (code == 1006)
			return "Suspend-2-way";
		else if (code == 1007)
			return "Frozen";
		else if (code == 1008)
			return "Terminate";
		else if (code == 1009)
			return "Pool";
		else if (code == 1010)
			return "Pre-Terminal";
		else if (code == 1011)
			return "Suspend-1-way";
		return "";
	}
}

