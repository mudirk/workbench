package de.homelabs.webapps.workbench.persistence;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import de.homelabs.collection.CollectionTools;

@Transactional
public abstract class BaseDao implements IBaseDao{

	@Autowired
	SessionFactory sessionFactory;

	protected Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	public <T> List<T> findAll(Class<T> clazz) {
		return CollectionTools.convertToCheckedList(clazz, getCurrentSession()
				.createCriteria(getClass()).list());
	}

	public Serializable save(Object object) {
		return getCurrentSession().save(object);
	}

	public void saveOrUpdate(Object object) {
		getCurrentSession().saveOrUpdate(object);
	}

	public void delete(Object entity) {
		getCurrentSession().delete(entity);
	}

	public <T> T load(Class<T> clazz, Serializable id) {
		return CollectionTools.checkedCast(clazz,
				getCurrentSession().load(clazz, id));
	}

	public <T> List<T> findObjectsByProperty(Class<T> clazz, String property,
			Object value) {
		return CollectionTools.convertToCheckedList(clazz, getCurrentSession()
				.createCriteria(clazz).add(Restrictions.eq(property, value))
				.list());
	}
}
