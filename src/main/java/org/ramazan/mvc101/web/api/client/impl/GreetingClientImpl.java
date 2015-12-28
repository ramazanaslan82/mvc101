package org.ramazan.mvc101.web.api.client.impl;

import org.ramazan.mvc101.core.model.Greeting;
import org.ramazan.mvc101.web.api.client.GreetingClient;
import org.springframework.stereotype.Component;

@Component
public class GreetingClientImpl extends BaseClientImpl implements GreetingClient {

	@Override
	public Greeting testGreeting() {
		return restTemplate.getForObject(getBaseUrl() + "greeting", Greeting.class);
	}

}
