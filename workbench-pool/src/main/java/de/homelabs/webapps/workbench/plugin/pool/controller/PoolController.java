package de.homelabs.webapps.workbench.plugin.pool.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import de.homelabs.webapps.workbench.domain.WorkbenchConstants;
import de.homelabs.webapps.workbench.plugin.pool.domain.PoolItem;
import de.homelabs.webapps.workbench.plugin.pool.service.PoolPlugin;

@Controller
public class PoolController {
	final static Logger logger = LoggerFactory
			.getLogger(PoolController.class);


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

		//test
		List<PoolItem> poolItems = new ArrayList<PoolItem>();
		poolItems.add(new PoolItem(1,new Date(114,8,20),"Dirk M&uuml;ller",1,"Beispiellink"));
		model.addAttribute("title", "Workbench");
		model.addAttribute("moduleTitle", "Pool");
		// model.addAttribute("contextMenuItems",
		// UserManagementContextMenu.getContextMenuItems());
		model.addAttribute("contentTemplate",
				PoolPlugin.TEMPLATE_PATH + "main.ftl");
		//model.addAttribute("users", userService.getAllUser());
		model.addAttribute("poolitems",poolItems);
		return WorkbenchConstants.TEMPLATE_PATH + "main";
	}
}
