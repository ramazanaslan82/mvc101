package org.ramazan.mvc101.rest.resource;

import java.util.concurrent.atomic.AtomicLong;

import org.ramazan.mvc101.core.model.Greeting;
import org.ramazan.mvc101.core.model.User;
import org.ramazan.mvc101.core.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiResource {
	private static final Logger logger = LoggerFactory.getLogger(ApiResource.class);

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    
    @Autowired
    private UserService userService;

    @RequestMapping("/api/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
    	long cnt = counter.incrementAndGet();
    	logger.debug("cnt:{} name:{}", cnt, name);
        return new Greeting(cnt, String.format(template, name));
    }
    
    @RequestMapping("/api/users/{id}")
    public User getUser(@RequestParam(value="id", defaultValue="null") Long id) {
    	logger.debug("loading user id:{}",id);
        return userService.loadUser(id);
    }
    
    @RequestMapping( value= "/api/users/", method = RequestMethod.POST)
    public Long addUser(User user) {
    	logger.debug("saving user:{}", user);
        userService.addUser(user);
        return user.getId();
    }
    
}
