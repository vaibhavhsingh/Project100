package com.questionbank.security.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.questionbank.core.context.Context;
import com.questionbank.core.dataobjects.User;
import com.questionbank.core.logger.Logger;
import com.questionbank.core.logger.impl.LogUtils;
import com.questionbank.security.QBAuthenticationManager;
import com.questionbank.security.exceptions.UserNotFoundException;
import com.questionbank.services.user.QBAuthenticationService;

public class QBAuthenticationManagerImpl implements QBAuthenticationManager{
	
	private Logger logger = LogUtils.getLogger(QBAuthenticationManagerImpl.class.getName());
	
	@Autowired
	private QBAuthenticationService qbAuthService;

	@Override
	public User login(Context ctx, String loginId, String password, int role) throws UserNotFoundException{
		logger.info(ctx, "Enter login");
		try{
			User user = qbAuthService.loginUser(ctx, loginId, password, role);
			if(user == null)
				throw new UserNotFoundException("user not found");
			return user;
		}catch(Exception e){
			logger.error(ctx, e);
			throw new UserNotFoundException("", e);
		}finally{
			logger.info(ctx, "Exit login");	
		}
	}
}
