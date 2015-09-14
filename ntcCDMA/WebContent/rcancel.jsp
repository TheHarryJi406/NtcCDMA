

<%@page import="com.designco.ntbilling.dao.PaymentCollectionDao"%>
<%@page import="com.designco.ntbilling.dao.ItemDao"%>
<%@page import="com.designco.ntbilling.dao.RegionDao"%>
<%@page import="com.designco.ntbilling.dao.AccCenterDao"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@include file="checkUser.jsp" %>

<%
String message="";
String srvNo="";
String accNo="";
String fromDate="";
String toDate="";

PaymentCollectionDao paymentCollectionDao=(PaymentCollectionDao)Context.get().getBean("paymentCollectionDao");
String mode = request.getParameter("mode");
mode = mode==null ? "" : mode;


%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Nepal Telecom </title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<link href="css/style-ntc.css" rel="stylesheet" type="text/css" />

<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/jquery.validate.js"></script>
<script type="text/javascript" src="js/jquery.autocomplete.js"></script>
<script src="js/check.js"></script>


</head>
<body>
<div id="loadingDiv"><img src="images/loading image.gif" alt="" /></div>
<div id="wraper">
<%@include file="includes/header.jsp"%>

<script>
$(document).ready( function() {
	$("#form1").submit(function(){
		$("#loadingDiv").show();
	});
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

<script type="text/javascript">

function deleteRow(tableID) {
    try {
    var table = document.getElementById(tableID);
    var rowCount = table.rows.length;

    for(var i=0; i<rowCount; i++) {
        var row = table.rows[i];
        var chkbox = row.cells[0].childNodes[0];
        var receiptNo=row.cells[3].childNodes[0];
        if(null != chkbox && true == chkbox.checked) {
            table.deleteRow(i);
            rowCount--;
            i--;
        }


    }
    }catch(e) {
        alert(e);
    }
}


</script>

<table width="100%">

<tr>
<td valign="top" width="200px"  ><%@include file="includes/leftmenu.jsp" %></td>
<td valign="top" align="left">
Nepal Telecom Web Based Billing
<br/><br/>
<div align="center"><%=message %></div>

<br/>
<div align="left">
<form action="cancellation.jsp" method="post" id="form1">
<table>
<tr>
<td>Service No:</td>
<td><input type="text" name="srvNo" id="srvNo" value="<%=srvNo%>"></td> 
</tr>
<tr>
<td>Account No:</td>
<td><input type="text" name="accountNo" id="accountNo" value="<%=accNo%>"></td> 
</tr>
<tr>
<td>From Date:</td>
<td><input type="text" name="fromDate" id="fromDate" value="<%=fromDate%>"></td> 
</tr>
<tr>
<td>To Date:</td>
<td><input type="text" name="toDate" id="toDate" value="<%=toDate%>"></td> 
</tr>

<tr>
<td><input type="submit" name="go" value="go" style="width: 30px;" ></td>
</tr>
</table>
</form>
</div>
<%
if(request.getParameter("go")!=null){
	 srvNo=request.getParameter("srvNo");
	accNo=request.getParameter("accountNo");
	fromDate=request.getParameter("fromDate");
	toDate=request.getParameter("toDate");
%>
<form action="" method="post">
<table name="payCollTable" id="payCollTable">
<tr>
<td></td>
<td>Transaction Type</td>
<td>Service No.</td>
<td>Account No.</td>
<td>Receipt No.</td>
<td>Bill Amt</td>
<td>TSC Amt</td> 
<td>VAT</td>
<td>Total Amt</td>
</tr>
<%
List<Map> lst=paymentCollectionDao.getallBetweenDates(srvNo,accNo,fromDate,toDate);
int cnt=0;
for(Map m:lst){
	
%>
<tr>
<td><input type="checkbox" name="check" id="check<%=cnt%>" ></td> 
<td><input type="text" name="transactionType" id="transactionType<%=cnt%>" style="width: 50px;" value="<%=m.get("TRANS_TYPE")%>" ></td>
<td><input type="text" name="serviceNo" id="serviceNo<%=cnt%>" style="width: 70px;" value="<%=m.get("SRV_NO")%>" readonly="readonly"></td>
<td><input type="text" name="accountNo" id="accountNo<%=cnt%>" style="width: 70px;" value="<%=m.get("ACC_NO")%>" readonly="readonly"></td>
<td><input type="text" name="receiptNo" id="receiptNo<%=cnt%>" style="width: 70px;" value="<%=m.get("RECEIPT_NO")%>" readonly="readonly"></td>
<td><input type="text" name="billAmt" id="billAmt<%=cnt%>" style="width: 70px;" value="<%=m.get("BILL_AMT")%>" readonly="readonly"></td>
<td><input type="text" name="tscAmt" id="tscAmt<%=cnt%>" style="width: 70px;" value="<%=m.get("TSC_AMT")%>" readonly="readonly"></td>
<td><input type="text" name="vatAmt" id="vatAmt<%=cnt%>" style="width: 70px;" value="<%=m.get("VAT_AMT")%>" readonly="readonly"></td>
<td><input type="text" name="totalAmt" id="totalAmt<%=cnt%>" style="width: 70px;" value="<%=m.get("TOTAL_AMT")%>" readonly="readonly"></td>
</tr>
<% 
cnt++;
}
%>

</table>
<br/>
<input type="button" value="delete" onclick="deleteRow('payCollTable')">	
</form>

	
<%	
}
%>

</td>
</tr>
</table>
<%@include file="includes/footer.jsp"%>
</div>

</body>
</html>


