package com.tlj.blockhead.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import javax.annotation.Resource;

/**
 * @author ：tlj
 * @date ：Created in 2021/7/2 9:59
 * @version: IntelliJ IDEA
 */

//@Configuration
//public class ApiConfig extends WebMvcConfigurationSupport {
//
//    @Resource
//    private LoginController loginController;
//
//    @Override
//    protected void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(this.loginController).addPathPatterns("/**").excludePathPatterns("/login","/css/**.css","/images/**","/js/**","*.js","*.css","/**/*.jpg","/static/css/**");;
//        super.addInterceptors(registry);
//    }
//}


