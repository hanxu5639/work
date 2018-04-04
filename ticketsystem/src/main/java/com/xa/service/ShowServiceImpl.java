package com.xa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xa.bean.ShowBean;
import com.xa.dao.ShowDao;

@Service
public class ShowServiceImpl implements ShowService {

	@Autowired
	private ShowDao sd;
	
	public List<ShowBean> getAllShow() {
		
		return sd.getAllShow();
	}

	public ShowBean getOneShow(String showId) {
		
		return sd.getOneShow(showId);
	}

}
