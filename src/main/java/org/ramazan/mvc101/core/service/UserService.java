package org.ramazan.mvc101.core.service;

import org.ramazan.mvc101.core.model.User;

public interface UserService {

	User loadUser(Long userId);
	
	Long addUser(User user);
}
