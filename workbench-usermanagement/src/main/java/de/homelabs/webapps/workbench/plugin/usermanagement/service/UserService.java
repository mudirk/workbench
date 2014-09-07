package de.homelabs.webapps.workbench.plugin.usermanagement.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.homelabs.webapps.workbench.plugin.usermanagement.persistence.IUserManagementDao;
import de.homelabs.webapps.workbench.plugin.usermanagement.persistence.User;

@Service
@Transactional
public class UserService implements IUserService {

	@Autowired
	IUserManagementDao userManagementDao;
	
	public List<User> getAllUser() {
		List<User> user = userManagementDao.getAllUser();
		return user;
	}

}
