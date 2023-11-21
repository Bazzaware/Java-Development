package com.headfirst.DesignsPatterns.StrategyPattern;

import com.headfirst.DesignsPatterns.StrategyPattern.classes.FlyNoWay;
import com.headfirst.DesignsPatterns.StrategyPattern.classes.Squeak;
import com.headfirst.DesignsPatterns.StrategyPattern.interfaces.IDuck;

public class RubberDuck extends IDuck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("I am a Rubber Duck");
    }

}
