package com.web.eurekaclientone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;


/***
 * @description: <p>第一个集群节点</>
 * @author: <H2>James<H2>
 * @date: <P>2018/10/9 15:50</P>
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
 * 开启路由监控盘
 */
@EnableHystrixDashboard
@EnableCircuitBreaker
public class EurekaclientOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaclientOneApplication.class, args);
    }
}
