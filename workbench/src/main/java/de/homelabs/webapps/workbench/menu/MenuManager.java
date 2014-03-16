package de.homelabs.webapps.workbench.menu;

/**
 * Im Kontext nach Plugins scannen (initPlugin?)
 * 
 * http://devnotesblog.wordpress.com/2011/03/20/adding-plug-ins-to-your-application-with-spring/
 * http://stackoverflow.com/questions/10549458/java-annotation-scanning-with-spring
 * http://sourceforge.net/projects/extcos/
 * 
 * @author D.Mueller
 *
 */
public class MenuManager implements IMenuManager {

	private IMenu mainMenu = new MainMenu();
	
	public MenuManager(){
		mainMenu.addItem(new MainMenuItem("home.html", "Home", "Home"));
	}
	
	@Override
	public IMenu getMenu(MenuType menuType) {
		return mainMenu;
	}

	@Override
	public boolean addMenu(MenuType menuType, IMenu menu) {
		//TODO: wofuer??
		return false;
	}

}
