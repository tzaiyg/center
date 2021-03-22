package com.tlj.blockhead;

import java.math.BigDecimal;
import java.util.Arrays;

public class SkipController {

    public static void main(String[] args) {
        final BigDecimal bigDecimal = null;
        String a="1";
        System.out.println(Arrays.asList("1", "3", "6").contains(a));
        if(!Arrays.asList("1", "3", "6").contains(a)){
            System.out.println(1);
        }
    }
}
