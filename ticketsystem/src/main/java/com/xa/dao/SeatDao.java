package com.xa.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.xa.bean.SeatBean;
import com.xa.util.State;

@Repository
public interface SeatDao {

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
	public boolean updateWorkOff(@Param("state")String state,@Param("seatNum")String seatNum);
	
}
