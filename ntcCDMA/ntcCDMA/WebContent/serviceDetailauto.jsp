
<%@page import="com.designco.ntbilling.util.Context"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@page import="com.designco.ntbilling.dao.SrvDetailDao"%>
<%@page import="java.math.BigDecimal"%>
<%@page import="java.sql.ResultSet"%>
<%
	String key = request.getParameter("q");
	if (key != null && key.length() > 0) {
// 		Connection connection = (Connection) request
// 				.getAttribute("connection");
// 		Billing billing = new Billing(connection);
	SrvDetailDao srvDetailDao= (SrvDetailDao) Context.get().getBean("srvDetailDao");
	List<Map> lst=srvDetailDao.getByCode(key);
	for(Map m:lst){
		String serviceNo=m.get("SERVICE_NO").toString();
		String serviceName=m.get("NAME").toString();
		String serviceAcNo=m.get("ACCOUNT_NO").toString();
		String serviceOsAmt=m.get("OS_AMT").toString();
		String serviceProductId=m.get("PRODUCT_ID").toString();
		String depBal=m.get("DEPOSIT_BAL").toString();
		out.println(serviceNo + "<span>" + serviceName +  "</span>" + serviceAcNo + "-" + serviceOsAmt + "-" + serviceProductId+ "-" + depBal );
// 		out.println("<span style='display:none;'  >"+serviceAcNo+"</span>"); 
// 		System.out.println(serviceName);
	}
	}
%>