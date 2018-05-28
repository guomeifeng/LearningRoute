package com.guo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.guo.model.User;
import com.guo.service.IUserService;

@Controller
public class MainController {
    
    @Autowired
    private IUserService userService;


    
   @RequestMapping("/index")
    public String index(){
   return "index";
   }
   
   @RequestMapping("/common/index")
   public String commonindex(){
  return "/common/index";
  }
   
   @RequestMapping("/common/home")
   public String commonhome(){
  return "/common/home";
  }
   @RequestMapping("/portal/daiban")
   public String potaldaiban(){
  return "/portal/daiban";
  }
   

   @RequestMapping(value="/login")
   public String login(){ 
	   return "login";  
  }
   @RequestMapping(value="/user/login",method=RequestMethod.POST)
   public ModelAndView userLogin(HttpServletRequest req,HttpServletResponse resp){
	   User user = userService.login(req.getParameter("user.username"), req.getParameter("user.password"));  
	   req.getSession().setAttribute("loginUser", user); 
	   ModelAndView mav = new ModelAndView();
	   mav.addObject("userobject",user);
	   mav.setViewName("index");
	   return mav;
	   //return "redirect:/index";  
  }
   @RequestMapping("/validatecode")
   public String validatecode() {
	   return "validatecode";
   }
}
