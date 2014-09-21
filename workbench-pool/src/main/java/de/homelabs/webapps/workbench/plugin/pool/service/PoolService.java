package de.homelabs.webapps.workbench.plugin.pool.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.homelabs.webapps.workbench.plugin.pool.domain.PoolItem;
import de.homelabs.webapps.workbench.plugin.pool.persistence.IPoolDao;

@Service
@Transactional
public class PoolService implements IPoolService {

	@Autowired
	IPoolDao poolDao;
	
	@Override
	public List<PoolItem> getAllPoolItems() {
		return poolDao.getAllPoolItems();
	}

}
