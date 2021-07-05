package com.tlj.blockhead;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
//public class BlockheadApplication extends SpringBootServletInitializer {
public class BlockheadApplication  {

    public static void main(String[] args) {
        SpringApplication.run(BlockheadApplication.class, args);
    }
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//
//        return builder.sources(BlockheadApplication.class);
//    }
}

