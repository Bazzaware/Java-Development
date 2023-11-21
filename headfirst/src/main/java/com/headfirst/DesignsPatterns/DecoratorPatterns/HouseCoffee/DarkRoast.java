package com.headfirst.DesignsPatterns.DecoratorPatterns.HouseCoffee;

import com.headfirst.DesignsPatterns.DecoratorPatterns.Classes.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
