
<%@page import="com.designco.ntbilling.util.FtpUtil"%>
<%@page import="com.designco.ntbilling.pojo.FtpInfo"%>
<%@page import="com.designco.ntbilling.util.Context"%>
<%@page import="com.designco.ntbilling.dao.UtilityDao"%>
<%@page import="com.ailk.openbilling.service.imsintf.QueryType"%>
<%@page import="com.ailk.openbilling.service.imsintf.SQueryParam"%>
<%@page import="com.ailk.openbilling.service.imsintf.QueryTypeList"%>
<%@page import="com.ailk.openbilling.service.imsintf.SOperInfo"%>
<%@page import="com.ailk.openbilling.service.imsintf.DoQueryResponse2"%>
<%@page import="com.ailk.openbilling.service.imsintf.IInfoMgntService"%>
<%
	try {
		UtilityDao utilityDao = (UtilityDao) Context.get().getBean(
				"utilityDao");

		String phoneNo = request.getParameter("phoneNo");
		String year = request.getParameter("year");
		String month = request.getParameter("month");

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

		DoQueryResponse2 first = info.getIInfoMgntService().doQuery(
				oper, qtl, qp);

		if (first.getErrorMsg().getResultCode() != 0) {
			session.setAttribute("err", first.getErrorMsg());
			response.sendRedirect("error.jsp");
			return;
		}
		
		FtpInfo finfo = (FtpInfo) Context.get().getBean("ftpInfo");
		FtpUtil ftp = new FtpUtil(finfo.getHost(), finfo.getUsername(), finfo.getPassword());
		
		String bill = ftp.getBillDetail(first.getAccount().getAcctId()+"", year, month);
		bill += "<script>window.print();</script>";
		out.write(bill);
	} catch (Exception ex) {
		session.setAttribute("ex", ex);
		response.sendRedirect("error.jsp");
		return;
	}
%>