package com.guo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.guo.dao.base.IUserDao;
import com.guo.model.User;
import com.guo.service.IUserService;
import com.guo.utils.MD5Utils;

@Transactional
@Service
@Component
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private IUserDao userDao;
	
	
	
	public User login(String username, String password) {
		return userDao.findUserByUsernameAndPassword(username,MD5Utils.md5(password) );
	}



	public Integer editPassword(String id, String password) {
		return userDao.executeUpdate("user.updatePassword", MD5Utils.md5(password),id);
		
	}

}
