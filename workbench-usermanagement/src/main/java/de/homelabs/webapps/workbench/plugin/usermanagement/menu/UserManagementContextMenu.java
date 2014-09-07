package de.homelabs.webapps.workbench.plugin.usermanagement.menu;

import java.util.ArrayList;
import java.util.List;

import de.homelabs.webapps.workbench.menu.ContextMenuItem;

public enum UserManagementContextMenu {
	OVERVIEW("user/userList.html", "Benutzeruebersicht", "Benutzeruebersicht", "img/page_find.png"),
	ADD("user/userAdd.html","Benutzer hinzuguegen", "Benutzer hinzufuegen","img/page_add.png");
	
	private String link;
	private String text;
	private String title;
	private String icon;
	
	private UserManagementContextMenu(String link, String text, String title, String icon){
		this.link = link;
		this.text = text;
		this.title = title;
		this.icon = icon;
	}

	public static List<ContextMenuItem> getContextMenuItems(){
		List<ContextMenuItem> contextMenuItems = new ArrayList<ContextMenuItem>();
		for (UserManagementContextMenu menu : UserManagementContextMenu.values()){
			ContextMenuItem item = new ContextMenuItem(menu.getLink(), menu.text, menu.getTitle(), menu.getIcon());
			contextMenuItems.add(item);
		}
		return contextMenuItems;
	}
	
	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}
}
