package com.questionbank.services.user;

import com.questionbank.core.context.Context;
import com.questionbank.core.dataobjects.User;
import com.questionbank.services.QBCoreService;

public interface QBAuthenticationService extends QBCoreService{
	User fetchUser(Context ctx, String loginId);
	User loginUser(Context ctx, String loginId, String password, int role);
}
