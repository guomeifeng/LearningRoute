package com.guo.bos.service.user;

import com.guo.bos.model.User;

public interface IUserService {

	User login(String username, String password);

	Integer editPassword(String string, String password);

}
