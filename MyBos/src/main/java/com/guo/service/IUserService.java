package com.guo.service;

import com.guo.model.User;

public interface IUserService {

	User login(String username, String password);

	Integer editPassword(String string, String password);

}
