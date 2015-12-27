package org.ramazan.mvc101.api.client;

import org.ramazan.mvc101.api.client.impl.BaseClientImpl;
import org.ramazan.mvc101.core.model.Greeting;
import org.springframework.stereotype.Component;

@Component
public class GreetingClientImpl extends BaseClientImpl implements GreetingClient {

	@Override
	public Greeting testGreeting() {
		return restTemplate.getForObject(getBaseUrl() + "greeting", Greeting.class);
	}

}
