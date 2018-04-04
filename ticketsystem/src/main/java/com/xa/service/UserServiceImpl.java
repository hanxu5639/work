package com.xa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xa.bean.UserBean;
import com.xa.dao.UserDao;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao ud;
	
	public UserBean login(String loginname, String password) {
        
		return ud.login(loginname, password);
	}

	public UserBean getOneUser(String userId) {

		return ud.getOneUser(userId);
	}

}
