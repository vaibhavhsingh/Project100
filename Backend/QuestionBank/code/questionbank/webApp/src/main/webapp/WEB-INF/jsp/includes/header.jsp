<div class="header">
	<div id="top">
		<div id="logo"></div>
		<div id="blank_header"></div>
		<div id="loginBtnDiv">
			<c:if test="true">
				<a class="login" href="<%=request.getContextPath()%>/web/user/logout"/>Logout</a>
			</c:if>
		</div>
	</div>
	<div id="menuDiv">
		<div id="cssmenu">
			<ul>
			   <li class='active'><a href='<%=request.getContextPath()%>/'><span>Home</span></a></li>
			   <li><a href='#'><span>Products</span></a></li>
			   <li><a href='#'><span>About</span></a></li>
			   <li class='last'><a href='#'><span>Contact</span></a></li>
			</ul>
		</div> 
	</div>
</div>