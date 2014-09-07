package de.homelabs.webapps.workbench.plugin.usermanagement.service;

import java.util.List;

import de.homelabs.webapps.workbench.plugin.usermanagement.persistence.User;

public interface IUserService {
	List<User> getAllUser();
}
