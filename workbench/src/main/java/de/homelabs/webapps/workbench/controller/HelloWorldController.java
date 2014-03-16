package de.homelabs.webapps.workbench.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

	Logger logger = LoggerFactory.getLogger(getClass());
	
	public HelloWorldController() {
		System.out.println("Hello World Controller");
	}
	
	@RequestMapping({ "/*", "/" })
	public String hello(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name,
			Model model) {
		
		model.addAttribute("name", name);
		
		logger.debug("HelloWorld Controller");
		return "user";
	}

}
