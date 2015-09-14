
<%@page import="java.text.DecimalFormat"%>
<%@page import="java.text.NumberFormat"%>
<%@page import="com.designco.ntbilling.dao.PaymentCollectionDao"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@page import="com.designco.ntbilling.dao.TempDao"%>
<%@include file="checkUser.jsp"%>
<%
String pageName = "paymentCollection.jsp";
String collCen = session.getAttribute("ccCode").toString();
String userId = session.getAttribute("username").toString();
MenuAccessDao menuAccessDao= (MenuAccessDao) Context.get().getBean("menuAccessDao");

DecimalFormat df = new DecimalFormat("#,###,##0.00");

if (menuAccessDao.checkMenuAccessForUser(userId, pageName)==false) {
	response.sendRedirect("index.jsp");
	return;
}
 PaymentCollectionDao paymentCollectionDao= (PaymentCollectionDao) Context.get().getBean("paymentCollectionDao");
%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Payment Collection</title>
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
<script>
$(document).ready( function() {
	// get only input tags with class data-entry
	textboxes = $("input");
	//alert(textboxes.length);
	// now we check to see which browser is being used
	if ($.browser.mozilla) {
	$(textboxes).keypress (checkForEnter);
	} else {
	$(textboxes).keydown (checkForEnter);
	}
	});
	function checkForEnter (event) {
	if (event.keyCode == 13) {
	currentBoxNumber = textboxes.index(this);
	if (textboxes[currentBoxNumber + 1] != null) {
	nextBox = textboxes[currentBoxNumber + 1]
	nextBox.focus();
	nextBox.select();
	event.preventDefault();
	return false;
	}
	}
	}
</script>

<div id="wraper">
<%@include file="includes/header.jsp"%>


<script>
$(document).ready(function() {
// 	document.getElementById("check1").checked=true
	$("a.cancel").click(function(e){
		if (confirm("Are you sure you want to cancel?")) {
			return true;
		}
		return false;
	});
});
</script>
<table width="100%">


	
	<tr>
		<td valign="top" width="200px"><%@include
			file="includes/leftmenu.jsp"%></td>
		<td valign="top" align="left"><br />
		<br />
		<div>
			<%
			String tempSrvNo= request.getParameter("tempSrvNo");
			tempSrvNo = tempSrvNo==null ? "" : tempSrvNo;
			%>		
			<table class="xform">
			<tr><h2>Payment Query</h2></tr><br>
			<tr><td>
				<form action="" method="post">
				Service No. <input  type="text" value="<%=tempSrvNo%>" name="tempSrvNo" onchange="this.form.submit();">
					<input type="submit" name="btn" value=Query> </form>
			</td></tr>	
			</table><br>
			
			<h3> Transaction</h3>
			 
			<table width="98%" class="color xform">
				<tr>
					<th>S.No.</th>
					<th>Service No</th>
<!-- 					<th>Product ID</th> -->
					<th>Trans Type</th>
					<th>Date</th>
					<th>Receipt No.</th>
					<th>Pay Mode</th>
					<th>Bill Amt</th>
					<th>TSC</th>
					<th>VAT</th>
					<th >Total Amt</th>
				</tr>
				<%
				int i = 0;
				List<Map> lists = paymentCollectionDao.getTransactionByServiceNoWithoutCancelled(tempSrvNo);
				for (Map m : lists)
				{
// 					String code = m.get("REGION_CODE").toString();
					String receipt_no = m.get("RECEIPT_NO").toString();
					i++;
				%>
				
					<tr onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';" style="background-color: #d4e3e5;">	
					<td><%=i %></td>
					<td><%=m.get("SRV_NO") %></td>
<%-- 					<td><%=m.get("PRODUCT_ID") %></td> --%>
					<td><%=m.get("TRANS_TYPE") %></td>
					<td><%=m.get("TRANS_DT") %></td>
					<td><%=m.get("RECEIPT_NO") %></td>
					<td><%=m.get("PAY_MODE") %></td>
					<td><%=df.format(m.get("BILL_AMT")) %></td>
					<td><% if(m.get("TSC_AMT")==null){ out.write( df.format(0));}else{%><%= df.format(m.get("TSC_AMT")) %><%}%></td>
					<td><% if(m.get("VAT_AMT")==null){ out.write( df.format(0));}else{%><%= df.format(m.get("VAT_AMT"))%><%}%></td>
					<td><%=df.format(m.get("TOTAL_AMT")) %></td>
				</tr>
				<%
				}
				%>
			</table>
			</form>
			</div>
		
		</div>
		</td>
	</tr>
	<tr>
		<td colspan="2"><%@include file="includes/footer.jsp"%></td>
	</tr>
</table>
</div>

</body>
</html>