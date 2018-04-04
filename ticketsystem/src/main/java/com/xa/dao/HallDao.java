package com.xa.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.xa.bean.HallBean;

@Repository
public interface HallDao {

	/**
	 * 获得所有放映厅方法
	 * @return
	 */
	public List<HallBean> getHallAll();
	
	/**
	 * 获取一个放映厅
	 * @return
	 */
	public HallBean getOneHall(String hallId);
}
