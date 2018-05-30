package com.taotao.sso.service;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.taotao.sso.model.TaotaoResult;
import com.taotao.sso.model.User;
import com.taotao.sso.dao.JedisClient;
import com.taotao.sso.dao.UserRepository;
import com.taotao.sso.utils.CookieUtils;
import com.taotao.sso.utils.TaotaoUtils;
import com.taotao.sso.utils.JsonUtils;

//@Service
//@Transactional
//@PropertySource(value = "classpath:redis.properties")
public interface UserQueryService {
	public TaotaoResult queryUserByToken(String token) ;
    
}