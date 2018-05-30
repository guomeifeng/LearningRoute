package com.taotao.sso.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.sso.model.TaotaoResult;
import com.taotao.sso.service.UserServiceSSO;


@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserServiceSSO userServiceSSO;
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	@ResponseBody
	public TaotaoResult userLogin(String account, String password,
			HttpServletRequest request, HttpServletResponse response) {
		try {
			TaotaoResult result = userServiceSSO.userLogin(account, password, request, response);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return TaotaoResult.build(500, "");
		}
	}
	
	@RequestMapping(value="/logout/{token}")
	public String logout(@PathVariable String token) {
		userServiceSSO.logout(token); // 思路是从Redis中删除key，实际情况请和业务逻辑结合
		return "index";
	}
	
	@RequestMapping("/token/{token}")
	@ResponseBody
	public Object getUserByToken(@PathVariable String token) {
		TaotaoResult result = null;
		try {
			result = userServiceSSO.queryUserByToken(token);
		} catch (Exception e) {
			e.printStackTrace();
			result = TaotaoResult.build(500, "");
		}
		return result;
	}
}