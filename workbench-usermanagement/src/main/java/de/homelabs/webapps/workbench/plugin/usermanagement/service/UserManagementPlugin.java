package de.homelabs.webapps.workbench.plugin.usermanagement.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import de.homelabs.webapps.workbench.menu.IMenuItem;
import de.homelabs.webapps.workbench.menu.MainMenuItem;
import de.homelabs.webapps.workbench.plugin.IWorkbenchPlugin;

@Service
public class UserManagementPlugin implements IWorkbenchPlugin {

	public final static String TEMPLATE_PATH = "/de/homelabs/webapps/workbench/plugin/usermanagement/templates/";
	
	final static Logger logger = LoggerFactory.getLogger(UserManagementPlugin.class);
	
	public UserManagementPlugin() {
		logger.info("WorkbenchPlugin-Init: "+this.getClass()+" "+getPluginVersion()+"; "+getPluginInfo());
	}
	
	public String getPluginVersion() {
		return "0.1";
	}

	public String getPluginInfo() {
		return "Usermanagement-Plugin\r\nby Dirk Mueller";
	}

	public IMenuItem getMainMenuItem() {
		return new MainMenuItem("usermanagement.html", "User", "Userverwaltung");
	}

}
