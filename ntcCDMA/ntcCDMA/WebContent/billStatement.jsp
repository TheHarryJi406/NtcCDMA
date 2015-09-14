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
<title>Bill Query</title>
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
<div id="wraper">
<h5 align="right"><%@include file="includes/user.jsp"%></h5>
<%

	SequenceDao sequenceDao = (SequenceDao) Context.get().getBean("sequenceDao");
	UtilityDao utilityDao = (UtilityDao) Context.get().getBean("utilityDao");
	
	String phoneNo = "";
	
	if (request.getParameter("phoneNo") != null) {
		phoneNo = request.getParameter("phoneNo");
	}
%>

<table width="100%">
	<tr>
		<td colspan="2"><%@include file="includes/header.jsp"%></td>
	</tr>
	<tr>
		<td valign="top" width="200px" ><%@include file="includes/leftmenu.jsp"%></td>
		<td valign="top" align="left">
		<h2>Bill Statement</h2>
		
		<br>
		<script>
		$(document).ready(function(){
			$("#billQuery").click(function(){
				var pno = $("#phoneNo").val();
				var year = $("#year").val();
				var month = $("#month").val();
				
				var url = "billStatement2.jsp?phoneNo="+pno+"&year="+year+"&month="+month;
				window.open(url);
			});
		});
		</script>
		<table width="100%" class="xform">
			<tr>
				<td width="150px">Phone No.</td>
				<td><input type="text" name="phoneNo" id="phoneNo" value="<%=phoneNo %>" /></td>
			</tr>
			<tr>
				<td width="150px">Year</td>
				<td><input type="text" name="year" id="year" value="<%=utilityDao.getYear() %>" /></td>
			</tr>
			<tr>
				<td width="150px">Month</td>
				<td><%
				String month = request.getParameter("month");
				month = month == null ? utilityDao.getMonth() : month; %>
				<select name="month" style="width: 150px;" id="month">
				<option value="01" <%if (month.equals("01")) {out.write("selected");	}%>>January</option>
				<option value="02" <%if (month.equals("02")) {out.write("selected");	}%>>February</option>
				<option value="03" <%if (month.equals("03")) {out.write("selected");	}%>>March</option>
				<option value="04" <%if (month.equals("04")) {out.write("selected");	}%>>April</option>
				<option value="05" <%if (month.equals("05")) {out.write("selected");	}%>>May</option>
				<option value="06" <%if (month.equals("06")) {out.write("selected");	}%>>June</option>
				<option value="07" <%if (month.equals("07")) {out.write("selected");	}%>>July</option>
				<option value="08" <%if (month.equals("08")) {out.write("selected");	}%>>August</option>
				<option value="09" <%if (month.equals("09")) {out.write("selected");	}%>>September</option>
				<option value="10" <%if (month.equals("10")) {out.write("selected");	}%>>October</option>
				<option value="11" <%if (month.equals("11")) {out.write("selected");	}%>>November</option>
				<option value="12" <%if (month.equals("12")) {out.write("selected");	}%>>December</option>
				</select>
<%-- 				<input type="text" name="month" id="month" value="<%=utilityDao.getMonth() %>" /></td> --%>
			</tr>
			<tr>
				<td></td>
				<td><input type="button" value="Query" id="billQuery" /></td>
			</tr>
		</table>

		</td>
	</tr>
	<tr>
		<td colspan="2"><%@include file="includes/footer.jsp"%></td>
	</tr>
</table>

</div>
</body>
</html>