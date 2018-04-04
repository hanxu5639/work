package com.xa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xa.bean.SeatBean;
import com.xa.dao.SeatDao;

@Service
public class SeatServiceImpl implements SeatService {

	@Autowired
	private SeatDao sd;
	
	

	public SeatBean getOneSeat(String seatId) {
		
		return sd.getOneSeat(seatId);
	}

	public List<SeatBean> getBookedSeat() {
		
		return sd.getBookedSeat();
	}

	public List<SeatBean> getNoBookedSeat() {
		
		return sd.getNoBookedSeat();
	}

	public boolean updateWorkOff(String state, String seatNum) {

		return sd.updateWorkOff(state, seatNum);
	}

	

	

}
