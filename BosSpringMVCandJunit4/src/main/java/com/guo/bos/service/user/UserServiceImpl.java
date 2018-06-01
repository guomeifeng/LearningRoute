package com.guo.bos.service.user;

import javax.annotation.PostConstruct;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.guo.bos.dao.IBaseDao;
import com.guo.bos.dao.IUserDao;
import com.guo.bos.model.User;
import com.guo.bos.utils.MD5Utils;

@Service
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
