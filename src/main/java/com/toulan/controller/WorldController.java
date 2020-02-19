package com.toulan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author LOL_toulan
 * @Time 2020/2/19 10:13
 * @Message
 */
@Controller
public class WorldController {
    @RequestMapping("hello")
    public String hello(){
        System.out.println("hello springMVC");
        return "success";
    }
}
