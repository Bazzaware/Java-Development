package com.headfirst.DesignsPatterns.ChapterOne.classes;

import com.headfirst.DesignsPatterns.ChapterOne.interfaces.IQuackBehavior;

public class Quack implements IQuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack");
    }

}
