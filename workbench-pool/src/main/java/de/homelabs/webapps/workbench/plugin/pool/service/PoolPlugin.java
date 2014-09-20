package de.homelabs.webapps.workbench.plugin.pool.service;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import de.homelabs.webapps.workbench.domain.MetaDataKey;
import de.homelabs.webapps.workbench.menu.MenuItem;
import de.homelabs.webapps.workbench.plugin.IWorkbenchPlugin;

@Service
public class PoolPlugin implements IWorkbenchPlugin {

	public final static String TEMPLATE_PATH = "/de/homelabs/webapps/workbench/plugin/pool/templates/";
	
	final static Logger logger = LoggerFactory.getLogger(PoolPlugin.class);
	
	public PoolPlugin() {
		logger.info("PoolPlugin-Init: "+this.getClass());
	}
	

	@Override
	public MenuItem getMenuItem() {
			return new MenuItem("pool.html", "Pool", "Pool", "", "");
	}

	@Override
	public Map<MetaDataKey, Object> getMetaData() {
		// TODO Auto-generated method stub
		return null;
	}
}
