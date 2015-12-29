package org.ramazan.mvc101.core.service.impl;

import java.util.List;

import org.ramazan.mvc101.core.dao.UserDao;
import org.ramazan.mvc101.core.model.User;
import org.ramazan.mvc101.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public User loadUser(Long userId) {
		return userDao.loadUser(userId);
	}

	@Override
	@Transactional
	public List<User> loadAllUsers() {
		return userDao.loadAllUsers();
	}
	
	@Override
	public Long addUser(User user) {
		userDao.saveUser(user);
		return user.getId();
	}

}
