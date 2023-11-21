package com.headfirst.DecoratorPatterns.HouseCoffee;

import com.headfirst.DecoratorPatterns.Classes.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }

}
