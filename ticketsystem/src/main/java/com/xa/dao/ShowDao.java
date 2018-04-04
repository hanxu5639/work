package com.xa.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.xa.bean.ShowBean;

@Repository
public interface ShowDao {

	/**
	 * 获取所有放映信息
	 * @return
	 */
	public List<ShowBean> getAllShow();
	
	/**
	 * 获取单个放映信息
	 * @return
	 */
	public ShowBean getOneShow(String showId);
}
