package org.ramazan.mvc101.web.controller;

import java.util.Locale;

import org.ramazan.mvc101.core.model.User;
import org.ramazan.mvc101.web.api.client.UserClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class UserController extends BaseController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserClient userClient;

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
	public String getUser(Locale locale, Model model, @PathVariable(value = "id") Long id) {
		logger.info("Welcome users! The client locale is {}.", locale);

		setTime(locale, model);

		User user = userClient.getUser(id);
		model.addAttribute("user", user);

		model.addAttribute("title", getText(locale, "user.title"));

		return "user";
	}

}
