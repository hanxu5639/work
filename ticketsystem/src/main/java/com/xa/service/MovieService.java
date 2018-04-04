package com.xa.service;

import java.util.List;

import com.xa.bean.MovieBean;

public interface MovieService {

	/**
	 * 获取所有影片
	 * @return
	 */
	public List<MovieBean> getAllMovie();
	
	/**
	 * 获取一个影片
	 * @return
	 */
	public MovieBean getOneMovie(String movieId);
}
