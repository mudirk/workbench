package de.homelabs.webapps.workbench.menu;

import java.util.List;

public interface IMenu {
	List<MenuItem> getItems();
	boolean addItem(MenuItem menuItem);
	boolean addItems(List<MenuItem> menuItems);
}
