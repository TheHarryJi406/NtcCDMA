
<%@page import="com.designco.ntbilling.util.Context"%>
<%@page import="java.sql.Connection"%><script type="text/javascript"
	src="js/jquery.blockUI.js"></script>
<script type="text/javascript">
$(document).ready(function() {

});
function hideMsg() {
	$.unblockUI();
}
function processNumber() {
	connNo = $("#connNo").val();
	//if (connNo.length > 0)
		location.href = (page+"connectionNo=" + connNo);
	$.unblockUI();
	return false;
}
var page = "";
function askConnection(pg) {
	page = pg;
	$("#connNo").val('');
	$.blockUI({ message: $('#askNumber') }); 
}

</script>
<div id="askNumber" style="display: none;">
<form onsubmit="return processNumber();"><br />
Connection number : <input type="text" id="connNo" /> <br />
<br />
<input type="button" value="Okay" id="btnOkay"
	onclick="processNumber();" /> <input type="button" value="Cancel"
	id="btnCancel" onclick="hideMsg();" /></form>
</div>
<div style="width: 200px;">
<div id="accord">
<h4 style="text-align: left;">Menu</h4>
<div>
<ul>Area
<li><a href="region.jsp">Region</a></li>
<li><a href="accCenter.jsp">Account Center</a></li>
<li><a href="collCenter.jsp">Collection Center</a></li>
</ul>

<li><a href="supervisorSequence.jsp">Supervisor Sequence</a></li>

<li><a href="role.jsp">Role</a></li>
<li><a href="user.jsp">User</a></li>
<li><a href="itemCategory.jsp">Item Category</a></li>
<li><a href="item.jsp">Item</a></li>
<li><a href="deposit.jsp">Deposit</a></li>
<li><a href="receipt.jsp">Receipt</a></li>
<li><a href="cashSales.jsp">Cash Sales</a></li>
<li><a href="cancellation.jsp">Cancellation</a></li>
<!-- <li><a href="temp.jsp">Temp Page</a></li> -->
<li><a href="changePassword.jsp">Change Password</a></li>
<li><a href="logout.jsp">Logout</a></li>
</div>
</div>
</div>