package de.homelabs.webapps.workbench.domain;

import java.text.DateFormat;
import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.Transient;

@Embeddable
public class EntityMetaData {
	//vars
	Date created;
	long createdBy;
	Date changed;
	long changedBy;
	
	/**
	 * default contructor
	 */
	public EntityMetaData(){}
	
	/**
	 * properties constructor
	 * @param created
	 * @param createdBy
	 * @param changed
	 * @param changedBy
	 */
	public EntityMetaData(Date created, long createdBy, Date changed, long changedBy){
		this.created = created;
		this.createdBy = createdBy;
		this.changed = changed;
		this.changedBy = changedBy;
	}
	
	//getter - setter
	public Date getCreated() 					{ return created;										}
	public void setCreated(Date created) 		{ this.created = created;								}
	public long getCreatedBy() 					{ return createdBy;										}
	public void setCreatedBy(long createdBy) 	{ this.createdBy = createdBy;							}
	public Date getChanged() 					{ return changed;										}
	public void setChanged(Date changed) 		{ this.changed = changed;								}
	public long getChangedBy() 					{ return changedBy;										}
	public void setChangedBy(long changedBy) 	{ this.changedBy = changedBy;							}
	
	@Transient
	public String getCreatedAsText()			{return WorkbenchConstants.sdf.format(this.created);	};
}
