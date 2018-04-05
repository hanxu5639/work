package com.xa.bean;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Qualifier;

/**
 * 座位
 * @author try hard
 *
 */
@Qualifier("sb")
public class SeatBean implements Serializable{
    private Integer seatNum;//座位号数主键id

    private Integer hallId;//放映厅主键id

    private Integer workOff;//是否还有该座位
    
    private HallBean hb;//放映厅

    
    
    
    public SeatBean() {
		super();
	}

	public SeatBean(Integer seatNum, Integer hallId, Integer workOff, HallBean hb) {
		super();
		this.seatNum = seatNum;
		this.hallId = hallId;
		this.workOff = workOff;
		this.hb = hb;
	}

	public Integer getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(Integer seatNum) {
        this.seatNum = seatNum;
    }

    public Integer getHallId() {
        return hallId;
    }

    public void setHallId(Integer hallId) {
        this.hallId = hallId;
    }

    public Integer getWorkOff() {
        return workOff;
    }

    public void setWorkOff(Integer workOff) {
        this.workOff = workOff;
    }

	public HallBean getHb() {
		return hb;
	}

	public void setHb(HallBean hb) {
		this.hb = hb;
	}
    
    
}