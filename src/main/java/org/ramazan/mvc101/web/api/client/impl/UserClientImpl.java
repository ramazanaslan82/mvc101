package org.ramazan.mvc101.web.api.client.impl;

import org.ramazan.mvc101.core.model.User;
import org.ramazan.mvc101.web.api.client.UserClient;
import org.springframework.stereotype.Component;

@Component
public class UserClientImpl extends BaseClientImpl implements UserClient {

	@Override
	public Long addUser(User user) {
		return restTemplate.postForObject(getBaseUrl() + "users", user, Long.class);
	}

	@Override
	public User getUser(Long userId) {
		String url = getBaseUrl() + "users/" + userId;
		
		return restTemplate.getForObject(url, User.class);
	}

}
