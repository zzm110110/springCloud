package com.web.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin.server.internal.EnableZipkinServer;

/**
 * @version <p>V1.0</p>
 * @Author: <H2>james</H2>
 * @Description: <P>添加说明</P>
 * @Date: <P>CREATE IS 2018/10/12 14:29</P>
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableZipkinServer
public class ZipKinApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZipKinApplication.class, args);
    }
}
