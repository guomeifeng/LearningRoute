package com.itheima.bos.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itheima.bos.dao.base.IUserDao;
import com.itheima.bos.domain.User;
import com.itheima.bos.service.IUserService;
import com.itheima.bos.utils.MD5Utils;

@Transactional
@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private IUserDao userDao;
	
	
	
	@Override
	public User login(User user) {
		return userDao.findUserByUsernameAndPassword(user.getUsername(),MD5Utils.md5(user.getPassword()) );
	}



	@Override
	public Integer editPassword(String id, String password) {
		return userDao.executeUpdate("user.updatePassword", MD5Utils.md5(password),id);
		
	}

}
