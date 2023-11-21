package com.headfirst.DesignsPatterns.DecoratorPatterns.Classes;

public abstract class CondimentDecorator extends Beverage {
    public Beverage beverage;

    public abstract String getDescription();

}
