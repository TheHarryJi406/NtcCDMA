<div class="banner">
<div class="logo"><img src="images/ntc-logo.jpg" width="255" height="63" /></div>
<div class="header-title">
  <h2><span style="color:#69b00c; font-size:1.5em;">CDMA</span> Online Payment Module </h2>
  <%
  if (session.getAttribute("username") == null) {
	%>
	Please login first.
	<%  
  }
  else {
  %>
    Welcome, <strong><%= session.getAttribute("username").toString() %>!!! </strong><br>
	<a href="logout.jsp" ><img style="padding-left: 0px;" src="images/logout.png" alt="" ></a>
  <%
  }
  %>  
  </div>
<div class="clear"></div>

<br><br>
</div>