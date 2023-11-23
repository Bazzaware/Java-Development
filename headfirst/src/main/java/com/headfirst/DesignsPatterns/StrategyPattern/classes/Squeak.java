package com.headfirst.DesignsPatterns.StrategyPattern.classes;

import com.headfirst.DesignsPatterns.StrategyPattern.interfaces.IQuackBehavior;

public class Squeak implements IQuackBehavior {

    @Override
    public void quack() {
        System.out.println("Squeak");
    }

}
