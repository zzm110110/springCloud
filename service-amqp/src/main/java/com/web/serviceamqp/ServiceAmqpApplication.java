package com.web.serviceamqp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/***
 * @description: <p>消息总线</>
 * @author: <H2>James<H2>
 * @date: <P>2018/10/10 16:44</P>
 * @param: <P> * @param null</P>
 * @return: <P></P>
 */
@SpringBootApplication
@EnableEurekaClient
@RefreshScope
public class ServiceAmqpApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceAmqpApplication.class, args);
    }
}
