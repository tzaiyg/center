package com.tlj.blockhead.inter;

import com.tlj.blockhead.dto.TRP;
import com.tlj.blockhead.entity.User;

/**
 * @author ：tlj
 * @date ：Created in 2021/7/1 13:20
 * @version: IntelliJ IDEA
 */
public interface UserInterface {

    TRP login(User user);

    TRP register(User u);

    TRP findAll();
}
