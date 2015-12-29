package org.ramazan.mvc101.core.dao;

import java.util.List;

import org.ramazan.mvc101.core.model.User;

public interface UserDao {
	void saveUser(User user);
	List<User> loadAllUsers();
	User loadUser(Long userId);
}
