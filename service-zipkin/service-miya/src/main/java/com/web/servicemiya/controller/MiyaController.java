package com.web.servicemiya.controller;

import brave.sampler.Sampler;
import com.web.servicemiya.ServiceMiyaApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @version <p>V1.0</p>
 * @Author: <H2>james</H2>
 * @Description: <P>添加说明</P>
 * @Date: <P>CREATE IS 2018/10/11 16:51</P>
 **/
@RestController
public class MiyaController {

    private static final Logger LOG = Logger.getLogger(ServiceMiyaApplication.class.getName());

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/miya")
    public String info() {
        LOG.log(Level.INFO, "开始调用server-hi的服务");
        return restTemplate.getForObject("http://localhost:10009/info", String.class);
    }

    @RequestMapping("/hi")
    public String home() {
        LOG.log(Level.INFO, "我是servic-hi中的info接口");
        return "我是servic-hi中的info接口";
    }

}
