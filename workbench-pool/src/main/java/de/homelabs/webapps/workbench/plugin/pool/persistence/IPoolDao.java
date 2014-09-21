package de.homelabs.webapps.workbench.plugin.pool.persistence;

import java.util.List;

import de.homelabs.webapps.workbench.plugin.pool.domain.PoolItem;

public interface IPoolDao {

	List<PoolItem> getAllPoolItems();
}
