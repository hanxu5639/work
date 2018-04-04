package com.xa.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.xa.bean.MovieBean;

@Repository
public interface MovieDao {

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
