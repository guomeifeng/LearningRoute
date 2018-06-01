package com.guo.bos.service.configuration;  
  
import org.springframework.context.annotation.ComponentScan;  
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;  
  
@Configuration 
@EnableTransactionManagement
@EnableAspectJAutoProxy
@Import({ RestServiceConfiguration.class, DatabaseConfiguration.class, ScheduleConfiguration.class, BatchConfiguration.class})
@ComponentScan({ "com.guo.bos.service", "com.guo.bos.dao", "com.guo.bos.model"})
//@ComponentScan(basePackages = "com.guo.bos", excludeFilters = {  
//        @ComponentScan.Filter(type = FilterType.ANNOTATION, value = {Controller.class})  
public class AppConfiguration  {  
	
}  