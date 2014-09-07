package de.homelabs.webapps.workbench.menu;

import de.homelabs.webapps.workbench.domain.WorkbenchConstants;

public class MenuItem {
	private String link;
	private String text;
	private String title;
	private String image;
	private String template = WorkbenchConstants.TEMPLATE_PATH+"submenu.ftl";
	
	/**
	 * default constructor
	 */
	public MenuItem(){}
	
	/**
	 * constructor with fields
	 * @param link
	 * @param text
	 * @param title
	 * @param image
	 * @param template
	 */
	public MenuItem(String link, String text, String title, String image,
			String template) {
		super();
		this.link = link;
		this.text = text;
		this.title = title;
		this.image = image;
		this.template = template;
	}
	
	
	/* getter / setter */
	public String getLink() 					{ return link;				}
	public void setLink(String link) 			{ this.link = link;			}
	public String getText() 					{ return text;				}
	public void setText(String text) 			{ this.text = text;			}
	public String getTitle() 					{ return title;				}
	public void setTitle(String title) 			{ this.title = title;		}
	public String getImage() 					{ return image;				}
	public void setImage(String image) 			{ this.image = image; 		}
	public String getTemplate() 				{ return template; 			}
	public void setTemplate(String template) 	{ this.template = template; }
}
