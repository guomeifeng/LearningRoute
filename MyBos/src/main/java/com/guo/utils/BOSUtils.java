package com.guo.utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import com.guo.model.User;

/**
 * BOS项目的工具类
 * @author KellyGuo
 *
 */
public class BOSUtils {
	//获取当前session对象
	@Autowired
	private static HttpServletRequest request;

	public static HttpSession getSession() {
		return request.getSession();
	}
	//获取当前登陆用户
	public static User getLoginUser(HttpServletRequest request) {
		return (User)request.getSession().getAttribute("loginUser");
	}

}
