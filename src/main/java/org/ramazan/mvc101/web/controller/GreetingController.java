package org.ramazan.mvc101.web.controller;

import java.util.Locale;

import org.ramazan.mvc101.core.model.Greeting;
import org.ramazan.mvc101.web.api.client.GreetingClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class GreetingController extends BaseController {

	private static final Logger logger = LoggerFactory.getLogger(GreetingController.class);

	@Autowired
	private GreetingClient greetingClient;

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/greeting", method = RequestMethod.GET)
	public String greetingClient(Locale locale, Model model) {
		logger.info("Welcome greeting! The client locale is {}.", locale);

		setTime(locale, model);

		model.addAttribute("greetingText", "no response:)!");
		Greeting testGreeting = greetingClient.testGreeting();
		String greetingText = "cnt : " + testGreeting.getCounter() + " text : " + testGreeting.getText();
		model.addAttribute("greetingText", greetingText);

		model.addAttribute("title", getText(locale, "greeting.title"));

		return "greeting";
	}

}
