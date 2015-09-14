

<%@page import="java.net.URLDecoder"%>
<%@page import="java.net.URLEncoder"%>
<%@page import="com.designco.ntbilling.dao.UtilityDao"%>
<%@page import="com.designco.ntbilling.dao.AccCenterDao"%>
<%@page import="com.designco.ntbilling.dao.CollCenterDao"%>
<%@page import="java.math.RoundingMode"%>
<%@page import="java.math.BigDecimal"%>
<%@page import="com.designco.ntbilling.dao.RegionDao"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@include file="checkUser.jsp" %>

<%

String pageName = "rClerkwiseCashColl.jsp";
String colCen = session.getAttribute("ccCode").toString();
String userId = session.getAttribute("username").toString();
MenuAccessDao menuAccessDao= (MenuAccessDao) Context.get().getBean("menuAccessDao");

if (menuAccessDao.checkMenuAccessForUser(userId, pageName)==false) {
	response.sendRedirect("index.jsp");
	return;
}
	String message = "";

	/* LccLedgerDatDao lccLedgerDatDao = (LccLedgerDatDao) Context.get()
			.getBean("lccLedgerDatDao");
	String mode = request.getParameter("mode");
	mode = mode == null ? "" : mode; */
	
	String userName = session.getAttribute("username").toString();
	
	RegionDao regionDao = (RegionDao) Context.get().getBean("regionDao");
	AccCenterDao accCenterDao = (AccCenterDao) Context.get().getBean("accCenterDao");
	CollCenterDao collCenterDao = (CollCenterDao) Context.get().getBean("collCenterDao");
	UserAllDao userAllDao = (UserAllDao) Context.get().getBean("userAllDao");
	UtilityDao utilityDao= (UtilityDao) Context.get().getBean("utilityDao");
	String collCencode = session.getAttribute("ccCode").toString();

	List list = collCenterDao.getByCode(collCencode);
	Map mappp = (Map) list.get(0);

	String userLever = session.getAttribute("userLevel").toString();

	String regionCode = mappp.get("REGION_CODE").toString();
	String accCenCode = mappp.get("ACC_CEN_CODE").toString();

	if(request.getParameter("ok")!=null){
		
	
		String fromDate=request.getParameter("fromDate");
		String toDate=request.getParameter("toDate");
		String region=request.getParameter("region");
		String accCen=request.getParameter("accCen");
		String collCen=request.getParameter("collCen");
		String clrk=request.getParameter("clerk");
		
	 	String tempRegion="";
		String tempAccCen="";
		String tempCollCen="";
		String tempClrk="";
		
		if(clrk.equals("all")){
			tempClrk="";
		}
		
			else{
				tempClrk="&clerk="+clrk;
			}
		if(region.equals("all")){
			tempRegion="";
		}
		
			else{
				tempRegion="&regionCode="+region;
			}
		
		if(accCen.equals("all")){
			tempAccCen="";
		}
			else{
				tempAccCen="&accCenCode="+accCen;
			}
		if(collCen.equals("all")){
			tempCollCen="";
		}
			else{
				tempCollCen="&ccCode="+collCen;
			}
		
		String url="../WebViewerExample/frameset?__report=cdmaReport/clerkwiseCashColl.rptdesign"+tempCollCen+"&frmDate="+fromDate+"&toDate="+toDate+"&createdBy="+userName+tempAccCen+tempRegion+tempClrk;
// 		System.out.println(url);
		url = URLEncoder.encode(url);
			response.sendRedirect("rClerkwiseCashColl.jsp?&url="+url);
			return;
// 		response.sendRedirect(url);
// 		return;
	}
	
	
%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Nepal Telecom - <%=session.getAttribute("username")%> [<%=session.getAttribute("ccCode")%>]</title>
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
<div id="loadingDiv"><img src="images/loading image.gif" alt="" /></div>
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

<div id="wraper">
<%@include file="includes/header.jsp"%>
<%
String pop = request.getParameter("url");
		if(pop != null)	{
			pop = URLDecoder.decode(pop);
		%>
		
		<script>
		window.open("<%=pop%>");
		</script>
		<%
		}
// 		{
		%>


<%-- <%System.out.println(session.getAttribute("password").toString()); %> --%>
<script>



$(document).ready(function() {
	$("#form1").validate({

		rules : {
//			fromAccountId : "required",// simple rule, converted to {required:true}   
// 			toAccountId : {// compound rule   
// 				required : true

// 			},
			fromDate : {// compound rule   
				required : true

			},
			toDate : {// compound rule   
				required : true

			},
			transtype : {// compound rule   
				required : true

			},
			
			region : {// compound rule   
				required : true

			},
			accCen : {// compound rule   
				required : true

			},
			collCen : {// compound rule   
				required : true

			},
			clerk : {// compound rule   
				required : true

			}

		}
	});

});
</script>


