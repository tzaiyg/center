package com.tlj.blockhead.impl;

import com.tlj.blockhead.inter.Strategy;

public class two implements Strategy {
    @Override
    public boolean choice(String name) {
        if(name=="two"){
            return true;
        }
        return false;
    }
}
