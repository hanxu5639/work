package com.xa.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.xa.bean.UserBean;

@Repository
public interface UserDao {

	/**
	 * 登录的方法
	 * @param loginname
	 * @param password
	 * @return
	 */
	public UserBean login(@Param("ln")String loginname,@Param("ps")String password);

	
	/**
	 * 获取一个用户
	 * @param userId
	 * @return
	 */
	public UserBean getOneUser(String userId);
}
