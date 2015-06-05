package com.questionbank.services.user.impl;

import com.questionbank.core.context.Context;
import com.questionbank.core.dataobjects.User;
import com.questionbank.core.logger.Logger;
import com.questionbank.core.logger.impl.LogUtils;
import com.questionbank.services.impl.QBCoreServiceImpl;
import com.questionbank.services.user.QBAuthenticationService;

public class QBAuthenticationServiceImpl extends QBCoreServiceImpl implements
		QBAuthenticationService {
	private Logger log = LogUtils.getLogger(QBAuthenticationServiceImpl.class
			.getName());

	@Override
	public User fetchUser(Context ctx, String loginId) {
		log.debug(ctx, "Enter method fetchUser with password");

		log.debug(ctx, "Exit method fetchUser with password");
		return null;

	}

	@Override
	public User loginUser(Context ctx, String loginId, String password, int role) {
		log.debug(ctx, "Enter method loginUser with password");

		log.debug(ctx, "Exit method loginUser with password");
		return null;
	}
}
