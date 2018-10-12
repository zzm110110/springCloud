package com.web.servicehi.controller;

import com.web.servicehi.ServiceHiApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @version <p>V1.0</p>
 * @Author: <H2>james</H2>
 * @Description: <P>添加说明</P>
 * @Date: <P>CREATE IS 2018/10/11 16:46</P>
 **/
@RestController
public class HiController {

    private static final Logger LOG = Logger.getLogger(ServiceHiApplication.class.getName());

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/hi")
    public String callHome() {

        LOG.log(Level.INFO, "开始调用servic-miya服务中的miya接口");

        return restTemplate.getForObject("http://localhost:10010/miya", String.class);
    }

    @RequestMapping("/info")
    public String info() {

        LOG.log(Level.INFO, "我是servic-hi中的info接口");

        return "我是servic-hi服务中的info方法";

    }

}
