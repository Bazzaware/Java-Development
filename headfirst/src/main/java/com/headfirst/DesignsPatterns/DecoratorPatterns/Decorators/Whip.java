package com.headfirst.DesignsPatterns.DecoratorPatterns.Decorators;

import com.headfirst.DesignsPatterns.DecoratorPatterns.Classes.Beverage;
import com.headfirst.DesignsPatterns.DecoratorPatterns.Classes.CondimentDecorator;

public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }

}
