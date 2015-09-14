
<%@page import="java.text.DecimalFormat"%>
<%@page import="com.designco.ntbilling.dao.UtilityDao"%>
<%@page import="java.math.BigDecimal"%>
<%@page import="com.designco.ntbilling.dao.ItemDao"%>
<%@page import="com.designco.ntbilling.dao.ItemRateDao"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@page import="com.designco.ntbilling.dao.TempDao"%>
<%@include file="checkUser.jsp"%>
<%
String pageName = "itemRate.jsp";
String collCen = session.getAttribute("ccCode").toString();
String userId = session.getAttribute("username").toString();
MenuAccessDao menuAccessDao= (MenuAccessDao) Context.get().getBean("menuAccessDao");
DecimalFormat df = new DecimalFormat("#,###,##0.00");

if (menuAccessDao.checkMenuAccessForUser(userId, pageName)==false) {
	response.sendRedirect("index.jsp");
	return;
}

ItemRateDao itemRateDao = (ItemRateDao) Context.get().getBean("itemRateDao");
ItemDao itemDao = (ItemDao) Context.get().getBean("itemDao");
UtilityDao utilityDao = (UtilityDao) Context.get().getBean("utilityDao");


//RoleDao roleDao = (RoleDao) Context.get().getBean("roleDao");
String message = "";
String selectedItem = request.getParameter("selectItem");
String mode = request.getParameter("mode");
mode = mode==null ? "" : mode;

String addNew = request.getParameter("addNew");
if (addNew != null) {
	String item = request.getParameter("item");
	String effDate = request.getParameter("effDate");
	BigDecimal charge=new BigDecimal(request.getParameter("charge"));
	BigDecimal tsc = new BigDecimal(request.getParameter("tsc"));
	BigDecimal vat = new BigDecimal(request.getParameter("vat"));
	String checkboxStatus="";
	if(request.getParameter("flag")!=null){
		 checkboxStatus =request.getParameter("flag");	
	}
	
	String activeFlag="";
	if(checkboxStatus.equals("on")  ){
		activeFlag="A";		
	}
	else {
		activeFlag="N";
		}
// 		System.out.println(activeFlag);
	itemRateDao.save(item, effDate, charge, tsc, vat, activeFlag, session); 
	
	message = "Successfully saved.";
}

String editButton = request.getParameter("editButton");
if (editButton != null) {
	String rateId = request.getParameter("rateId");
	String item = request.getParameter("item");
	BigDecimal charge=new BigDecimal(request.getParameter("charge"));
	BigDecimal tsc = new BigDecimal(request.getParameter("tsc"));
	BigDecimal vat = new BigDecimal(request.getParameter("vat"));
	String effDate = request.getParameter("effDate");
	String checkboxStatus="";
	if(request.getParameter("flag")!=null){
		 checkboxStatus =request.getParameter("flag");	
	}
	
	String activeFlag="";
	if(checkboxStatus.equals("on")  ){
		activeFlag="A";		
	}
	else {
		activeFlag="N";
		}
	
	itemRateDao.update(rateId, item, effDate, charge, tsc, vat, activeFlag, session);
	
	message = "Successfully updated.";
}

if (mode.equals("delete")) {
	String code = request.getParameter("code");
	if (code != null) {
		itemRateDao.delete(code,session);
		message = "Successfully deleted.";
	}
}
%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Nepal Telecom - <%=session.getAttribute("username")%> [<%=session.getAttribute("ccCode")%>]</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<link href="css/style-ntc.css" rel="stylesheet" type="text/css" />

<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/jquery.validate.js"></script>


</head>
<body>
<div id="loadingDiv"><img src="images/loading image.gif" alt="" /></div>
<div id="wraper">
<%@include file="includes/header.jsp"%>

