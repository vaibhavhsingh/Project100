<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@include file="includes/meta.jsp" %>
<title><spring:message code="label.appname" /> - <spring:message code="label.register" /></title>
</head>
<body>
<div>
	<div class="headerDiv"><%@ include file="includes/header_login.jsp" %></div>
    <div class="centerDiv">	
		<div id="login-error" class="hideDiv">${error}</div>
		<form action="<%=request.getContextPath()%>/web/default/register" method="post" >
			<div class="text">
				<label for="firstName"><spring:message code="label.firstName" /></label>
				<input id="firstName" name="firstName" type="text" />
			</div>
			<div class="text">
				<label for="middleName"><spring:message code="label.middleName" /></label>
				<input id="middleName" name="middleName" type="text" />
			</div>
			<div class="text">
				<label for="lastName"><spring:message code="label.lastName" /></label>
				<input id="lastName" name="lastName" type="text" />
			</div>
			<div class="text">
				<label for="email"><spring:message code="label.email" /></label>
				<input id="email" name="email" type="text" />
			</div>
			<div class="text">
				<label for="password"><spring:message code="label.password" /></label>
				<input id="password" name="password" type="password" />
			</div>
			<div class="text">
				<label for="blank"></label>
				<span>
				<input class="button" type="submit" value='<spring:message code="label.register" />'/>
				<input class="button" type="button" value='<spring:message code="label.cancel" />' onClick="homePage()"/>
				</span>
			</div>
		</form>
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