package de.homelabs.webapps.workbench.plugin.pool.domain;

import java.util.Date;

public class PoolItem {

	int id;
	Date created;
	String author;
	int authorId;
	String name;
	
	public PoolItem(int id, Date created, String author, int authorId, String name) {
		super();
		this.id = id;
		this.created = created;
		this.author = author;
		this.authorId = authorId;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
