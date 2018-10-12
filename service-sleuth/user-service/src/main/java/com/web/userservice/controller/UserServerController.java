package com.web.userservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version <p>V1.0</p>
 * @Author: <H2>james</H2>
 * @Description: <P>添加说明</P>
 * @Date: <P>CREATE IS 2018/10/12 16:40</P>
 **/
@RestController
@RequestMapping("/user")
public class UserServerController {

    @GetMapping("/hi")
    public String hi(){
        return "我是hi";
    }
}
