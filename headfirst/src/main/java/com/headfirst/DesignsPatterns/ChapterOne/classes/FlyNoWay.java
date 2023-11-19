package com.headfirst.DesignsPatterns.ChapterOne.classes;

import com.headfirst.DesignsPatterns.ChapterOne.interfaces.IFlyBehavior;

public class FlyNoWay implements IFlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }

}
