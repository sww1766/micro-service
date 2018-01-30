package com.microservice.skeleton.auth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "order";
    }
    @RequestMapping("/login")

    @ResponseBody
    public String login() {
        return "login";
    }
    @RequestMapping(value = "/doLogin",method = RequestMethod.POST)
    public void doLogin(String username,String password){
        System.out.println(username);
    }
}
