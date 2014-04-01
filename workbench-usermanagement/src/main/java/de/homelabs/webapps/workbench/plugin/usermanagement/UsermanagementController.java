package de.homelabs.webapps.workbench.plugin.usermanagement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import de.homelabs.webapps.workbench.domain.WorkbenchConstants;

@Controller
public class UsermanagementController { 
	Logger logger = LoggerFactory.getLogger(getClass());

	public UsermanagementController(){
		logger.info("Usermanagementcontroller created");
	}
	
	@RequestMapping({ "/usermanagement.html" })
	public String mainHandler(HttpServletRequest request,
			HttpServletResponse response, Model model) {

		model.addAttribute("title", "Workbench");

		
		model.addAttribute("contextMenuItems", UsermanagementContextMenu.getContextMenuItems());
		model.addAttribute("contentTemplate", UsermanagementPlugin.TEMPLATE_PATH + "main.ftl");
		return WorkbenchConstants.TEMPLATE_PATH + "main";
	}
}
