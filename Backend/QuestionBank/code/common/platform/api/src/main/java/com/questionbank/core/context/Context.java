package com.questionbank.core.context;

import java.sql.Timestamp;
import java.util.Locale;

import com.questionbank.core.dataobjects.User;

public interface Context {
	String getContextId();

	String getDomain();

	Locale getLocale();

	void setUser(User user);

	User getUser();

	void setProfile(String key, Object value);

	Object getProfile(String key);

	void setLoginTime(Timestamp time);

	Timestamp getLoginTime();

	void setIPAddress(String ip);

	String getIPAddress();

	String getWebBrowser();

	String getOS();
}
