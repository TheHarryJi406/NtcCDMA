
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@page import="com.designco.ntbilling.util.Context"%>
<%@page import="com.designco.ntbilling.dao.PaymentCollectionDao"%>
<%@page import="java.io.FileWriter"%>
<%
if(request.getParameter("ok")!=null){
	
	
	PaymentCollectionDao paymentCollectionDao = (PaymentCollectionDao) Context.get().getBean("paymentCollectionDao");
	String path="D://file.CSV";
	FileWriter fw = new FileWriter(path);
	List<Map> lst=paymentCollectionDao.getTransactionBySystemDate();
	String cancelledSoNbr="";
	String cancelledStatus="";
	String cancelledDate="";
 	String remark="";
	for(Map m:lst){
// 		SRV_NO,SO_NUMBER,CANCEL_SO_NUMBER,TOTAL_AMT,CREATED_DATE,CANCEL_STATUS,CANCELLED_DT,REMARK
	 	
 
if((m.get("TRANS_TYPE").toString()).equals("DEPS")){
 			remark="DEPOSIT";
		}
		
		else{
			remark="";
		}


		if(m.get("CANCEL_SO_NUMBER")!=null){
					
		 			cancelledSoNbr=m.get("CANCEL_SO_NUMBER").toString();
				}
				
				else{
					cancelledSoNbr="";
				}
		
		
		if(m.get("CANCEL_STATUS")!=null){
			
				cancelledStatus=m.get("CANCEL_STATUS").toString();
		}
		
		else{
			cancelledStatus="";
		}
		
		if(m.get("CANCELLED_DT")!=null){
			
				cancelledDate=m.get("CANCELLED_DT").toString();
		}
		
		else{
			cancelledDate="";
		}
		 String print_val=m.get("SRV_NO").toString()+","+m.get("SO_NUMBER").toString()+","+cancelledSoNbr+","+m.get("TOTAL_AMT").toString()+","+
								m.get("CREATED_DATE").toString()+","+cancelledStatus+","+cancelledDate+","+remark;

		System.out.println(print_val); 
		
		 		fw.write(print_val+ "\n" );
		
	}
	
	fw.close();
	 
}


%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="" method="post">
<input type="submit" value="ok" name="ok">
</form>


</body>
</html>

