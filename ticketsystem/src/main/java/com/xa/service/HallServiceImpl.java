package com.xa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.xa.bean.HallBean;
import com.xa.dao.HallDao;

@Service
public class HallServiceImpl implements HallService {

	@Autowired
	private HallDao hd;
	
	public List<HallBean> getHallAll() {
		
		return hd.getHallAll();
	}

}
