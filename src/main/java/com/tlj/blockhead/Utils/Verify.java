package com.tlj.blockhead.Utils;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Field;

@Slf4j
public class Verify {
    public static boolean isNUll(Object obj) {
        for (Field field : obj.getClass().getFields()) {
            field.setAccessible(true);
            if (field.getName().equals("id") || field.getName().equals("head")) {
                continue;
            }
            try {
                if (field.get(obj) == null || field.get(obj).toString().length() == 0) {
                    return false;
                }
            } catch (IllegalAccessException e) {
                log.error(BaseUrl.ERROR + ":{}", e);
            }
        }
        return true;
    }
}
