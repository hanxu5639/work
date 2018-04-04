package com.xa.controller;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xa.bean.UserBean;

@Controller
public class LogoutController {

	@Autowired
	private ServletContext sc;
	
	@RequestMapping("/logout")
	public String logout(HttpSession session){
		UserBean u = (UserBean) session.getAttribute("ub");
		List<UserBean> l = (List<UserBean>) sc.getAttribute("uon");
		for (int i = 0; i < l.size(); i++) {
			UserBean ub = l.get(i);
			if(ub != null && u.getUserId() == ub.getUserId()){
				l.remove(i);
				break;
			}
		}
		session.invalidate();
		sc.setAttribute("uon", l);
		return "redirect:/login.jsp";
		
	}
}
