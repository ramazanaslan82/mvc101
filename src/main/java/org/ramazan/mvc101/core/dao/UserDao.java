package org.ramazan.mvc101.core.dao;

import org.ramazan.mvc101.core.model.User;

public interface UserDao {
	void saveUser(User user);
	User loadUser(Long userId);
}
