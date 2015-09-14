<%@include file="checkUser.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.designco.ntbilling.dao.*"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="java.sql.ResultSet"%><html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Supervisor Sequence</title>
<link href="css/jquery.autocomplete.css" rel="stylesheet"
	type="text/css" />
<link href="css/style.css" rel="stylesheet" type="text/css" />
<link href="css/jquery.datepick.css" rel="stylesheet" type="text/css" />
<link href="css/style-ntc.css" rel="stylesheet" type="text/css" />

<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/jquery.autocomplete.js"></script>
<script type="text/javascript" src="js/jquery.datepick.js"></script>
<script type="text/javascript" src="js/jquery.validate.js"></script>
</head>
<body>
<div id="wraper">
<div id="loadingDiv"><img src="images/loading image.gif" alt="" /></div>
<%@include file="includes/header.jsp"%>
<%
String pageName = "supervisorSequence.jsp";
String collCen = session.getAttribute("ccCode").toString();
String userId = session.getAttribute("username").toString();
MenuAccessDao menuAccessDao= (MenuAccessDao) Context.get().getBean("menuAccessDao");

if (menuAccessDao.checkMenuAccessForUser(userId, pageName)==false) {
	response.sendRedirect("index.jsp");
	return;
}


	UtilityDao utilityDao = (UtilityDao) Context.get().getBean("utilityDao");
	SequenceDao sequenceDao = (SequenceDao) Context.get().getBean("sequenceDao");
	if (request.getParameter("Save") != null) {

		String supervisors[] = request.getParameterValues("supervisor");
		String centers[] = request.getParameterValues("center");
		String operators[] = request.getParameterValues("operator");
		String dates[] = request.getParameterValues("date");
		String starts[] = request.getParameterValues("start");
		String ends[] = request.getParameterValues("end");
		//System.out.println(dates[0]);
		String msg =sequenceDao.saveSequences(supervisors, centers, operators, dates, starts, ends,session);
				
				
		response.sendRedirect("index.jsp?msg=" + msg);
		return; 
	} else {
%>
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

<script>
var today = '<%=utilityDao.getTodaysDateNepali()%>';
var idcount = 1;

function makeAutoComp(num) {
	$("#supervisor"+num).autocomplete("supervisorauto.jsp", {width:300});
	$("#operator"+num).autocomplete("userauto.jsp", {width:300});
	//$("#date"+num).datepick({dateFormat: 'dd-M-yy'});
      
        $("#supervisor"+num).blur(function() {
		check();
	});
        
        
	$("#supervisor"+num).result(function(event, data, formatted) {
		if (data)
			{
			d = data+"";
			code = d.substring(0,d.indexOf("<"));
			d = d.substring(d.indexOf(">")+1);
			desc = d.substring(0, d.indexOf("**"));
			d = d.substring(d.indexOf("**")+2);
			$(this).val(code);
			
			$("#center" + num).val(desc);
			
			}
	});
}
$(document).ready(function() {
	makeAutoComp(0);
       
});
   
function addRow() {
	var tbl = document.getElementById("supervisorTable");
	var row = tbl.insertRow(tbl.rows.length);
	idcount++;

	var cell = row.insertCell(0);
	sp = document.createElement("span");
	sp.innerHTML = idcount+"";
	cell.appendChild(sp);

	cell = row.insertCell(1);
	fCode = document.createElement("input");
	fCode.setAttribute("type", "text");
	fCode.setAttribute("name", "supervisor");
	fCode.setAttribute("readonly", "readonly");
	fCode.setAttribute("value", "<%=userId%>");
	fCode.setAttribute("id", "supervisor" + idcount);
	fCode.setAttribute("style", "width:120px;");
	cell.appendChild(fCode);

	cell = row.insertCell(2);
	fCode = document.createElement("input");
	fCode.setAttribute("type", "text");
	fCode.setAttribute("name", "center");
	fCode.setAttribute("value", "<%=collCen%>");
	fCode.setAttribute("readonly", "readonly");
	fCode.setAttribute("id", "center" + idcount);
	fCode.setAttribute("style", "width:120px;");
	cell.appendChild(fCode);

	cell = row.insertCell(3);
	fCode = document.createElement("input");
	fCode.setAttribute("type", "text");
	fCode.setAttribute("name", "operator");
	fCode.setAttribute("id", "operator" + idcount);
	fCode.setAttribute("style", "width:120px;");
	cell.appendChild(fCode);

	cell = row.insertCell(4);
	fCode = document.createElement("input");
	fCode.setAttribute("type", "text");
	fCode.setAttribute("name", "date");
	fCode.setAttribute("id", "date" + idcount);
	fCode.setAttribute("value", today);
	fCode.setAttribute("style", "width:100px;");
	cell.appendChild(fCode);

	cell = row.insertCell(5);
	fCode = document.createElement("input");
	fCode.setAttribute("type", "text");
	fCode.setAttribute("name", "start");
	fCode.setAttribute("id", "start" + idcount);
	fCode.setAttribute("value", "0");
	fCode.setAttribute("style", "width:50px;");
	cell.appendChild(fCode);

	cell = row.insertCell(6);
	fCode = document.createElement("input");
	fCode.setAttribute("type", "text");
	fCode.setAttribute("name", "end");
	fCode.setAttribute("id", "end" + idcount);
	fCode.setAttribute("value", "0");
	fCode.setAttribute("style", "width:50px;");
	cell.appendChild(fCode);

	makeAutoComp(idcount);
       
}
    
  $(document).ready(function() {   
       $("#form1").validate({ 
                
         rules: {   
           supervisor: "required",// simple rule, converted to {required:true}   
           center: {// compound rule   
           required: true   
           
         },   
          operator: {   
           required: true
                     
         } , 
        date: {   
           required: true,
           date:true,
           dateISO:true
                     
         } , 
         start: {   
           required: true,
          number:true
         } , 
         end: {   
           required: true,
           number:true             
         }  

         }
       }); 

     }); 
/* $(document).ready(function() { 
        $.validator.addMethod("date", function(value, element) { 
            var todayDate = $('.todayDate').val(); 
            return Date.parse(todayDate) = Date.parse(value); 
        }, "* StartDate must be Less than or equal to todays Date"); 
        $('#form1').validate(); 
    });       */
</script>
<table width="100%">
	
	<tr>
		<td valign="top" width="200px" ><%@include file="includes/leftmenu.jsp"%></td>
		<td valign="top" align="left">
		<h2>Supervisor Sequence Entry</h2>
		<br>
		<input type="button" value="Add Row" id="addRow" onclick="addRow();" />
		<form id="form1" action="" method="post">
		<table id="supervisorTable" width="100%" class="xform">
			<tr>
				<td>S.no</td>
				<td>Supervisor</td>
				<td>Center</td>
				<td>Operator</td>
				<td>Date</td>
				<td>Start</td>
				<td>End</td>
			</tr>
			<tr>
				<td>1</td>
				<td><input type="text" name="supervisor" id="supervisor0"
					title="Enter Supervisor" style="width: 120px;" value="<%=userId %>" /></td>
				<td><input type="text" name="center" id="center0"
					style="width: 120px;" readonly="readonly" value="<%=collCen %>" /></td>
				<td><input type="text" name="operator" id="operator0"
					title="Enter Operator" style="width: 120px;" /></td>
				<td><input type="text" name="date" id="date0" readonly="readonly"
					value="<%=utilityDao.getTodaysDateNepali()%>" style="width: 100px;" /></td>
				<td><input type="text" name="start" id="start0" value="0"
					style="width: 50px;" /></td>
				<td><input type="text" name="end" id="end0" value="0"
					style="width: 50px;" /></td>
				<td><input type="hidden" name="todayDate" class="todayDate"
					id="todayDate" value="<%=utilityDao.getTodaysDateNepali()%>" /></td>
			</tr>
		</table>
		<table width="100%" class="xform">
			<tr>
				<td align="center" style="text-align:center;"><input type="submit" value="Save" name="Save" /></td>
			</tr>
		</table>
		</form>
		</td>
	</tr>
	<tr>
		<td colspan="2"><%@include file="includes/footer.jsp"%></td>
	</tr>
</table>
<%
	}
%>
</div>
</body>
</html>