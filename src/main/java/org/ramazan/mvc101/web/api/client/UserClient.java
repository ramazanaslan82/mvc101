package org.ramazan.mvc101.web.api.client;

import org.ramazan.mvc101.core.model.User;

public interface UserClient {

	Long addUser(User user);

	User getUser(Long userId);

}
