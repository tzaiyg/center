package com.tlj.blockhead.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.tlj.blockhead.Utils.Constants;
import com.tlj.blockhead.Utils.EnumT;
import com.tlj.blockhead.Utils.JwtUtil;
import com.tlj.blockhead.dto.TRP;
import com.tlj.blockhead.entity.User;
import com.tlj.blockhead.intercepter.NoLoginController;
import com.tlj.blockhead.service.UserService;
import com.tlj.blockhead.templates.ControllerTemplate;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@RequestMapping("/tlj/user")
@RestController
@Slf4j
@CrossOrigin
public class UserController {

    @Resource
    UserService userService;

    @RequestMapping("login")
    @NoLoginController
    public TRP login(@RequestBody User user, HttpServletRequest request, HttpServletResponse httpServletResponse) {
        ThreadLocal<Object> objectThreadLocal = new ThreadLocal<>();
        Object o = objectThreadLocal.get();
        System.out.println(o);
        HttpSession session = request.getSession(true);
        session.setAttribute("name",user.getName());
        return ControllerTemplate.execute(() -> {
            TRP login = userService.login(user);
            User data = (User) login.getData();
            // TODO jwt加密
            request.getSession().setAttribute(Constants.LOGIN_INFO, data);
            return login;
        }, user);
    }

    @RequestMapping("/register")
    public TRP register(@RequestBody User u, HttpServletRequest request) {


        return ControllerTemplate.execute(() -> {
            return userService.register(u);
        }, u);

    }
    @RequestMapping("/getUser")
    public TRP getUser(HttpServletRequest request) {
        User name =(User) request.getSession().getAttribute(Constants.LOGIN_INFO);
        log.info("user:{}",name);
        if(name==null)
            return new TRP(EnumT.NO_LOGIN.getCode(),EnumT.NO_LOGIN.getMessage(),null);
        return ControllerTemplate.execute(() -> {
            return new TRP<User>(name);
        });

    }
    @RequestMapping("/findAll")
    public TRP findAll(HttpServletRequest request) {
        return ControllerTemplate.execute(() -> {
            return userService.findAll();
        });

    }
}
