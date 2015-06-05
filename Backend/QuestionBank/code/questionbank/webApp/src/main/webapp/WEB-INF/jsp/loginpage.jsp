<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@include file="includes/meta.jsp" %>
<title><spring:message code="label.appname" /> - <spring:message code="label.login" /></title>
</head>
<body>
<div id="page">
	<div class="headerDiv"><%@ include file="includes/header_login.jsp" %></div>
	<div class="mainContent">
		<div id="content">
			<div id="login-error" class="hideDiv">${error}</div>
			<div>
				<form action="<%=request.getContextPath()%>/web/default/login" method="post">
					<div>
						<label for="username"><spring:message code="label.username" /></label>
						<input id="username" name="username" type="text" value=""/>
					</div>

					<div>
						<label for="passwd"><spring:message code="label.password" /></label>
						<input id="passwd" name="passwd" type="password" value=""/>
					</div>
					
					<div>
						<label for="blank"></label>
						<input class="login"  type="submit" value='<spring:message code="label.login" />'/>
						<a href="<%=request.getContextPath()%>/web/default/register"/><spring:message code="label.register" /></a>	
					</div>
				</form> 
			</div>
		</div>
	</div>
	<div class="footerDiv"><%@ include file="includes/footer.jsp" %></div>
</div>
</body>
</html>