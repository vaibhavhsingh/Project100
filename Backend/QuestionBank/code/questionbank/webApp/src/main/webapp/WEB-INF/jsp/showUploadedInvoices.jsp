<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@include file="includes/meta.jsp" %>
<title><spring:message code="label.appname" /> - Invoice List</title>
</head>
<body>
<div>
	<div class="headerDiv"><%@ include file="includes/header.jsp" %></div>
    <div class="middleDiv">	
		<h3>File name : "<strong> ${invoiceList[0].invoiceId}</strong>" uploaded successfully ! </h3>  
	</div>
	<div class="footerDiv"><%@ include file="includes/footer.jsp" %></div>
</div>

</body>
</html>