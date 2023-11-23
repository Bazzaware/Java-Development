package com.headfirst.DesignsPatterns.StrategyPattern.ducks;

import com.headfirst.DesignsPatterns.StrategyPattern.classes.FlyWithWings;
import com.headfirst.DesignsPatterns.StrategyPattern.classes.Quack;
import com.headfirst.DesignsPatterns.StrategyPattern.interfaces.IDuck;

public class MallardDuck extends IDuck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }

}
