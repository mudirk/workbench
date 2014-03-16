package de.homelabs.webapps.workbench.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.stereotype.Service;

import de.homelabs.webapps.workbench.plugin.IWorkbenchPlugin;

@Service
public class WorkbenchPluginManager {

	List<IWorkbenchPlugin> plugins = new ArrayList<IWorkbenchPlugin>();
	
	@Autowired
	ApplicationContext context;
	
	public WorkbenchPluginManager() {
		System.out.println("Init");
	}
	
	@PostConstruct
	protected void registerPlugins(){
		Map<String, IWorkbenchPlugin> plugins = context.getBeansOfType(IWorkbenchPlugin.class);
		for (String key : plugins.keySet()){
			IWorkbenchPlugin plugin = plugins.get(key);
			System.out.println("Info: "+plugin.getPluginInfo());
			System.out.println("Version: "+plugin.getPluginVersion());
		}
	}
}
