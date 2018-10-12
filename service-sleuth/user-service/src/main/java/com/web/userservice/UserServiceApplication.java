package com.web.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @version <p>V1.0</p>
 * @Author: <H2>james</H2>
 * @Description: <P>添加说明</P>
 * @Date: <P>CREATE IS 2018/10/12 16:33</P>
 **/
@SpringBootApplication
@EnableEurekaClient
public class UserServiceApplication {

    public static void main(String[] args){
        SpringApplication.run(UserServiceApplication.class);
    }

}
