package com.tlj.blockhead.service;

import com.alibaba.fastjson.JSON;
import com.tlj.blockhead.Utils.EnumT;
import com.tlj.blockhead.Utils.IdWorker;
import com.tlj.blockhead.dao.UserDao;
import com.tlj.blockhead.dto.TRP;
import com.tlj.blockhead.entity.User;
import com.tlj.blockhead.exception.BaseException;
import com.tlj.blockhead.exception.ValidationException;
import com.tlj.blockhead.inter.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

/**
 * @author ：tlj
 * @date ：Created in 2021/7/1 13:20
 * @version: IntelliJ IDEA
 */
@Service
public class UserService implements UserInterface {
    @Resource
    UserDao userDao;
    @Override
    public TRP login(User user) {
        User u = userDao.findbyName(user.getName());
        if (u!= null && user.getPass().equals(u.getPass()))
            return new TRP(u);
       throw  new ValidationException(EnumT.NONENTITY.getMessage(), EnumT.NONENTITY.getCode());
    }

    @Override
    public TRP register(User u) {
        User user = userDao.findbyName(u.getName());
        if(user==null){
            IdWorker idWorker = new IdWorker(1, 1, 1);
            long l = idWorker.nextId();
            u.setId(String.valueOf(l));
          return new TRP(userDao.saveAndFlush(u));
        }
        return new TRP(null);
    }

    public TRP findAll() {
        return new TRP(userDao.findAll());
    }
}
