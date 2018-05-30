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
public class UserQueryServiceImpl implements UserQueryService {
	
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private JedisClient jedisClient;
	
	@Value("${REDIS_USER_SESSION_KEY}")
	private String REDIS_USER_SESSION_KEY;
	
	@Value("${SSO_SESSION_EXPIRE}")
	private Integer SSO_SESSION_EXPIRE;
	



	public TaotaoResult queryUserByToken(String token) {
		// 根据token从redis中查询用户信息
		String json = jedisClient.get(REDIS_USER_SESSION_KEY + ":" + token);
		// 判断是否为空
		if (StringUtils.isEmpty(json)) {
			return TaotaoResult.build(400, "此session已经过期，请重新登录");
		}
		// 更新过期时间
		jedisClient.expire(REDIS_USER_SESSION_KEY + ":" + token, SSO_SESSION_EXPIRE);
		// 返回用户信息
		return TaotaoResult.ok(JsonUtils.jsonToPojo(json, User.class));
	}
    
}