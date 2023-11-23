package com.headfirst.DesignsPatterns.DecoratorPatterns.HouseCoffee;

import com.headfirst.DesignsPatterns.DecoratorPatterns.Classes.Beverage;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }

}
