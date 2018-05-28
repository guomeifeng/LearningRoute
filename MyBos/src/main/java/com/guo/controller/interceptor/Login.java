package com.guo.controller.interceptor;

import com.guo.model.User;
import com.guo.utils.BOSUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
public class Login implements HandlerInterceptor {
	private static final String[] IGNORE_URI = { "/login", "/validatecode", "/checkLogin", "/hello" };

	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
		// TODO Auto-generated method stub
		boolean flag = false;
		User user = BOSUtils.getLoginUser(arg0);
		String url = arg0.getRequestURI().toString();
		
			for (String s:IGNORE_URI) {
				if (url.contains(s)) {
					flag = true;
					break;
				}else {//判断user是否为空
					if (user != null) {
						flag = true;
						break;
					}
				}				
			}			
		
		if (flag == false) {
			String contextPath = arg0.getContextPath();
			arg1.sendRedirect(contextPath  + "/login");
		}
		return flag;
	}

}
