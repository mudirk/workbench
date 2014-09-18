package de.homelabs.webapps.workbench.service;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import de.homelabs.webapps.workbench.menu.IMenu;
import de.homelabs.webapps.workbench.menu.MainMenu;
import de.homelabs.webapps.workbench.menu.MenuItem;
import de.homelabs.webapps.workbench.plugin.IWorkbenchPlugin;

/**
 * Im Kontext nach Plugins scannen (initPlugin?)
 * 
 * http://devnotesblog.wordpress.com/2011/03/20/adding-plug-ins-to-your-application-with-spring/
 * http://stackoverflow.com/questions/10549458/java-annotation-scanning-with-spring
 * http://sourceforge.net/projects/extcos/
 * 
 * @author smirk
 *
 */
@Service
public class WorkbenchPluginManager {

	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	private Map<String, IWorkbenchPlugin> plugins = new HashMap<String, IWorkbenchPlugin>();
	
	@Autowired private ApplicationContext context;
	
	private IMenu mainMenu = new MainMenu();
	
	public WorkbenchPluginManager() {
		System.out.println("Init");
		//add some static content
		mainMenu.addItem(new MenuItem("index.html", "Home", "Home", "", ""));
	}
	
	@PostConstruct
	protected void registerPlugins(){
		plugins = context.getBeansOfType(IWorkbenchPlugin.class);
		
		//add user management
		//TODO: convert to plugin
		//mainMenu.addItem(new MainMenuItem("user.html","Benutzerverwaltung", "Benutzerverwaltung"));
		
		//add plugin main menu links
		for (String key : plugins.keySet()){
			IWorkbenchPlugin plugin = plugins.get(key);
			logger.debug("Class: "+plugin.getClass());
			mainMenu.addItem(plugin.getMenuItem());
		}
	}
	
	public IMenu getMainMenu(){
		return mainMenu;
	}
}
