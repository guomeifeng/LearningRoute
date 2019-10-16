/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 *
 * @author kelly
 */
@SpringBootApplication
@EnableJpaRepositories("Test2.DAO")
@EnableAutoConfiguration
public class Test2Application {
    public static void main(String[] args){
        SpringApplication.run(Test2Application.class, args);
    }
}
