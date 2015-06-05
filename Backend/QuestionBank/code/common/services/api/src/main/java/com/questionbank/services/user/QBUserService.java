package com.questionbank.services.user;

import com.questionbank.core.context.Context;
import com.questionbank.core.dataobjects.User;
import com.questionbank.services.QBCoreService;
import com.questionbank.services.exceptions.DBException;
import com.questionbank.services.exceptions.DuplicateUserException;

public interface QBUserService extends QBCoreService{
	boolean registerUser(Context ctx, User user) throws DBException, DuplicateUserException;
}
