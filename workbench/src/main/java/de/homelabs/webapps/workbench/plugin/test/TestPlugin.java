package de.homelabs.webapps.workbench.plugin.test;

import org.springframework.stereotype.Service;

import de.homelabs.webapps.workbench.menu.IMenuItem;
import de.homelabs.webapps.workbench.menu.MainMenuItem;
import de.homelabs.webapps.workbench.plugin.IWorkbenchPlugin;

@Service
public class TestPlugin implements IWorkbenchPlugin {

	public TestPlugin(){
		System.out.println("test Service instantiated");
	}

	@Override
	public String getPluginVersion() {
		return "0.1";
	}

	@Override
	public String getPluginInfo() {
		return "TestPlugin\r\nby Dirk Mueller";
	}

	@Override
	public IMenuItem getMainMenuItem() {
		return new MainMenuItem("testplugin.html", "TestPlugin", "TestPlugin");
	}
}
