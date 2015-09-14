<%@page import="com.designco.ntbilling.dao.ItemDao"%>
<%@page import="com.designco.ntbilling.dao.ItemCategoryDao"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@page import="com.designco.ntbilling.dao.RoleDao"%>
<%@include file="checkUser.jsp" %> 

<%
String pageName = "item.jsp";
String collCen = session.getAttribute("ccCode").toString();
String userId = session.getAttribute("username").toString();
MenuAccessDao menuAccessDao= (MenuAccessDao) Context.get().getBean("menuAccessDao");

if (menuAccessDao.checkMenuAccessForUser(userId, pageName)==false) {
	response.sendRedirect("index.jsp");
	return;
}

String message="";
String selectedItemCategory = request.getParameter("selectItemCategory");
ItemDao itemDao=(ItemDao)Context.get().getBean("itemDao");
ItemCategoryDao itemCategoryDao=(ItemCategoryDao)Context.get().getBean("itemCategoryDao");
List<Map> itemCategoryList=itemCategoryDao.getAll();

String mode = request.getParameter("mode");
mode = mode==null ? "" : mode;


if (mode.equals("delete")){
	String code=request.getParameter("code");
	if(code!=null){
	message = itemDao.delete(code,session);
	//message="Delete Successfully";
		}
	
}

String add=request.getParameter("addnew");
if(add!=null){
String desc=request.getParameter("description");
String categoryCode=request.getParameter("comboCategory");
message = itemDao.save(desc,categoryCode,session);
//message="Saved Successfully";

}

String editbutton=request.getParameter("editButton");
if (editbutton!=null){
String	code=request.getParameter("code");
String desc=request.getParameter("description");
String categoryCode=request.getParameter("comboCategory");

itemDao.update(code,desc,categoryCode,session);
message="Successfully Updated";
}

	
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
	$("#itemForm").validate({

		rules : {
			description : {
				required : true,
				
			},
			comboCategory : {// compound rule  
				required : true
				
			}
		}
	});

});
</script>


<table width="100%" class="yform">

<tr>
<td valign="top" width="200px"><%@include file="includes/leftmenu.jsp" %></td>
<td valign="top" align="left">
<h2>Item</h2>
<div align="center"><%=message %></div>
<div>
<%if (mode.equals("add"))
{
%>  <form action="item.jsp" method="post" id="itemForm">
	<table>
	<tr>
	<td>Description</td>
	<td><input type="text" name="description" value=""></td>
	</tr>
	<tr>
	<td>Item Category</td>
	<td><select name="comboCategory" id="comboCategory">
	<option value="">Select</option>
	<%  
	for(Map m:itemCategoryList){
	%>
		<option value=<%=m.get("CATEGORY_CODE") %>><%=m.get("DESCRIPTION") %></option>
			<% 
			}
  %>
	
	</select></td>
	</tr>
	
	<tr>
	<td><input type="submit" name="addnew" value="Save"></td></tr>
	</table>
	</form>
</div>
	<%}
	else if(mode.equals("edit")){
 		String code=request.getParameter("code").toString();
 		List<Map> itemListByCode=itemDao.getByCode(code);
 		Map map=(Map)itemListByCode.get(0);
 		
 	%>
 	<div>
 	<form action="item.jsp" method="post" id="itemForm">
	<table>
	<tr>
	<td>Code</td>
	<td><input type="text" name="code" value="<%=map.get("ITEM_CODE") %>" readonly="readonly" class="readonly"></td>
	</tr>
	
	<tr>
	<td>Description</td>
	<td><input type="text" name="description" value="<%=map.get("DESCRIPTION") %>"></td>
	</tr>
	<tr>
	<td>Item Category</td>
	<td><select name="comboCategory" id="combo_category" >
	<%  
	for(Map m:itemCategoryList){
		%>
		<option value=<%=m.get("CATEGORY_CODE") %> <% if(m.get("CATEGORY_CODE").equals(map.get("CATEGORY_CODE"))) { out.write("selected"); } %>><%=m.get("DESCRIPTION") %></option>
		
<%-- 		<option value=<%=m.get("CATEGORY_CODE") %>><%=m.get("DESCRIPTION") %></option> --%>
			<% 
			
	}
  %>
	
	
	</select></td>
	</tr>
	
	<tr>
	<td><input type="submit" name="editButton" value="Save"></td></tr>
	</table>
	</form>
 	</div>	
 	<%	
 	}else{
	%>

<div style="text-align: right;"><a href="item.jsp?mode=add" ><img style="padding-right: 10px;" src="images/add new.png" alt=""><p>Add New</p></a></div>
<div>

<%
selectedItemCategory = (selectedItemCategory == null) ? "" : selectedItemCategory;
%>
<form action="" method="post" style="font-size: 14px;">
Item Category: &nbsp;<select name="selectItemCategory" onchange="this.form.submit()">
<option  value="">Select</option>
<%
String selectedCategoryDesc="";
for(Map m:itemCategoryList){
	String categoryCode=m.get("CATEGORY_CODE").toString();
	String categoryDesc=m.get("DESCRIPTION").toString();
	selectedCategoryDesc=categoryDesc;
	%>
	<option value="<%=categoryCode%>" <%if(selectedItemCategory.equals(categoryCode)){out.write("selected");} %>><%=categoryDesc%></option>
	<%
}%>
</select></form><br><%} %>
<table width="98%" class="color">
<tr>
<th>S.No.</th>
<th>Description</th>
<th>Category Desc</th>
<th>Action</th>
</tr>

<%

int i=0;
List<Map> lists=itemDao.getByCategoryCode(selectedItemCategory);
for(Map m:lists){
	String code=m.get("ITEM_CODE").toString();
	i++;
	%>
	<tr onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';" style="background-color: #d4e3e5;">	
	<td> <%=i %>   </td>
	<td> <%=m.get("DESCRIPTION") %>   </td>
	<td> <%=m.get("CAT_DESCRIPTION") %>   </td>
	<td id="actionrow"> <a href="item.jsp?mode=edit&code=<%=code%>">Edit</a>&nbsp;|
	<a href="item.jsp?mode=delete&code=<%=code%>" class="delete">Delete</a>   </td>
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
</div>
</body>
</html>