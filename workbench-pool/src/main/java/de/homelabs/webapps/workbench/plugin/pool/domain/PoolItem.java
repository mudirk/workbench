package de.homelabs.webapps.workbench.plugin.pool.domain;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import de.homelabs.webapps.workbench.domain.EntityMetaData;

@Entity
@Table(name="pool", schema="core")
public class PoolItem {

	@Embedded
	private EntityMetaData entityMetaData;
	
	@Id
	int id;
	String name;
	String description;
	
	public PoolItem(){}
	public PoolItem(EntityMetaData entityMetaData, int id, String name) {
		super();
		this.entityMetaData = entityMetaData;
		this.id = id;
		this.name = name;
	}

	public EntityMetaData getEntityMetaData()						{ return this.entityMetaData;			}
	public void setEntityMetaData(EntityMetaData entityMetaData)	{ this.entityMetaData = entityMetaData;	}
	public int getId() 												{ return id;							}
	public void setId(int id) 										{ this.id = id;							}
	public String getName() 										{ return name;							}
	public void setName(String name) 								{ this.name = name;						}
	public String getDescription() 									{ return description;					}
	public void setDescription(String description) 					{ this.description = description;		}
	
}
