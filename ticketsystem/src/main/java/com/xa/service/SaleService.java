package com.xa.service;

import java.util.List;

import com.xa.bean.SaleBean;

public interface SaleService {

	/**
	 * 获取所有售出信息
	 * @return
	 */
	public List<SaleBean> getAllSale();
	
	/**
	 * 获取一个售出信息
	 * @return
	 */
	public SaleBean getOneSale(int saleId);
	
	/**
	 * 添加一个售出信息
	 * @param sb
	 * @return
	 */
	public boolean saveSale(SaleBean sb);
}
