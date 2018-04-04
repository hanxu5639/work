package com.xa.bean;

import java.io.Serializable;
/**
 * 放映厅
 * @author try hard
 *
 */
public class HallBean implements Serializable{
    private Integer hallId;//放映厅主键id

    private String hallName;//放映厅名字

    private Integer hallSeat;//放映厅共有座位

    public Integer getHallId() {
        return hallId;
    }

    public void setHallId(Integer hallId) {
        this.hallId = hallId;
    }

    public String getHallName() {
        return hallName;
    }

    public void setHallName(String hallName) {
        this.hallName = hallName == null ? null : hallName.trim();
    }

    public Integer getHallSeat() {
        return hallSeat;
    }

    public void setHallSeat(Integer hallSeat) {
        this.hallSeat = hallSeat;
    }
}