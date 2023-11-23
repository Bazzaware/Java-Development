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

        Beverage beverage4 = new DarkRoast();
        beverage4.setSize(Beverage.Size.VENTI);
        beverage4 = new Mocha(beverage4);
        beverage4 = new Mocha(beverage4);
        beverage4 = new Whip(beverage4);
        System.out.println(beverage4);

        Beverage beverage3 = new DarkRoast();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3);

        Beverage beverage5 = new HouseBlend();
        beverage5.setSize(Beverage.Size.GRANDE);
        beverage5 = new Soy(beverage5);
        System.out.println(beverage5);
    }
}
