package com.questionbank.core.context.impl;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import com.questionbank.core.context.Context;
import com.questionbank.core.dataobjects.User;

public class QBContextImpl implements Context {

	private User user;
	private String IPAddress;
	private Timestamp loginTime;
	private Map<String, Object> profile = new HashMap<String, Object>();

	@Override
	public String getContextId() {
		if (this.user != null) {
			return user.getUserId();
		}
		return "UN-REGISTERED";
	}

	@Override
	public String getDomain() {
		return "PayOnTime";
	}

	@Override
	public Locale getLocale() {
		return new Locale("en");
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Object getProfile(String key) {
		return profile.get(key);
	}

	public void setProfile(String key, Object value) {
		profile.put(key, value);
	}

	public String getIPAddress() {
		return IPAddress;
	}

	public void setIPAddress(String IPAddress) {
		this.IPAddress = IPAddress;
	}

	public Timestamp getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(Timestamp loginTime) {
		this.loginTime = loginTime;
	}

	public Map<String, Object> getProfile() {
		return profile;
	}

	public void setProfile(Map<String, Object> profile) {
		this.profile = profile;
	}

	@Override
	public String getWebBrowser() {
		return null;
	}

	@Override
	public String getOS() {
		return null;
	}
}
