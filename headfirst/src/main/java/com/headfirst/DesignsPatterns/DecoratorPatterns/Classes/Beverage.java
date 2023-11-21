package com.headfirst.DesignsPatterns.DecoratorPatterns.Classes;

public abstract class Beverage {
    /*
     * This is the base class for all the beverages
     * This class will be extended by all the beverages
     * This class will have the description and cost of the beverage
     */
    public String description = "Unknown Beverage";

    /*
     * Added size variable to the beverage along with the getter and setter
     * This will be used to calculate the cost of the beverage
     */

    public enum Size {
        TALL, GRANDE, VENTI
    };

    Size size = Size.TALL;

    public String getDescription() {
        return description;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return this.size;
    }

    public abstract double cost();

    public String toString() {
        /*
         * This method will return the description and cost of the beverage
         */
        return "Description: " + this.getDescription() + "\nCost: " + this.cost() + "\n Size: " + this.size + "\n";
    }
}
