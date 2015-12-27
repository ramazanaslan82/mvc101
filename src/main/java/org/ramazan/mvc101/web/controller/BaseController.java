package org.ramazan.mvc101.web.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

public class BaseController {

	@Autowired
	@Qualifier("messageSource")
	protected ReloadableResourceBundleMessageSource i18n;
	
	protected String getText(Locale locale, String key)
	{
		return i18n.getMessage(key, new Object[]{}, locale);
	}
}
