package org.ramazan.mvc101.rest.resource;

import java.util.concurrent.atomic.AtomicLong;

import org.ramazan.mvc101.core.model.Greeting;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingApi {
	private static final Logger logger = LoggerFactory.getLogger(GreetingApi.class);

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@RequestMapping("/api/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		long cnt = counter.incrementAndGet();
		logger.debug("cnt:{} name:{}", cnt, name);
		return new Greeting(cnt, String.format(template, name));
	}

}
