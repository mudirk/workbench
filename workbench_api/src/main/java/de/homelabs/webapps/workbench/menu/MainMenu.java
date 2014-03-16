package de.homelabs.webapps.workbench.menu;

import java.util.ArrayList;
import java.util.List;

public class MainMenu implements IMenu {

	private List<IMenuItem> mainMenuItems = new ArrayList<IMenuItem>();
	
	@Override
	public List<IMenuItem> getItems() {
		return mainMenuItems;
	}

	@Override
	public boolean addItem(IMenuItem menuItem) {
		mainMenuItems.add(menuItem);
		return true;
	}

	@Override
	public boolean addItems(List<IMenuItem> menuItems) {
		for (IMenuItem item : menuItems){
			mainMenuItems.add(item);
		}
		
		return true;
	}

}
