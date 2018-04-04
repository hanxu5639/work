package com.xa.service;

import java.util.List;

import com.xa.bean.ShowBean;

public interface ShowService {

	/**
	 * 获取所有放映信息
	 * @return
	 */
	public List<ShowBean> getAllShow();
	
	/**
	 * 获取单个放映信息
	 * @return
	 */
	public ShowBean getOneShow(String id);
}
