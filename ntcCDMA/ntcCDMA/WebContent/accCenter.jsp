

<%@page import="com.designco.ntbilling.dao.AccCenterDao"%>
<%@page import="com.designco.ntbilling.dao.RegionDao"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@include file="checkUser.jsp" %>

<%
String pageName = "accCenter.jsp";
String collCen = session.getAttribute("ccCode").toString();
String userId = session.getAttribute("username").toString();
MenuAccessDao menuAccessDao= (MenuAccessDao) Context.get().getBean("menuAccessDao");

if (menuAccessDao.checkMenuAccessForUser(userId, pageName)==false) {
	response.sendRedirect("index.jsp");
	return;
}

String message="";

AccCenterDao accCenterDao=(AccCenterDao)Context.get().getBean("accCenterDao");
RegionDao regionDao=(RegionDao)Context.get().getBean("regionDao");

String mode = request.getParameter("mode");
mode = mode==null ? "" : mode;

String cod = request.getParameter("code");
cod = cod==null ? "" : cod;

String tempSearchReg = request.getParameter("selectRegionCode");
tempSearchReg = tempSearchReg==null ? "" : tempSearchReg;

String add=request.getParameter("addnew");
if(add!=null){
String code=request.getParameter("code");
String desc=request.getParameter("description");
String regionCode=request.getParameter("regionCode");
message=accCenterDao.save(code, desc, regionCode, session);
tempSearchReg=regionCode;
//message="Saved Successfully";

}

if (mode.equals("delete")){
	String code=request.getParameter("code");
	if(code!=null){
	message=accCenterDao.delete(code,session);
	String regionCode=request.getParameter("regCod");
	tempSearchReg=regionCode;
	//message="Delete Successfully";
		}
	
}

String editbutton=request.getParameter("editButton");
if (editbutton!=null){
String	code=request.getParameter("code");
String desc=request.getParameter("description");
String regionCode=request.getParameter("regionCode");
message=accCenterDao.update(code, desc, regionCode, session);
tempSearchReg=regionCode;
//message="Successfully Updated";
 
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
<link href="css/jquery.datepick.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/jquery.autocomplete.js"></script>
<script type="text/javascript" src="js/jquery.datepick.js"></script>
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
	$("#form1").validate({

		rules : {
			code : "required",// simple rule, converted to {required:true}   
			description : {// compound rule   
				required : true

			},

	
	description : {// compound rule   
		required : true

	},

	regionCode : {// compound rule   
		required : true

	}

	
		}
	});

});
</script>


<table width="100%" class="yform">



<tr>
<td valign="top" width="200px" ><%@include file="includes/leftmenu.jsp" %></td>
<td valign="top" align="left">
<h2>Account Center</h2>
<br/><br/>
<div align="center">
	<%=message %> 
</div>


<%if (mode.equals("add"))
			{
%> 			<div>
				<form id="form1"  action="accCenter.jsp" method="post" >
					<table>
						<tr>
							<td>Code</td>
							<td><input type="text" name="code" id="code"  class="code" title="Enter Code" style="width:225px;"></td>
						</tr>
						<tr>
							<td>Description</td>
							<td><input type="text" name="description" id="description"  class="description" title="Enter description" style="width:225px;"></td>
						</tr>
						<tr>
							<td>Region</td>
							<td>
									<select name="regionCode" id="regionCode" class="regionCode" title="Select Region" style="width:225px;">
										<option value="">Select</option>
										<%
										List<Map> lists=regionDao.getAll();
											for(Map m:lists){
										%>
										<option value=<%=m.get("REGION_CODE") %>><%=m.get("DESCRIPTION")%></option>	
										<%
												}
										%>
							
									</select>
							</td>
						</tr>
						<tr>
							<td><input type="submit" name="addnew" value="Save"></td></tr>
					</table>
	
					</form>
			</div>
			<% 
				}
	
	else if(mode.equals("edit")){
		String code=request.getParameter("code").toString();
		List list1=accCenterDao.getByCode(code);
		Map map=(Map)list1.get(0);
		
%>
			<div>
				<form id="form1" action="accCenter.jsp" method="post" >
					<table>
						<tr>
							<td>Code</td>
							<td><input type="text" name="code" id="code" value="<%=map.get("ACC_CEN_CODE") %>" class="code" title="Enter Code" readonly="readonly" style="width:225px; border: none; background-color: transparent;"></td>
						</tr>
						<tr>
							<td>Description</td>
							<td><input type="text" name="description" id="description" value="<%=map.get("DESCRIPTION") %>" class="description" title="Enter description" style="width:225px;"></td>
						</tr>
						<tr>
							<td>Region</td>
							<td>
									<select name="regionCode" id="regionCode" class="regionCode" title="Select Region" style="width:225px;">
										<option value="">Select</option>
										<%
										List<Map> lists=regionDao.getAll();
											for(Map m:lists){
										%>
										<option value=<%=m.get("REGION_CODE") %> <%  if(m.get("REGION_CODE").equals(map.get("REGION_CODE"))) {out.write("selected");}  %> ><%=m.get("DESCRIPTION")%></option>	
										<%
												}
										%>
							
									</select>
							</td>
						</tr>
						<tr>
							<td><input type="submit" name="editButton" value="Save"></td></tr>
					</table>
			</form>
		</div>
<%		
	}

else{
%>
<div style="text-align: right;"><a href="accCenter.jsp?mode=add" >
<img style="padding-right: 10px;" src="images/add new.png" alt=""><p>Add New</p>
</a></div>
<div class="tableView">
<%
	List<Map> listRegion=regionDao.getAll();

	%>	

<form action="" method="post" >
	Region Code: <select style="width:225px;" name="selectRegionCode" onchange="this.form.submit();" >
					<option value="">Select</option>
					<%
					for(Map m:listRegion){
					%>
						<option value=<%=m.get("REGION_CODE") %> <%  if(m.get("REGION_CODE").equals(tempSearchReg)) {out.write("selected");}  %>><%=m.get("DESCRIPTION")%></option>	
					<%
					}
					%>
							
				</select>
</form>
<br>
<%
}
%>

<table width="98%" class="color">
<tr>
<th>S.No.</th>
<th>Code</th>
<th>Description</th>
<th>Region</th>
<th>Action</th>
</tr>

<%
int i=0;
List<Map> lists=accCenterDao.getByRegionCode(tempSearchReg);
for(Map m:lists){
	String code=m.get("ACC_CEN_CODE").toString();
	i++;
	%>
<tr onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';" style="background-color: #d4e3e5;">	
<td> <%=i %>   </td>
	<td> <%=code %>   </td>
	<td> <%=m.get("DESCRIPTION") %> </td>
	<td> <%=m.get("REGION_CODE") %> </td>
	<td id="actionrow"> <a href="accCenter.jsp?mode=edit&code=<%=code%>">Edit</a>&nbsp;|
	<a href="accCenter.jsp?mode=delete&code=<%=code%>&regCod=<%=m.get("REGION_CODE") %>" class="delete">Delete</a></td>
	</tr>
	
	<%
}
%>


</table>
</div>

</td>
</tr>


</table>
<%@include file="includes/footer.jsp"%>
</div>

</body>
</html>