package com.toulan.controller;

import com.toulan.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author LOL_toulan
 * @Time 2020/2/18 10:41
 * @Message
 */
@Controller
@RequestMapping("/test")
public class HelloController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET,params = {"username=hehe"})
    public String hello(){
        System.out.println("hello springMVC");
        return "success";
    }

    @RequestMapping("/params")
    public String params(String username,String password){
        System.out.println("hello springMVC");

        System.out.println("用户名：" + username);

        System.out.println();

        System.out.println("密码："+password);

        return "success";
    }

    @RequestMapping("/beans")
    public String beans(User user){


        System.out.println("用户名：" + user);


        return "success";
    }
}
