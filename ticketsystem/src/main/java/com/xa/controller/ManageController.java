package com.xa.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xa.bean.SaleBean;
import com.xa.bean.SeatBean;
import com.xa.bean.ShowBean;
import com.xa.service.HallService;
import com.xa.service.MovieService;
import com.xa.service.SaleService;
import com.xa.service.SeatService;
import com.xa.service.ShowService;
import com.xa.util.CompareTime;
import com.xa.util.State;


@Controller
public class ManageController {

	@Autowired
	private HallService hs;
	@Autowired
	private MovieService ms;
	@Autowired
	private SaleService sas;
	@Autowired
	private SeatService ses;
	@Autowired
	private ShowService shs;
	

	
	
	@RequestMapping("/all")
	public String all(String id,Model m){
		ShowBean show = shs.getOneShow(id);
		List<SeatBean> Bookedseats = ses.getBookedSeat();
		List<SeatBean> NoBookedseats = ses.getNoBookedSeat();
		m.addAttribute("bs", Bookedseats);
		m.addAttribute("nbs", NoBookedseats);
		m.addAttribute("sh", show);
	return "/content.jsp";	
	}
	
	@RequestMapping("/back")
	public String back(Model m){
		List<ShowBean> show = shs.getAllShow();
		m.addAttribute("sh", show);
		return "/index.jsp";
	}
	

	
	@RequestMapping("/win")
	public String finish(SaleBean sb,String seatNum,String state,Model m){
		
		boolean is = ses.updateWorkOff(state, seatNum);
		if(is){
			sas.saveSale(sb);
			SaleBean sale = sas.getOneSale(sb.getSaleId());
            m.addAttribute("sa", sale);		
			m.addAttribute("mssg", "预订成功!");
			return "/succeed.jsp";
		}else{
			m.addAttribute("mssg", "预定失败,请重新尝试!");
			return "back";
		}
		
		
		
	}
	
	
	
	
}
