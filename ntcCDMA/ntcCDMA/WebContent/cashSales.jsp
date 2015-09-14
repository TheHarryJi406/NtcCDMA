<%@page import="java.net.URLDecoder"%>
<%@page import="java.net.URLEncoder"%>
<%@page import="com.designco.ntbilling.util.Wsutil"%>
<%@page import="com.ailk.openbilling.service.imsintf.DoQueryResponse2"%>
<%@page import="java.math.BigDecimal"%>
<%@page import="java.util.Map"%>
<%@include file="checkUser.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.designco.ntbilling.dao.*"%>

<%
try{
	String pageName = "cashSales.jsp";
	String collCen = session.getAttribute("ccCode").toString();
	String userId = session.getAttribute("username").toString();
	MenuAccessDao menuAccessDao= (MenuAccessDao) Context.get().getBean("menuAccessDao");
	BankDescDao bankDescDao = (BankDescDao) Context.get().getBean("bankDescDao");

	
	if (menuAccessDao.checkMenuAccessForUser(userId, pageName)==false) {
		response.sendRedirect("index.jsp");
		return;
	}
	
	
	UtilityDao utilityDao = (UtilityDao) Context.get().getBean("utilityDao");
	
	SequenceDao sequenceDao = (SequenceDao) Context.get().getBean("sequenceDao");
	
	BillingDao billingDao = (BillingDao) Context.get().getBean("billingDao");
	PaymentCollectionDao paymentCollectionDao = (PaymentCollectionDao) Context.get().getBean("paymentCollectionDao");
	CollCenterDao collCenterDao = (CollCenterDao) Context.get().getBean("collCenterDao");

	Wsutil wsUtil=new Wsutil();
	
	List list = collCenterDao.getByCode(collCen);
	Map mappp = (Map) list.get(0);

	
	String tempsrvNo="";
	
	if (request.getParameter("srvNo") != null) {
		
		tempsrvNo= request.getParameter("srvNo");
	}
	

	if (request.getParameter("save") != null && request.getParameter("totalAmount") != null) {
		
		String transType = "CSIA";
		
		
	 	String	srvNo=request.getParameter("srvNo");
		String	srvName=request.getParameter("srvName");
		String	srvAcNo=request.getParameter("srvAcNo");
		String srvProductNo=request.getParameter("srvProductNo");
		String lineStatus=request.getParameter("lineStatus")==null ? "" : request.getParameter("lineStatus");
		
		String chequeNo = "";
		String chequeAcNo = "";
		String chequeDt = "";
		String bankName="";
		String bankBranch = "";
		
		String paymentMode = request.getParameter("type");
// 		int resourceType=Integer.parseInt(request.getParameter("rtype"));

		BigDecimal vatAmt = BigDecimal.ZERO;
		BigDecimal tscAmt = BigDecimal.ZERO;
		String id_payment_dt = utilityDao.getTodaysDate();
		if (paymentMode.equals("CHQ")) {

			bankName= request.getParameter("bname").toUpperCase();
			bankBranch = request.getParameter("desc").toUpperCase();
			chequeDt = request.getParameter("checkDt"); 
			chequeNo = request.getParameter("checkNo");
			chequeAcNo= request.getParameter("AccountNo");
			
// 			String name=(request.getParameter("name")).toUpperCase();
// 			String branch=(request.getParameter("branch")).toUpperCase();

			String bank = bankDescDao.verify(bankName, bankBranch);
			String sessio="abc";
			System.out.println(bank);

			if(bank == "N"){
				System.out.println("abc");
				bankDescDao.save(bankName.toUpperCase(), bankBranch.toUpperCase(), session);
			}
		}
		String[] codes = request.getParameterValues("code");
		String[] qtys = request.getParameterValues("qty");
		String[] amounts = request.getParameterValues("amount");
		String[] tscs = request.getParameterValues("tsc");
		String[] vats = request.getParameterValues("vat");
		String[] totals = request.getParameterValues("total");
		String[] remarks=	request.getParameterValues("remark");
		
		BigDecimal billAmount = new BigDecimal(request.getParameter("totalAmount"));
		BigDecimal tscTotal = new BigDecimal(request.getParameter("totalTsc"));
		BigDecimal vatTotal = new BigDecimal(request.getParameter("totalVat"));
		BigDecimal amountTotal = new BigDecimal(request.getParameter("paidAmount"));
		BigDecimal tenderAmt = new BigDecimal(request.getParameter("tender"));
		BigDecimal rAmount = new BigDecimal(request.getParameter("change"));
		
		
		
		 	Map seqsMap = sequenceDao.getSupervisorNo(collCen, userId);
			Integer	supSeq =Integer.parseInt(seqsMap.get("on_sup_seq").toString()) ;
			Integer	seqOpr = Integer.parseInt(seqsMap.get("on_seq_opr").toString());
				if (seqsMap.get("ov_flag").equals("2")) {
					
					out.println("Supervisor sequence is already Finished.");
					return; 
				}  
				String transNo=paymentCollectionDao.getTransSequence();
				String receiptNo=paymentCollectionDao.getReceiptSequence();
		
		billingDao.cashSale(transNo,transType, srvNo,srvName, srvAcNo, srvProductNo, receiptNo, paymentMode,null, billAmount,
				tscTotal, vatTotal, amountTotal, tenderAmt, rAmount, seqOpr, session, chequeNo, chequeDt, chequeAcNo, bankName, bankBranch,codes,qtys,amounts,tscs,vats,totals,remarks, lineStatus);
// System.out.println("totals"+totals);
// System.out.println("amttotals"+amountTotal);
// System.out.println("rtotals"+rAmount);
		if(chequeNo!=""){
			chequeNo="&chequeNo="+chequeNo;
		}
		else{
			chequeNo="";
		}

		String printDate = utilityDao.getTodaysDateNepali() + " : " +utilityDao.getTodaysDate();
		
		/*String url="../WebViewerExample/frameset?__report=cdmaReport/receipt.rptdesign&"
				+"receiptNO="+receiptNo+"&telNo="+srvNo+"&payMode="+paymentMode+"&receivedBy="+userId+"&name="+srvName+"&billAmt="+billAmount+"&tsc="+tscTotal
				+"&vat="+vatTotal+"&subAmt="+tenderAmt+"&retAmt="+rAmount+"&collType=Cash Sales Item"+"&trNo="+transNo+chequeNo+
				"&totalAmt="+amountTotal+"&printTimes=1"+"&amtInWords="+utilityDao.inWord(amountTotal.toString())+"&ccCenter="+ mappp.get("DESCRIPTION");*/
				String url="repPrint.jsp?receiptNo="+receiptNo+"&telNo="+srvNo+"&payMode="+paymentMode+"&receivedBy="+userId+"&name="+srvName+"&billAmt="+billAmount+"&tsc="+tscTotal
				+"&vat="+vatTotal+"&subAmt="+tenderAmt+"&retAmt="+rAmount+"&collType=Cash Sales Item"+"&trNo="+transNo+chequeNo+
				"&totalAmt="+amountTotal+"&printTimes=1"+"&amtInWords="+utilityDao.inWord(amountTotal.toString())+"&ccCenter="+ mappp.get("DESCRIPTION")+
				"&currentDate="+printDate+"&time="+utilityDao.getTime();
		String msg = "Successfully paid Rs. " + amountTotal + " by " + srvNo;
		url = URLEncoder.encode(url);
		response.sendRedirect("cashSales.jsp?msg="+msg+"&url="+url);
		return;
						} 
	
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%><html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cash Sales</title>
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
		String msg = request.getParameter("msg");
		String pop = request.getParameter("url");
		if(msg != null)	{
			pop = URLDecoder.decode(pop);
		%>
		<h2><%=msg %></h2>
		<script>
		window.open("<%=pop%>");
		</script>
		<%
		}

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
		//console.log(nextBox.getAttribute("type"));
		if (nextBox.getAttribute("type") != "reset") {
			nextBox.focus();
			nextBox.select();
			event.preventDefault();
			return false;
		}
	}
	}
	}
