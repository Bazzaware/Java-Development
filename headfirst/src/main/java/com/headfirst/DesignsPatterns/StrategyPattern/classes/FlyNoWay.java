package com.headfirst.DesignsPatterns.StrategyPattern.classes;

import com.headfirst.DesignsPatterns.StrategyPattern.interfaces.IFlyBehavior;

public class FlyNoWay implements IFlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }

}
