package com.questionbank.services.user.impl;

import com.questionbank.core.context.Context;
import com.questionbank.core.dataobjects.User;
import com.questionbank.core.logger.Logger;
import com.questionbank.core.logger.impl.LogUtils;
import com.questionbank.services.exceptions.DBException;
import com.questionbank.services.exceptions.DuplicateUserException;
import com.questionbank.services.impl.QBCoreServiceImpl;
import com.questionbank.services.user.QBUserService;

public class QBUserServiceImpl extends QBCoreServiceImpl implements
		QBUserService {

	private static final Logger log = LogUtils
			.getLogger(QBUserServiceImpl.class.getName());

	@Override
	public boolean registerUser(Context ctx, User user) throws DBException,
			DuplicateUserException {
		log.debug(ctx, "");
		return false;
	}

}