<table width="100%">



<tr>
<td valign="top" width="200px" ><%@include file="includes/leftmenu.jsp" %></td>
<td valign="top" align="left">
<div align="center"><%=message%></div>
<h2>Clerkwise Cash Collection</h2>
<br><br>
<!-- <div style="text-align: right;"><a href="region.jsp?mode=add" >Add new</a></div> -->
<div>
	<form id="form1" action="rClerkwiseCashColl.jsp" method="post">
		<table class="xform">
			<tr>
				<%		
				String todayNepaliDate=utilityDao.getTodaysDateNepali();
				String frmDt = request.getParameter("fromDate");
				frmDt = frmDt == null ? todayNepaliDate : frmDt; 
				
				String toDt = request.getParameter("toDate");
				toDt = toDt == null ? todayNepaliDate: toDt; 
			
				%>
				
				
				<td>From Date:</br>(yyyy/mm/dd)</td>
				<td><input type="text" name="fromDate" class="fromDate" id="fromDate" title="Enter From Date" value= "<%=frmDt %>" maxlength="10"></td>
			</tr>
			<tr>
						
				
				<td>To Date:</br>(yyyy/mm/dd)</td>
				<td><input type="text" name="toDate" class="toDate" id="toDate" title="Enter To Date" value="<%=toDt%>" maxlength="10"></td>
			</tr>
						
			<!-- 			for user level 5 -->
			<%
				if (userLever.equals("5")) {
			%>
				<tr>
					<td>Region:</td>
					<%
					List<Map> list3 = regionDao.getAll();
						String selReg= request.getParameter("region");
						selReg = selReg == null ? regionCode : selReg;
					%>
					<td>
						<select  name="region" id="region"  STYLE="width: 250px" class="region" title="Select Region " onchange="this.form.submit();">
							<option value="">Select </option>
							<option value="all" <%if (selReg.equals("all")) {out.write("selected");	}%> >All </option>
						<%
							for (Map m : list3) {
						%>

							<option value=<%=m.get("REGION_CODE")%> <%if (selReg.equals(m.get("REGION_CODE"))) {out.write("selected");	}%> ><%=m.get("DESCRIPTION")%></option>
						<%
							}
						%>
						</select>
					</td>
				</tr>
			
			<% 
// 					if(request.getParameter("region")!=null){
		%>		 
					<tr>
				<%
					List<Map> list2 = accCenterDao.getByRegionCode(selReg);
						String selAccCen = request.getParameter("accCen");
						selAccCen = selAccCen == null ? accCenCode : selAccCen;
				%>
					<td>Account Center:</td>
					<td>
						<select  name="accCen" id="accCen"  STYLE="width: 250px" class="accCen" title="Select Accounting Center" onchange="this.form.submit();">
							<option value="">Select </option>
							<option value="all" <%if (selAccCen.equals("all")) {out.write("selected");	}%> >All </option>
						<%
							for (Map m1 : list2) {
						%>
							<option value=<%=m1.get("ACC_CEN_CODE")%> <%if (selAccCen.equals(m1.get("ACC_CEN_CODE"))) {out.write("selected");	}%> ><%=m1.get("DESCRIPTION")%></option>
				<% 
							}
				%> 
						</select>
					</td>
				</tr>
			
				<tr>
				<%
// 						List<Map> list1 = null;

// 						if (request.getParameter("accCen") != null) {
							List<Map> list1 = collCenterDao.getByAccountingCenter(selAccCen);
							String selCCCen = request.getParameter("collCen");
							selCCCen = selCCCen ==null ? collCencode : selCCCen;
// 							System.out.println(selCCCen);
							
				%>
					<td>Collection Center:</td>
					<td>
						<select  name="collCen" id="collCen"  STYLE="width: 250px" class="collCen" title="Select Collection Center" onchange="this.form.submit();">
							<option value="">Select </option>
							<option value="all" <%if (selCCCen.equals("all")) {out.write("selected");	}%> >All </option>
						<%
							for (Map m2 : list1) {
						%>
							<option value=<%=m2.get("CC_CODE")%> <%if (selCCCen.equals(m2.get("CC_CODE"))) {out.write("selected");	}%>><%=m2.get("DESCRIPTION")%></option>
						<%
							}
// 						}
						%>
						</select>
					</td>	
				</tr>
				<tr>
				<td>Clerk:</td>
				<%
					List<Map> l = userAllDao.getByCCCode(selCCCen);
				String clerk = request.getParameter("clerk");
				clerk = clerk == null ? userName : clerk;
					%>
					<td>
						<select  name="clerk" id="clerk"  STYLE="width: 250px" class="clerk" title="Select clerk " >
							<option value="">Select </option>
							<option value="all" <%if (clerk.equals("all")) {out.write("selected");	}%> >All </option>
						<%
							for (Map m : l) {
						%>

							<option value=<%=m.get("USER_CODE")%> <%if (clerk.equals(m.get("USER_CODE"))) {out.write("selected");	}%> ><%=m.get("USER_CODE")%></option>
						<%
							}
						%>
						</select></td>
				</tr>
					<%		
						}
				
					%>
			
				<%
