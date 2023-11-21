package com.headfirst.DesignsPatterns.StrategyPattern.classes;

import com.headfirst.DesignsPatterns.StrategyPattern.interfaces.IFlyBehavior;

public class FlyWithWings implements IFlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying!!");
    }

}
