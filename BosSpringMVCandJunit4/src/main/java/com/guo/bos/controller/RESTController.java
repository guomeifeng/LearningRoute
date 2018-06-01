package com.guo.bos.controller;
 
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.guo.bos.model.User;
import com.guo.bos.service.user.IUserService;

import net.sf.json.JSONObject;
 
@RestController
@Transactional(readOnly=true)
public class RESTController {
 
    @Autowired
    IUserService userService;  //Service which will do all data retrieval/manipulation work
    
    
//    @Autowired
//    private SessionFactory sessionFactory;
//    Session session = sessionFactory.getCurrentSession();
 
//-------------------Login a User--------------------------------------------------------
    
    @RequestMapping(value = "/user/login/", method = RequestMethod.GET)
    public ResponseEntity<User> findByUsernameAndPassword(@RequestParam(value="username",required=false) String username, @RequestParam(value="password",required=false) String password ) {
    	System.out.println(username + "aaaaaaaaaaaaaa" +  password);
//    	User user = (User) JSONObject.toBean(JSONObject.fromObject(userJson),User.class);
        System.out.println("Login username " + username + "and password="+ password);
        User userLogin = userService.login(username, password);
        if (userLogin==null) {
            System.out.println("username or password is incorrect");
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }else {
        	return new ResponseEntity<User>(userLogin, HttpStatus.NOT_FOUND);
        }
    }    
}