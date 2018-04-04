package com.xa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xa.bean.SaleBean;
import com.xa.dao.SaleDao;

@Service
public class SaleServiceImpl implements SaleService {

	@Autowired
	private SaleDao sd;
	
	public List<SaleBean> getAllSale() {
		
		return sd.getAllSale();
	}

	

	public boolean saveSale(SaleBean sb) {
		
		return sd.saveSale(sb);
	}



	public SaleBean getOneSale(int saleId) {
		
		return sd.getOneSale(saleId);
	}

}
