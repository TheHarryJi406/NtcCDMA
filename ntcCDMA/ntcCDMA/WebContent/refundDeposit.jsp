
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
<title>Deposit Refund</title>
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
<%@include file="includes/header.jsp"%>
<h5 align="right"><%@include file="includes/user.jsp"%></h5>
<%

String pageName = "refundDeposit.jsp";
String collCen = session.getAttribute("ccCode").toString();
String userId = session.getAttribute("username").toString();
MenuAccessDao menuAccessDao= (MenuAccessDao) Context.get().getBean("menuAccessDao");

if (menuAccessDao.checkMenuAccessForUser(userId, pageName)==false) {
	response.sendRedirect("index.jsp");
	return;
}


	DepositRefundDao depositRefundDao = (DepositRefundDao) Context.get().getBean("depositRefundDao");

	SequenceDao sequenceDao = (SequenceDao) Context.get().getBean("sequenceDao");
	UtilityDao utilityDao = (UtilityDao) Context.get().getBean("utilityDao");
	BillingDao billingDao = (BillingDao) Context.get().getBean("billingDao");
	PaymentCollectionDao paymentCollectionDao = (PaymentCollectionDao) Context.get().getBean("paymentCollectionDao");	

	if (request.getParameter("save") != null) {

	 	String	srvNo=request.getParameter("srvNo");
		String	srvName=request.getParameter("srvName");
		String	srvAcNo=request.getParameter("srvAcNo");
		String srvProductNo=request.getParameter("srvProductNo");
		String depBal=request.getParameter("depBal");
		String refAmount=request.getParameter("refAmount");
		String remark=request.getParameter("remark");

    String msg=depositRefundDao.save(srvNo, srvName, srvAcNo, srvProductNo, depBal, refAmount, remark, session);
	System.out.println(msg);
 	
						} 
				
		else {
%>
<script type="text/javascript">
$(document).ready( function() {
        
        textboxes = $("input");
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

$(document).ready(function() {
	$("#srvNo").autocomplete("serviceDetailauto.jsp", {width:400,
		formatItem: function(data, i, total) {
                d = data[0]+"";
                code = d.substring(0,d.indexOf("<"));
                        d = d.substring(d.indexOf(">")+1);
                        desc =d.substring(0, d.indexOf("<"));
                        return code + " - " + desc;
	}});

	 $("#srvNo").result(function(event, data, formatted) {
		if (data)
			{
			d = data+"";
			code = d.substring(0,d.indexOf("<"));
					
			d = d.substring(d.indexOf(">")+1);
			name =d.substring(0, d.indexOf("<")); // desc
			
			d = d.substring(d.indexOf(">")+1);	
			accountNo=d.substring(0, d.indexOf("-"));
			
			d = d.substring(d.indexOf("-")+1);
			osAmt=d.substring(0, d.indexOf("-"));
			
			d = d.substring(d.indexOf("-")+1);
			productId=d.substring(0, d.indexOf("-"));
			
			depBal = d.substring(d.indexOf("-")+1);
			$(this).val(code);
			
			
			$("#srvName").val(name);
			$("#srvAcNo").val(accountNo);
			$("#srvProductNo").val(productId);
			$("#osAmt").val(osAmt);
			$("#depBal").val(depBal);
			
			}
	}); 
	
});


$(document).ready(function() { 
         
      
       $("#form1").validate({ 
                
         rules: {  
            code: {
           required:true
            },
            srvNo:{
                required:true,
                 number:true               
              },
              srvName:{
                  required:true,
                },
                srvAcNo:{
                    required:true,
                     number:true               
                  },
                  srvProductNo:{
                      required:true,
                    },
                
          
       depBal:{
           required:true,
         },	
       
       refAmount:{
           required:true,
           checkLess:'#depBal'
         },
            }
            
        }); 

     });  
 
        </script>

<table width="100%">
	<tr>
		<td valign="top" width="200px"><%@include file="includes/leftmenu.jsp"%></td>
		<td valign="top" align="left">
		<h2>Deposit Refund</h2>
		<br>
		<form id="form1" action="" method="post">
		<table width="100%" class="xform">
			<tr>
				<td><input type="hidden" name="todayDate" class="todayDate"
					id="todayDate" value="<%=utilityDao.getTodaysDateNepali()%>" /></td>
			</tr>
			<tr>
				<td>Date</td>
				<td><%=utilityDao.getTodaysDateNepali()%></td>
			</tr>
			<tr>
				<td width="150px">Service No.</td>
				<td><input type="text" name="srvNo" id="srvNo" /></td>
			</tr>
			
			<tr>
				<td>Name</td>
				<td><input type="text" name="srvName" id="srvName" readonly="readonly" tabindex="-1" style="width:250px;" /></td>
			</tr>
			
			<tr >
				<td >Account No.</td>
				<td ><input type="text" name="srvAcNo" id="srvAcNo" readonly="readonly" tabindex="-1" /></td>
			</tr>
			<tr>
				<td>Prouduct No.</td>
				<td><input type="text" name="srvProductNo" id="srvProductNo" readonly="readonly" tabindex="-1`" /></td>

			<tr>
					
			<tr>
				<td>Deposit Balance</td>
				<td><input type="text" name="depBal" id="depBal" readonly="readonly" tabindex="-1" /></td>

			
			<tr>
				<td>Refund Amount</td>
				<td><input type="text" name="refAmount" id="refAmount" value="0" title="Less than or Equal to Deposit Balance"
					class="refAmount" /></td>
			</tr>
			
			<tr>
				<td>Remarks</td>
				<td><input type="text" name="remark" id="remark" 
					class="remark" /></td>
			</tr>
						
			
			<tr>
				<td></td>
				<td><input type="submit" value="Submit" name="save" /> <input
					type="reset" value="Reset" /></td>
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
<%
	}
%>

</body>
</html>