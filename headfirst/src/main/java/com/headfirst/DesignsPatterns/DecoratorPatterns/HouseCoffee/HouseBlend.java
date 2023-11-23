package com.headfirst.DesignsPatterns.DecoratorPatterns.HouseCoffee;

import com.headfirst.DesignsPatterns.DecoratorPatterns.Classes.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }

}
