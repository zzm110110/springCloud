package com.web.serviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @version <p>V1.0</p>
 * @Author: <H2>james</H2>
 * @Description: <P>添加说明</P>
 * @Date: <P>CREATE IS 2018/10/9 15:30</P>
 **/
@Service
public class HelloService {

    /**
     * 这里的RestTemplate在一开始没有实例化，要在启动类中实例化，才可以用
     */
    @Autowired
    RestTemplate restTemplate;

    /**
     * 通过在注册中心注册后，调用另一个微服务的接口
     * @param name
     * @return
     */
    @HystrixCommand(fallbackMethod = "helloError")
    public String hiService(String name) {
        //这个【http://node1/hi?name=name】路径是调用微服务为node1的一个controller暴露接口
        return restTemplate.getForObject("http://eureka-client/hi?name="+name,String.class);
    }

    /**
     * 这个方法是实现断路由后要执行的东西
     * @param name
     * @return
     */
    public String helloError(String name){
        return "哦哦，服务器处理超时，请重试！！";
    }
}
