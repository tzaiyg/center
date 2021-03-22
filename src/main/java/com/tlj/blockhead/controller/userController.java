package com.tlj.blockhead.controller;

import com.alibaba.fastjson.JSON;
import com.tlj.blockhead.Utils.BaseUrl;
import com.tlj.blockhead.Utils.EnumT;
import com.tlj.blockhead.Utils.IdWorker;
import com.tlj.blockhead.Utils.Verify;
import com.tlj.blockhead.dao.UserDao;
import com.tlj.blockhead.dto.TRP;
import com.tlj.blockhead.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("user")
@RestController
@Slf4j
public class userController {

    @Autowired
    UserDao userDao;

    @RequestMapping("login")
    public TRP login(@RequestBody User user){
        if (user.getPass() == null || user.getName() == null) {
            return TRP.builder().code(EnumT.NULL.getCode()).message(EnumT.NULL.getMessage()).build();
        }
        User u = userDao.findbyName(user.getName());
        if (u!= null && user.getPass().equals(u.getPass())) {
            return TRP.builder().code(EnumT.SUCCESS.getCode()).message(EnumT.SUCCESS.getMessage()).data(JSON.toJSONString(user)).build();
        }
    return TRP.builder().code(EnumT.ERROR.getCode()).message(EnumT.ERROR.getMessage()).build();
}
    @RequestMapping("/register")
    public TRP register(@RequestBody User u) {
        try {
            if (null != userDao.findbyName(u.getName())) {
                return TRP.builder().code(EnumT.EXIST.getCode()).message(EnumT.EXIST.getMessage()).build();
            }
            IdWorker idWorker = new IdWorker(1, 2, 1);
            u.setId(BaseUrl.T + String.valueOf(idWorker.nextId()));
            User user = userDao.saveAndFlush(u);
            return TRP.builder().code(EnumT.SUCCESS.getCode()).message(EnumT.SUCCESS.getMessage()).data(JSON.toJSONString(user)).build();
        } catch (Exception e) {
            log.error(BaseUrl.ERROR + ":{}", e);
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(1);
    }
}
