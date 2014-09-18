package de.homelabs.webapps.workbench.plugin.usermanagement.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import de.homelabs.webapps.workbench.plugin.usermanagement.service.IUserService;
import de.homelabs.webapps.workbench.plugin.usermanagement.service.UserManagementPlugin;
import de.homelabs.webapps.workbench.domain.WorkbenchConstants;

@Controller
public class UserManagementController { 
	final static Logger logger = LoggerFactory.getLogger(UserManagementController.class);

	@Autowired
	IUserService userService;
	
	public UserManagementController(){
		//logger.info("Usermanagementcontroller created");
	}
	
	/**
	 * Main View
	 * 
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping({ "/usermanagement.html" })
	public String mainHandler(HttpServletRequest request,
			HttpServletResponse response, Model model) {

		model.addAttribute("title", "Workbench");
		model.addAttribute("moduleTitle", "User");
		//model.addAttribute("contextMenuItems", UserManagementContextMenu.getContextMenuItems());
		model.addAttribute("contentTemplate", UserManagementPlugin.TEMPLATE_PATH + "main.ftl");
		model.addAttribute("users", userService.getAllUser());
		
		return WorkbenchConstants.TEMPLATE_PATH + "main";
	}
}
