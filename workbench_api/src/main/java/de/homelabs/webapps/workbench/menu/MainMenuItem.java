package de.homelabs.webapps.workbench.menu;

public class MainMenuItem implements IMenuItem {

	private String link;
	private String text;
	private String title;
	
	public MainMenuItem(String link, String text, String title){
		this.link = link;
		this.text = text;
		this.title = title;
	}

	@Override
	public String getLink() {	return link;}

	@Override
	public String getText() {	return text;}

	@Override
	public String getTitle() {	return title;}
	
	
}
