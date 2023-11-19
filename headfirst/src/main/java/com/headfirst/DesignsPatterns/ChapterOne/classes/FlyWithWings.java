package com.headfirst.DesignsPatterns.ChapterOne.classes;

import com.headfirst.DesignsPatterns.ChapterOne.interfaces.IFlyBehavior;

public class FlyWithWings implements IFlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying!!");
    }

}
