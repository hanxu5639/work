package com.xa.bean;

import java.io.Serializable;

/**
 * 用户
 * @author try hard
 *
 */
public class UserBean implements Serializable{
    private Integer userId;//用户主键id

    private String loginname;//登录名

    private String password;//登录密码

    private String userName;//用户名
    
    
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

	public String getLoginname() {
		return loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
    
    
}