package com.tlj.blockhead.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class index {
    @RequestMapping("index")
    public String index(){
        return "index";
    }
    @RequestMapping("login")
    public String login(){return "login";}
    @RequestMapping("register")
    public String register(){return "register";}
    @RequestMapping("secret")
    public String secret(){return "secret";}
    @RequestMapping("y")
    public String y(){return "y";}
    @RequestMapping("test")
    public String test(){return "test";}
}
