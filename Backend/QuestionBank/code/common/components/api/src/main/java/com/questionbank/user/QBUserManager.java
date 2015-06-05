package com.questionbank.user;

import com.questionbank.core.context.Context;
import com.questionbank.core.dataobjects.User;
import com.questionbank.security.exceptions.UserNotRegisteredException;
import com.questionbank.services.exceptions.DuplicateUserException;

public interface QBUserManager {
	boolean registerUser(Context ctx, User user) throws UserNotRegisteredException, DuplicateUserException;
}
