package com.headfirst.DesignsPatterns.DecoratorPatterns.Classes;

public abstract class CondimentDecorator extends Beverage {
    /*
     * This is the base class for all the condiments decorators that will be added
     * to the beverages
     * This will decorate the beverages and wrap the beverages so they can be
     * nested.
     * Each beverage can be wrapped with multiple condiments.
     */
    public Beverage beverage;

    public abstract String getDescription();

    /*
     * Added a method to get the size of the beverage
     */
    public Size getSize() {
        return this.beverage.getSize();
    }
}
