package de.homelabs.webapps.workbench.menu;

import java.util.List;

public interface IMenu {
	List<IMenuItem> getItems();
	boolean addItem(IMenuItem menuItem);
	boolean addItems(List<IMenuItem> menuItems);
}
