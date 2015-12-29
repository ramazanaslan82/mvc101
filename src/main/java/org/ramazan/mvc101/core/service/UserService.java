package org.ramazan.mvc101.core.service;

import java.util.List;

import org.ramazan.mvc101.core.model.User;

public interface UserService {

	User loadUser(Long userId);
	
	List<User> loadAllUsers();
	
	Long addUser(User user);
}
