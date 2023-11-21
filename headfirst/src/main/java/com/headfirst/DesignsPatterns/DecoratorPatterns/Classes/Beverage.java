package com.headfirst.DesignsPatterns.DecoratorPatterns.Classes;

public abstract class Beverage {
    /*
     * This is the base class for all the beverages
     * This class will be extended by all the beverages
     * This class will have the description and cost of the beverage
     */
    public String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public String toString() {
        /*
         * This method will return the description and cost of the beverage
         */
        return "Description: " + this.getDescription() + "\nCost: " + this.cost() + "\n";
    }
}
