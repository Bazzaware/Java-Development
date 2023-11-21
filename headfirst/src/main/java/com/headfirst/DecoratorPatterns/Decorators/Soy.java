package com.headfirst.DecoratorPatterns.Decorators;

import com.headfirst.DecoratorPatterns.Classes.Beverage;
import com.headfirst.DecoratorPatterns.Classes.CondimentDecorator;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.15;
    }
}
