package com.headfirst.DecoratorPatterns.HouseCoffee;

import com.headfirst.DecoratorPatterns.Classes.Beverage;

public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf Coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }

}
