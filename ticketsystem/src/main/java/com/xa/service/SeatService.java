package com.xa.service;

import java.util.List;



import com.xa.bean.SeatBean;

public interface SeatService {

	/**
	 * 获取已订出的座位
	 * @return
	 */
	public List<SeatBean> getBookedSeat();
	
	/**
	 * 获取未订出的座位
	 * @return
	 */
	public List<SeatBean> getNoBookedSeat();
	
	/**
	 * 获取一个座位
	 * @return
	 */
	public SeatBean getOneSeat(String seatId);
	
	
	/**
	 * 修改状态值
	 * @param sb
	 * @return
	 */
	public boolean updateWorkOff(String state,String seatNum);
}
