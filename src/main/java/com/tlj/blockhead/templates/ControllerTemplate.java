package com.tlj.blockhead.templates;

import com.tlj.blockhead.Utils.ValidationUtils;
import com.tlj.blockhead.dto.TRP;

import com.tlj.blockhead.inter.Action;
import org.springframework.stereotype.Component;

import javax.swing.*;


/**
 * @author ：tlj
 * @date ：Created in 2021/7/1 11:01
 * @version: IntelliJ IDEA
 */
@Component
public class ControllerTemplate {


    public static <T> TRP execute(Action action, T... t){
        ValidationUtils.validator(t);
    return action.excute();
    };
}
