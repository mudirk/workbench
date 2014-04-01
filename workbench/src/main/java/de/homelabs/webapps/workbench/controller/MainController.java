package de.homelabs.webapps.workbench.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

	Logger logger = LoggerFactory.getLogger(getClass());

	public MainController() {
		System.out.println("MainController");
	}

	@RequestMapping({ "/*", "/" })
	public String mainHandler(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name,
			Model model) {

		model.addAttribute("name", name);
		model.addAttribute("title","Workbench");
		
		model.addAttribute("contentTemplate", "/de/homelabs/webapps/workbench/templates/home.ftl");
		return "de/homelabs/webapps/workbench/templates/main";
	}

}