</script>

<script type="text/javascript">

    $(document).ready(function() {
	$("#bname").autocomplete("bankcodeauto.jsp", {width:400,
		formatItem: function(data, i, total) {
                d = data[0]+"";
                desc = d.substring(0,d.indexOf("<"));
                        d = d.substring(d.indexOf(">")+1);
                        branch =d.substring(0, d.indexOf("<"));
                        return desc + " - " + branch;
	}});

	$("#bname").result(function(event, data, formatted) {
		if (data)
			{
			d = data+"";
			code = d.substring(0,d.indexOf("<"));
			d = d.substring(d.indexOf(">")+1);
			desc =d.substring(0, d.indexOf("<"));
			
			$(this).val(code);
			
			$("#bname").val(code);
			$("#desc").val(desc);
			
			
			}
	});
	
});

function totals() {
	var ttsc = 0;
	var tvat = 0;
        var tamount=0;
	var ttotal = 0;
	for (i=0; i<=idcount; i++) {
        
		tempQty = $("#qty" + i).val();
		tempAmt = $("#xamount" + i).val();
// 		tempDiscount = $("#discount" + i).val();
		tempTsc = $("#xtsc" + i).val();
		tempVat = $("#xvat" + i).val();

		ttsc += (tempQty * tempTsc);
		tvat += (tempQty * tempVat);
		tamount+=(tempQty * tempAmt);
		tot = tempQty * tempAmt;
// 		tot -= (tempDiscount * 100 / tot);
		tot += tempQty * tempTsc;
		tot += tempQty * tempVat;
		tot = Math.round(tot*100) / 100;
		$("#total" + i).val(tot);
		
		var t1 = tempQty * tempTsc;
		var t2 = tempQty * tempVat;
		var t3 = tempQty * tempAmt;
		
		t1 = t1.toFixed(2);
		t2 = t2.toFixed(2);
		t3 = t3.toFixed(2);
		
		$("#tsc"+i).val(t1);
		$("#vat"+i).val(t2);
		$("#amount"+i).val(t3);

		ttotal += tot;
	}
	ra = document.getElementById("requiredAmount");
	tt = document.getElementById("totalTsc");
	tv = document.getElementById("totalVat");
       ta = document.getElementById("totalAmount");

	
	
	
	tt.value = ttsc.toFixed(2);
	tv.value = tvat.toFixed(2);
        ta.value=tamount.toFixed(2);
	ra.value = ttotal.toFixed(2);
	$("#paidAmount").val(ttotal.toFixed(2));
}

