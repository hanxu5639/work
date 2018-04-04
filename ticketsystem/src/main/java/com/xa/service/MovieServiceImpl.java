package com.xa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xa.bean.MovieBean;
import com.xa.dao.MovieDao;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieDao md;
	
	public List<MovieBean> getAllMovie() {
		
		return md.getAllMovie();
	}

	public MovieBean getOneMovie(String movieId) {
		
		return md.getOneMovie(movieId);
	}

}
