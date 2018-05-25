package com.itheima.bos.web.action.impl;

import java.io.IOException;

import org.apache.commons.lang.StringUtils;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.itheima.bos.domain.User;
import com.itheima.bos.service.IUserService;
import com.itheima.bos.utils.BOSUtils;
import com.itheima.bos.web.action.base.BaseAction;

@Controller
@Scope("prototype")
public class UserAction extends BaseAction<User> {
	private String checkcode;

	public void setCheckcode(String checkcode) {
		this.checkcode = checkcode;
	}	
	
	@Autowired
	private IUserService userService;
	
	/**
	 * 用户登陆
	 */
	public String login() {
		String validateCode = (String) ServletActionContext.getRequest().getSession().getAttribute("key");
		if (StringUtils.isNotBlank(checkcode) && checkcode.equals(validateCode)) {
			//判断用户名口令

			User user = userService.login(model);
			if (user != null) {
				ServletActionContext.getRequest().getSession().setAttribute("loginUser", user);
				return HOME;
			}else {
				this.addActionError("用户名或密码错误，请重新输入");
				return LOGIN;				
			}
		}else {
			//验证码错误，继续在登陆页面
			this.addActionError("validationCode error");
			return LOGIN;
		}
		
	}
	/**
	 * 用户注销
	 * @return
	 */
	public String logout() {
		ServletActionContext.getRequest().getSession().invalidate();
		return LOGIN;
	}
	
	/**
	 * 修改密码
	 * @throws IOException 
	 */
	public String editPassword() throws IOException {

		String f = "1";
		User user = BOSUtils.getLoginUser();
		try {
			Integer editResult = userService.editPassword(user.getId(), model.getPassword());
		}catch(Exception e) {
			f = "0";
			e.printStackTrace();
		}
		ServletActionContext.getResponse().getWriter().print(f);
		return NONE;
	}


}
