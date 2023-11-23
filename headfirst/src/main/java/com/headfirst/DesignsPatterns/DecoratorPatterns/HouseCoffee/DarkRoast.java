package com.headfirst.DesignsPatterns.DecoratorPatterns.HouseCoffee;

import com.headfirst.DesignsPatterns.DecoratorPatterns.Classes.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        double cost = 0.99;
        switch (this.getSize()) {
            case TALL:
                cost += 0.10;
                break;
            case GRANDE:
                cost += 0.15;
                break;
            case VENTI:
                cost += 0.20;
                break;
            default:
                break;
        }
        return cost;
    }
}
