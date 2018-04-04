package com.xa.service;

import com.xa.bean.UserBean;

public interface UserService {

	/**
	 * 登录的方法
	 * @param loginname
	 * @param password
	 * @return
	 */
	public UserBean login(String loginname,String password);
	
	
	
	/**
	 * 获取一个用户
	 * @param userId
	 * @return
	 */
	public UserBean getOneUser(String userId);
	
}
