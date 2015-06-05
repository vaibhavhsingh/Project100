package com.questionbank.user.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.questionbank.core.context.Context;
import com.questionbank.core.dataobjects.User;
import com.questionbank.security.exceptions.UserNotRegisteredException;
import com.questionbank.services.exceptions.DBException;
import com.questionbank.services.exceptions.DuplicateUserException;
import com.questionbank.services.user.QBUserService;
import com.questionbank.user.QBUserManager;

public class UserManagerImpl implements QBUserManager {

	@Autowired
	private QBUserService qbUserService;

	@Override
	public boolean registerUser(Context ctx, User user) throws UserNotRegisteredException, DuplicateUserException {
		boolean isSaved;
		try {
			isSaved = qbUserService.registerUser(ctx, user);
		} catch (DBException e) {
			throw new UserNotRegisteredException(e);
		} catch (Exception e) {
			throw new UserNotRegisteredException(e);
		}
		return isSaved;
	}
}
