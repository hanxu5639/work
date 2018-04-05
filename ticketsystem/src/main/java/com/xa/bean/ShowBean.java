package com.xa.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
/**
 * 放映
 * @author try hard
 *
 */
public class ShowBean implements Serializable{
    private Integer showId;//放映主键id

    private Integer hallId;//放映厅主键id

    private Integer movieId;//影片主键id

    private String showTimeStart;//影片放映时间

    private String showTimeEnd;//影片结束时间
    
    private MovieBean mb;//影片类
    
    private HallBean hb;//放映厅类
    

    
    
    

    public ShowBean() {
		super();
	}

	public ShowBean(Integer showId, Integer hallId, Integer movieId, String showTimeStart, String showTimeEnd,
			MovieBean mb, HallBean hb) {
		super();
		this.showId = showId;
		this.hallId = hallId;
		this.movieId = movieId;
		this.showTimeStart = showTimeStart;
		this.showTimeEnd = showTimeEnd;
		this.mb = mb;
		this.hb = hb;
	}

	public Integer getShowId() {
        return showId;
    }

    public void setShowId(Integer showId) {
        this.showId = showId;
    }

    public Integer getHallId() {
        return hallId;
    }

    public void setHallId(Integer hallId) {
        this.hallId = hallId;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public String getShowTimeStart() {
        return showTimeStart;
    }

    public void setShowTimeStart(String showTimeStart) {
        this.showTimeStart = showTimeStart;
    }

    public String getShowTimeEnd() {
        return showTimeEnd;
    }

    public void setShowTimeEnd(String showTimeEnd) {
        this.showTimeEnd = showTimeEnd;
    }

	public MovieBean getMb() {
		return mb;
	}

	public void setMb(MovieBean mb) {
		this.mb = mb;
	}

	public HallBean getHb() {
		return hb;
	}

	public void setHb(HallBean hb) {
		this.hb = hb;
	}

	
    
    
}