var idcount = 0;

function makeAutoComp(num) {
	$("#desc"+num).autocomplete("itemauto.jsp", {width:400,
		formatItem: function(data, i, total) {
		d = data[0]+"";
		desc = d.substring(0,d.indexOf("<"));
                d = d.substring(d.indexOf(">")+1);
                code = d.substring(0, d.indexOf("**"));
                d = d.substring(d.indexOf("**")+2);
                rate = d.substring(0, d.indexOf("**"));
                d = d.substring(d.indexOf("**")+2);
                tsc = d.substring(0, d.indexOf("**"));
                d = d.substring(d.indexOf("**")+2);
                vat = d.substring(0, d.indexOf("**"));
                       
                        return desc + " - " + code + "  -  "+ rate + "  -  "+ tsc + "  -  "+ vat;
	}});
         textboxes = $("input");
        if ($.browser.mozilla) {
            $(textboxes).keypress (checkForEnter);
        } else {
            $(textboxes).keydown (checkForEnter);
        }
	$("#code"+num).blur(function() {
		totals();
	});

	$("#qty"+num).blur(function() {
		totals();
	});
	$("#amount"+num).blur(function() {
		totals();
	});
	$("#tsc"+num).blur(function() {
		totals();
	});
	$("#vat"+num).blur(function() {
		totals();
	});
	$("#total"+num).blur(function() {
		totals();
	});
	
	$("#desc"+num).result(function(event, data, formatted) {
		if (data)
			{
			d = data+"";
			
			desc = d.substring(0,d.indexOf("<"));
            d = d.substring(d.indexOf(">")+1);
            code = d.substring(0, d.indexOf("**"));
            d = d.substring(d.indexOf("**")+2);
            rate = d.substring(0, d.indexOf("**"));
            d = d.substring(d.indexOf("**")+2);
            tsc = d.substring(0, d.indexOf("**"));
            d = d.substring(d.indexOf("**")+2);
            vat = d.substring(0, d.indexOf("**"));
            d = d.substring(d.indexOf("**")+2);
            isReq = d.substring(0, d.indexOf("**"));
           
			$("#code" + num).val(code);
			
			$("#desc" + num).val(desc);
			$("#xamount" + num).val(rate);
			$("#xtsc" + num).val(tsc);
			$("#xvat" + num).val(vat);
			$("#amount" + num).val(rate);
			$("#tsc" + num).val(tsc);
			$("#vat" + num).val(vat);
			$("#isReq" + num).val(isReq);
			}
	});
}
$(document).ready(function() {
	makeAutoComp(0);
});

