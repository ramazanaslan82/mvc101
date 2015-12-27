package org.ramazan.mvc101.web.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.ramazan.mvc101.api.client.GreetingClient;
import org.ramazan.mvc101.core.model.Greeting;
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
public class HomeController extends BaseController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private GreetingClient greetingClient;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("title", getText(locale, "homepage.title"));
		
		return "home";
	}
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public String about(Locale locale, Model model) {
		logger.info("Welcome about! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("title", getText(locale, "about.title"));
		
		return "about";
	}
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/greeting", method = RequestMethod.GET)
	public String greetingClient(Locale locale, Model model) {
		logger.info("Welcome greeting! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("greetingText", "no response:)!");

		Greeting testGreeting = greetingClient.testGreeting();
		String greetingText = "cnt : " + testGreeting.getCounter() + " text : " + testGreeting.getText();
		model.addAttribute("greetingText", greetingText);
		
		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("title", getText(locale, "greeting.title"));
		
		return "greeting";
	}
	
	
}
