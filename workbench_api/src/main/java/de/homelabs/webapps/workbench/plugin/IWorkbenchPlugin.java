package de.homelabs.webapps.workbench.plugin;

import java.util.Map;

import de.homelabs.webapps.workbench.domain.MetaDataKey;
import de.homelabs.webapps.workbench.menu.MenuItem;

public interface IWorkbenchPlugin {

	Map<MetaDataKey, Object> getMetaData();
	MenuItem getMenuItem();
}
