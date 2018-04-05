package com.xa.bean;

import java.io.Serializable;

/**
 * 售出
 * 
 * @author try hard
 *
 */
public class SaleBean implements Serializable {
	private Integer saleId;// 售出主键id

	private Integer userId;// 购买人主键id

	private Integer seatNum;// 座位号数主键id

	private Integer showId;// 放映主键id

	private String saleTime;// 售出时间

	private UserBean ub;// 用户

	private SeatBean seb;// 座位

	private ShowBean shb;// 放映

	public SaleBean() {
		super();
	}

	public SaleBean(Integer saleId, Integer userId, Integer seatNum, Integer showId, String saleTime, UserBean ub,
			SeatBean seb, ShowBean shb) {
		super();
		this.saleId = saleId;
		this.userId = userId;
		this.seatNum = seatNum;
		this.showId = showId;
		this.saleTime = saleTime;
		this.ub = ub;
		this.seb = seb;
		this.shb = shb;
	}

	public Integer getSaleId() {
		return saleId;
	}

	public void setSaleId(Integer saleId) {
		this.saleId = saleId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	
	public Integer getSeatNum() {
		return seatNum;
	}

	public void setSeatNum(Integer seatNum) {
		this.seatNum = seatNum;
	}

	public Integer getShowId() {
		return showId;
	}

	public void setShowId(Integer showId) {
		this.showId = showId;
	}


	public String getSaleTime() {
		return saleTime;
	}

	public void setSaleTime(String saleTime) {
		this.saleTime = saleTime;
	}

	public UserBean getUb() {
		return ub;
	}

	public void setUb(UserBean ub) {
		this.ub = ub;
	}


	public SeatBean getSeb() {
		return seb;
	}

	public void setSeb(SeatBean seb) {
		this.seb = seb;
	}

	public ShowBean getShb() {
		return shb;
	}

	public void setShb(ShowBean shb) {
		this.shb = shb;
	}



}