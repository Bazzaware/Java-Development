package com.headfirst.DesignsPatterns.ChapterOne.classes;

import com.headfirst.DesignsPatterns.ChapterOne.interfaces.IDuck;

public class MallardDuck extends IDuck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }

}