package de.homelabs.webapps.workbench.plugin.test;

import java.util.Map;

import org.springframework.stereotype.Service;

import de.homelabs.webapps.workbench.domain.MetaDataKey;
import de.homelabs.webapps.workbench.menu.MenuItem;
import de.homelabs.webapps.workbench.plugin.IWorkbenchPlugin;

@Service
public class TestPlugin implements IWorkbenchPlugin {

	public TestPlugin(){
		System.out.println("test Service instantiated");
	}


	@Override
	public MenuItem getMenuItem() {
		return new MenuItem("testplugin.html", "TestPlugin", "TestPlugin", "", "");
	}


	@Override
	public Map<MetaDataKey, Object> getMetaData() {
		// TODO Auto-generated method stub
		return null;
	}


}
