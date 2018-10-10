package com.web.eurekaclientone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/***
 * @description: <p>第一个集群节点</>
 * @author: <H2>James<H2>
 * @date: <P>2018/10/9 15:50</P>
 * @param: <P> * @param null</P>
 * @return: <P></P>
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaclientOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaclientOneApplication.class, args);
    }
}
