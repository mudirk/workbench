package de.homelabs.webapps.workbench.menu;

import java.util.ArrayList;
import java.util.List;

public class MainMenu implements IMenu {

	private List<MenuItem> mainMenuItems = new ArrayList<MenuItem>();
	
	@Override
	public List<MenuItem> getItems() {
		return mainMenuItems;
	}

	@Override
	public boolean addItem(MenuItem menuItem) {
		mainMenuItems.add(menuItem);
		return true;
	}

	@Override
	public boolean addItems(List<MenuItem> menuItems) {
		for (MenuItem item : menuItems){
			mainMenuItems.add(item);
		}
		
		return true;
	}

}
