package com.guo.bos.dao;

import com.guo.bos.model.User;

public interface IUserDao extends IBaseDao<User> {

	User findUserByUsernameAndPassword(String username, String password);

	

}
