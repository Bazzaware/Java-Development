package com.headfirst.DesignsPatterns.DecoratorPatterns.Decorators;

import com.headfirst.DesignsPatterns.DecoratorPatterns.Classes.Beverage;
import com.headfirst.DesignsPatterns.DecoratorPatterns.Classes.CondimentDecorator;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    /*
     * This method will return the description of the beverage and the condiment.
     * We want our description to not only include the beverage but also each item
     * decorating the beverage.
     * So we first delegate to the object we are decorating to get its description,
     * then append ", Mocha" to that description.
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    /*
     * This method will return the cost of the beverage and the condiment.
     * Now we need to compute the cost of our beverage with Mocha. First
     * we delegate the call to the object we are decorating, so that it can
     * compute the cost; then we add the cost of Mocha to the result.
     */
    @Override
    public double cost() {
        double cost = beverage.cost();
        if (beverage.getSize() == Size.TALL) {
            cost += .20;
        } else if (beverage.getSize() == Size.GRANDE) {
            cost += .25;
        } else if (beverage.getSize() == Size.VENTI) {
            cost += .30;
        }
        return cost;
    }

}
