package com.headfirst.DesignsPatterns.ChapterOne.ducks;

import com.headfirst.DesignsPatterns.ChapterOne.classes.*;
import com.headfirst.DesignsPatterns.ChapterOne.interfaces.IDuck;

public class ModelDuck extends IDuck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }

}
