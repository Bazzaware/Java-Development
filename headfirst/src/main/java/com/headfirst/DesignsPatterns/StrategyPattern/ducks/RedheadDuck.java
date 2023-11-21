package com.headfirst.DesignsPatterns.StrategyPattern.ducks;

import com.headfirst.DesignsPatterns.StrategyPattern.interfaces.IDuck;

public class RedheadDuck extends IDuck {

    @Override
    public void display() {
        System.out.println("I am a Redhead Duck");
    }

}
