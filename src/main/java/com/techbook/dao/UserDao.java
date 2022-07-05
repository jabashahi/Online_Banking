package com.techbook.dao;

import com.techbook.domain.User;


	public interface UserDao {
		
		int saveUserInfo(User user);
		int updateUserInfo(User user);

}
