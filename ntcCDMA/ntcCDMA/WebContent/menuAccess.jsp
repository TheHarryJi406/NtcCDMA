
<%@page import="com.designco.ntbilling.dao.BankDescDao"%>
<%@page import="com.designco.ntbilling.dao.RoleDao"%>
<%@page import="com.designco.ntbilling.dao.MenuAccessDao"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@page import="com.designco.ntbilling.dao.TempDao"%>
<%@include file="checkUser.jsp"%>
<%
String pageName = "menuAccess.jsp";
String collCen = session.getAttribute("ccCode").toString();
String userId = session.getAttribute("username").toString();
MenuAccessDao menuAccDao= (MenuAccessDao) Context.get().getBean("menuAccessDao");

if (menuAccDao.checkMenuAccessForUser(userId, pageName)==false) {
	response.sendRedirect("index.jsp");
	return;
}

RoleDao roleDao = (RoleDao) Context.get().getBean("roleDao");
String message = "";

String mode = request.getParameter("mode");
mode = mode==null ? "" : mode;

String code= request.getParameter("role");
code = code==null ? "" : code;

List<Map> lst = menuAccDao.getFromMenu();
List<Map> list1 = menuAccDao.getByRoleCode(code);


// String code = request.getParameter("role");

String addNew = request.getParameter("addNew");
if (addNew != null) {
	menuAccDao.delete(code, session);
	String role = request.getParameter("role");
	String menu[]=request.getParameterValues("menu");
	
	
	//System.out.println(menu[0]);
	if(menu!=null){
	menuAccDao.save(role, menu, session);
	}
// 	if(tempPostFlag.equals("N")){
// 		paymentCollectionDao.updateForCancellation(tempReceiptNo, session);
// 		message="Cancelled Successfully.";
// 	}
// 	else{
// 		message="Sorry The Transaction is Already Posted. It can't be Cancelled.";
// 	}
	
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
<link href="css/style-ntc.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/jquery.validate.js"></script>
<link rel="stylesheet" href="print.css" type="text/css" media="print" />
<script type="text/javascript" src="js/jquery.autocomplete.js"></script>
<script src="js/check.js"></script>


</head>
<body>
<div id="wraper">
<%@include file="includes/header.jsp"%>

<script>
$(document).ready(function() {
	$("a.delete").click(function(e){
		if (confirm("Are you sure you want to delete?")) {
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
		<td valign="top" align="left">
		<br />
		<div align="left">
				<form id="form1"  action="menuAccess.jsp" method="post" >
				Role: <select onchange="this.form.submit();" name="role" STYLE="width: 170px">
				<option value="">Select</option>
				<%
					List<Map> lists=roleDao.getAll();
					for(Map m:lists){
				%>
					<option value=<%=m.get("ROLE_CODE") %> <%  if(m.get("ROLE_CODE").equals(code)) {out.write("selected");}  %>><%=m.get("DESCRIPTION") %></option>	
				<%
					}
				%>
				</select>
				
			</div>
			
			<div>
			<% if(code!=null&&code!=""){%>
			<H3> Menus : <%=code %></H3>
			<table width="98%" style="border-collapse: collapse;">
				<tr>
					<th>S.No.</th>
					<th colspan="2">Description</th>
				</tr>
				<%
				
				int i = 0;
				List<Map> list=menuAccDao.getAll();
				//List<Map> lst = menuAccDao.getAll();
				for (Map m : list)
				{
					String menuCode = m.get("MENU_CODE").toString();
					String flg = menuAccDao.verify(menuCode, code);

					i++;
				%>
					<tr onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';" style="background-color: #d4e3e5;">

					<td><%=i %></td>
					<td><%=m.get("DESCRIPTION") %></td>
					<td><input type="checkbox" name="menu" id="menu" value="<%=m.get("MENU_CODE") %>" <% if(flg=="Y") {%>checked <%} %>></td>
					
				</tr>
				<%
				}

				%>
				<tr><td colspan="3"><input type="submit" value="Save" name="addNew"></td></tr>
			</table>
			</form>
			</div>
			<%} %>
		
		</div>
		</td>
	</tr>
	<tr>
		<td colspan="2"><%@include file="includes/footer.jsp"%></td>
	</tr>
</table>


</body>
</html>