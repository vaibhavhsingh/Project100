package com.questionbank.rest.auth;

import javax.ws.rs.core.Response;

public interface UserAuthService {
	
	Response authorizeUser(String userId, String password);
	
}