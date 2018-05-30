package com.taotao.sso.service;

import com.taotao.sso.pojo.User;

public interface UserService {
	
	User getUserByToken(String token);
	
}
