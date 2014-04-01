package de.homelabs.webapps.workbench.plugin.usermanagement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import de.homelabs.webapps.workbench.menu.IMenuItem;
import de.homelabs.webapps.workbench.menu.MainMenuItem;
import de.homelabs.webapps.workbench.plugin.IWorkbenchPlugin;

@Service
public class UsermanagementPlugin implements IWorkbenchPlugin {

	public final static String TEMPLATE_PATH = "/de/homelabs/webapps/workbench/plugin/usermanagement/templates/";
	
	Logger logger = LoggerFactory.getLogger(getClass());
	
	public UsermanagementPlugin() {
		logger.info("init UserManagementPlugin");
	}
	public String getPluginVersion() {
		return "0.1";
	}

	public String getPluginInfo() {
		return "Usermanagement-Plugin\r\nby Dirk Mueller";
	}

	public IMenuItem getMainMenuItem() {
		return new MainMenuItem("usermanagement.html", "Benutzerverwaltung", "Benutzerverwaltung");
	}

}
