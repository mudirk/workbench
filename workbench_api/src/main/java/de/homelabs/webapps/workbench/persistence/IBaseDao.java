package de.homelabs.webapps.workbench.persistence;

import java.io.Serializable;
import java.util.List;

public interface IBaseDao {

	<T> List<T> findAll(Class<T> clazz);
	
	Serializable save(Object object);
	
	void saveOrUpdate(Object object);
	
	void delete(Object entity);
	
	<T> T load(Class<T> clazz, Serializable id);

	<T> List<T> findObjectsByProperty(Class<T> clazz, String property,
			Object value);
}
