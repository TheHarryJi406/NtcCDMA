package com.designco.ntbilling.util;

import com.ailk.openbilling.service.imsintf.DoQueryResponse2;
import com.ailk.openbilling.service.imsintf.DoSMngDepositResponse;
import com.ailk.openbilling.service.imsintf.DoSMngQueryDepositResponse;
import com.ailk.openbilling.service.imsintf.IInfoMgntService;
import com.ailk.openbilling.service.imsintf.QueryType;
import com.ailk.openbilling.service.imsintf.QueryTypeList;
import com.ailk.openbilling.service.imsintf.SDeposit;
import com.ailk.openbilling.service.imsintf.SDepositOper;
import com.ailk.openbilling.service.imsintf.SMngDepositReq;
import com.ailk.openbilling.service.imsintf.SMngQueryDepositReq;
import com.ailk.openbilling.service.imsintf.SOperInfo;
import com.ailk.openbilling.service.imsintf.SQueryParam;
import com.designco.ntbilling.dao.UtilityDao;

public class trial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String phoneNo="16221829";
		
		
		UtilityDao utilityDao = (UtilityDao) Context.get().getBean("utilityDao");
		IInfoMgntService info = new IInfoMgntService();
		SOperInfo oper = new SOperInfo();
		Wsutil wsUtil=new Wsutil();
		
		DoQueryResponse2 first = wsUtil.getCustomerInfo(phoneNo);
		
		Long AccountNo=first.getAccount().getAcctId();

		
		oper.setSoNbr(utilityDao.getTimeForWs());
		oper.setBusiCode(1069);
		oper.setSoMode((short) 1);
		oper.setSoDate(utilityDao.getSoDate());
		oper.setChargeFlag((short) 1);
		oper.setRegionCode((short)0);
		oper.setCountyCode((short)1);
		
		
		
		SMngQueryDepositReq req=new SMngQueryDepositReq();
		req.setOuterAcctId("AccountNo");
		req.setValidDate(utilityDao.getDateAndTime());
		req.setExpireDate(utilityDao.getDateAndTime200());
		
		DoSMngQueryDepositResponse resp = 	info.getIInfoMgntService().doQueryDeposit(oper, req);
		
					

	}

}
