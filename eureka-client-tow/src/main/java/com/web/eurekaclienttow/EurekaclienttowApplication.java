package com.web.eurekaclienttow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/***
 * @description: <p>集群节点2</>
 * @author: <H2>James<H2>
 * @date: <P>2018/10/9 16:09</P>
 * @param: <P> * @param null</P>
 * @return: <P></P>
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaclienttowApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaclienttowApplication.class, args);
    }
}
