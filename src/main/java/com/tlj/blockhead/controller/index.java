package com.tlj.blockhead.controller;

import com.tlj.blockhead.intercepter.NoLoginController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class index {
    @RequestMapping("index")
    @NoLoginController
    public String index(){
        return "index";
    }
    @RequestMapping("login")
    @NoLoginController
    public String login(){return "login";}
    @RequestMapping("register")
    public String register(){return "register";}
    @RequestMapping("secret")
    public String secret(){return "secret";}
    @RequestMapping("y")
    public String y(){return "y";}
    @RequestMapping("test")
    public String test(){return "test";}
    @RequestMapping("host")
    public String host(){return "host";}
    @RequestMapping("blog")
    public String blog(){return "blog";}
    @RequestMapping("services")
    public String services(){return "services";}
    @RequestMapping("resume")
    public String resume(){return "resume";}
    @RequestMapping("contact")
    public String contact(){return "contact";}
    @RequestMapping("work")
    public String work(){return "work";}


}
