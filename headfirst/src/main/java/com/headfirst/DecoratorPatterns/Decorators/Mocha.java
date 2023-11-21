package com.headfirst.DecoratorPatterns.Decorators;

import com.headfirst.DecoratorPatterns.Classes.Beverage;
import com.headfirst.DecoratorPatterns.Classes.CondimentDecorator;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + .20;
    }

}
