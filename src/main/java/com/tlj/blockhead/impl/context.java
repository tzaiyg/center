package com.tlj.blockhead.impl;

import com.tlj.blockhead.inter.Strategy;

public class context {
    private Strategy strategy;

    public context(Strategy strategy) {
        this.strategy = strategy;
    }

    public context() {

    }

    public boolean excuteStrategy(String name){
       return strategy.choice(name);
    }


}
