package org.ramazan.mvc101.web.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.ui.Model;

public class BaseController {

	@Autowired
	@Qualifier("messageSource")
	protected ReloadableResourceBundleMessageSource i18n;
	
	protected void setTime(Locale locale, Model model)
	{
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate );
	}
	
	protected String getText(Locale locale, String key)
	{
		return i18n.getMessage(key, new Object[]{}, locale);
	}
}
