package org.ramazan.mvc101.api.client.impl;

import javax.annotation.PostConstruct;

import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

public class BaseClientImpl {

	private static String BASE_URL = "http://localhost:8080/mvc101/api/";

	// do not autowire
	protected RestTemplate restTemplate;

	protected String getBaseUrl() {
		return BASE_URL;
	}

	@PostConstruct
	public void init() {
		restTemplate = new RestTemplate(clientHttpRequestFactory());
	}

	private ClientHttpRequestFactory clientHttpRequestFactory() {
		HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory();
		factory.setReadTimeout(2000);
		factory.setConnectTimeout(2000);
		return factory;
	}
}
