package com.techbook.service;

import com.techbook.dao.UserDao;
import com.techbook.dao.UserDaoImpl;
import com.techbook.domain.User;

public class UserServiceImpl implements UserService {

	private UserDao userDao;

	public UserServiceImpl() {
		userDao = new UserDaoImpl();
	}

	@Override
	public void saveUserInfo(User user) {
		userDao.saveUserInfo(user);
	}

}