$(document).ready(function() {
	$("table.xform tr:odd").addClass("odd");
});

function test() {
	alert("ldk");
}
function addRow() {
	var tbl = document.getElementById("salesTable");
	var row = tbl.insertRow(tbl.rows.length);
	idcount++;

	var cell = row.insertCell(0);
	var fCode = document.createElement("input");
	fCode.setAttribute("type", "text");
	fCode.setAttribute("name", "description");
	fCode.setAttribute("id", "desc"+idcount);
    fCode.setAttribute("class", "entry");
	cell.appendChild(fCode);
	
	var fCode = document.createElement("input");
	fCode.setAttribute("type", "hidden");
	fCode.setAttribute("name", "xtsc");
	fCode.setAttribute("id", "xtsc"+idcount);
	cell.appendChild(fCode);
	
	var fCode = document.createElement("input");
	fCode.setAttribute("type", "hidden");
	fCode.setAttribute("name", "xvat");
	fCode.setAttribute("id", "xvat"+idcount);
	cell.appendChild(fCode);
	
	var fCode = document.createElement("input");
	fCode.setAttribute("type", "hidden");
	fCode.setAttribute("name", "xamount");
	fCode.setAttribute("id", "xamount"+idcount);
	cell.appendChild(fCode);
	
	cell = row.insertCell(1);
	var fCode = document.createElement("input");
	fCode.setAttribute("type", "text");
	fCode.setAttribute("name", "code");
	fCode.setAttribute("readonly", "readonly");
	fCode.setAttribute("style", "width:50px;");
    fCode.setAttribute("class", "entry");
	cell.appendChild(fCode);
	fCode.setAttribute("id", "code"+idcount);
	

	cell = row.insertCell(2);
	var fCode = document.createElement("input");
	fCode.setAttribute("type", "text");
	fCode.setAttribute("name", "qty");
	fCode.setAttribute("value", "1");
	fCode.setAttribute("id", "qty"+idcount);
	fCode.setAttribute("class", "entry");
	fCode.setAttribute("style", "width:40px;");
	cell.appendChild(fCode);


	cell = row.insertCell(3);
	var fCode = document.createElement("input");
	fCode.setAttribute("type", "text");
	fCode.setAttribute("name", "amount");
	fCode.setAttribute("value", "0");
	fCode.setAttribute("readonly", "readonly");
	fCode.setAttribute("id", "amount"+idcount);
	fCode.setAttribute("class", "entry");
	fCode.setAttribute("style", "width:70px;");
	fCode.setAttribute("id", "amount" + idcount);
	cell.appendChild(fCode);

	cell = row.insertCell(4);
	var fCode = document.createElement("input");
	fCode.setAttribute("type", "text");
	fCode.setAttribute("name", "tsc");
	fCode.setAttribute("value", "0");
	fCode.setAttribute("readonly", "readonly");
	fCode.setAttribute("id", "tsc"+idcount);
	fCode.setAttribute("class", "entry");
	fCode.setAttribute("style", "width:70px;");
	cell.appendChild(fCode);

	cell = row.insertCell(5);
	var fCode = document.createElement("input");
	fCode.setAttribute("type", "text");
	fCode.setAttribute("name", "vat");
	fCode.setAttribute("value", "0");
	fCode.setAttribute("readonly", "readonly");
	fCode.setAttribute("id", "vat"+idcount);
	fCode.setAttribute("class", "entry");
	fCode.setAttribute("style", "width:50px;");
	cell.appendChild(fCode);

	cell = row.insertCell(6);
	var fCode = document.createElement("input");
	fCode.setAttribute("type", "text");
	fCode.setAttribute("name", "total");
	fCode.setAttribute("value", "0");
	fCode.setAttribute("readonly", "readonly");
	fCode.setAttribute("id", "total"+idcount);
	fCode.setAttribute("class", "xtotal");
	fCode.setAttribute("style", "width:90px;");
	cell.appendChild(fCode);
	
	cell = row.insertCell(7);
	var fCode = document.createElement("input");
	fCode.setAttribute("type", "text");
	fCode.setAttribute("name", "remark");
// 	fCode.setAttribute("value", "0");
	fCode.setAttribute("id", "remark"+idcount);
	fCode.setAttribute("class", "entry");
	fCode.setAttribute("style", "width:90px;");
	cell.appendChild(fCode);

	cell = row.insertCell(8);
	var fCode = document.createElement("input");
	fCode.setAttribute("type", "text");
	fCode.setAttribute("name", "isReq");
// 	fCode.setAttribute("value", "0");
	fCode.setAttribute("readonly", "readonly");
	fCode.setAttribute("id", "isReq"+idcount);
	fCode.setAttribute("class", "entry small");

	cell.appendChild(fCode);

	makeAutoComp(idcount);
}

    function changeEntry()
        {
            var type=document.getElementById("type").value;
            if(type=="CSH")
            {
                document.getElementById('cashSaleDiv').style.display = 'none';  
            }
            else if(type=="CHQ")
            {document.getElementById('cashSaleDiv').style.display = 'block';}
        }        
            function calculate() {
                ra = document.getElementById("requiredAmount");
                pa = document.getElementById("paidAmount");
                t = document.getElementById("tender");
                c = document.getElementById("change");
                
                c.value = (Number(t.value) - pa.value).toFixed(2);
            }
            
            function checkDecimal(val) {
//              	var val = document.getElementById("charge");
             	 	
             	var rgexp = /^[0-9]+(\.[0-9]{1,2})?$/;
             	
             	if(rgexp.test(val.value)==false)
             	{
             		val.value=Number(val.value).toFixed(2);
             		val.focus();
             	}
            }
            
          function set()                                  
          {
        	  ra = document.getElementById("requiredAmount");
              pa = document.getElementById("paidAmount");
              //pa.value=ra.value;
                
          }
          

          function checkRequired(x){
        	  r=document.getElementById("isReq0");
        	  if(r.value=="Y"){
//         		  alert("tilak"+r.value);	  
        		  
        	  }

        	 
          }
  
     var formSubmitted = false;
     $(document).ready(function() { 
		$("#form1").live("submit",function() {
			var isValidRows = true;
			$("input.xreq").each(function(){
				var inp = $(this);
				if (inp.val() == 'Y'){
					$("input.xrem", inp.parent().parent()).each(function(){
						if ($(this).val().length == 0) {
							isValidRows = false;
						}
					});
				}
			});
		
			if (!isValidRows) {
				//alert("You must write a remark.");
				//return false;
			}
			
			if ($("#srvNo").val().length == 0){
				alert("Service No. is missing.");
				return false;
			}
			
			if ($("#srvAcNo").val().length == 0){
				alert("Service Account No. is missing.");
				return false;
			}
			
			$("#loadingDiv").show();
			return true;
		});
		
		$("#form1").submit(function() {
			if (formSubmitted){
				//alert("Already submitted.");
				return;
			}
			var paidAmount = Number($("#paidAmount").val());
			var tender = Number($("#tender").val());
			
			if (tender < paidAmount) {
				alert("Tender cannot be less than the paid amount.");
				return false;
				}
			
			
			if (paidAmount <= 0) {
				alert('Paid amount cannot be zero or less.')
				$("#paidAmount").focus();
				return false;
			}
			if (tender <= 0) {
				alert('Tender amount cannot be zero or less.')
				$("#tender").focus();
				return false;
			}
			$("#loadingDiv").show();
			$("#submitbtn").hide();
			formSubmitted = true;
			setTimeout(function() {
	            $('input').attr('disabled', 'disabled');
	            $('a').attr('disabled', 'disabled');
	        }, 50);
			return true;
		});
     });  
 
        </script>

