package com.guo.bos.service.configuration;

import java.util.Properties;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * C3P0数据源配置
 *
 * @author leon.gan
 *
 */
@Configuration 
public class C3p0DataSourceDBConfig  {
  @Autowired
//  private DBProperties dBProperties;
	private Environment env;
  
    @Bean
    public DataSource dataSource() {
    	
        try {
            ComboPooledDataSource dataSource = new ComboPooledDataSource();
            dataSource.setDriverClass(env.getProperty("jdbc.driverClass"));
            dataSource.setJdbcUrl(env.getProperty("jdbc.jdbcUrl"));
            dataSource.setUser(env.getProperty("jdbc.user"));
            dataSource.setPassword(env.getProperty("jdbc.password"));
//            //当连接池在没有可用空闲连接时每次可以新增的连接数
            System.out.println(env.getProperty("jdbc.user"));
            System.out.println(Integer.parseInt(env.getProperty("c3p0.acquireIncrement")));
            dataSource.setAcquireIncrement(Integer.parseInt(env.getProperty("c3p0.acquireIncrement")));
            //连接池初始连接数
            dataSource.setInitialPoolSize(Integer.parseInt(env.getProperty("c3p0.initialPoolSize")));
            //连接池可持有的最大连接数
            dataSource.setMaxPoolSize(Integer.parseInt(env.getProperty("c3p0.maxPoolSize")));
            //连接池可持有的最小连接数
            dataSource.setMinPoolSize(Integer.parseInt(env.getProperty("c3p0.minPoolSize")));
            //连接池中的连接失效的阀值(即最大未被使用时长)
            dataSource.setMaxIdleTime(Integer.parseInt(env.getProperty("c3p0.maxIdleSize")));
            //与MaxIdleTime配合使用，必须小于MaxIdleTime的值，用于减少连接池中的连接
            dataSource.setMaxIdleTimeExcessConnections(Integer.parseInt(env.getProperty("c3p0.maxIdleTimeExcessConnections")));
            //连接最大存活时间，超过这个时间将被断开，正在使用的连接在使用完毕后被断开
            dataSource.setMaxConnectionAge(Integer.parseInt(env.getProperty("c3p0.maxConnectionAge")));
            //进行空闲连接测试的SQL
            dataSource.setPreferredTestQuery(env.getProperty("c3p0.preferredTestQuery"));
            //进行空闲连接测试的时间间隔
            dataSource.setIdleConnectionTestPeriod(Integer.parseInt(env.getProperty("c3p0.idleConnectionTestPeriod")));
            return dataSource;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}