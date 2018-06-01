package com.guo.bos.service.configuration;

import java.io.IOException;
import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.Hibernate;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;

import com.guo.bos.model.User;

/**
 * 基本的数据库配置
 * 统一配置了数据库访问工具和事务管理器
 * 具体的数据库配置类需要实现数据源创建的抽象方法
 * 这个类为实现不同的数据源提供了接口
 *
 * @author leon.gan
 *
 */

public class DatabaseConfiguration {
    
    /**
     * 事务管理器
     */
	@Autowired
	private DataSource dataSource;
	
    @Bean
    public HibernateTransactionManager transactionManager() throws IOException {
    	HibernateTransactionManager transactionManager = new HibernateTransactionManager();
        transactionManager.setDataSource(dataSource);
        transactionManager.setSessionFactory(sessionFactory());
        return transactionManager;
    }
    
    /**
     * Hibernate
     * @throws IOException 
     */

    @Bean
    public SessionFactory sessionFactory() throws IOException {
    	LocalSessionFactoryBean localSessionFactory = new LocalSessionFactoryBean();
    	localSessionFactory.setDataSource(dataSource);
    	Properties props = new Properties();
    	props.setProperty("hibernate.dialect","org.hibernate.dialect.MySQL5Dialect");
    	props.setProperty("hibernate.hbm2ddl.auto","update");
    	props.setProperty("hibernate.show_sql","true");
    	props.setProperty("hibernate.format_sql","true");
    	localSessionFactory.setHibernateProperties(props);
//    	<!--指明使用标注的实体类-->
    	localSessionFactory.setAnnotatedClasses(User.class);
    	localSessionFactory.afterPropertiesSet();
		return localSessionFactory.getObject();
    }

    
}