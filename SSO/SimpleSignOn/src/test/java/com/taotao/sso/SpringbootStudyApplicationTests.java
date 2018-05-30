package com.taotao.sso;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.taotao.sso.StartApplication;
import com.taotao.sso.model.User;
import com.taotao.sso.service.UserServiceSSO;
import com.taotao.sso.utils.TaotaoUtils;

/**
 * @RunWith	它是一个运行器
 * @RunWith(SpringRunner.class) 表示让测试运行于Spring测试环境，不用启动spring容器即可使用Spring环境
 * @SpringBootTest(classes=StartApplication.class)  表示将StartApplication.class纳入到测试环境中，若不加这个则提示bean找不到。
 * 
 * @author itdragon
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes=StartApplication.class)
public class SpringbootStudyApplicationTests {
	
	@Autowired
	private UserServiceSSO userServiceSSO;

	@Test	// 测试注册，新增数据
	public void registerUser() {
		User user = new User();
		user.setAccount("Taotao");
		user.setUserName("kelly");
		user.setEmail("kellyguomf@git.com");
		user.setIphone("12349857999");
		user.setPlainPassword("123456789");
		user.setPlatform("github");
		user.setCreatedDate(TaotaoUtils.getCurrentDateTime());
		user.setUpdatedDate(TaotaoUtils.getCurrentDateTime());
		TaotaoUtils.entryptPassword(user);
		System.out.println(user);
		userServiceSSO.registerUser(user);
	}
	
	
	
}