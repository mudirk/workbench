package de.homelabs.webapps.workbench.plugin.usermanagement.persistence;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import de.homelabs.collection.CollectionTools;

@Repository
public class UserManagementDao implements IUserManagementDao {
	@Autowired
	SessionFactory sessionFactory;

	public List<User> getAllUser(){
		List<User> users = CollectionTools.convertToCheckedList(User.class, sessionFactory.getCurrentSession().createQuery("from User").list());
		return users;
	}
}
