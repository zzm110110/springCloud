package com.web.eurekaclienttow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/***
 * @description: <p>集群节点2</>
 * @author: <H2>James<H2>
 * @date: <P>2018/10/9 16:09</P>
 * @param: <P> * @param null</P>
 * @return: <P></P>
 */
@SpringBootApplication
@EnableEurekaClient
/**
 * 开启断路由
 */
@EnableHystrix
/**
 * 设置路由断点
 */
@EnableHystrixDashboard
@EnableCircuitBreaker
public class EurekaclienttowApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaclienttowApplication.class, args);
    }
}
