package com.web.serviceamqp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version <p>V1.0</p>
 * @Author: <H2>james</H2>
 * @Description: <P>添加说明</P>
 * @Date: <P>CREATE IS 2018/10/10 16:22</P>
 **/
@RestController
public class TestController {

    @Value("${democonfigclient.message}")
    String configServer;

    @RequestMapping(value = "/hi")
    public String hi(){
        return configServer;
    }

}
