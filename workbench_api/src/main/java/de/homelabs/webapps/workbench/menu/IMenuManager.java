package de.homelabs.webapps.workbench.menu;

public interface IMenuManager {
	IMenu getMenu(MenuType menuType);
	boolean addMenu(MenuType menuType, IMenu menu);
}
