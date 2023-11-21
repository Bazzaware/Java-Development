package com.headfirst.DecoratorPatterns;

public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public String toString() {
        return "Description: " + this.getDescription() + "\nCost: " + this.cost() + "\n";
    }
}