<table width="100%" class="xform">
	
	<tr>
		<td valign="top" width="200px" ><%@include file="includes/leftmenu.jsp"%></td>
		<td valign="top" align="left">
		<h2>Cash Sales</h2>
		<br>
		<%
		
		
		
			Map map=sequenceDao.getSupervisorNo(collCen, userId);	
			//Integer[] seqs = sequence.getSupervisorNo(coll_cnt_cd, usr_id);
				Integer in_sup_seq = null;
				Integer in_seq_opr = null;
				
				if (map.get("ov_flag").equals("1")) {
					
					out.println("Supervisor sequence not found.");
				}

				else	if (map.get("ov_flag").equals("2")) {
					
					out.println("Supervisor sequence is already Finished.");
				}
				else {
					in_sup_seq =Integer.parseInt(map.get("on_sup_seq").toString()) ;
					in_seq_opr = Integer.parseInt(map.get("on_seq_opr").toString());
		%>

		<form id="form1" action="" method="post">
		<table width="100%" >
			<tr>
				<td width="150px">Sequence No</td>
				<td><%=in_sup_seq%>
				<input type="hidden" name="todayDate" class="todayDate"
					id="todayDate" value="<%=utilityDao.getTodaysDateNepali()%>" /></td>
			</tr>
			<tr>
				<td>Date</td>
				<td><%=utilityDao.getTodaysDateNepali()%></td>
			</tr>
			<tr>
				<td>Service No.</td>
				<td><input type="text" name="srvNo" id="srvNo" value="<%=tempsrvNo %>" onchange="document.getElementById('loadingDiv').style.display='block'; this.form.submit()" /></td>
			</tr>
			
			<%
			if(!tempsrvNo.isEmpty()){
				String tempName=""; 
				String status = "";
				Long tempAccountNo=0l;
				
				DoQueryResponse2 first = wsUtil.getCustomerInfo(tempsrvNo);
				
				 if(first.getErrorMsg().getResultCode()==200057 || first.getErrorMsg().getResultCode()==200033){
					tempName="No Name";
				}
					
				else if(first.getErrorMsg().getResultCode()!=0){
					session.setAttribute("err", first.getErrorMsg());
					response.sendRedirect("error.jsp");
					return;
						
				}
				else {
					tempName=first.getAccount().getAcctName();
					tempAccountNo=first.getAccount().getAcctId();
					status = Wsutil.getCustomerStatusByJptCode(first.getUser().getStatus());
				} 
				 
				
			%>	
			
			<%-- <tr>
				<td>tilak sample test:</td>
				
				<td><%=first.getErrorMsg().getResultCode() %></td>
			</tr>
			 --%>
			 
		 	<tr>
				<td>Name</td>
				
				<td><input type="text" name="srvName" id="srvName" value="<%=tempName %>"  readonly="readonly" tabindex="-1" style="width:250px;" class="readonly" /></td>
			</tr>
			
			<tr >
				<td >Account No.</td>
				<td ><input type="text" name="srvAcNo" id="srvAcNo"  value="<%=tempAccountNo %>"  readonly="readonly" tabindex="-1" class="readonly"/></td>
			</tr>
			<tr>
			<td >Status</td>
			<td><input type="text" name="lineStatus" value="<%=status %>" readonly="readonly" tabindex="-1" class="readonly"/></td>
			</tr>
			<tr>
				<td>Payment Type</td>
				<td><select name="type" id="type" class="type"
					onchange="changeEntry()" onKeyDown="changeKeyCode()" STYLE="width: 155px">
					<option value="CSH">Cash</option>
					<option value="CHQ">Cheque</option>

				</select></td><td>	<div id="cashSaleDiv" style="border: 1px solid; display: none; padding:5px;">
				
			<table><tr>
	<td>Bank</td><td><input type="text" name="bname" id="bname" onKeyDown="changeKeyCode()" style="width:150px;" /></td></tr>
	<tr><td>Branch : </td><td><input type="text" name="desc" id="desc" style="width: 150px" onKeyDown="changeKeyCode()"/></td></tr>
	<tr><td>Check Date: </td><td><input type="text" name="checkDt" id="checkDt" style="width: 80px" value="<%=utilityDao.getTodaysDateNepali()%>" onKeyDown="changeKeyCode()" /></td></tr>
	<tr><td>Check No:</td><td><input type="text" name="checkNo" id="checkNo" style="width: 150px" onKeyDown="changeKeyCode()" /></td> </tr>
	<tr><td>Account No:</td><td><input type="text" name="AccountNo" id="AccountNo" style="width: 150px" onKeyDown="changeKeyCode()" /></td></tr>
	</table></td>

			</tr>
<!-- 			<tr> -->
<!-- 				<td>Resource Type</td> -->
<!-- 				<td><select name="rtype" id="rtype" class="rtype" STYLE="width: 155px"> -->
<!-- 					<option value=1>C-Phone</option> -->
<!-- 					<option value=2>Sky Phone</option> -->

<!-- 				</select></td> -->
<!-- 			</tr> -->
			
			<tr>
				<td colspan="3"><input type="button" value="Add row"
					onclick="addRow();" /> <br />
				<table width="100%" id="salesTable" style="border: 1px solid;">
					<tr>
						<td width="160px">Description</td>
						<td width="50px">Code</td>
						<td width="40px">Qty</td>
						<td width="70px">Amount</td>
						<td>TSC</td>
						<td>VAT</td>
						<td>Total</td>
						<td>Remarks</td>
					</tr>
					<tr>
						<td><input type="text" name="description" id="desc0" 
							class="entry" onKeyDown="changeKeyCode()" />
							<input type="hidden" name="xtsc" id="xtsc0" />
							<input type="hidden" name="xvat" id="xvat0" />
							<input type="hidden" name="xamount" id="xamount0" />
							</td>
						<td><input type="text" name="code" id="code0" class="entry" readonly="readonly"
							style="width: 50px;" onKeyDown="changeKeyCode()" class="readonly"/></td>
						<td><input type="text" name="qty" id="qty0" value="1"
							class="entry" style="width: 30px;" onkeydown="changeKeyCode()"
							class="xqty" onchange="totals();" /></td>
						<td><input type="text" name="amount" id="amount0" readonly="readonly"
							class="entry" style="width: 70px;" value="0"
							onKeyDown="changeKeyCode()" class="readonly"/></td>
						<td><input type="text" name="tsc" id="tsc0" class="entry" readonly="readonly"
							style="width: 70px;" value="0" onKeyDown="changeKeyCode()" class="readonly"/></td>
						<td><input type="text" name="vat" id="vat0" class="entry" readonly="readonly"
							style="width: 50px;" class="xvat" value="0"
							onKeyDown="changeKeyCode()" class="readonly"/></td>
						<td><input type="text" name="total" id="total0" 
							style="width: 90px;" class="entry" value="0" readonly="readonly"
							onKeyDown="changeKeyCode()" class="readonly"/></td>
						<td><input type="text" name="remark" id="remark0" class="entry xrem" 
							style="width: 90px;" onKeyDown=""  /></td>
						<td><input type="text" name="isReq" id="isReq0" class="entry small xreq" readonly="readonly"
							class="readonly"/></td>
					</tr>
				</table>
				<table>
					<tr>
						<td width="160px"></td>
						<td width="50px"></td>
						<td width="40px"></td>
						<td width="70px"><input type="text" name="totalAmount" id="totalAmount" readonly="readonly" tabindex="-1"
					value="0" style="width:70px;" class="readonly"/></td>
						<td width="70px"><input type="text" name="totalTsc" id="totalTsc" value="0" readonly="readonly" tabindex="-1"
					onKeyDown="changeKeyCode()" style="width:70px;" class="readonly"/></td>
						<td width="50px"><input type="text" name="totalVat" id="totalVat" value="0" readonly="readonly" tabindex="-1"
					onKeyDown="changeKeyCode()" style="width:50px;" class="readonly"/></td>
						<td width="90px"><input type="text" name="requiredAmount"
					readonly="readonly" id="requiredAmount" class="requiredAmount"
					value="0" onBlur="set()" style="width:90px;"/></td>
						<td width="90px"></td>
						<td width=""></td>
					</tr>
				</table>
				</td>
			</tr>
			<tr>
				<td>Paid Amount</td>
				<td><input type="text" name="paidAmount" id="paidAmount" readonly="readonly"
					class="paidAAmount" class="readonly" /></td>
			</tr>
			<tr>
				<td>Tender</td>
				<td><input type="text" name="tender" id="tender" class="tender"
					onchange="calculate(); checkDecimal(this);" /></td>
			</tr>
			<tr>
				<td>Change</td>
				<td><input type="text" name="change" id="change" value="0"
					readonly="readonly" tabindex="-1" class="readonly"/></td>
			</tr>
			<%	
			}
			%>
			<tr>
				<td></td>
				<td><input type="submit" value="Submit" name="save" id="submitbtn" />
<!-- 				<input type="reset" value="Reset" onclick="location.href='cashSales.jsp'" /></td> -->
			</tr>
			
			
		</table>
		</form>
		<%
			}

		%>
		</td>
	</tr>
	<tr>
		<td colspan="2"><%@include file="includes/footer.jsp"%></td>
	</tr>
</table>

</div>

</body>
</html>
<%
		}
	catch(Exception ex){
		session.setAttribute("ex", ex);
		response.sendRedirect("error.jsp");
		return;
	}
%>