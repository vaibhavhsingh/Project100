package com.questionbank.rest.auth;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.questionbank.core.dataobjects.User;
import com.questionbank.core.logger.Logger;
import com.questionbank.core.logger.impl.LogUtils;
import com.questionbank.rest.auth.UserAuthService;
import com.questionbank.security.QBAuthenticationManager;
import com.questionbank.security.exceptions.UserNotFoundException;

public class UserAuthServiceImpl implements UserAuthService{
	
	private Logger logger = LogUtils.getLogger(UserAuthServiceImpl.class.getName());
	
	@Autowired
	private QBAuthenticationManager qbAuthMgr;
	
	@POST
	@Path("/login")
	@Produces({"application/xml","application/json"})
	@Consumes({"application/xml","application/json","application/x-www-form-urlencoded"})
	@Override
	public Response authorizeUser(@FormParam("userId")String userId, @FormParam("pwd")String password) {
		logger.info(null,"Enter authorizeUser");
		try {
			User user = qbAuthMgr.login(null, userId, password, 1);
			if(user == null){
				return Response.status(Response.Status.BAD_REQUEST).build();
			}else{
				return Response.ok(user).build();
			}
		} catch (UserNotFoundException e) {
			logger.error(null,"Exception occured!!!", e);
		} catch (Exception e){
			logger.error(null,"Unknown Exception has occured!!!", e);
		} finally{
			logger.info(null,"Exit authorizeUser");	
		}
		return Response.status(Response.Status.BAD_REQUEST).build();
	}
}