// 					}
				%>
			<!-- 			for user level 4 -->
				<%
					if (userLever.equals("4")) {
						List lst=regionDao.getByCode(regionCode);
						Map mmap=(Map)lst.get(0);
				%>	
				<tr>
					<td>Region:</td>
					<td><input type="text"  value="<%=mmap.get("DESCRIPTION")%>" class="region" title=" Region" readonly="readonly" STYLE="width: 250px"></td>
					<td><input type="hidden" name="region" id="region" value=<%=regionCode%> class="region" ></td>
				</tr>
			
				<tr>
				<%
					List<Map> list2 = accCenterDao.getByRegionCode(regionCode);
						String selAccCen = request.getParameter("accCen");
						selAccCen = selAccCen == null ? accCenCode : selAccCen;
				%>
					<td>Account Center:</td>
					<td>
						<select  name="accCen" id="accCen" class="accCen"  STYLE="width: 250px" title="Select Accounting Center" onchange="this.form.submit();">
							<option value="">Select </option>
							<option value="all" <%if (selAccCen.equals("all")) {out.write("selected");	}%> >All </option>
						<%
							for (Map m : list2) {
						%>
<%-- 							<option value=<%=m.get("ACC_CEN_CODE") %>><%=m.get("DESCRIPTION") %></option> --%>
							<option value=<%=m.get("ACC_CEN_CODE")%> <%if (selAccCen.equals(m.get("ACC_CEN_CODE"))) {out.write("selected");	}%> ><%=m.get("DESCRIPTION")%></option>
						<%
							}
						%>
						</select>
					</td>
				</tr>
			
				<tr>
				<%
					
						List<Map> list1 = null;

// 						if (request.getParameter("accCen") != null) {
							
// 							System.out.println("sample----"+request.getParameter("accCen"));
							
							list1 = collCenterDao.getByAccountingCenter(selAccCen);
							String selCCCen = request.getParameter("accCen");
							selCCCen = selCCCen == null ? collCencode : selCCCen;
				%>
					<td>Collection Center:</td>
					<td>
						<select  name="collCen" id="collCen" class="collCen"  STYLE="width: 250px" title="Select Collection Center" onchange="this.form.submit();">
							<option value="">Select </option>
							<option value="all" <%if (selCCCen.equals("all")) {out.write("selected");	}%> >All </option>
						<%
							for (Map m : list1) {
						%>
							<option value=<%=m.get("CC_CODE")%> <%if (selCCCen.equals(m.get("CC_CODE"))) {out.write("selected");	}%>><%=m.get("DESCRIPTION")%></option>
						<%
							}
// 						}
						%>
						</select>
					</td>	
				</tr>
				<tr>
				<td>Clerk:</td>
				<%
					List<Map> l = userAllDao.getByCCCode(selCCCen);
				String clerk = request.getParameter("clerk");
				clerk = clerk == null ? userName : clerk;
					%>
					<td>
						<select  name="clerk" id="clerk"  STYLE="width: 250px" class="clerk" title="Select clerk " >
							<option value="">Select </option>
							<option value="all" <%if (clerk.equals("all")) {out.write("selected");	}%> >All </option>
						<%
							for (Map m : l) {
						%>

							<option value=<%=m.get("USER_CODE")%> <%if (clerk.equals(m.get("USER_CODE"))) {out.write("selected");	}%> ><%=m.get("USER_CODE")%></option>
						<%
							}
						%>
						</select></td>
			</tr>
				
			<%
								
								}
							%>
			
			<!-- 			for user level 3 -->
				<%
					if (userLever.equals("3")) {
						List lst=regionDao.getByCode(regionCode);
						Map mmap=(Map)lst.get(0);
						List lst1=accCenterDao.getByCode(accCenCode);
						Map mmap1=(Map)lst1.get(0);
					
				%>	
				<tr>
					<td>Region:</td>
					<td><input type="text"  value="<%=mmap.get("DESCRIPTION")%>" class="region" title=" Region" readonly="readonly" STYLE="width: 250px"></td>
					<td><input type="hidden" name="region" id="region" value=<%=regionCode%> class="region" ></td>
				</tr>
			
				<tr>
					<td>Account Center:</td>
					<td><input type="text" value="<%=mmap1.get("DESCRIPTION")%>" class="accCen" title=" Accounting Center"  readonly="readonly" STYLE="width: 250px"></td>
					<td><input type="hidden" name="accCen" id="accCen" value=<%=accCenCode%> class="accCen" ></td>
				</tr>
			
				<tr>
				<%
					List<Map> list1 = collCenterDao.getByAccountingCenter(accCenCode);
				String selCCCen = request.getParameter("accCen");
				selCCCen = selCCCen == null ? collCencode : selCCCen;
				%>
					<td>Collection Center:</td>
					<td>
						<select  name="collCen" id="collCen" class="collCen" title="Select Collection Center" STYLE="width: 250px" onchange="this.form.submit();">
							<option value="">Select </option>
							<option value="all" <%if (selCCCen.equals("all")) {out.write("selected");	}%> >All </option>
						<%
							for (Map m : list1) {
						%>
							<option value=<%=m.get("CC_CODE")%> <%if (selCCCen.equals(m.get("CC_CODE"))) {out.write("selected");	}%>><%=m.get("DESCRIPTION")%></option>
						<%
							}
						%>
						
						</select>
				</tr>
				<tr>
				<td>Clerk:</td>
				<%
					List<Map> l = userAllDao.getByCCCode(selCCCen);
				String clerk = request.getParameter("clerk");
				clerk = clerk == null ? userName : clerk;
					%>
					<td>
						<select  name="clerk" id="clerk"  STYLE="width: 250px" class="clerk" title="Select clerk " >
							<option value="">Select </option>
							<option value="all" <%if (clerk.equals("all")) {out.write("selected");	}%> >All </option>
						<%
							for (Map m : l) {
						%>

							<option value=<%=m.get("USER_CODE")%> <%if (clerk.equals(m.get("USER_CODE"))) {out.write("selected");	}%> ><%=m.get("USER_CODE")%></option>
						<%
							}
						%>
						</select></td>
			</tr>
		
			<%
						}
					%>
			
			<!-- 			for User level 1 and 2	 -->
				<%
					if (userLever.equals("1") | userLever.equals("2")) {
				%>	
		 		<tr>
					<td>Region:</td>
					<%
					List lst=regionDao.getByCode(regionCode);
					Map mmap=(Map)lst.get(0);
					List lst1=accCenterDao.getByCode(accCenCode);
					Map mmap1=(Map)lst1.get(0);
					List lst2=collCenterDao.getByCode(collCencode);
					Map mmap2=(Map)lst2.get(0);
					
					
					%>
					<td><input type="text"  value="<%=mmap.get("DESCRIPTION")%>" class="region" title=" Region" readonly="readonly" STYLE="width: 250px"></td>
					<td><input type="hidden" name="region" id="region" value=<%=regionCode%> class="region" ></td>
				</tr>
			
				<tr>
					<td>Account Center:</td>
					<td><input type="text" value="<%=mmap1.get("DESCRIPTION")%>" class="accCen" title=" Accounting Center"  readonly="readonly" STYLE="width: 250px"></td>
					<td><input type="hidden" name="accCen" id="accCen" value=<%=accCenCode%> class="accCen" ></td>
				</tr>
			
				<tr>
					<td>Collection Center:</td>
					<td><input type="text"  value="<%=mmap2.get("DESCRIPTION")%>" class="collCen" title=" Collection Center"  readonly="readonly" STYLE="width: 250px"></td>
					<td><input type="hidden" name="collCen" id="collCen" value=<%=collCencode%> class="region" ></td>
				</tr>
				
				<tr>
				<td>Clerk: </td><td><input type="text" name="clerk" id="clerk"  STYLE="width: 250px" class="clerk" title="Select clerk " value=<%=userName %> readonly="readonly"></td></tr>
		 		
			<%
		 						}
		 					%>
			
						
						
			<tr>
				<td><input type="submit" name="ok" value="Ok"></td>
			</tr>
		</table>
	</form>
</div>

		


</td>
</tr>


</table>
<%@include file="includes/footer.jsp"%>
</div>
</body>
</html>