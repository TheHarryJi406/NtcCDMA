

<%@page import="com.designco.ntbilling.dao.RegionDao"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@include file="checkUser.jsp" %>

<%
String pageName = "region.jsp";
String collCen = session.getAttribute("ccCode").toString();
String userId = session.getAttribute("username").toString();
MenuAccessDao menuAccessDao= (MenuAccessDao) Context.get().getBean("menuAccessDao");

if (menuAccessDao.checkMenuAccessForUser(userId, pageName)==false) {
	response.sendRedirect("index.jsp");
	return;
}

String message="";

RegionDao regionDao=(RegionDao)Context.get().getBean("regionDao");
String mode = request.getParameter("mode");
mode = mode==null ? "" : mode;

String add=request.getParameter("addnew");
if(add!=null){
String code=request.getParameter("code");
String desc=request.getParameter("description");
message = regionDao.save(code,desc,session);
//message="Saved Successfully";

			}
if (mode.equals("delete")){
	String code=request.getParameter("code");
	if(code!=null){
		System.out.println("tilak code:"+code);
	message = regionDao.delete(code,session);
	//message="Delete Successfully";
		}
	
		}

String editbutton=request.getParameter("editButton");
if (editbutton!=null){
String	code=request.getParameter("code");
String desc=request.getParameter("description");
regionDao.update(code,desc,session);

message="Successfully Updated";

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
	$("#form_add").validate({

		rules : {
			code : "required",// simple rule, converted to {required:true}   
			description : {// compound rule   
				required : true

			}

		}
	});

});
</script>

<div>
<table width="100%" class="yform" >

<tr>
<td valign="top" width="225px" ><%@include file="includes/leftmenu.jsp" %></td>
<td valign="top" align="left">
<h2>Region</h2>

<div align="center"><%=message %></div>

<div valign="left"> 
<%if (mode.equals("add"))
{
	%> <form id="form_add" action="region.jsp" method="post" onsubmit="submitAddForm();">
	<table >
	<tr>
		<td>Code</td>
		<td><input type="text" name="code" id="code" value="" class="code" title="Enter Code" style="width:225px;"></td>
	</tr>
	<tr>
		<td>Description</td>
		<td><input type="text" name="description" id="description" value="" class="description" title="Enter Description" style="width:225px;"></td>
	</tr>
	<tr>
		<td><input type="submit" name="addnew" value="Save"></td></tr>
	</table>
	
	
	
	</form>
	<% 
	}

else if(mode.equals("edit")){
	String code=request.getParameter("code").toString();
	List lists=regionDao.getByCode(code);
	Map map=(Map)lists.get(0);
	
	%>
	<form action="region.jsp" method="post" id="form_add">
	<table >
	<tr>
	<td>Code</td>
	<td><input type="text" name="code"  value="<%=map.get("REGION_CODE") %>" readonly="readonly" style="width:225px;"></td>
	</tr>
	
	<tr>
	<td>Description</td>
	<td><input type="text" name="description" value="<%=map.get("DESCRIPTION") %>" style="width:225px;"></td>
	</tr>
	<tr>
	<td><input type="submit" name="editButton" value="Save"></td></tr>
	</table>
	
	
	
	</form>
	<%
}

	%>
	
	
	  </div>

<div style="text-align: right;"><a href="region.jsp?mode=add" ><img style="padding-right: 10px;" src="images/add new.png" alt=""><p>Add New</p></a></div><br>

<table width="98%" class="color">
<tr>
<th>S.No.</th>
<th>Code</th>
<th>Description</th>
<th>Action</th>
</tr>

<%
int i=0;
List<Map> lists=regionDao.getAll();
for(Map m:lists){
	String code=m.get("REGION_CODE").toString();
	i++;
	%>
	<tr onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';" style="background-color: #d4e3e5;">	<td> <%=i %>   </td>
	<td> <%=code %>   </td>
	<td> <%=m.get("DESCRIPTION") %>   </td>
	<td id="actionrow"> <a href="region.jsp?mode=edit&code=<%=code%>">Edit</a>&nbsp;|
	<a href="region.jsp?mode=delete&code=<%=code%>" class="delete">Delete</a>   </td>
	</tr>
	
	<%
}
%>


</table>
</td>
</tr>


</table>

</div>
<%@include file="includes/footer.jsp"%>
</div>
</body>
</html>