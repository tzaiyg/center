package com.tlj.blockhead.controller;

import com.tlj.blockhead.Utils.EnumT;
import com.tlj.blockhead.dao.UserDao;
import com.tlj.blockhead.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;
import java.sql.Time;
import java.util.*;
import java.util.stream.Collectors;
@Controller
@RequestMapping("test")
public class test {
    @Autowired
    UserDao userDao;
    @RequestMapping("test")
    public void test(@RequestBody String a) throws Exception {
        final BigDecimal bigDecimal = new BigDecimal("20.00");

        List<User> list=new ArrayList<>();
        list.add(new User("000","9527","000","000",1,bigDecimal));
        list.add(new User("000","9528","000","000",1,bigDecimal));
        userDao.save(new User("tlj125383860170264576","9527","000","000",1,bigDecimal));
        userDao.save(new User("tlj125383860170264579","9528","000","000",1,bigDecimal));
        final BigDecimal biga = BigDecimal.ZERO;
//        list.stream().forEach(l->{
//            final User user =
//                    userDao.findbyName(l.getName());
//            if(user!=null){
//                final BigDecimal money = user.getMoney();
//                System.out.println(money);
//                BigDecimal bigDecimal1= new BigDecimal(String.valueOf(biga.add(money)));
//                System.out.println("金额："+ bigDecimal1);
//
//            }
//
//        });
        List l=new ArrayList();
        BigDecimal bigDecima1=BigDecimal.ZERO;
        for (String u : list.stream().map(User::getName).collect(Collectors.toList())) {
            bigDecima1=bigDecima1.add(userDao.findbyName(u).getMoney());
        }
        throw new Exception("da");

//        collect.stream().forEach(
//        );
//        System.out.println(bigDecima1);

//        BigDecimal result2 = list.stream()
//                // 将user对象的age取出来map为Bigdecimal
//                .map(User::getMoney)
//                // 使用reduce()聚合函数,实现累加器
//                .reduce(BigDecimal.ZERO,BigDecimal::add);
//        System.out.println(result2);
    }

//    public static void main(String[] args) {
//     final BigDecimal bigDecimal = new BigDecimal("10.00");
//        List<User> list=new ArrayList<>();
//        list.add(new User("000","000","000","000",1,bigDecimal));
//        list.add(new User("111","000","000","000",1,bigDecimal));
////
////        BigDecimal result2 = list.stream()
////                // 将user对象的age取出来map为Bigdecimal
////                .map(User::getMoney)
////                // 使用reduce()聚合函数,实现累加器
////                .reduce(BigDecimal.ZERO,BigDecimal::add);
////        System.out.println(result2);
////        final BigDecimal bigDecimal = new BigDecimal("0");
////        final BigDecimal bigDecimal1 = new BigDecimal("10.00");
////        final BigDecimal add = bigDecimal.add(bigDecimal1);
////        System.out.println(add);
//
//        list.stream().forEach(l->{
//
//                }
//        );
//
//
//    }

    public static void main(String[] args) {
        time();

    }
    private static void time(){
        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(1);
            }
        },10000);

    }
}
