package com.xa.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.xa.bean.UserBean;

public class LoginInterceptor implements HandlerInterceptor {

	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		

		
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response,
			Object arg2, ModelAndView arg3) throws Exception {

		
	}

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object handler) throws Exception {
		String uri = request.getRequestURI();
		String path = request.getContextPath();
		if(uri.equals(path + "/login.jsp") || uri.equals(path + "/login")){
			return true;
		}else{
			HttpSession session = request.getSession();
			UserBean ub = (UserBean)session.getAttribute("ub");
			if(ub != null){
				return true;
			}else{
				request.getRequestDispatcher("/login.jsp").forward(request, response);
				return false;
			}
		}
		
	}

}
