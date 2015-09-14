<%@page import="com.ailk.openbilling.service.imsintf.SPocket"%>
<%@page import="com.ailk.openbilling.service.imsintf.DoSMngQueryDepositResponse"%>
<%@page import="com.ailk.openbilling.service.imsintf.SMngQueryDepositReq"%>
<%@page import="com.ailk.openbilling.service.imsintf.PaymentItemList"%>
<%@page import="com.ailk.openbilling.service.imsintf.DoPaymentAndBillAdjustResponse2"%>
<%@page import="com.ailk.openbilling.service.imsintf.PaymentItem"%>
<%@page import="com.ailk.openbilling.service.imsintf.PaymentInfo"%>
<%@page import="com.ailk.openbilling.service.imsintf.SPaymentReq"%>
<%@page import="com.ailk.openbilling.service.imsintf.Billinfo"%>
<%@page import="com.ailk.openbilling.service.imsintf.BillinfoList"%>
<%@page import="com.ailk.openbilling.service.imsintf.SBalance"%>
<%@page import="com.ailk.openbilling.service.imsintf.QueryType"%>
<%@page import="com.ailk.openbilling.service.imsintf.SQueryParam"%>
<%@page import="com.ailk.openbilling.service.imsintf.QueryTypeList"%>
<%@page import="com.ailk.openbilling.service.imsintf.SOperInfo"%>
<%@page import="com.ailk.openbilling.service.imsintf.DoQueryResponse2"%>
<%@page import="com.ailk.openbilling.service.imsintf.IInfoMgntService"%>
<%@page import="java.math.BigDecimal"%>
<%@page import="java.util.Map"%>
<%@include file="checkUser.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.designco.ntbilling.dao.*"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%><html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Deposit Query</title>
<link href="css/jquery.autocomplete.css" rel="stylesheet"
	type="text/css" />
<link href="css/style.css" rel="stylesheet" type="text/css" />
<link href="css/style-ntc.css" rel="stylesheet" type="text/css" />
	
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/jquery.validate.js"></script>
<link rel="stylesheet" href="print.css" type="text/css" media="print" />
<script type="text/javascript" src="js/jquery.autocomplete.js"></script>
<script src="js/check.js"></script>

</head>
<body>
<div id="loadingDiv"><img src="images/loading image.gif" alt="" /></div>

<div id="wraper">
<h5 align="right"><%@include file="includes/user.jsp"%></h5>
<%
String pageName = "depositQuery.jsp";
String collCen = session.getAttribute("ccCode").toString();
String userId = session.getAttribute("username").toString();
MenuAccessDao menuAccessDao= (MenuAccessDao) Context.get().getBean("menuAccessDao");

if (menuAccessDao.checkMenuAccessForUser(userId, pageName)==false) {
	response.sendRedirect("index.jsp");
	return;
}


	SequenceDao sequenceDao = (SequenceDao) Context.get().getBean("sequenceDao");
	UtilityDao utilityDao = (UtilityDao) Context.get().getBean("utilityDao");
	
	String phoneNo = "";
	
	if (request.getParameter("phoneNo") != null) {
		phoneNo = request.getParameter("phoneNo");
	}
%>
<script>
$(document).ready(function() {
	$("#form1").submit(function() {
		$("#loadingDiv").show();
	});
});
</script>
<table width="100%">
	<tr>
		<td colspan="2"><%@include file="includes/header.jsp"%></td>
	</tr>
	<tr>
		<td valign="top" width="200px" ><%@include file="includes/leftmenu.jsp"%></td>
		<td valign="top" align="left">
		<h2>Deposit Query</h2>
		
		<br>
		<form id="form1" action="" method="post">
		<table width="100%" class="xform">
			<tr>
				<td width="150px">Phone No.</td>
				<td><input type="text" name="phoneNo" value="<%=phoneNo %>" /></td>
			</tr>
			<%
			if (!phoneNo.isEmpty())
			{
			%>
			<tr>
			<td colspan="1">Total Deposit</td>
			<%	
			BigDecimal amt = null;
			try {
				IInfoMgntService info = new IInfoMgntService();
				SOperInfo oper = new SOperInfo();
				
				oper.setSoNbr(utilityDao.getTimeForWs());
				oper.setBusiCode(1069);
				oper.setSoMode((short) 1);
				oper.setChargeFlag((short) 1);
				oper.setRemark("");
				
				SMngQueryDepositReq req = new SMngQueryDepositReq();
				req.setValidDate(utilityDao.getSoDate());
				req.setExpireDate(utilityDao.getSoDate());
				req.setPhoneId(phoneNo);
				
				DoSMngQueryDepositResponse resp = info.getIInfoMgntService().doQueryDeposit(oper, req);
				
// 				System.out.println(resp);
				
				if (resp.getErrorMsg().getResultCode() != 0) {
					session.setAttribute("err", resp.getErrorMsg());
					response.sendRedirect("error.jsp");
					return;
				}
				
				BigDecimal tmp = BigDecimal.ZERO;
				
				int counter=0;
				for (SPocket sp : resp.getPocketList().getSPocketList()) {
					if (sp.getPhoneId().equals(phoneNo)) {
						
						if (resp.getPocketList().getSPocketList().get(counter).getPocketItem()==302000000){
							
							Long l = resp.getPocketList().getSPocketList().get(counter).getAmount();
// 							System.out.println( "deposit :" +l);
// 							System.out.println( "pocket item :" +resp.getPocketList().getSPocketList().get(counter).getPocketItem());
							tmp = tmp.add(new BigDecimal(l/100));
							
						}
						counter++;
					}
				}
				
				amt = tmp;
				
			} catch (Exception ex) {
				session.setAttribute("ex", ex);
				response.sendRedirect("error.jsp");
				return;
			}
			%><td><%=amt %>
			</td>
			</tr>
			<%
			}
			%>
			<tr>
				<td></td>
				<td><input type="submit" value="Query" name="billQuery" /></td>
			</tr>
		</table>
		</form>

		</td>
	</tr>
	<tr>
		<td colspan="2"><%@include file="includes/footer.jsp"%></td>
	</tr>
</table>

</div>
</body>
</html>