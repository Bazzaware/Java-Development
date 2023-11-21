package com.headfirst.DesignsPatterns.StrategyPattern.ducks;

import com.headfirst.DesignsPatterns.StrategyPattern.classes.*;
import com.headfirst.DesignsPatterns.StrategyPattern.interfaces.IDuck;

public class ModelDuck extends IDuck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }

}