<script>
$(document).ready( function() {
	// get only input tags with class data-entry
	textboxes = $("input");
	//alert(textboxes.length);
	// now we check to see which browser is being used
	if ($.browser.mozilla) {
	$(textboxes).keypress (checkForEnter);
	} else {
	$(textboxes).keypress (checkForEnter);
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

<script>

function calculate(){
	 var a=document.getElementById("charge");
	 var b=document.getElementById("tsc");
	 var c=document.getElementById("vat");
	 var d=document.getElementById("own");
	 var e=document.getElementById("total");

	 e.value = Number(a.value) + Number(b.value) + Number(c.value) + Number(d.value);
}


function checkDecimal(val) {
//  	var val = document.getElementById("charge");
 	 	
 	var rgexp = /^[0-9]+(\.[0-9]{1,2})?$/;
 	
 	if(rgexp.test(val.value)==false)
 	{
 		val.value=Number(val.value).toFixed(2);
 		val.focus();
 	}
}

function checkDate(val){
	var rgexp = /^(\d{4})(\/|-|.|\s|\\)(\d{1,2})\2(\d{1,2})$/;
// 	var rgexp = /^\d{4}\/\d{2}\/\d{2}$/;
	if(rgexp.test(val.value)==false){
		alert("wrong entry");
		val.value="";
		val.focus();
	}
}


$(document).ready(function() {
	$("a.delete").click(function(e){
		if (confirm("Are you sure you want to delete?")) {
			return true;
		}
		return false;
	});
});

$(document).ready(function() {
	$("table.yform tr:odd").addClass("odd");
});

$(document).ready(function() {
	$("#itemRateForm").validate({

		rules : {
			charge : {
				required : true,
				number : true
// 				decimal : true
			},
// 			own : {// compound rule  
// 				required : true,
// 				number : true

// 			},

	
	effDate : {// compound rule   
			required : true,
			date : true

	},

item : {// compound rule   
		required : true

	}

	
		}
	});

});
</script>
<table width="100%" class="yform">
	
	<tr>
		<td valign="top" width="200px"><%@include
			file="includes/leftmenu.jsp"%></td>
		<td valign="top" align="left">
		<h2>Item Rate</h2>
		<div align="center">
		<%=message%>
		</div>
		<div>
		<%
		List<Map> lst1=itemDao.getAll();
		if (mode.equals("add"))
		{
			
		%>
		
	
		<form action="itemRate.jsp" method="post" id="itemRateForm">
		<table>
			<tr>
				<td >Item</td>
				<td><select name="item" >
				<option value="">Select</option>
				<%
				for(Map m:lst1){
					%>
					<option value=<%=m.get("ITEM_CODE") %>><%=m.get("DESCRIPTION") %></option>	
				<%
				}
				%>
				
				</select></td>
				
			</tr>
			<tr>
				<td>Effective Date</td>
				<td><input type="text" name="effDate" value="<%=utilityDao.getTodaysDateNepali() %>" onchange="checkDate(this);" /></td>
			</tr>
			<tr>
				<td>Charge</td>
				<td><input type="text" name="charge" id="charge" value="0" onchange="checkDecimal(this); " /></td>
			</tr>
			<tr>
				<td>TSC</td>
				<td><input type="text" name="tsc" id="tsc" value="0" onchange="checkDecimal(this);"/></td>
			</tr>
			<tr>
				<td>Vat</td>
				<td><input type="text" name="vat" id="vat" value="0" onchange="checkDecimal(this); calculate(this);"/></td>
			</tr>
<!-- 			<tr> -->
<!-- 				<td>Own</td> -->
<!-- 				<td><input type="text" name="own" id="own" value="" onchange="checkDecimal(this); calculate(this);"/></td> -->
<!-- 			</tr> -->
			<tr>
				<td>Total</td>
				<td><input type="text" name="total" id="total" value="0" readonly="readonly" class="readonly"/></td>
			</tr>
			<tr>
				<td>Active Flag</td>
				<td><input type="checkbox" name="flag" id="flag" class="flag" /></td>
			</tr>
			<tr>
				<td><input type="submit" name="addNew" value="Save" /></td>
			</tr>
		</table>
		</form><br>
		<%
		} else if (mode.equals("edit")) {
			String code=request.getParameter("code").toString();
	 		List<Map> itemRateCode=itemRateDao.getByCode(code);
	 		
	 		Map mp=(Map)itemRateCode.get(0);
	 		BigDecimal charge = new BigDecimal(mp.get("CHARGE").toString());
	 		BigDecimal tsc = new BigDecimal(mp.get("TSC").toString());
	 		BigDecimal vat = new BigDecimal(mp.get("VAT").toString());
	 		BigDecimal own = new BigDecimal(mp.get("OWN").toString());
	 		BigDecimal total = tsc.add(vat).add(own).add(charge);
	 		//Map mp = (Map).itemRateCode.get(0);
			%>
			
		
			<form action="itemRate.jsp" method="post" id="itemRateForm">
			<table>
				<tr>
					<td>Rate Id</td>
					<td><input type="text" name="rateId" value="<%=mp.get("RATE_ID") %>" readonly="readonly" class="readonly"></td>
				</tr>
				<tr>
					<td >Item</td>
					<td><select name="item" >
					<option value="">Select</option>
					<%
					//String itemCode = mp.get("ITEM_CODE").toString();
					for(Map m:lst1){
						%>
						<option value=<%=m.get("ITEM_CODE") %> <% if(m.get("ITEM_CODE").equals(mp.get("ITEM_CODE"))) { out.write("selected"); } %>><%=m.get("DESCRIPTION") %></option>
<%-- 						<option value=<%=m.get("ITEM_CODE") %>><%=m.get("DESCRIPTION") %></option>	 --%>
					<%
					}
					%>
					
					</select></td>
					
				</tr>
				<tr>
					<td>Effective Date</td>
					<td><input type="text" name="effDate" id="effDate" value="<%=mp.get("EFFECTIVE_DT") %>" onchange="calculate(this); checkDate(this);"/></td>
				</tr>
				<tr>
					<td>Charge</td>
					<td><input type="text" name="charge" id="charge" value="<%=mp.get("CHARGE") %>" onchange="checkDecimal(this);" /></td>
				</tr>
				<tr>
					<td>TSC</td>
					<td><input type="text" name="tsc" id="tsc" value="<%= mp.get("TSC") %>" onchange="checkDecimal(this);"/></td>
				</tr>
				<tr>
					<td>Vat</td>
					<td><input type="text" name="vat" id="vat" value="<%= mp.get("VAT") %>" onchange="checkDecimal(this); calculate(this);"/></td>
				</tr>
<!-- 				<tr> -->
<!-- 					<td>Own</td> -->
<%-- 					<td><input type="text" name="own" id="own" value="<%= mp.get("OWN") %>" onchange="checkDecimal(this); calculate(this);"/></td> --%>
<!-- 				</tr> -->
				<tr>
					<td>Total</td>
					<td><input type="text" name="total" id="total" value="<%=total %>" readonly="readonly" class="readonly"/></td>
				</tr>
				<tr>
					<td>Active Flag</td>
					<td style="text-align: left;"><input type="checkbox" name="flag"  id="flag" /></td>
					<script type="text/javascript">
								var x=document.getElementById("flag");
								<%if(mp.get("ACTIVE_FLAG").equals("A")){
							   		%>
							   		x.checked=true;
							   	<%
							   	}
							   	else{
							   		%>
							   		x.checked=false;
							   		<%
							   	}
							   	%>
								
								</script>					
				</tr>
				<tr>
					<td colspan="2"><input type="submit" name="editButton" value="Save" /></td>
				</tr>
			</table>
			</form><br>
		<%
		}else{
		%>
			<div style="text-align:right;">
				<a href="itemRate.jsp?mode=add"><img style="padding-right: 10px;" src="images/add new.png" alt=""><p>Add New</p></a>
			</div>
			<div>
			<form action="" method="post" style="font-size: 16px;">
			<%
selectedItem = (selectedItem == null) ? "" : selectedItem;

%>

Item : &nbsp;
<select name="selectItem" onchange="this.form.submit()">
<option  value="" selected="selected">Select</option>
<%

String selectedItemDesc="";
List<Map> itemCat=itemDao.getAll();
for(Map m:itemCat){
	String itemCode=m.get("ITEM_CODE").toString();
	String itemDesc=m.get("DESCRIPTION").toString();
	selectedItemDesc=itemDesc;
	%>
	<option value="<%=itemCode%>" <%if(selectedItem.equals(itemCode)){out.write("selected");} %>><%=itemDesc%></option>
	<%
}%>
</select></form><br><%} %>
<form action="" method="post" >
<table width="98%" class="color">
				<tr>
					<th>S.No.</th>
					<th>Item</th>
					<th>Charge</th>
					<th>Tsc</th>
					<th>Vat</th>
<!-- 					<th>Own</th> -->
					<th>Total</th>
					<th>Effective Date</th>
					<th>Flag</th>
					<th>Action</th>
				</tr>
				<%
				int i=0;
				List<Map> lists=itemRateDao.getByItemCode(selectedItem);
				for (Map m : lists)
				{
// 					System.out.println(selectedItem);

					String code = m.get("RATE_ID").toString();
					String item_code=m.get("ITEM_CODE").toString();
					
// 					String flag=m.get("ACTIVE_FLAG").toString();
// 					System.out.println(flag);
					i++;
					//String effDate = m.get("EFFECTIVE_DT").toString();
				%>
				<tr onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';" style="background-color: #d4e3e5;">
					<td><%=i %></td>
					<td><%=m.get("DESCRIPTION") %></td>
					<td><%=df.format(m.get("CHARGE")) %></td>
					<td><%=df.format(m.get("TSC")) %></td>
					<td><%=df.format(m.get("VAT")) %></td>
<%-- 					<td><%=df.format(m.get("OWN")) %></td> --%>
					<td><%=df.format(m.get("TOTAL")) %></td>
					<td><%= m.get("EFFECTIVE_DT") %></td>
					<td><%=m.get("ACTIVE_FLAG") %></td>
					<td id="actionrow">
					<a href="itemRate.jsp?mode=edit&code=<%= code%>">Edit</a>&nbsp;|
					<a href="itemRate.jsp?mode=delete&code=<%= code%>" class="delete">Delete</a> 
					</td>
				</tr>
				<% 
				}
				 %>
			</table>
			</div>
		</div>
		</td>
	</tr>
</table>
</form>
<%@include file="includes/footer.jsp"%>
</div>
</body>
</html>