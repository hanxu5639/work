package com.xa.bean;

import java.io.Serializable;
/**
 * 影片
 * @author try hard
 *
 */
public class MovieBean implements Serializable{
    private Integer movieId;//电影主键id

    private String movieName;//电影名字

    public MovieBean() {
		super();
	}

	public MovieBean(Integer movieId, String movieName) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
	}

	public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName == null ? null : movieName.trim();
    }
}