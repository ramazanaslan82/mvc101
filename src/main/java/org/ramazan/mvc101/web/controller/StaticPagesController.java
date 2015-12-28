package org.ramazan.mvc101.web.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class StaticPagesController extends BaseController {

	private static final Logger logger = LoggerFactory.getLogger(StaticPagesController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public String about(Locale locale, Model model) {
		logger.info("Welcome about! The client locale is {}.", locale);

		setTime(locale, model);

		model.addAttribute("title", getText(locale, "about.title"));

		return "about";
	}

}
