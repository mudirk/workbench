package de.homelabs.webapps.workbench.plugin;

import de.homelabs.webapps.workbench.menu.IMenuItem;

public interface IWorkbenchPlugin {

	String getPluginVersion();
	String getPluginInfo();
	IMenuItem getMainMenuItem();
}
