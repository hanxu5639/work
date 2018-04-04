package com.xa.service;

import java.util.List;

import com.xa.bean.HallBean;

public interface HallService {

	/**
	 * 获得所有放映厅方法
	 * @return
	 */
	public List<HallBean> getHallAll();
}
