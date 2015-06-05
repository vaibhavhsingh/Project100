<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@include file="includes/meta.jsp" %>
<title><spring:message code="label.appname" /> - <spring:message code="label.upload.invoice.page" /></title>
</head>
<body>
<div id="page">
	<div class="headerDiv"><%@ include file="includes/header.jsp" %></div>
    <div class="mainContent">	
		<div id="content">
			<div id="login-error" class="hideDiv">${error}</div>
			<form:form action="uploadInvoiceForm" method="post" enctype="multipart/form-data" modelAttribute="invoiceForm">
				<div class="text">
					<label for="invoiceId"></label>
					<input id="invoiceId" name="invoiceId" type="hidden" value="${invoiceForm.invoiceId}"/>
				</div>
				<div class="text">
					<label for="billNo"><spring:message code="label.upload.invoice.billno" /></label>
					<input id="billNo" name="billNo" type="text" />
				</div>
				<div class="text">
					<label for="shopName"><spring:message code="label.upload.invoice.shopName" /></label>
					<input id="shopName" name="shopName" type="text" />
				</div>
				<div class="text">
					<label for="billFirstName"><spring:message code="label.upload.invoice.billFirstName" /></label>
					<input id="billFirstName" name="billFirstName" type="text" />
				</div>
				<div class="text">
					<label for="billLastName"><spring:message code="label.upload.invoice.billLastName" /></label>
					<input id="billLastName" name="billLastName" type="text" />
				</div>
				<div class="text">
					<label for="billAmount"><spring:message code="label.upload.invoice.billAmount" /></label>
					<input id="billAmount" name="billAmount" type="text" />
				</div>
				<div class="text">
					<label for="dateOfPurchase"><spring:message code="label.upload.invoice.dateOfPurchase" /></label>
					<input id="dateOfPurchase" name="dateOfPurchase" type="text" />
				</div>
				<div class="text">
					<label for="description"><spring:message code="label.upload.invoice.productDescription" /></label>
					<textarea id="description" name="description" ></textarea>
				</div>
				<div class="text">
					<label for="invoiceFile"><spring:message code="label.upload.invoice.file" /></label>
					<input id="invoiceFile" name="invoiceFile" type="file" />
				</div>
				<div>

						<%@ include file="invoice_details.jsp"%>
					
				<div>
				<div class="text">
					<label for="blank"></label>
					<span>
					<input class="button" type="submit" value='<spring:message code="label.upload.invoice.submit" />'/>
					<input class="button" type="button" value='<spring:message code="label.cancel" />' onClick="homePage()"/>
					</span>
				</div>
			</form:form>
		</div>
	</div>
	<div class="footerDiv"><%@ include file="includes/footer.jsp" %></div>
</div>

</body>
</html>

<script>
function homePage(){
	window.location.href = "<%=request.getContextPath()%>/web/default/login";
}
</script>