<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@include file="includes/meta.jsp" %>
<title><spring:message code="label.appname" /> - Home</title>
</head>
<body>
<div id="page">
	<div class="headerDiv"><%@ include file="includes/header.jsp" %></div>
    <div class="mainContent">	
		<div id="content">
			<h1>Common Page</h1>
			<p>Every Logged in user has access to this page.</p>
			<h2>Home Page.</h2>
			<p><a href="<%=request.getContextPath()%>/web/user/uploadInvoiceForm">Upload Invoice</a></p>
			<p><a href="<%=request.getContextPath()%>/web/user/loadInvoices">Load Invoice</a></p>
		</div>
	</div>
	<div class="footerDiv"><%@ include file="includes/footer.jsp" %></div>
</div>

</body>
</html>