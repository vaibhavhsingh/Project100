package com.questionbank.security;

import com.questionbank.core.context.Context;
import com.questionbank.core.dataobjects.User;
import com.questionbank.security.exceptions.UserNotFoundException;

public interface QBAuthenticationManager {
	User login(Context ctx, String loginId, String password, int role) throws UserNotFoundException;
}
