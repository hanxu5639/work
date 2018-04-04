package com.xa.controller;



import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.xa.bean.ShowBean;
import com.xa.bean.UserBean;
import com.xa.service.ShowService;
import com.xa.service.UserService;

@Controller
@SessionAttributes({"ub"})
public class LoginController {

	@Autowired
	private UserService us;
    @Autowired
	private ServletContext sc;
    @Autowired
	private ShowService ss;
	
	@RequestMapping("/login")
	public String login(String loginname,String password,Model m){
		UserBean ub = us.login(loginname, password);
		List<ShowBean> show = ss.getAllShow();
			m.addAttribute("sh", show);
		if(ub != null){
			Object obj = sc.getAttribute("uon");
			List<UserBean> onlineUser = null;
			if(obj != null){
				onlineUser = (List<UserBean>) obj;
			}else{
				onlineUser = new ArrayList<UserBean>();
			}
			boolean is = true;
		    for (int i = 0; i < onlineUser.size(); i++) {
			UserBean u = onlineUser.get(i);
			if(u != null && u.getUserId() == ub.getUserId()){
				is = false;
				break;
			}
		    }
		    if(is){
		    	onlineUser.add(ub);
		    	sc.setAttribute("uon", onlineUser);
		    	m.addAttribute("ub", ub);
				return "/index.jsp";
		    }else{
		    	m.addAttribute("msg","该用户已经登录！");
		    	return "/login.jsp";
		    }
			
		}else{
			m.addAttribute("msg", "账号或密码错误！");
			return "/login.jsp";
		}
		
	}
}
