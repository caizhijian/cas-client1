package com.czj.modules.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:caizhijian
 * @Date:2020-04-12
 */
@RestController
@RequestMapping("/hello")
public class TestController {

    @RequestMapping("/sayhello")
    public String sayHello(){
        System.out.println("hello666");
        return "hello";
    }
}
