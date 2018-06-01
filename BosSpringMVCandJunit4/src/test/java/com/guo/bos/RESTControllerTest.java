package com.guo.bos;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.guo.bos.model.User;
import com.guo.bos.service.configuration.AppConfiguration;
import com.guo.bos.service.configuration.RestServiceConfiguration;




//集成web环境方式

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
//@ContextConfiguration(classes = {WebInitializer.class})
//@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@ContextHierarchy({ 
@ContextConfiguration(name = "parent", classes = AppConfiguration.class) , 
@ContextConfiguration(name = "child", classes = RestServiceConfiguration.class)  
})  
//配置事务的回滚,对数据库的增删改都会回滚,便于测试用例的循环利用
//@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
//@Transactional
public class RESTControllerTest {
	@Autowired
    private WebApplicationContext wac;  
    private MockMvc mockMvc;  
  
    
    
  @Before  
  public void setUp() throws Exception { 
//	  RESTController restController = new RESTController();  
//      this.mockMvc = MockMvcBuilders.standaloneSetup(restController).build();
	  
//	  WebInitializer waci = new WebInitializer();
//	  WebApplicationContext wac = ContextLoader.getCurrentWebApplicationContext();   
	  
	  this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
  }  

  //进行测试  
  @Test  
  public void testFindByUsernameAndPassword() throws Exception {  
      User user = new User();
      user.setUsername("kelly");
      user.setPassword("1234");
//      1、mockMvc.perform执行一个请求；
//      2、MockMvcRequestBuilders.get("/user/1")构造一个请求
//      3、ResultActions.andExpect添加执行完成后的断言
//      4、ResultActions.andDo添加一个结果处理器，表示要对结果做点什么事情，比如此处使用MockMvcResultHandlers.print()输出整个响应结果信息。
//      5、ResultActions.andReturn表示执行完成后返回相应的结果。
//      String userJson = JSONObject.fromObject(user).toString();
      System.out.println(user);
      MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/user/login/")
    		  .contentType(MediaType.APPLICATION_FORM_URLENCODED)
    		  .param("username", "kelly")
    		  .param("password", "1234"))
    		  
    		  
//    		  .contentType(MediaType.APPLICATION_JSON).content(userJson) )  
//       .andExpect(MockMvcResultMatchers.view().name("index"))
//    		  .andExpect(content().contentType(MediaType.APPLICATION_JSON)) //验证响应contentType  
//    		  .andExpect(jsonPath("$.id").value(1)) //使用Json path验证JSON 请参考http://goessner.net/articles/JsonPath/  
//       .andExpect(MockMvcResultMatchers.model().attributeExists("user"))
//       .andExpect(MockMvcResultMatchers.redirectedUrl("/index"))
      .andDo(MockMvcResultHandlers.print()) 
      .andReturn(); 
      Assert.assertNotNull(result.getModelAndView().getModel().get("user"));  
  }
}



