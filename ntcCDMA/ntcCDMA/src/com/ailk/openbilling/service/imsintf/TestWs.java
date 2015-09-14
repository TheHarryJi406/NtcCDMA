package com.ailk.openbilling.service.imsintf;

public class TestWs {
	public TestWs() {
		IInfoMgntService info = new IInfoMgntService();

		SOperInfo oper = new SOperInfo();
		oper.setSoNbr("201201011111113");
		oper.setBusiCode(6023);
		oper.setSoMode((short) 1);
		oper.setSoDate("2012-11-29 14:00:00");
		oper.setChargeFlag((short) 1);
		/*
		 * oper.setIsnormal((short) 0); oper.setOpId(12211L);
		 * oper.setProvCode((short) 1); oper.setRegionCode((short) 1);
		 * oper.setCountyCode((short) 1); oper.setOrgId(12);
		 * oper.setRsoNbr("1"); oper.setIsMonitor((short) 0);
		 */
		oper.setRemark("");

		QueryTypeList qtl = new QueryTypeList();
		qtl.getQueryTypeItem().add(new QueryType() {
			{
				setQueryType((short) 1);
			}
		});

		SQueryParam qp = new SQueryParam();
		// qp.setAcctId(117084L);
		// qp.setUserId(117084L);
		qp.setPhoneId("9820121202");

		SPaymentReq pay = new SPaymentReq();
		pay.setPaymentChannel((short) 1);
		pay.setPaymentType((short) 2);
		pay.setOrderType((short) 0);

		PaymentInfo pi = new PaymentInfo();
		pi.setPhoneId("9820121202");
		pi.setPayType((short) 1);
		
//		pi.getPaymentList().getPaymentItemItem().add(new PaymentItem(){{}});

//		pay.setPaymentInfo(pi);

		//DoPaymentAndBillAdjustResponse2 res = info.getIInfoMgntService()
			//	.doPaymentAndBillAdjust(oper, pay);
		
		
		DoQueryResponse2 qres = info.getIInfoMgntService().doQuery(oper, qtl,
				qp);
		
		for (SBalance sb : qres.getBalance().getSBalanceListItem()) {
			System.out.println(sb.getAmount());
		}
		

	}

	public static void main(String[] args) {
		new TestWs();
	}
}
