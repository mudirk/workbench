package de.homelabs.webapps.workbench.plugin.pool.persistence;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import de.homelabs.collection.CollectionTools;
import de.homelabs.webapps.workbench.plugin.pool.domain.PoolItem;

@Repository
public class PoolDao implements IPoolDao {
	@Autowired
	SessionFactory sessionFactory;


	@Override
	public List<PoolItem> getAllPoolItems() {
		List<PoolItem> poolItems= CollectionTools.convertToCheckedList(PoolItem.class, sessionFactory.getCurrentSession().createQuery("from PoolItem order by created").list());
		return poolItems;
	}

}
