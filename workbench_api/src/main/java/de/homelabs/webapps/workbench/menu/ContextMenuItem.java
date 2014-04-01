package de.homelabs.webapps.workbench.menu;

public class ContextMenuItem {

	private String link;
	private String title;
	private String alt;
	private String icon;
	
	public ContextMenuItem(String link, String title, String alt, String icon){
		this.link = link;
		this.title = title;
		this.alt = alt;
		this.icon = icon;
	}
	
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAlt() {
		return alt;
	}
	public void setAlt(String alt) {
		this.alt = alt;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	
	
}
