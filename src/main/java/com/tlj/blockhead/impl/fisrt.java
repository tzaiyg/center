package com.tlj.blockhead.impl;

import com.tlj.blockhead.inter.Strategy;

public class fisrt implements Strategy {
    @Override
    public boolean choice(String name) {
        if(name=="one"){
            return true;
        }
        return false;
    }
}
