package de.homelabs.webapps.workbench.plugin.pool.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import de.homelabs.webapps.workbench.domain.WorkbenchConstants;
import de.homelabs.webapps.workbench.plugin.pool.service.IPoolService;
import de.homelabs.webapps.workbench.plugin.pool.service.PoolPlugin;
 

@Controller
public class PoolController {
	final static Logger logger = LoggerFactory.getLogger(PoolController.class);
	
	@Autowired
	IPoolService poolService;
	
	public PoolController() {
		// logger.info("Usermanagementcontroller created");
	}

	/**
	 * Main View
	 * 
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping({ "/pool.html" })
	public String mainHandler(HttpServletRequest request,
			HttpServletResponse response, Model model) {
		
		model.addAttribute("title", "Workbench");
		model.addAttribute("moduleTitle", "Pool");
		// model.addAttribute("contextMenuItems",
		// UserManagementContextMenu.getContextMenuItems());
		model.addAttribute("contentTemplate",
				PoolPlugin.TEMPLATE_PATH + "main.ftl");
		//model.addAttribute("users", userService.getAllUser());
		model.addAttribute("poolitems",poolService.getAllPoolItems());
		return WorkbenchConstants.TEMPLATE_PATH + "main";
	}
}
