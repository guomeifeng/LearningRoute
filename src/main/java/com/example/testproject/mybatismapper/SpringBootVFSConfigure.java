/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testproject.mybatismapper;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.boot.autoconfigure.SpringBootVFS;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author kelly
 */
public class SpringBootVFSConfigure {

//    @Bean
//    public SqlSessionFactory masterSqlSessionFactory() throws Exception {
//        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
//        factoryBean.setDataSource(masterDataSource());
//        factoryBean.setVfs(SpringBootVFS.class); // Sets the SpringBootVFS class into SqlSessionFactoryBean
//        // ...
//        return factoryBean.getObject();
//    }
}
