package com.xa.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.xa.bean.SaleBean;

@Repository
public interface SaleDao {

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
