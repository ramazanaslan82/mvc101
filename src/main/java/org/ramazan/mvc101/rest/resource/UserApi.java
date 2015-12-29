package org.ramazan.mvc101.rest.resource;

import java.util.List;

import org.ramazan.mvc101.core.model.User;
import org.ramazan.mvc101.core.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserApi {
	private static final Logger logger = LoggerFactory.getLogger(UserApi.class);

	@Autowired
	private UserService userService;

	@RequestMapping("/api/users/")
	public List<User> getUsers() {
		logger.debug("loading all users");
		return userService.loadAllUsers();
	}
	
	@RequestMapping("/api/users/{id}")
	public User getUser(@PathVariable(value = "id") Long id) {
		logger.debug("loading user id:{}", id);
		return userService.loadUser(id);
	}

	@RequestMapping(value = "/api/users/", method = RequestMethod.POST)
	public Long addUser(User user) {
		logger.debug("saving user:{}", user);
		userService.addUser(user);
		return user.getId();
	}

}
