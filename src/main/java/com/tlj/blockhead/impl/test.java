package com.tlj.blockhead.impl;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class test {
    public static void main(String[] args) {
        final context context = new context(new fisrt());
        final boolean fisrt = context.excuteStrategy("fisrt");
        context context1 = new context(new two());
        final boolean two = context1.excuteStrategy("two");
        System.out.println(fisrt+""+two);
    }
}
