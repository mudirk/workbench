package de.homelabs.webapps.workbench.plugin.usermanagement.service;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import de.homelabs.webapps.workbench.domain.MetaDataKey;
import de.homelabs.webapps.workbench.menu.MenuItem;
import de.homelabs.webapps.workbench.plugin.IWorkbenchPlugin;

@Service
public class UserManagementPlugin implements IWorkbenchPlugin {

	public final static String TEMPLATE_PATH = "/de/homelabs/webapps/workbench/plugin/usermanagement/templates/";
	
	final static Logger logger = LoggerFactory.getLogger(UserManagementPlugin.class);
	
	public UserManagementPlugin() {
		logger.info("WorkbenchPlugin-Init: "+this.getClass());
	}
	
	@Override
	public Map<MetaDataKey, Object> getMetaData() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MenuItem getMenuItem() {
			return new MenuItem("usermanagement.html", "User", "Userverwaltung", "", "");
	}

}
