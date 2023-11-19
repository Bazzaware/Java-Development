package com.headfirst.DesignsPatterns.ChapterOne;

import com.headfirst.DesignsPatterns.ChapterOne.classes.FlyNoWay;
import com.headfirst.DesignsPatterns.ChapterOne.classes.Squeak;
import com.headfirst.DesignsPatterns.ChapterOne.interfaces.IDuck;

public class RubberDuck extends IDuck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("I am a Rubber Duck");
    }

}
