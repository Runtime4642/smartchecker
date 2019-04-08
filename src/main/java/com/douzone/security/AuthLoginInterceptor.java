package com.douzone.security;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.douzone.smartchecker.service.UserService;
import com.douzone.smartchecker.vo.UserVo;

public class AuthLoginInterceptor extends HandlerInterceptorAdapter {
	@Autowired
	private UserService userService;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
//		ApplicationContext ac =  WebApplicationContextUtils.getWebApplicationContext(request.getServletContext());
//		UserService userService = ac.getBean(UserService.class);
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		UserVo userVo = userService.login(email,password);
		if(userVo == null)
		{
			request.setAttribute("result", false);
			 RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/user/login.jsp");
			  dispatcher.forward(request, response);
			  return false;
		}
		//로그인 처리
		HttpSession session = request.getSession(true);
		session.setAttribute("authuser", userVo);
		response.sendRedirect(request.getContextPath()+"/");
		return false;
	}



}
