package com.guo.bos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class IndexController {

	  @RequestMapping(method = RequestMethod.GET)
	    public String getLoginPage() {
	       // return "UserManagement";
		  return "login";
	    }
	  @RequestMapping(value = "/validatecode")
	    public String getValidatecode() {
	       // return "UserManagement";
		  return "validatecode";
	    }
	  
}