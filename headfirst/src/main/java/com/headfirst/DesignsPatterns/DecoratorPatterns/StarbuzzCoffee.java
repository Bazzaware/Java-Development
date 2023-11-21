package com.headfirst.DesignsPatterns.DecoratorPatterns;

import com.headfirst.DesignsPatterns.DecoratorPatterns.Classes.Beverage;
import com.headfirst.DesignsPatterns.DecoratorPatterns.Decorators.*;
import com.headfirst.DesignsPatterns.DecoratorPatterns.HouseCoffee.*;

public class StarbuzzCoffee {
    public static void main(String args[]) {
        Beverage beverage = new Espresso();
        System.out.println(beverage);

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2);

        Beverage beverage3 = new DarkRoast();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3);

    }
}