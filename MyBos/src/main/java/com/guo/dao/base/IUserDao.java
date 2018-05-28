package com.guo.dao.base;

import com.guo.model.User;

public interface IUserDao extends IBaseDao<User> {

	User findUserByUsernameAndPassword(String username, String password);

	

}
