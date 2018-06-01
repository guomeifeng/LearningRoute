package com.guo.bos.service.configuration;
import java.util.concurrent.Executor;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.aop.interceptor.SimpleAsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.scheduling.support.CronTrigger;
@EnableScheduling
@EnableAsync//Spring 会自动的创建基于ThreadPoolTaskExecutor 实例注入到上下文中。
@Configuration



public class ScheduleConfiguration implements SchedulingConfigurer, AsyncConfigurer {
	
	
	
	/*
	* 并行任务
	*/
	public void configureTasks(ScheduledTaskRegistrar taskRegistrar)
	{
	TaskScheduler taskScheduler = taskScheduler();
	taskRegistrar.setTaskScheduler(taskScheduler);
	}

	/**
	* 并行任务使用策略：多线程处理（配置线程数等）
	* 
	* @return ThreadPoolTaskScheduler 线程池
	*/
	@Bean(destroyMethod = "shutdown")
	public ThreadPoolTaskScheduler taskScheduler()
	{
	ThreadPoolTaskScheduler scheduler = new ThreadPoolTaskScheduler();
	scheduler.setPoolSize(20);
	scheduler.setThreadNamePrefix("task-");  //设置线程名开头
	scheduler.setAwaitTerminationSeconds(60);
	scheduler.setWaitForTasksToCompleteOnShutdown(true);
	return scheduler;
	}

	/*
	* 异步任务
	*/
	public Executor getAsyncExecutor()
	{
	Executor executor = taskScheduler();
	return executor;
	}

	/*
	* 异步任务 异常处理
	*/
	public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler()
	{
	return new SimpleAsyncUncaughtExceptionHandler();
	}
	}

//	备注：
//	SchedulingConfigurer： 将线程池注入TaskScheduler，并与ScheduledTaskRegistrar 关联；
//	AsyncConfigurer：用于异步处理
	
	

    
