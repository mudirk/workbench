package de.homelabs.webapps.workbench.plugin.pool.service;

import java.util.List;

import de.homelabs.webapps.workbench.plugin.pool.domain.PoolItem;

public interface IPoolService {
	List<PoolItem> getAllPoolItems();
}
